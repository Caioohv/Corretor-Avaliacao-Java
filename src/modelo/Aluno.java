package modelo;

public class Aluno {
/*ra varchar(10) primary key,
nome text,
turma varchar(10) references turma(id_turma)
*/
	String ra, nome, turma;

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		return ra + " - " + nome;
	}

	public Aluno(String ra, String nome, String turma) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.turma = turma;
	}
	



}
