package dataAcess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import conexao.Conn;
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
	public static int insert() {
		
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