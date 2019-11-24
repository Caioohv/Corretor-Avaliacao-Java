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
		 PreparedStatement ps = Conn.connect().prepareStatement("Select * from gabarito where ano = ? and etapa = ? and tipo = ? and area = ?");
		 System.out.println(ano + " - "+ etapa + " - "+ tipo + " - " + area);
		 ps.setInt(1, ano );
		 ps.setInt(2, etapa );
		 ps.setString(3, tipo );
		 ps.setString(4, area );
		 
		 ResultSet rs = ps.executeQuery();
		 
		 String resps = "", areaa = "", tipoo = "";
		 int anoo = 0, etapaa = 0, id = 0;
		 while(rs.next()) {
		 resps = rs.getString("resps");
		 anoo = rs.getInt("ano");
		 etapaa = rs.getInt("etapa");
		 tipoo = rs.getString("tipo");
		 areaa = rs.getString("area");
		 id = rs.getInt("id");
		 }
		 g = new Gabarito(resps, areaa, anoo,  etapaa,  tipoo,  id);
		 System.out.println(g);
		 }catch (Exception e){
			 System.out.println("Erro! Detalhes: "+e);
		 }finally {
			 if(g.getResps().isEmpty()) {
				 g.setResps("AAAAAAAAAAAAAAAAAAAA");// = ;
			 }
			 return g;
		 }
	 }
	 public static void insert(Gabarito g) {
		
		 try {
			 System.out.println("Chegou 2");
			 PreparedStatement ps = Conn.connect().prepareStatement("insert into gabarito(ano, etapa,  area, tipo  ,resps) values (?,?,?,?,?)");
			 ps.setInt(1, g.getAno());
			 ps.setInt(2, g.getEtapa());
			 ps.setString(3, g.getArea());
			 ps.setString(4, g.getTipo());
			 ps.setString(5, g.getResps());
			 System.out.println("Chegou 3");
			 int i = ps.executeUpdate();
			 System.out.println("Chegou 4");
			 if(i == 1) {
				 JOptionPane.showMessageDialog(null, "Gabarito Inserido!");
			 }else {
				 JOptionPane.showMessageDialog(null, "Eita! Aconteceu algo de errado...");
			 }
			 
		 }catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e);
		}
		 
	 }
}
