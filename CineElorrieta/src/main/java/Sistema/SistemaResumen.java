package Sistema;

public class SistemaResumen {

	Ventanas.Menu Menu = new Ventanas.Menu();
	SistemaMenu sistemaMenu = new Sistema.SistemaMenu();
	//Ventanas.Resumen resumen = new Ventanas.Resumen();
	
	//public String peliculaSabado[];
	
	public void peliculaElegida(){
		
		int peliElegida = Menu.dramaSabado.getSelectedIndex();
		System.out.print(peliElegida+ " hola ");
		String xc =  sistemaMenu.peliculasDrama[peliElegida];
		
		for(int i=0; i<sistemaMenu.peliculasDrama.length; i++) {
			
			//peliculaSabado[peliElegida]= sistemaMenu.peliculasDrama[peliElegida];
			
			System.out.println(sistemaMenu.peliculasDrama[i]);	
		}
		
	}
	
	int peliElegida = Menu.comediaSabado.getSelectedIndex();
//	String xc =  sistemaMenu.peliculasDrama[peliElegida];
//	//System.out.print(xc+ " hola ");
//	System.out.print(peliElegida+ " hola ");
//	

}
