package CineElorrieta;

import java.awt.Color;

import javax.swing.JLabel;

public class SistemaLogin {

	
	//METODO PARA CHECKEAR QUE ADMIN Y CONTRASEÑA
	public void checkAdmin(String admin,String pass) {
		
		 Login ventanaLogin= new Login();
		 
		 if(admin.equals(ventanaLogin.administrador) && pass.equals(ventanaLogin.password)) {	
			 //CORRECTO	
			System.out.println("Correcto");
		 }else{
			 //INCORRECTO
			System.out.println("Incorrecto");
			ventanaLogin.mensaje.setVisible(true);
		 }     	  
	
	}
}