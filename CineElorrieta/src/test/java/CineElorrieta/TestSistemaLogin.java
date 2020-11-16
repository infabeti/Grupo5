package CineElorrieta;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSistemaLogin {

	// Sistema.SistemaLogin sistemaLogin = new Sistema.SistemaLogin();
	private String administrador="admin",password="1234";
	private String adminEscrito,passEscrita;
	private String resultado;
	
	@Test
	public void testCheckAdmin() {
		
		adminEscrito="admin";
		passEscrita="1234";
		
		if(adminEscrito.equals(administrador) && passEscrita.equals(password)) {	
			//CORRECTO
			resultado="Correcto";
		 }else{
			//INCORRECTO
			resultado="Incorrecto"; 
		 }     	
		
		assertEquals("Correcto", resultado);
		
	} 

}

