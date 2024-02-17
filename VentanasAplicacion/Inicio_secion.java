package VentanasAplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Inicio_secion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_usuario;
	private JPasswordField Cotraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio_secion frame = new Inicio_secion();
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

	public Inicio_secion() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MegaMarket");
		setBounds(100, 100, 1003, 637);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 198, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_inicio_sesión = new JLabel("INICIO DE SESIÓN ");
		lblNewLabel_inicio_sesión.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_inicio_sesión.setBounds(322, 39, 166, 32);
		contentPane.add(lblNewLabel_inicio_sesión);
		
		JLabel lblNewLabel_usuario = new JLabel("CORREO:");
		lblNewLabel_usuario.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_usuario.setBounds(242, 116, 71, 13);
		contentPane.add(lblNewLabel_usuario);
		
		textField_usuario = new JTextField();
		textField_usuario.setBounds(343, 113, 166, 19);
		contentPane.add(textField_usuario);
		textField_usuario.setColumns(10);
		
		JLabel lblNewLabel_contraseña = new JLabel("CONTRASEÑA:");
		lblNewLabel_contraseña.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_contraseña.setBounds(242, 169, 98, 13);
		contentPane.add(lblNewLabel_contraseña);
		
		JButton Boton_contraseña = new JButton("¿ Ha olvidado tu contraseña ?");
		Boton_contraseña.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 12));
		Boton_contraseña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Inicio_secion contraseña = new Inicio_secion();
			olvido_contraseña Inicio_secion  = new olvido_contraseña ();
			Inicio_secion.setVisible(true);
			}
		});
		Boton_contraseña.setBounds(242, 260, 246, 21);
		contentPane.add(Boton_contraseña);
		
		JButton enviar = new JButton("Enviar");
		enviar.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 12));
		enviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Pagina1 Inicio_secion  = new Pagina1 ();
			Inicio_secion.setVisible(true);
			}
		});
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_usuario.getText().equals("") || Cotraseña.getPassword().length == 0) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                } else {
                   dispose();
                }
			}
		});
		enviar.setBounds(242, 211, 246, 21);
		contentPane.add(enviar);
		
		Cotraseña = new JPasswordField();
		Cotraseña.setBounds(343, 164, 166, 19);
		contentPane.add(Cotraseña);
		
		JButton btnMostrarContrasea = new JButton("Mostrar la contraseña");
		btnMostrarContrasea.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 12));
		btnMostrarContrasea.setBounds(519, 164, 150, 19);
		btnMostrarContrasea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 
                if (Cotraseña.getEchoChar() != 0) {
                	Cotraseña.setEchoChar('\u0000');
                } else {
                	Cotraseña.setEchoChar('*'); 
                }
            }
        });
		
		contentPane.add(btnMostrarContrasea);
		
		JLabel lblNewLabel_logo = new JLabel("");
		lblNewLabel_logo.setIcon(new ImageIcon("C:\\Users\\Alvaro Arevalo Paris\\Downloads\\logo_tienda_pnline.png"));
		lblNewLabel_logo.setBounds(31, 39, 150, 157);
		contentPane.add(lblNewLabel_logo);
		
		
		
	}
}
