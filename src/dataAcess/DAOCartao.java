package dataAcess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import conexao.Conn;
import modelo.Cartao;
import net.proteanit.sql.DbUtils;

public class DAOCartao {
	
	/*
	 * create table cartoes(
	 * id serial primary key,
	 * resps varchar(20),
	 * ano int,
	 * etapa int,
	 * area varchar(25),
	 * tipo char(1),
	 * aluno_ra varchar(10) references aluno(ra),
	 * resultado float
	 * );
	 */
	@SuppressWarnings("finally")
	public static TableModel selectModel() {
		TableModel model = null;
		try {
			String sql = "Select * from Cartao";
			PreparedStatement ps = Conn.connect().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			model = DbUtils.resultSetToTableModel(rs);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			return model;
		}
			
			
	}
	public static int insert(Cartao c) {
		int i = 0;
		
		try {	
			String sql = "insert into cartoes(ano, etapa, resultado, resps, correcao, aluno_ra, area, tipo) values (?,?,?,?,?,?,?,?);";
			//int ano, int etapa, double resultado, String resps, String correcao, String aluno, String area,String tipo
			PreparedStatement ps = Conn.connect().prepareStatement(sql);
			
			ps.setInt(1, c.getAno());
			ps.setInt(2, c.getEtapa());
			ps.setFloat(3, (c.getResultado()));
			ps.setString(4, c.getResps());
			ps.setString(5, c.getCorrecao());
			ps.setString(6, c.getAluno());
			ps.setString(7, c.getArea());
			ps.setString(8, c.getTipo());
			
			i = ps.executeUpdate();
			if(i != 1) {
				JOptionPane.showMessageDialog(null, "Erro! ");
			}else {
				JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");
			}
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro!\n"+ex);
		}finally {

		
		
		return i;
		}
	}
	
}


/*
create table cartoes(
id serial primary key,
resps varchar(20),
aluno_ra int references aluno(ra),
resultado float
);
*/