package Sistema;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Ventanas.Login;
import Ventanas.Menu;

public class SistemaLogin {

	
	//METODO PARA CHECKEAR QUE ADMIN Y CONTRASEÑA
	public void checkAdmin(String admin,String pass) {
		
		//STRINGS PARA COMPROBAR
		 String administrador="admin",password="1234";
		 Ventanas.Login ventanaLogin = new Ventanas.Login();
		 SistemaMenu sistemaMenu = new SistemaMenu();
		 
		 if(admin.equals(administrador) && pass.equals(password)) {	
			 //CORRECTO	
			//Antes de nada inicializamos todos los valores a su valor estandar
			sistemaMenu.tiempoSabado=480;
			sistemaMenu.tiempoDomingo=360;
			
			sistemaMenu.tiempoEscogidoSabado=0;
			sistemaMenu.tiempoEscogidoDomingo=0;
			
			sistemaMenu.peliDramaSabBloqueado=false;
			sistemaMenu.peliComeSabBloqueado=false; 
			sistemaMenu.peliCienciaSabBloqueado=false; 
			sistemaMenu.peliTerrorSabBloqueado=false;	
			sistemaMenu.peliDramaDominBloqueado=false;
			sistemaMenu.peliComeDominBloqueado=false;
			sistemaMenu.peliCienciaDominBloqueado=false;
			sistemaMenu.peliTerrorDominBloqueado=false;	
			
			Menu menuPeli = new Menu();
			menuPeli.setBounds(0,0,1024,768);
			menuPeli.setLocationRelativeTo(null);
			menuPeli.setVisible(true);
			menuPeli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ventanaLogin.setVisible(false);
			ventanaLogin.dispose();
			
	        
		 } else{
			 //INCORRECTO
				 JOptionPane.showMessageDialog(null, "*INTRODUCE EL ADMINISTRADOR Y CONTRASEÑA CORRECTOS");
			
			ventanaLogin.mensaje.setVisible(true);
		 }     	  
	
	}
}