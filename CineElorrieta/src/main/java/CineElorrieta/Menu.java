package CineElorrieta;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
		setBackground(Color.RED);
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 727);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setLocation(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(443, 41, 124, 50);
		contentPane.add(lblNewLabel);
		
		JComboBox dramaSabado = new JComboBox();
		dramaSabado.setBackground(Color.WHITE);
		dramaSabado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dramaSabado.setModel(new DefaultComboBoxModel(new String[] {"", "Handia: 1 h 56 min.", "La lista de Schindler: 3 h 17 min.", "Cadena Perpetua: 2 h 22 min.", "Million Dollar Baby: 2 h 13 min."}));
		dramaSabado.setBounds(66, 223, 366, 37);
		contentPane.add(dramaSabado);
		
		JLabel lblNewLabel_1 = new JLabel("Drama");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(182, 179, 112, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Comedia");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(182, 262, 112, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox comediaSabado = new JComboBox();
		comediaSabado.setBackground(Color.WHITE);
		comediaSabado.setModel(new DefaultComboBoxModel(new String[] {"", "Scary movie: 1 h 30 min.", "El gran Lebowsky: 1 h 59 min.", "La vida de Brian: 1 h 34 min.", "Aterriza como puedas: 1 h 28 min."}));
		comediaSabado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comediaSabado.setBounds(66, 305, 366, 37);
		contentPane.add(comediaSabado);
		
		JLabel lblNewLabel_1_2 = new JLabel("S\u00E1bado");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(130, 114, 112, 31);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Terror");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(687, 354, 112, 31);
		contentPane.add(lblNewLabel_1_1_1);
		
		JComboBox terrorSabado = new JComboBox();
		terrorSabado.setBackground(Color.WHITE);
		terrorSabado.setModel(new DefaultComboBoxModel(new String[] {"", "Psicosis: 1 h 49 min.", "El resplandor: 2 h 26 min.", "Dracula: 2 h 35 min.", "Cisne negro: 1 h 50 min."}));
		terrorSabado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		terrorSabado.setBounds(66, 397, 366, 37);
		contentPane.add(terrorSabado);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Ciencia Ficci\u00F3n");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1.setBounds(164, 446, 170, 44);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JComboBox cienciaSabado = new JComboBox();
		cienciaSabado.setBackground(Color.WHITE);
		cienciaSabado.setModel(new DefaultComboBoxModel(new String[] {"", "2001: Odisea en el espacio 2 h 22 min.", "La novia de Frankenstein: 1 h 15 min.", "El planeta de los simios: 1 h 55 min.", "Alien, el octavo pasajero: 1 h 57 min."}));
		cienciaSabado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cienciaSabado.setBounds(66, 502, 366, 37);
		contentPane.add(cienciaSabado);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Domingo");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2_1.setBounds(669, 114, 112, 31);
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
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBackground(Color.BLACK);
		verticalStrut.setBounds(466, 179, 43, 400);
		contentPane.add(verticalStrut);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(66, 619, 112, 37);
		contentPane.add(btnSalir);
		
		JComboBox dramaDomingo = new JComboBox();
		dramaDomingo.setModel(new DefaultComboBoxModel(new String[] {"", "Handia: 1 h 56 min.", "La lista de Schindler: 3 h 17 min.", "Cadena Perpetua: 2 h 22 min.", "Million Dollar Baby: 2 h 13 min."}));
		dramaDomingo.setBackground(Color.WHITE);
		dramaDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dramaDomingo.setBounds(538, 223, 394, 37);
		contentPane.add(dramaDomingo);
		
		JComboBox comediaDomingo = new JComboBox();
		comediaDomingo.setBackground(Color.WHITE);
		comediaDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comediaDomingo.setBounds(538, 305, 394, 37);
		contentPane.add(comediaDomingo);
		
		JComboBox terrorDomingo = new JComboBox();
		terrorDomingo.setBackground(Color.WHITE);
		terrorDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		terrorDomingo.setBounds(538, 397, 394, 37);
		contentPane.add(terrorDomingo);
		
		JComboBox cienciaDomingo = new JComboBox();
		cienciaDomingo.setBackground(Color.WHITE);
		cienciaDomingo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cienciaDomingo.setBounds(538, 502, 394, 37);
		contentPane.add(cienciaDomingo);
		
		JButton btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSiguiente.setBounds(790, 619, 142, 37);
		contentPane.add(btnSiguiente);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLUE);
		separator.setBackground(Color.RED);
		separator.setBounds(591, 165, -266, -77);
		contentPane.add(separator);
	}
}
