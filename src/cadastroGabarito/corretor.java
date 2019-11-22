package cadastroGabarito;

import modelo.Cartao;

public class corretor {
	private static String gabarito = "";
	public static Cartao corrigir(Cartao c){
		gabarito = getGabarito();
		
		String correcao = "";
		
		for(int i = 0; i < c.getResps().length(); i++) {
			if(c.getResps().toUpperCase().charAt(i) == gabarito.toUpperCase().charAt(i)) {
				
				System.out.println((i+1) + " - Certa");
				correcao = correcao + ("C");
				c.acerto();
			} else {
				System.out.println((i+1) + " - Errada");
				correcao = correcao + ("F");
				c.erro();
			}
			
		}
		System.out.println("\n\n\n\n\n");
		System.out.println(c.getCorrecao());
		return c;
	}
	private static String getGabarito() {
		return "BCADBCADBCDACBADBCAD";
		
	}
	public static Cartao avaliar(Cartao c, double valorProva, int qntquestoes) {
		String rs = c.getCorrecao();
		double valorquestao = valorProva / qntquestoes;
		double result = 0;
		for(int i = 0; i < c.getCorrecao().length(); i++) {
			if(c.getCorrecao().toUpperCase().charAt(i) == 'C') {
				result = result + valorquestao;
			}
		}
		c.setResultado(result);
		
		
		return c;
		
	}
}
