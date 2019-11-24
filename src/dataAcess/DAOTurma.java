package dataAcess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import conexao.Conn;
import modelo.Curso;
import modelo.Turma;

public class DAOTurma {
	public static int insert(Turma t) {
		int xesque = 0;
		try {
			 PreparedStatement ps = Conn.connect().prepareStatement("insert into turma(id_turma, curso,  ano) values (?,?,?);");
			 System.out.println("foi");
			 ps.setString(1, t.getId_turma());
			 ps.setString(2, t.getCurso());
			 ps.setInt(3, t.getAno());
			 
			 xesque=ps.executeUpdate();
			 
			 
		 }catch (Exception x) {
			// TODO: handle exception
			 System.out.println(x);
		 }finally {
			 return xesque;
		 }
	}
	
	
		
		
		public static void update(Turma c, String nome) {
			try {	
				String sql = "update turma set id_turma = ?, ano = ?, curso = ? where id_turma = ?;";
				PreparedStatement ps = Conn.connect().prepareStatement(sql);
				
				int i = ps.executeUpdate();
				if(i != 1) {
					JOptionPane.showMessageDialog(null, "Erro! ");
				}else {
					//atualizar o objeto
					JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
					
				}
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, "Erro!\n"+ex);
			}
		}
		public static void delete(Turma c) {
			try {	
				String sql = "delete from curso where id_turma = ?;";
				PreparedStatement ps = Conn.connect().prepareStatement(sql);
				ps.setString(1, c.getId_turma());
				
				int i = ps.executeUpdate();
				if(i != 1) {
					JOptionPane.showMessageDialog(null, "Erro! ");
				}else {
					JOptionPane.showMessageDialog(null, "Deletado com Sucesso!");
					
				}
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(null, "Erro!\n"+ex);
			}
		}
		public static ArrayList<Turma> getList(){
			ArrayList<Turma> ar = new ArrayList<Turma>();
			
			try {
				PreparedStatement ps = Conn.connect().prepareStatement("Select * from turma");
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					//id, curso, ano
					ar.add(new Turma(rs.getString("id_turma"), rs.getString("curso"), rs.getInt("ano")));
				}
				}catch(Exception ex) {
					System.out.println(ex);
					
				}finally {
					return ar;
				}
	}
		public static void listar(JComboBox<Turma> jc){
			
			try {
				PreparedStatement ps = Conn.connect().prepareStatement("Select * from turma");
				ResultSet rs = ps.executeQuery();
				DefaultComboBoxModel<Turma> a = new DefaultComboBoxModel<Turma>();
				
				while(rs.next()) {
					//id, curso, ano
					a.addElement(new Turma(rs.getString("id_turma"), rs.getString("curso"), rs.getInt("ano")));
				}
				jc.setModel(a);
				}catch(Exception ex) {
					System.out.println(ex);
					
				}
	}

}
