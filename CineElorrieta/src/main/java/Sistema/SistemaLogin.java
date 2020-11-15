package Sistema;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Ventanas.Login;
import Ventanas.Menu;

public class SistemaLogin {

	
	//METODO PARA CHECKEAR QUE ADMIN Y CONTRASEÑA
	public void checkAdmin(String admin,String pass) {
		
		 Login ventanaLogin= new Login();
		 
		 if(admin.equals(ventanaLogin.administrador) && pass.equals(ventanaLogin.password)) {	
			 //CORRECTO	
			System.out.println("Correcto");
			Menu menuPeli = new Menu();
			menuPeli.setBounds(0,0,1024,768);
			menuPeli.setLocationRelativeTo(null);
			menuPeli.setVisible(true);
			menuPeli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
		 }else{
			 //INCORRECTO
			System.out.println("Incorrecto");
			ventanaLogin.mensaje.setVisible(true);
		 }     	  
	
	}
}