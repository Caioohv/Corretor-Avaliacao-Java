package modelo;

public class Gabarito {
	private String resps = "", area = "", tipo = "";
	private int ano = 0, etapa = 0, id = 0;
	public Gabarito(String resps, String area, int ano, int etapa, String tipo) {
		super();
		this.resps = resps.toUpperCase();
		this.ano = ano;
		this.etapa = etapa;
		this.tipo = tipo.toUpperCase();
		this.area = area.toUpperCase();
	}
	public Gabarito(String resps, String area, int ano, int etapa, String tipo, int id) {
		super();
		this.resps = resps;
		this.ano = ano;
		this.etapa = etapa;
		this.tipo = tipo;
		this.area = area;
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResps() {
		return resps;
	}
	public void setResps(String resps) {
		this.resps = resps;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ano + " - " + etapa +"° etapa - "+ tipo + " - " + area + " - "+resps;
	}
	
}
