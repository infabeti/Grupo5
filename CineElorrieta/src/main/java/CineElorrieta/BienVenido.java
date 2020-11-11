package CineElorrieta;
import javax.swing.*;
import java.util.TimerTask;
import java.util.Timer;
import java.awt.Window.Type;
//import static CineElorrieta.VentanaLogin.iniciostart;


public class BienVenido extends JFrame {
    private JLabel bienvenido;
    
    public BienVenido(){
        
    	getContentPane().setLayout(null);
    	    	
        bienvenido=new JLabel("BIENVENIDO");
        bienvenido.setBounds(192,237,400,60);
        bienvenido.setFont(bienvenido.getFont().deriveFont(60f));
        getContentPane().add(bienvenido);
        
        JLabel bienvenido_1 = new JLabel("AL");
        bienvenido_1.setFont(bienvenido_1.getFont().deriveFont(60f));
        bienvenido_1.setBounds(342, 353, 100, 60);
        getContentPane().add(bienvenido_1);
        
        JLabel bienvenido_2 = new JLabel("CINE ELORRIETA");
        bienvenido_2.setFont(bienvenido_2.getFont().deriveFont(60f));
        bienvenido_2.setBounds(142, 434, 500, 60);
        getContentPane().add(bienvenido_2);

        //cronometro de 3segundos que lleva automaticamente a la siguiente ventana
        Timer cronom = new Timer();
        cronom.schedule(new TimerTask() {
        public void run(){ // método que llevará a la ventana 
      
        Login logeo =new Login();
        logeo.setBounds(0,0,900,600);
        logeo.setLocationRelativeTo(null);
        logeo.setVisible(true);
        logeo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
            
        }},3000);
        
    }

    
      public static void main(String[] ar){
       
           BienVenido inicio=new BienVenido();
           inicio.setBounds(0,0,900,600);
           inicio.setLocationRelativeTo(null);
           inicio.setVisible(true);
           inicio.setTitle("Bienvenido");
          
          
      }
}