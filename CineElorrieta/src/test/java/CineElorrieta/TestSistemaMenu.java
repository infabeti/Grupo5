package CineElorrieta;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSistemaMenu {

	 Sistema.SistemaMenu testmenu = new Sistema.SistemaMenu();
	
	
	@Test
	public void calcularTiempoSabado() {
		
		
		int tiempoSabado=480;
		int horas=tiempoSabado/60;
		int minutos=tiempoSabado%60;
		
			String esperado =""+horas+" h";
			String total= testmenu.calcularTiempoSabado();
		
		assertEquals(null, total,esperado);
	}

	@Test
	public void calcularTiempoDomingo() {
		
		
		int tiempoDomingo=360;
		int horas=tiempoDomingo/60;
		int minutos=tiempoDomingo%60;
		
			String esperado= ""+horas+" h";
			String total= testmenu.calcularTiempoDomingo();
		
		assertEquals(null, total,esperado);
	}

}

