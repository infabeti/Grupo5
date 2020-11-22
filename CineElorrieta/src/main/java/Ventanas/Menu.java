package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sistema.SistemaMenu;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

public class Menu extends JFrame implements ActionListener {

	Sistema.SistemaMenu sistemaMenu = new Sistema.SistemaMenu();
	
	public JPanel contentPane;
	public static String pelidramaSab,peliComeSab, peliCienciaSab, peliTerrorSab;
	public static String pelidramaDomin,peliComeDomin, peliCienciaDomin, peliTerrorDomin;
	public static String pelidramaSabFinal,peliComeSabFinal, peliCienciaSabFinal, peliTerrorSabFinal;
	public static String pelidramaDominFinal,peliComeDominFinal, peliCienciaDominFinal, peliTerrorDominFinal;
	public static JComboBox dramaSabado,comediaSabado,terrorSabado,cienciaSabado, dramaDomingo,comediaDomingo,terrorDomingo,cienciaDomingo;
	public JButton btnSiguiente;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBackground(Color.RED);
		setTitle("Menu");
		setBounds(100, 100, 1031, 733);
		contentPane = new JPanel();
		contentPane.setBorder(null);

		setContentPane(contentPane); 
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(443, 41, 124, 50);
		contentPane.add(lblNewLabel);
		
		//LABEL DEL TIEMPO SABADO
		JLabel labelSabado = new JLabel("S\u00E1bado: "+sistemaMenu.calcularTiempoSabado());
		labelSabado.setFont(new Font("Tahoma", Font.PLAIN, 25));
		labelSabado.setBounds(130, 114, 242, 31);
		contentPane.add(labelSabado);
		
