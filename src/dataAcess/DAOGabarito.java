package dataAcess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import conexao.Conn;
import modelo.Gabarito;

public class DAOGabarito {
	 @SuppressWarnings("finally")
	public static Gabarito select(int ano, int etapa, String tipo, String area) {
		 Gabarito g = null;
		 try {
		 PreparedStatement ps = Conn.connect().prepareStatement("Select * from gabarito where ano = ?, etapa = ?, tipo = ?, area = ?");
		 ps.setInt(1, ano );
		 ps.setInt(2, etapa );
		 ps.setString(3, tipo );
		 ps.setInt(4, ano );
		 ResultSet rs = ps.executeQuery();
		 
		 int ano1,  etapa1,  id1;
		 String resps_certas1 = "", area1 = "", tipo1 = "";
		 
		 resps_certas1 = rs.getString("resps_certas");
		 ano1 = rs.getInt("ano");
		 etapa1 = rs.getInt("etapa");
		 tipo1 = rs.getString("tipo");
		 area1 = rs.getString("area");
		 id1 = rs.getInt("id");
		 
		 g = new Gabarito(resps_certas1, area1, ano1,  etapa1,  tipo1,  id1);
		 }catch (Exception e){
			 System.out.println("Erro! Detalhes: "+e);
		 }finally {
			 return g;
		 }
	 }
	 public static void insert(Gabarito g) {
		
		 try {
			 PreparedStatement ps = Conn.connect().prepareStatement("insert into gabarito(ano, etapa,  area, tipo  ,resps) values (?,?,?,?,?);");
			 ps.setInt(1, g.getAno());
			 ps.setInt(2, g.getEtapa());
			 ps.setString(3, g.getArea());
			 ps.setString(4, g.getTipo());
			 ps.setString(5, g.getResps());
			 ps.executeUpdate();
			 JOptionPane.showMessageDialog(null, "Gabarito Inserido!");
			 
		 }catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e);
		}
		 
	 }
}
