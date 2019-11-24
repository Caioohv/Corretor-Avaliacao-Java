package modelo;

public class Ordem {
	private String print = "", order = "";

	@Override
	public String toString() {
		return "Ordenar por: " + print;
	}

	public String getPrint() {
		return print;
	}

	public void setPrint(String print) {
		this.print = print;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}
	
	
	
}
