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
		 Login ventanaLogin = new Login();
		 SistemaMenu sistemaMenu = new SistemaMenu();
		 
		 if(admin.equals(administrador) && pass.equals(password)) {	
			 //CORRECTO	
			sistemaMenu.tiempoSabado=480;
			sistemaMenu.tiempoDomingo=360;
			
			Menu menuPeli = new Menu();
			menuPeli.setBounds(0,0,1024,768);
			menuPeli.setLocationRelativeTo(null);
			menuPeli.setVisible(true);
			menuPeli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ventanaLogin.setVisible(false);
			
	        
		 } else{
			 //INCORRECTO
				 JOptionPane.showMessageDialog(null, "*INTRODUCE EL ADMINISTRADOR Y CONTRASEÑA CORRECTOS");
			
			ventanaLogin.mensaje.setVisible(true);
		 }     	  
	
	}
}