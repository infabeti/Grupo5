package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sistema.SistemaMenu;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JList;

public  class Resumen extends JFrame {
	Menu menu = new Menu();
	Sistema.SistemaMenu sistemaMenu = new Sistema.SistemaMenu();
	
	public JPanel contentPane;
	public JTextField totalSabado;
	public JTextField totaldomingo;
	//public static JTextArea listaSabado;	 
	public static JLabel resumenSabado, resumenDomingo;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resumen frame = new Resumen();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
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
	public Resumen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024,768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labResumen = new JLabel("RESUMEN");
		labResumen.setFont(new Font("Tahoma", Font.BOLD, 40));
		labResumen.setBounds(287, 11, 210, 84);
		contentPane.add(labResumen);
		
		JButton btnSeguirElig = new JButton("SEGUIR ELIGIENDO");
		btnSeguirElig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(sistemaMenu.domingoCompleto()==false) {
					Ventanas.Menu menu =new Ventanas.Menu();
					menu.setBounds(0,0,1024,768);
					menu.setLocationRelativeTo(null);
					menu.setVisible(true);
					menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "NO ENTRAN MAS PELICULAS");
				}
				
			}
		});
		btnSeguirElig.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSeguirElig.setBounds(43, 637, 263, 39);
		contentPane.add(btnSeguirElig);
		
		JButton btnFinalizar = new JButton("FINALIZAR");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int confimar = JOptionPane.showConfirmDialog(null, "¿Desea confirmar la operación?", "Confirmación",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(confimar==0){
					if(sistemaMenu.domingoCompleto()==true) {
					JOptionPane.showMessageDialog(null, "Operación concluida con éxito.");
					Timer cronom = new Timer();
			        cronom.schedule(new TimerTask() {
			        public void run(){ // método que llevará a la ventana  	
				        	Final fin =new Final();
				        	fin.setBounds(0,0,1024,768);
				        	fin.setLocationRelativeTo(null);
				        	fin.setVisible(true);
				        	fin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        	dispose();
			        	
			        		
			        	
			            
			        }},2000);
				   }else {
					   JOptionPane.showMessageDialog(null, "QUEDAN MAS PELICULAS PARA ESCOGER");  
				   }
			           
				}
								
			}
		});
		btnFinalizar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnFinalizar.setBounds(773, 637, 187, 39);
		contentPane.add(btnFinalizar);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(43, 505, 75, 39);
		contentPane.add(lblNewLabel_1);
		
		totalSabado = new JTextField(sistemaMenu.calcularTiempoFinalSabado());
		totalSabado.setHorizontalAlignment(SwingConstants.CENTER);
		totalSabado.setFont(new Font("Tahoma", Font.BOLD, 18));
		totalSabado.setEditable(false);
		totalSabado.setBounds(128, 505, 103, 32);
		contentPane.add(totalSabado);
		totalSabado.setColumns(10);
		
		JLabel labelSabado = new JLabel("S\u00C1BADO");
		labelSabado.setFont(new Font("Tahoma", Font.BOLD, 20));
		labelSabado.setBounds(149, 116, 108, 39);
		contentPane.add(labelSabado);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(482, 115, 75, 405);
		contentPane.add(separator);
		
		JLabel labTotalDom = new JLabel("DOMINGO");
		labTotalDom.setFont(new Font("Tahoma", Font.BOLD, 20));
		labTotalDom.setBounds(647, 116, 108, 39);
		contentPane.add(labTotalDom);
		
		JLabel labTotalSab = new JLabel("TOTAL:");
		labTotalSab.setFont(new Font("Tahoma", Font.BOLD, 20));
		labTotalSab.setBounds(567, 498, 75, 39);
		contentPane.add(labTotalSab);
		
		totaldomingo = new JTextField(sistemaMenu.calcularTiempoFinalDomingo());
		totaldomingo.setHorizontalAlignment(SwingConstants.CENTER);
		totaldomingo.setFont(new Font("Tahoma", Font.BOLD, 18));
		totaldomingo.setEditable(false);
		totaldomingo.setColumns(10);
		totaldomingo.setBounds(652, 498, 103, 32);
		contentPane.add(totaldomingo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "La operación se ha cancelado.");
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
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalir.setBounds(550, 637, 187, 39);
		contentPane.add(btnSalir);
		
		JLabel labeldramaSab = new JLabel(menu.pelidramaSab);
		labeldramaSab.setFont(new Font("Tahoma", Font.BOLD, 18));
		labeldramaSab.setBounds(66, 170, 363, 39);
		contentPane.add(labeldramaSab);
		
		JLabel labelcomeSab = new JLabel(menu.peliComeSab);
		labelcomeSab.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelcomeSab.setBounds(66, 213, 363, 39);
		contentPane.add(labelcomeSab);
		
		JLabel labelterrorSab = new JLabel(menu.peliTerrorSab);
		labelterrorSab.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelterrorSab.setBounds(66, 263, 363, 39);
		contentPane.add(labelterrorSab);
		
		JLabel labelCienciaSab = new JLabel(menu.peliCienciaSab);
		labelCienciaSab.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelCienciaSab.setBounds(66, 315, 363, 39);
		contentPane.add(labelCienciaSab);
		
		JLabel labeldramaDomin = new JLabel(menu.pelidramaDomin);
		labeldramaDomin.setFont(new Font("Tahoma", Font.BOLD, 18));
		labeldramaDomin.setBounds(550, 181, 363, 39);
		contentPane.add(labeldramaDomin);
		
		JLabel labelcomeDomin = new JLabel(menu.peliComeDomin);
		labelcomeDomin.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelcomeDomin.setBounds(550, 224, 363, 39);
		contentPane.add(labelcomeDomin);
		
		JLabel labelterrorDomin = new JLabel(menu.peliTerrorDomin);
		labelterrorDomin.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelterrorDomin.setBounds(550, 274, 363, 39);
		contentPane.add(labelterrorDomin);
		
		JLabel labelCienciaDomin = new JLabel(menu.peliCienciaDomin);
		labelCienciaDomin.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelCienciaDomin.setBounds(550, 326, 363, 39);
		contentPane.add(labelCienciaDomin);
		
			
	}
}
