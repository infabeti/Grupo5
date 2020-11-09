package CineElorrieta;
import javax.swing.*;
import java.util.TimerTask;
import java.util.Timer;
//import static CineElorrieta.VentanaLogin.iniciostart;


public class BienVenido extends JFrame {
    private JLabel bienvenido;
    
    public BienVenido(){
        
    	setLayout(null);
    	    	
        bienvenido=new JLabel("BIENVENIDO AL CINE ELORRIETA");
        bienvenido.setBounds(250,230,900,60);
        bienvenido.setFont(bienvenido.getFont().deriveFont(60f));
        add(bienvenido);

        //cronometro de 3segundos que lleva automaticamente a la siguiente ventana
        Timer cronom = new Timer();
        cronom.schedule(new TimerTask() {
        public void run(){ // método que llevará a la ventana 
      
        Login.iniciostart=new Login();
        iniciostart.setBounds(0,0,900,600);
        iniciostart.setVisible(true);
        iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
            
        }},3000);
        
    }

    
      public static void main(String[] ar){
       
           BienVenido inicio=new BienVenido();
           inicio.setBounds(0,0,900,600);
           inicio.setVisible(true);
           inicio.setTitle("Bienvenido");
          
          
      }
    
    
}