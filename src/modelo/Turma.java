package modelo;

public class Turma {
	private String id_turma, curso;
	private int ano;
	
	public Turma(String id_turma, String curso, int ano) {
		super();
		this.id_turma = id_turma;
		this.curso = curso;
		this.ano = ano;
	}

	public String getId_turma() {
		return id_turma;
	}

	public void setId_turma(String id_turma) {
		this.id_turma = id_turma;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
