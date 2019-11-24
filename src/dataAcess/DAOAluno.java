package dataAcess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListModel;

import conexao.Conn;
import modelo.Aluno;
import modelo.Ordem;
import net.proteanit.sql.DbUtils;

public class DAOAluno {
	public static void listarbyRA(JList l, String ra, Ordem order) {
		
		
		
		
		try {
		//PreparedStatement ps = Conn.connect().prepareStatement("select * from aluno where ra like ? order by ?");
		//ps.setString(1, '%'+ra.toUpperCase()+'%');
		//ps.setString(2, order.getOrder());
			PreparedStatement ps = Conn.connect().prepareStatement("Select * from aluno where nome like ? order by "+order.getOrder());
			//ps.setString(2, order.getOrder());
			ps.setString(1, '%'+ra.toUpperCase()+'%');
			//ps.setString(2, ord.getOrder());
			
			System.out.println(ps);
		ResultSet rs = ps.executeQuery();
		DefaultListModel<Aluno> m = new DefaultListModel<Aluno>();
		
		while(rs.next()) {//ra nome turma
			Aluno a = new Aluno(rs.getString("ra"), rs.getString("nome"), rs.getString("turma"));
			m.addElement(a);
		}
		l.setModel(m);
		}catch(Exception ex) {
			System.out.println("Erro na classe DAOAluno - Listar ra : " + ex);
		}
	}
	public static void listarbyNome(JList l, String nome, Ordem ord) {
		try {
		//PreparedStatement ps = Conn.connect().prepareStatement("Select * from aluno where nome like ? order by ?");
			PreparedStatement ps = Conn.connect().prepareStatement("Select * from aluno where nome like ? order by "+ord.getOrder());
			//ps.setString(2, ord.getOrder());
		ps.setString(1, '%'+nome.toUpperCase()+'%');
		//ps.setString(2, ord.getOrder());
		
		System.out.println(ps);
		ResultSet rs = ps.executeQuery();
		DefaultListModel<Aluno> m = new DefaultListModel<Aluno>();
		
		while(rs.next()) {//ra nome turma
			Aluno a = new Aluno(rs.getString("ra"), rs.getString("nome"), rs.getString("turma"));
			
			m.addElement(a);
		}
		l.setModel(m);
		}catch(Exception ex) {
			System.out.println("Erro na classe DAOAluno - Listar nome: " + ex);
		}
		}
		
	public static void listarGeral(JList l, Ordem o) {
		try {
			//PreparedStatement ps = Conn.connect().prepareStatement("select * from aluno where ra like ? order by ?");
			//ps.setString(1, '%'+ra.toUpperCase()+'%');
			//ps.setString(2, order.getOrder());
				PreparedStatement ps = Conn.connect().prepareStatement("Select * from aluno order by "+o.getOrder());
				
				//ps.setString(1, o.getOrder());
				//ps.setString(2, ord.getOrder());
				
				
				System.out.println(ps);
		ResultSet rs = ps.executeQuery();
		DefaultListModel<Aluno> m = new DefaultListModel<Aluno>();
		
		while(rs.next()) {//ra nome turma
			Aluno a = new Aluno(rs.getString("ra"), rs.getString("nome"), rs.getString("turma"));
			m.addElement(a);
		}
		l.setModel(m);
		}catch(Exception ex) {
			//JOptionPane.showMessageDialog(null, "Erro na classe DAOAluno - Listar geral");
			System.out.println("Erro na classe DAOAluno - Listar geral: " + ex);
		}
	}
	
	public static void insert(Aluno a) {
		try {
		PreparedStatement ps = Conn.connect().prepareStatement("insert into aluno(ra, nome, turma) values (?,?,?);");
		ps.setString(1, a.getRa());
		ps.setString(2, a.getNome());
		ps.setString(3, a.getTurma());
		
		int i = ps.executeUpdate();
		
		if(i == 1) {
			JOptionPane.showMessageDialog(null, "Inserção realizada!");
		}else {
			JOptionPane.showMessageDialog(null, "Oh oh... inserção não realizada!");
		}
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro :(\n" + ex);
		}
	}
	public static void update(Aluno a) {
		try {
			PreparedStatement ps = Conn.connect().prepareStatement("update aluno set nome = ?, turma = ? where ra = ?");
			
			ps.setString(1, a.getNome());
			ps.setString(2, a.getTurma());
			ps.setString(3, a.getRa());
			
			int i = ps.executeUpdate();
			
			if(i == 1) {
				JOptionPane.showMessageDialog(null, "Atualização realizada!");
			}else {
				JOptionPane.showMessageDialog(null, "Oh oh... inserção não realizada!");
			}
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, "Erro :(\n" + ex);
			}
	}
	public static void delete(Aluno a) {
		try {
			PreparedStatement ps = Conn.connect().prepareStatement("delete from aluno where ra = ? and nome = ?");
			
			ps.setString(1, a.getRa());
			ps.setString(2, a.getNome());
			
			int i = ps.executeUpdate();
			
			if(i == 1) {
				JOptionPane.showMessageDialog(null, "Exclusão realizada!");
			}else {
				JOptionPane.showMessageDialog(null, "Oh oh... inserção não realizada!");
			}
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, "Erro :(\nMuito provavelmente existem cartões respostas registrados com esse aluno..\n\n" + ex);
			}
	}
	public static String suggestRA() {
		String ra = "";
		try {
		PreparedStatement ps = Conn.connect().prepareStatement("Select ra from aluno order by ra asc");
		ResultSet rs = ps.executeQuery();
		
		
		while(rs.next()) {//ra nome turma
			
			ra = rs.getString("ra");
		}
		ra = (Integer.parseInt(ra) + 1) + "";
		 
		
		
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro na classe DAOAluno - Listar por RA");
		}finally {
			return ra;
		}
	}
	public static void listDados(JTable tableDados, Ordem o) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = Conn.connect().prepareStatement("select ra, nome, turma, resultado, ano, etapa, area, tipo from aluno join cartoes on ra = aluno_ra order by " + o.getOrder());
			
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			tableDados.setModel(DbUtils.resultSetToTableModel(rs));
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro :(\n" + e);
			// TODO: handle exception
		}
	}
}