		dramaSabado=new JComboBox();
		dramaSabado.setBackground(Color.WHITE);
		dramaSabado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dramaSabado.setModel(new DefaultComboBoxModel(sistemaMenu.mostrarPeliculas("drama","sabado")));
		dramaSabado.setBounds(66, 223, 366, 37);
		contentPane.add(dramaSabado);	
		dramaSabado.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("Drama");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(182, 179, 112, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Comedia");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(182, 262, 112, 31);
		contentPane.add(lblNewLabel_1_1);
		
		comediaSabado = new JComboBox();
		comediaSabado.setBackground(Color.WHITE);
		comediaSabado.setModel(new DefaultComboBoxModel(sistemaMenu.mostrarPeliculas("comedia","sabado")));
		comediaSabado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comediaSabado.setBounds(66, 305, 366, 37);
		contentPane.add(comediaSabado);
		comediaSabado.addActionListener(this);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Terror");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(687, 354, 112, 31);
		contentPane.add(lblNewLabel_1_1_1);
		
		terrorSabado = new JComboBox();
		terrorSabado.setBackground(Color.WHITE);
		terrorSabado.setModel(new DefaultComboBoxModel(sistemaMenu.mostrarPeliculas("terror","sabado")));
		terrorSabado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		terrorSabado.setBounds(66, 397, 366, 37);
		contentPane.add(terrorSabado);
		terrorSabado.addActionListener(this);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Ciencia Ficci\u00F3n");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1.setBounds(164, 446, 170, 44);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		cienciaSabado = new JComboBox();
		cienciaSabado.setBackground(Color.WHITE);
		cienciaSabado.setModel(new DefaultComboBoxModel(sistemaMenu.mostrarPeliculas("scifi","sabado")));
		cienciaSabado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cienciaSabado.setBounds(66, 502, 366, 37);
		contentPane.add(cienciaSabado);
		cienciaSabado.addActionListener(this);
		
		//LABEL DEL TIEMPO DOMINGO
		JLabel lblNewLabel_1_2_1 = new JLabel("Domingo: "+sistemaMenu.calcularTiempoDomingo());
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2_1.setBounds(669, 114, 262, 31);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Drama");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(669, 179, 112, 31);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Comedia");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_2.setBounds(669, 262, 112, 31);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Terror");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1_2.setBounds(200, 354, 112, 31);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Ciencia Ficci\u00F3n");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1_1_1_1_1.setBounds(669, 447, 155, 44);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "La operación se ha cancelado.");
				//System.exit(0);
				
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
		});
		btnSalir.setBounds(66, 619, 112, 37);
		contentPane.add(btnSalir);
		
		dramaDomingo = new JComboBox();
		dramaDomingo.setModel(new DefaultComboBoxModel(sistemaMenu.mostrarPeliculas("drama","domingo")));
		dramaDomingo.setBackground(Color.WHITE);
		dramaDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dramaDomingo.setBounds(538, 223, 394, 37);
		contentPane.add(dramaDomingo);
		dramaDomingo.addActionListener(this);
			
		comediaDomingo = new JComboBox();
		comediaDomingo.setModel(new DefaultComboBoxModel(sistemaMenu.mostrarPeliculas("comedia","domingo")));
		comediaDomingo.setBackground(Color.WHITE);
		comediaDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comediaDomingo.setBounds(538, 305, 394, 37);
		contentPane.add(comediaDomingo);
		comediaDomingo.addActionListener(this);
		
		terrorDomingo = new JComboBox();
		terrorDomingo.setModel(new DefaultComboBoxModel(sistemaMenu.mostrarPeliculas("terror","domingo")));
		terrorDomingo.setBackground(Color.WHITE);
		terrorDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		terrorDomingo.setBounds(538, 397, 394, 37);
		contentPane.add(terrorDomingo);
		terrorDomingo.addActionListener(this);
		
		cienciaDomingo = new JComboBox();
		cienciaDomingo.setModel(new DefaultComboBoxModel(sistemaMenu.mostrarPeliculas("scifi","domingo")));
		cienciaDomingo.setBackground(Color.WHITE);
		cienciaDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cienciaDomingo.setBounds(538, 502, 394, 37);
		contentPane.add(cienciaDomingo);
		cienciaDomingo.addActionListener(this);
		
		//Para bloquear-desbloquear domingo
		if(sistemaMenu.domingoBloqueado()==true) {				
			dramaDomingo.disable();
			comediaDomingo.disable();
			terrorDomingo.disable();
			cienciaDomingo.disable();
		}else {	
			dramaSabado.disable();
			comediaSabado.disable();
			terrorSabado.disable();
			cienciaSabado.disable();
		}
		
		//Para bloquear generos ya escogidos
 		if(sistemaMenu.peliDramaSabBloqueado==true) {
			dramaSabado.disable();
		}
 		
 		if(sistemaMenu.peliComeSabBloqueado==true) {
			comediaSabado.disable();
		}
 		
 		if(sistemaMenu.peliTerrorSabBloqueado==true) {
			terrorSabado.disable();
		}
 		
 		if(sistemaMenu.peliCienciaSabBloqueado==true) {
			cienciaSabado.disable();
		}
 		
 		if(sistemaMenu.peliDramaDominBloqueado==true) {
			dramaDomingo.disable();
		}
 		
 		if(sistemaMenu.peliComeDominBloqueado==true) {
			comediaDomingo.disable();
		}
 		
 		if(sistemaMenu.peliTerrorDominBloqueado==true) {
			terrorDomingo.disable();
		}
 		
 		if(sistemaMenu.peliCienciaDominBloqueado==true) {
			cienciaDomingo.disable();
		}
			
		btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSiguiente.setBounds(771, 619, 161, 37);
		btnSiguiente.addActionListener(this);
		contentPane.add(btnSiguiente);
	
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLUE);
		separator.setBackground(Color.RED);
		separator.setBounds(591, 165, -266, -77);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(487, 114, 21, 484);
		contentPane.add(separator_1);
	}
	
	 public void actionPerformed(ActionEvent e){
	        if (e.getSource()==dramaSabado) { 	           	
	        	pelidramaSab = String.valueOf(dramaSabado.getSelectedItem());
	        }
	        
	        if (e.getSource()==comediaSabado) { 	 	
	        	peliComeSab = String.valueOf(comediaSabado.getSelectedItem());
	        }
	        
	        if (e.getSource()==terrorSabado) { 		
	        	peliTerrorSab = String.valueOf(terrorSabado.getSelectedItem());
	        }
	        
	        if (e.getSource()==cienciaSabado) { 	
	        	peliCienciaSab = String.valueOf(cienciaSabado.getSelectedItem());
	        }
	        
	        if (e.getSource()==dramaDomingo) { 	        	
	        	pelidramaDomin = String.valueOf(dramaDomingo.getSelectedItem());
	        	
	        }
	        
	        if (e.getSource()==comediaDomingo) { 	
	        	peliComeDomin = String.valueOf(comediaDomingo.getSelectedItem());
	        }
	        
	        if (e.getSource()==terrorDomingo) { 	
	        	peliTerrorDomin = String.valueOf(terrorDomingo.getSelectedItem());
	        }
	        
	        if (e.getSource()==cienciaDomingo) { 	
	        	peliCienciaDomin = String.valueOf(cienciaDomingo.getSelectedItem());
	        }
	        
	        if(e.getSource()==btnSiguiente) {
	        	pelidramaSabFinal = String.valueOf(dramaSabado.getSelectedItem());
	        	peliCienciaSabFinal = String.valueOf(cienciaSabado.getSelectedItem());
	        	peliTerrorSabFinal = String.valueOf(terrorSabado.getSelectedItem());
	        	peliComeSabFinal = String.valueOf(comediaSabado.getSelectedItem());
	        	
	        	pelidramaDominFinal = String.valueOf(dramaDomingo.getSelectedItem());
	        	peliCienciaDominFinal = String.valueOf(cienciaDomingo.getSelectedItem());
	        	peliTerrorDominFinal = String.valueOf(terrorDomingo.getSelectedItem());
	        	peliComeDominFinal = String.valueOf(comediaDomingo.getSelectedItem());
	        	
	        	sistemaMenu.tiempoPeliculas();
	        	sistemaMenu.continuarResumen();  
	        	sistemaMenu.bloquearGenero();
	        	
	        }

	    }
	
}
