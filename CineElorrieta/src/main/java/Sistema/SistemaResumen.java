package Sistema;

import javax.swing.JOptionPane;

	
public class SistemaResumen {
	
	 public static int peliElegida;
	
	//Ventanas.Resumen resumen = new Ventanas.Resumen();
	
	//public String peliculaSabado[];
	
	
	public void peliculaElegida(){
		Ventanas.Menu Menu = new Ventanas.Menu();
	SistemaMenu sistemaMenu = new SistemaMenu();
	
		 peliElegida = Menu.dramaSabado.getSelectedIndex();
		System.out.print(peliElegida+ " hola ");
		
		String xc =  sistemaMenu.peliculasDrama[peliElegida];
		System.out.print(xc+ " hola ");
		 xc =  sistemaMenu.peliculasDrama[2];
		
		JOptionPane.showMessageDialog(null, xc);
		System.out.print(xc+ " hola ");
		
//		for(int i=0; i<sistemaMenu.peliculasDrama.length; i++) {
//			
//			//peliculaSabado[peliElegida]= sistemaMenu.peliculasDrama[peliElegida];
//			
//			System.out.println(sistemaMenu.peliculasDrama[i]);	
//		}
		
	}
	
	//int peliElegida = Menu.comediaSabado.getSelectedIndex();
//	String xc =  sistemaMenu.peliculasDrama[peliElegida];
//	//System.out.print(xc+ " hola ");
//	System.out.print(peliElegida+ " hola ");
//	

}
