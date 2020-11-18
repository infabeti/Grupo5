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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class VentanaResumen extends JFrame {
	Sistema.SistemaMenu sistemaMenu = new Sistema.SistemaMenu();
	public JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextArea listaSabado;	 
	public JLabel resumenSabado;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaResumen frame = new VentanaResumen();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaResumen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024,768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RESUMEN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(287, 11, 210, 84);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("SEGUIR ELIGIENDO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ventanas.Menu menu =new Ventanas.Menu();
				menu.setBounds(0,0,1024,768);
				menu.setLocationRelativeTo(null);
				menu.setVisible(true);
				menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(43, 637, 263, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("FINALIZAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int confimar = JOptionPane.showConfirmDialog(null, "¿Desea confirmar la operación?", "Confirmación",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(confimar==0){
					JOptionPane.showMessageDialog(null, "Operación concluida con éxito.");
					BienVenido inicio=new BienVenido();
			           inicio.setBounds(0,0,1024,768);
			           inicio.setLocationRelativeTo(null);
			           inicio.setVisible(true);
			           inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
								
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(773, 637, 187, 39);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(43, 505, 75, 39);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField(sistemaMenu.calcularTiempoSabado());
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setEditable(false);
		textField.setBounds(128, 505, 103, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel labelSabado = new JLabel("S\u00C1BADO");
		labelSabado.setFont(new Font("Tahoma", Font.BOLD, 20));
		labelSabado.setBounds(149, 116, 108, 39);
		contentPane.add(labelSabado);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(482, 115, 75, 405);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2_1 = new JLabel("DOMINGO");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(647, 116, 108, 39);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TOTAL:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(567, 498, 75, 39);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField(sistemaMenu.calcularTiempoDomingo());
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(652, 498, 103, 32);
		contentPane.add(textField_1);
		
		JButton btnNewButton_1_1 = new JButton("SALIR");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "La operación se ha cancelado.");
				System.exit(0);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(550, 637, 187, 39);
		contentPane.add(btnNewButton_1_1);
		
		JTextArea listaSabado = new JTextArea();
		listaSabado.setBounds(77, 407, 263, 68);
		contentPane.add(listaSabado);
		
		JLabel resumenSabado = new JLabel();
		
		//Sistema.SistemaMenu sistemaMenu = new Sistema.SistemaMenu();
		//String X = getText(sistemaMenu.peliculasDrama);
		//resumenSabado.setText(sistemaMenu.peliculasDrama);
		
		resumenSabado.setBounds(90, 190, 227, 151);
		contentPane.add(resumenSabado);
		
		
	}
}
