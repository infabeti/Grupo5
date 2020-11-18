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
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

public class Menu extends JFrame implements ActionListener {

	Sistema.SistemaMenu sistemaMenu = new Sistema.SistemaMenu();
	//Resumen resumen = new Resumen();

	public JPanel contentPane;
	public static String pelidramaSab,peliComeSab, peliCienciaSab, peliTerrorSab;
	public static JComboBox<String> dramaSabado,comediaSabado,terrorSabado,cienciaSabado;
	public JLabel labelSabado;
	
	
		public JLabel getLabelSabado() {
			return labelSabado;
		}
	
		public void setLabelSabado(JLabel labelSabado) {
			this.labelSabado = labelSabado;
		}
		
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
		setResizable(false);
		setBackground(Color.RED);
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		labelSabado = new JLabel("S\u00E1bado: "+sistemaMenu.calcularTiempoSabado());
		labelSabado.setFont(new Font("Tahoma", Font.PLAIN, 25));
		labelSabado.setBounds(130, 114, 242, 31);
		contentPane.add(labelSabado);
		
		dramaSabado=new JComboBox<String>();
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
		lblNewLabel_1_2_1.setBounds(669, 114, 222, 31);
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
				System.exit(0);
			}
		});
		btnSalir.setBounds(66, 619, 112, 37);
		contentPane.add(btnSalir);
		
		JComboBox dramaDomingo = new JComboBox();
		dramaDomingo.setModel(new DefaultComboBoxModel(sistemaMenu.mostrarPeliculas("drama","domingo")));
		dramaDomingo.setBackground(Color.WHITE);
		dramaDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dramaDomingo.setBounds(538, 223, 394, 37);
		contentPane.add(dramaDomingo);
		
		JComboBox comediaDomingo = new JComboBox();
		comediaDomingo.setModel(new DefaultComboBoxModel(sistemaMenu.mostrarPeliculas("comedia","domingo")));
		comediaDomingo.setBackground(Color.WHITE);
		comediaDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comediaDomingo.setBounds(538, 305, 394, 37);
		contentPane.add(comediaDomingo);
		
		JComboBox terrorDomingo = new JComboBox();
		terrorDomingo.setModel(new DefaultComboBoxModel(sistemaMenu.mostrarPeliculas("terror","domingo")));
		terrorDomingo.setBackground(Color.WHITE);
		terrorDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		terrorDomingo.setBounds(538, 397, 394, 37);
		contentPane.add(terrorDomingo);
		
		JComboBox cienciaDomingo = new JComboBox();
		cienciaDomingo.setModel(new DefaultComboBoxModel(sistemaMenu.mostrarPeliculas("scifi","domingo")));
		cienciaDomingo.setBackground(Color.WHITE);
		cienciaDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cienciaDomingo.setBounds(538, 502, 394, 37);
		contentPane.add(cienciaDomingo);
		
		JButton btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println(peli+ "hola");
				 	Resumen resumen =new Resumen();
				 	resumen.setBounds(0,0,1024,768);
				 	resumen.setLocationRelativeTo(null);
				 	resumen.setVisible(true);
				 	resumen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			}
			
		});
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSiguiente.setBounds(771, 619, 161, 37);
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
	        	labelSabado.setText(sistemaMenu.generoCambio(dramaSabado.getSelectedIndex(),"DRAMA"));           	
	        	pelidramaSab = String.valueOf(dramaSabado.getSelectedItem());
	        }
	        
	        if (e.getSource()==comediaSabado) { 	
	        	labelSabado.setText(sistemaMenu.generoCambio(comediaSabado.getSelectedIndex(),"COMEDIA"));
	        	peliComeSab = String.valueOf(comediaSabado.getSelectedItem());
	        }
	        
	        if (e.getSource()==terrorSabado) { 	
	        	labelSabado.setText(sistemaMenu.generoCambio(comediaSabado.getSelectedIndex(),"TERROR"));
	        	peliTerrorSab = String.valueOf(terrorSabado.getSelectedItem());
	        }
	        
	        if (e.getSource()==cienciaSabado) { 	
	        	labelSabado.setText(sistemaMenu.generoCambio(comediaSabado.getSelectedIndex(),"SCIFI"));
	        	peliCienciaSab = String.valueOf(cienciaSabado.getSelectedItem());
	        }

	    }
	
}
