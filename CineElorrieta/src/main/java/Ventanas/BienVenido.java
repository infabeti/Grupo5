package Ventanas;
import javax.swing.*;

import java.util.TimerTask;
import java.util.Timer;
import java.awt.Window.Type;
import java.awt.Font;
//import static CineElorrieta.VentanaLogin.iniciostart;


public class BienVenido extends JFrame {
    private JLabel bienvenido;
    
    public BienVenido(){
        
    	getContentPane().setLayout(null);
    	    	
        bienvenido=new JLabel("BIENVENIDO");
        bienvenido.setBounds(192,237,400,60);
        bienvenido.setFont(new Font("Tahoma", Font.BOLD, 60));
        getContentPane().add(bienvenido);
        
        JLabel bienvenido_1 = new JLabel("AL");
        bienvenido_1.setFont(new Font("Tahoma", Font.BOLD, 60));
        bienvenido_1.setBounds(342, 344, 100, 60);
        getContentPane().add(bienvenido_1);
        
        JLabel bienvenido_2 = new JLabel("CINE ELORRIETA");
        bienvenido_2.setFont(new Font("Tahoma", Font.BOLD, 60));
        bienvenido_2.setBounds(110, 434, 564, 60);
        getContentPane().add(bienvenido_2);

        //cronometro de 3segundos que lleva automaticamente a la siguiente ventana
        Timer cronom = new Timer();
        cronom.schedule(new TimerTask() {
        public void run(){ // método que llevará a la ventana 
      
        Login logeo =new Login();
        logeo.setBounds(0,0,1024,768);
        logeo.setLocationRelativeTo(null);
        logeo.setVisible(true);
        logeo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
            
        }},3000);
        
    }

    
      public static void main(String[] ar){
       
           BienVenido inicio=new BienVenido();
           inicio.setBounds(0,0,1024,768);
           inicio.setLocationRelativeTo(null);
           inicio.setVisible(true);
           inicio.setTitle("Bienvenido");
          
          
      }
}