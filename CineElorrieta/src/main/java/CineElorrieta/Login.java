package CineElorrieta;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener,FocusListener{
	
	//LABELS
	public JLabel adminLabel,passLabel,mensaje;
	//TEXTFIELD
	public JTextField adminText;
	//PASSWORDFIELD
	public JPasswordField passText;
	//BOTONES
	public JButton entrar,salir;
	//CLASE DE METODOS
	public SistemaLogin sistemaLogin = new SistemaLogin();
	//STRINGS PARA COMPROBAR
	public String administrador="admin",password="1234";
		
	public Login(){
		
		setLayout(null);
		
		adminLabel = new JLabel("Administrador:");
		adminLabel.setBounds(10, 10, 100, 30);
		add(adminLabel);
		
		passLabel = new JLabel("Contraseña:");
		passLabel.setBounds(10, 50, 100, 30);
		add(passLabel);
		
		adminText=new JTextField();
		adminText.setBounds(130, 15, 100, 20);
		adminText.addFocusListener(this);
	    add(adminText);
	    
	    passText=new JPasswordField();
	    passText.setBounds(130, 55, 100, 20);
	    passText.addFocusListener(this);
	    add(passText);

	    entrar=new JButton("Entrar");
	    entrar.setBounds(10, 100, 80, 25);  
	    entrar.addActionListener(this);
	    add(entrar);  
	    
	    salir=new JButton("Salir");
	    salir.setBounds(150, 100, 80, 25);  
	    salir.addActionListener(this);
	    add(salir);
	    
	    mensaje=new JLabel("*INTROUCE EL ADMINISTRADOR Y CONTRASEÑA CORRECTOS");
		mensaje.setBounds(10, 150, 350, 25);
		mensaje.setForeground(Color.RED);
		mensaje.setVisible(false);
		add(mensaje);
	    
	}
	
	public void actionPerformed(ActionEvent e){
		 
		//ENVIAR
		 if(e.getSource()==entrar){	
			 sistemaLogin.checkAdmin(adminText.getText(),new String(passText.getPassword()));
			
		 }
		 //SALIR
		 if(e.getSource()==salir){	      
			
			 
		 }		 
	 }
	
	//FOCUS
	@Override
	public void focusGained(FocusEvent e) {
		
		if(e.getSource()==adminText){
			 /*remove(mensaje);
			 repaint();
			 revalidate();*/
			
		}
		
		if(e.getSource()==passText){
			 /*remove(mensaje);
			 repaint();
			 revalidate();*/
			
		}
		 		
		
	}

	//QUITAR FOCUS
	@Override
	public void focusLost(FocusEvent e) {
		
	}
	

	public static void main(String[] ar){
		Login login=new Login ();
		login.setBounds(0, 0, 900, 600);
		login.setVisible(true);    
		login.setResizable(false);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


	

}
