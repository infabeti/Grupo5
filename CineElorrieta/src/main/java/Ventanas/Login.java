package Ventanas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;

public class Login extends JFrame implements ActionListener{
	
	//LABELS
	public JLabel adminLabel,passLabel,mensaje;
	//TEXTFIELD
	public JTextField adminText;
	//PASSWORDFIELD
	public JPasswordField passText;
	//BOTONES
	public JButton entrar,salir;
	//CLASE DE METODOS
	public Sistema.SistemaLogin sistemaLogin = new Sistema.SistemaLogin();
	private JLabel lblCineElorrieta;
		
	public Login(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		adminLabel = new JLabel("LOGIN:");
		adminLabel.setBounds(373, 168, 122, 30);
		adminLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		getContentPane().add(adminLabel);
		
		passLabel = new JLabel("CONTRASEÑA:");
		passLabel.setBounds(322, 209, 162, 48);
		passLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		getContentPane().add(passLabel);
		
		adminText=new JTextField();
		adminText.setBounds(505, 168, 126, 30);
	    getContentPane().add(adminText);
	    
	    passText=new JPasswordField();
	    passText.setBounds(505, 222, 126, 30);
	    getContentPane().add(passText);

	    entrar=new JButton("ENTRAR");
	    entrar.setBounds(574, 338, 131, 33);
	    entrar.setFont(new Font("Tahoma", Font.BOLD, 20));
	    entrar.addActionListener(this);
	    getContentPane().add(entrar);  
	    
	    salir=new JButton("SALIR");
	    salir.setBounds(373, 338, 100, 33);
	    salir.setFont(new Font("Tahoma", Font.BOLD, 20));
	    salir.addActionListener(this);
	    getContentPane().add(salir);
	    
	    mensaje=new JLabel("*INTRODUCE EL ADMINISTRADOR Y CONTRASEÑA CORRECTOS");
	    mensaje.setBounds(355, 400, 350, 25);
		mensaje.setForeground(Color.RED);
		mensaje.setVisible(false);
		getContentPane().add(mensaje);
		
		lblCineElorrieta = new JLabel("CINE ELORRIETA");
		lblCineElorrieta.setBounds(384, 61, 240, 30);
		lblCineElorrieta.setFont(new Font("Tahoma", Font.BOLD, 26));
		getContentPane().add(lblCineElorrieta);
	    
	}
	
	public void actionPerformed(ActionEvent e){
		 
		//ENVIAR
		 if(e.getSource()==entrar){	
			 sistemaLogin.checkAdmin(adminText.getText(),new String(passText.getPassword()));
			 
		 }
		 //SALIR
		 if(e.getSource()==salir){	      
			 JOptionPane.showMessageDialog(null, "La operación se ha cancelado.");
			 System.exit(0);
			 
		 }		 
	 }
	
	public static void main(String[] ar){
		Login login=new Login ();
		login.setBounds(0, 0, 1024,768);
		login.setLocationRelativeTo(null);
		login.setVisible(true);    
		login.setResizable(false);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
