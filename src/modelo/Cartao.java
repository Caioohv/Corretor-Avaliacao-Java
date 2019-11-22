package modelo;

public class Cartao {
/*
	id int pk
	imagem bytea
	respostas String
	aluno int (RA)
	resultado double
*/
	
	
	private int id, aluno; //RA
	private double resultado;
	private String resps = "", correcao = "";
	public String getResps() {
		return resps;
	}
	public void setResps(String resps) {
		this.resps = resps;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAluno() {
		return aluno;
	}
	public void setAluno(int aluno) {
		this.aluno = aluno;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public String getCorrecao() {
		return correcao;
	}
	public void setCorrecao(String correcao) {
		this.correcao = correcao;
	}
	public void acerto() {
		correcao = correcao + "C";
	}
	public void erro() {
		correcao = correcao + "F";
	}
}
