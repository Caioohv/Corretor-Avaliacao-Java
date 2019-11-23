package dataAcess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import conexao.Conn;
import modelo.Curso;

public class DAOCursos {
	public static void listar(JComboBox jc) {
		DefaultComboBoxModel<Curso> jcm = new DefaultComboBoxModel<Curso>();
		try {
		PreparedStatement ps = Conn.connect().prepareStatement("Select * from curso");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			jcm.addElement(new Curso(rs.getInt("id"), rs.getString("nome")));
		}
		}catch(Exception ex) {
			System.out.println(ex);
			
		}finally {
			jc.setModel(jcm);
		}
		
	}
	public static void insert(String nome) {
		try {	
			String sql = "insert into curso(nome) values (?);";
			PreparedStatement ps = Conn.connect().prepareStatement(sql);
			ps.setString(1, nome);
			int i = ps.executeUpdate();
			if(i != 1) {
				JOptionPane.showMessageDialog(null, "Erro! ");
			}else {
				JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");
			}
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro!\n"+ex);
		}
	}
	public static void update(Curso c, String nome) {
		try {	
			String sql = "update curso set nome = ? where id = ?;";
			PreparedStatement ps = Conn.connect().prepareStatement(sql);
			ps.setString(1, nome);
			ps.setInt(2, c.getId());
			
			int i = ps.executeUpdate();
			if(i != 1) {
				JOptionPane.showMessageDialog(null, "Erro! ");
			}else {
				c.setNome(nome);
				JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
				
			}
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro!\n"+ex);
		}
	}
	public static void delete(Curso c) {
		try {	
			String sql = "delete from curso where nome = ?;";
			PreparedStatement ps = Conn.connect().prepareStatement(sql);
			ps.setString(1, c.getNome());
			
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
}
