
package corretor;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import dataAcess.DAOGabarito;
import modelo.Cartao;
import modelo.Gabarito;

import static corretor.Util.getSource;
import static corretor.Util.sout;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void maingggg(String[] args) throws Exception {

        sout("...started");

        Mat source = Imgcodecs.imread(getSource("sheet-1.jpg"));
        
        Scanner scanner = new Scanner(source, 20);
        scanner.setLogging(true);
        ArrayList<String> a = scanner.scanr();

        sout("...finished");
        
        
    }
    /*public static String ler() throws Exception {

        sout("...started");
        //JFileChooser jf = new JFileChooser();
        //sout("\n\n\n\n ------------- \n\n "+)
        ArrayList<String> path = Scan.getPaths();
        String g = (path.get(0));
        sout(g);
        Mat source = Imgcodecs.imread(g);
        
        Scanner scanner = new Scanner(source, 20);
        scanner.setLogging(true);
        ArrayList<String> a = scanner.scanr();
		String resps = "";
        for(String s: a) {
        	resps = resps + s;
        }
        System.out.println(resps);
        return resps;
        
    }
    */
    public static ArrayList<Cartao> ler() throws Exception {

        sout("...started");
        //JFileChooser jf = new JFileChooser();
        //sout("\n\n\n\n ------------- \n\n "+)
        ArrayList<String> path = Scan.getPaths();
        //String g = (path.get(0));
        //sout(g);
        ArrayList<Cartao> ar = new ArrayList<Cartao>();
        for(String s: path) {
        	Mat source = Imgcodecs.imread(s);
            
            Scanner scanner = new Scanner(source, 20);
            scanner.setLogging(true);
            ArrayList<String> a = scanner.scanr();
    		String resps = "";
            for(String s1: a) {
            	resps = resps + s1;
            }
            //System.out.println(resps);
            Cartao c = new Cartao();
            c.setAluno((JOptionPane.showInputDialog(null, "Qual o RA do aluno do arquivo "+s+" ?")));
            //c.setAluno(I);
            c.setResps(resps);
            System.out.println(c);
            ar.add(c);
        }
        
        
        return ar;
        
    }
    public static ArrayList<String> getLista(String g) throws Exception {

        sout("...started");

        Mat source = Imgcodecs.imread(getSource("sheet-1.jpg"));
        
        Scanner scanner = new Scanner(source, 20);
        scanner.setLogging(true);
        ArrayList<String> a = scanner.scanr();

        sout("...finished");
        return a;
        
    }
    
    public static ArrayList<String> getListByFileChooser() throws Exception {

        sout("...started");
        JFileChooser jf = new JFileChooser();
        
        Mat source = Imgcodecs.imread(getSource("sheet-1.jpg"));
        
        Scanner scanner = new Scanner(source, 20);
        scanner.setLogging(true);
        ArrayList<String> a = scanner.scanr();

        sout("...finished");
        return a;
        
    }
	public static ArrayList<String> getList(String g) throws Exception {
		
        sout("...started");
        
        Mat source = Imgcodecs.imread(getSource("sheet-1.jpg"));
        
        Scanner scanner = new Scanner(source, 20);
        scanner.setLogging(true);
        ArrayList<String> a = scanner.scanr();

        sout("...finished");
        return a;
	}
    
	
	//GETBYPATH
public static ArrayList<String> getPaths() throws Exception {
		
        sout("...started");
        
        

        ArrayList<String> a = Scan.getPaths();
        
        
        sout("...finished");
        return a;
	}
	public static void main(String[] args) throws Exception {
		int a = 1;
		while(a != 11) {
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Corrigir imagens\n2 - Inserir Gabarito (respostas certas)"
					+ "\n3 - CRUD aluno\n4 - CRUD turma\n5 - CRUD tabela alunos x notas\n6 - Sair"));
			switch(a) {
			case 1:
				Gabarito ge = null;
				lerGabarito( ge);
				break;
			case 2:
				Gabarito g = new Gabarito(JOptionPane.showInputDialog("Gabarito:"), 
					JOptionPane.showInputDialog("Area:"), Integer.parseInt(JOptionPane.showInputDialog("Ano:")),
					Integer.parseInt(JOptionPane.showInputDialog("Etapa:")), (JOptionPane.showInputDialog("Tipo:")) );
				DAOGabarito.insert(g);
				System.out.println("Inserted!\n\n");
				break;
			case 3:
				//CrudAlunos();
				break;
			case 6:
				System.exit(0);
				
				break;
			
			
		
		}
			
		}
		//Gabarito g = new Gabarito("", "Linguagens", 2017,3, "A" );
		//DAOGabarito.insert(g);
		
		Gabarito g2 = DAOGabarito.select(2011, 1, "C" , "Linguagens");
		System.out.println("Selected:\n"+g2);
		
		
		

	}
	
	public static void lerGabarito(Gabarito g) throws Exception {
		String resps; int ano = 2019; int etapa = 3;
		int valorProva=10, qntquestoes=20;
		
		ArrayList<Cartao> valores = ler();
		for(Cartao c: valores) {
		cadastroGabarito.corretor.corrigir(c, g);
		}
		
		//Atribui nota
		for(Cartao c: valores) {
			cadastroGabarito.corretor.avaliar(c, valorProva, qntquestoes);
		}
		
		System.out.println("\n\n --- --- --- --- --- --- ---:");
		for(Cartao c: valores) {
			System.out.println("RA:		"+c.getAluno());
			System.out.println("Nota: 		"+c.getResultado());
			System.out.println("Correção:	"+c.getCorrecao());
			System.out.println("Respostas: 	"+c.getResps());
			System.out.println("\n\n----- 		---------");
			
		}
	}
	public static ArrayList<Cartao> lerGabaritoR(Gabarito g) throws Exception {
		String resps; int ano = 2019; int etapa = 3;
		double valorProva= Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da prova?\nPadrão: 10"));
		int qntquestoes=20;
		
		ArrayList<Cartao> valores = ler();
		for(Cartao c: valores) {
			System.out.println(c.getResps());
			cadastroGabarito.corretor.corrigir(c, g);
		}
		
		//Atribui nota
		for(Cartao c: valores) {
			cadastroGabarito.corretor.avaliar(c, valorProva, qntquestoes);
		}
		
		System.out.println("\n\n --- --- --- --- --- --- ---:");
		for(Cartao c: valores) {
			System.out.println("RA:		"+c.getAluno());
			System.out.println("Nota: 		"+c.getResultado());
			System.out.println("Correção:	"+c.getCorrecao());
			System.out.println("Respostas: 	"+c.getResps());
			System.out.println("\n\n----- 		---------");
			
		}
		return valores;
	}
    
}
