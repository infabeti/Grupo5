package Ventanas;
import javax.swing.*;

import java.util.TimerTask;
import java.util.Timer;
import java.awt.Window.Type;
import java.awt.Font;
//import static CineElorrieta.VentanaLogin.iniciostart;


public class Final extends JFrame {
    private JLabel gracias;
    
    public Final(){
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	setTitle("Gracias!");
        
    	getContentPane().setLayout(null);
    	    	
        gracias=new JLabel("GRACIAS!!");
        gracias.setBounds(304,339,400,60);
        gracias.setFont(new Font("Tahoma", Font.BOLD, 60));
        getContentPane().add(gracias);
        
   
        //cronometro de 3segundos que lleva automaticamente a la siguiente ventana
        Timer cronom = new Timer();
        cronom.schedule(new TimerTask() {
        public void run(){ // método que llevará a la ventana 
      
        	BienVenido bienvenido =new BienVenido();
        	bienvenido.setBounds(0,0,1024,768);
        	bienvenido.setLocationRelativeTo(null);
        	bienvenido.setVisible(true);
        	bienvenido.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	dispose();
            
        }},2000);
        
    }

    
      public static void main(String[] ar){
       
           Final fin =new Final();
           fin.setBounds(0,0,1024,768);
           fin.setLocationRelativeTo(null);
           fin.setVisible(true);
           fin.setTitle("¡¡Gracias!!");
          
          
      }
}