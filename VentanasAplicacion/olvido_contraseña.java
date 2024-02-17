package VentanasAplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class olvido_contraseña extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;

	/**
	 * Create the frame.
	 */
	public olvido_contraseña() {
		setTitle("MegaMarket");

		setBounds(100, 100, 715, 483);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 198, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CORREO:");
		lblNewLabel.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setBounds(194, 147, 69, 21);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(284, 145, 225, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			dispose();}
		});
		btnNewButton.setBounds(284, 217, 85, 21);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alvaro Arevalo Paris\\Downloads\\logo_tienda_pnline (2).png"));
		lblNewLabel_1.setBounds(37, 29, 100, 92);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnIntroduzcaLaDireccin = new JTextPane();
		txtpnIntroduzcaLaDireccin.setEditable(false);
		txtpnIntroduzcaLaDireccin.setBackground(new Color(254, 198, 122));
		txtpnIntroduzcaLaDireccin.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 16));
		txtpnIntroduzcaLaDireccin.setText("Introduzca la dirección de correo\r\n electrónico asociada con su cuenta.");
		txtpnIntroduzcaLaDireccin.setBounds(224, 47, 251, 62);
		contentPane.add(txtpnIntroduzcaLaDireccin);
	}
}
