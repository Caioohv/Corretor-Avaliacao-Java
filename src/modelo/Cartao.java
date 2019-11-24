package modelo;

public class Cartao {
/*
	id int pk
	imagem bytea
	respostas String
	aluno int (RA)
	resultado double
*/
	//resps ok, correcao ok, anook, etapaok, areaok, tipook, aluno_raok, resultadook
	
	@Override
	public String toString() {
		return "Cartao [ano=" + ano + ", etapa=" + etapa + ", resultado=" + resultado + ", resps=" + resps
				+ ", correcao=" + correcao + ", aluno=" + aluno + ", area=" + area + ", tipo=" + tipo + "]";
	}
	private int id, ano, etapa; //RA
	private float resultado;
	private String resps = "", correcao = "", aluno = "", area = "", tipo = "";
	public String getResps() {
		return resps;
	}
	public void setResps(String resps) {
		this.resps = resps;
	}
	public Cartao() {
		super();
	}
	//sem id
	public Cartao(int ano, int etapa, float resultado, String resps, String correcao, String aluno, String area,
			String tipo) {
		super();
		this.ano = ano;
		this.etapa = etapa;
		this.resultado = resultado;
		this.resps = resps;
		this.correcao = correcao;
		this.aluno = aluno;
		this.area = area;
		this.tipo = tipo;
	}
	//com id
	public Cartao(int id, int ano, int etapa, float resultado, String resps, String correcao, String aluno,
			String area, String tipo) {
		super();
		this.id = id;
		this.ano = ano;
		this.etapa = etapa;
		this.resultado = resultado;
		this.resps = resps;
		this.correcao = correcao;
		this.aluno = aluno;
		this.area = area;
		this.tipo = tipo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getEtapa() {
		return etapa;
	}
	public void setEtapa(int etapa) {
		this.etapa = etapa;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAluno() {
		return aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	public float getResultado() {
		return resultado;
	}
	public void setResultado(float resultado) {
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
