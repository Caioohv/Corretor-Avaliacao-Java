package dataAcess;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import conexao.Conn;
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
}
