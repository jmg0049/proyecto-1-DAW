package VentanasAplicacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Window;

public class Registrarse extends JFrame {


	private static final long serialVersionUID = 1L;
	protected static final JLabel Texto_Mostrar_Contraseña = null;
	private JPanel contentPane;
	private JPasswordField Texto_Contraseña;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrarse frame = new Registrarse();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Registrarse() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MegaMarket");
		setBounds(100, 100, 525, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(252, 216, 131));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Etiqueta_Registrarse = new JLabel("Registrarse");
		Etiqueta_Registrarse.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 11));
		Etiqueta_Registrarse.setBounds(196, 21, 100, 14);
		Etiqueta_Registrarse.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(Etiqueta_Registrarse);
		
		JLabel Etiqueta_NombreyApellido = new JLabel("Nombre Completo");
		Etiqueta_NombreyApellido.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 11));
		Etiqueta_NombreyApellido.setBounds(93, 77, 103, 14);
		Etiqueta_NombreyApellido.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(Etiqueta_NombreyApellido);
		
		JTextPane Texto_Nombre = new JTextPane();
		Texto_Nombre.setBounds(206, 71, 188, 20);
		Texto_Nombre.getDocument().addDocumentListener(new DocumentListener() {
		    public void changedUpdate(DocumentEvent e) {}
		    public void insertUpdate(DocumentEvent e) {
		        if (Texto_Nombre.getText().length() > 45) {
		            Texto_Nombre.setText(Texto_Nombre.getText().substring(0, 45));
		        }
		    }
		    public void removeUpdate(DocumentEvent e) {}
		});
		contentPane.add(Texto_Nombre);

		
		JLabel Etiqueta_Correo = new JLabel("Correo");
		Etiqueta_Correo.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 11));
		Etiqueta_Correo.setHorizontalAlignment(SwingConstants.CENTER);
		Etiqueta_Correo.setBounds(139, 170, 46, 14);
		contentPane.add(Etiqueta_Correo);
		
		JTextPane Texto_Correo = new JTextPane();
		Texto_Correo.setBounds(206, 164, 188, 20);
		Texto_Correo.getDocument().addDocumentListener(new DocumentListener() {
		    public void changedUpdate(DocumentEvent e) {}
		    public void insertUpdate(DocumentEvent e) {
		        if (Texto_Correo.getText().length() > 45) {
		            Texto_Correo.setText(Texto_Correo.getText().substring(0, 45));
		        }
		    }
		    public void removeUpdate(DocumentEvent e) {}
		});
		contentPane.add(Texto_Correo);

		
		JLabel Etiqueta_Contraseña = new JLabel("Contraseña");
		Etiqueta_Contraseña.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 11));
		Etiqueta_Contraseña.setHorizontalAlignment(SwingConstants.CENTER);
		Etiqueta_Contraseña.setBounds(113, 201, 83, 14);
		contentPane.add(Etiqueta_Contraseña);
		
		
		Texto_Contraseña = new JPasswordField();
		Texto_Contraseña.setBounds(206, 195, 189, 20);
		Texto_Contraseña.getDocument().addDocumentListener(new DocumentListener() {
		    public void changedUpdate(DocumentEvent e) {}
		    @SuppressWarnings("deprecation")
			public void insertUpdate(DocumentEvent e) {
		        if (Texto_Contraseña.getText().length() > 45) {
		            Texto_Contraseña.setText(Texto_Correo.getText().substring(0, 45));
		        }
		    }
		    public void removeUpdate(DocumentEvent e) {}
		});
		contentPane.add(Texto_Contraseña);
		
		
		JButton Boton_Mostrar = new JButton("Mostrar Contraseña");
		Boton_Mostrar.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 11));
		Boton_Mostrar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (Texto_Contraseña.getEchoChar() != 0) {
		            Texto_Contraseña.setEchoChar('\u0000');
		            Boton_Mostrar.setText("Ocultar Contraseña"); // Cambiar texto del botón
		        } else {
		            Texto_Contraseña.setEchoChar('*');
		            Boton_Mostrar.setText("Mostrar Contraseña"); // Cambiar texto del botón
		        }
		    }
		});

		Boton_Mostrar.setBounds(315, 252, 164, 23);
		contentPane.add(Boton_Mostrar);
		
		JLabel Telefono = new JLabel("Telefono");
		Telefono.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 11));
		Telefono.setHorizontalAlignment(SwingConstants.CENTER);
		Telefono.setBounds(124, 108, 72, 14);
		contentPane.add(Telefono);
		
		JTextPane Texto_Telefono = new JTextPane();
		Texto_Telefono.setContentType("int");
		Texto_Telefono.setBounds(206, 102, 188, 20);
		Texto_Telefono.getDocument().addDocumentListener(new DocumentListener() {
		    public void changedUpdate(DocumentEvent e) {}
		    public void insertUpdate(DocumentEvent e) {
		        if (Texto_Telefono.getText().length() > 13) {
		            Texto_Telefono.setText(Texto_Correo.getText().substring(0, 13));
		        }
		    }
		    public void removeUpdate(DocumentEvent e) {}
		});
		contentPane.add(Texto_Telefono);
		
		JLabel Etiqueta_Direccion = new JLabel("Direccion");
		Etiqueta_Direccion.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 11));
		Etiqueta_Direccion.setHorizontalAlignment(SwingConstants.CENTER);
		Etiqueta_Direccion.setBounds(124, 139, 72, 14);
		contentPane.add(Etiqueta_Direccion);
		
		JTextPane Texto_Direccion = new JTextPane();
		Texto_Direccion.setBounds(206, 133, 188, 20);
		Texto_Direccion.getDocument().addDocumentListener(new DocumentListener() {
		    public void changedUpdate(DocumentEvent e) {}
		    public void insertUpdate(DocumentEvent e) {
		        if (Texto_Direccion.getText().length() > 150) {
		            Texto_Direccion.setText(Texto_Correo.getText().substring(0, 150));
		        }
		    }
		    public void removeUpdate(DocumentEvent e) {}
		});
		contentPane.add(Texto_Direccion);
		
		JLabel Etiqueta_Foto = new JLabel("New label");
		Etiqueta_Foto.setIcon(new ImageIcon(Registrarse.class.getResource("/Imagenes/MegaMarket.png")));
		Etiqueta_Foto.setBounds(22, 119, 72, 65);
		contentPane.add(Etiqueta_Foto);
		
		JButton Boton_Borrar = new JButton("Borrar Todo");
		Boton_Borrar.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 11));
		Boton_Borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 	Texto_Nombre.setText("");		       
			        Texto_Telefono.setText("");
			        Texto_Direccion.setText("");
			        Texto_Correo.setText("");
			        Texto_Contraseña.setText("");
			}
		});
		Boton_Borrar.setBounds(168, 252, 120, 23);
		contentPane.add(Boton_Borrar);
		
		JButton Boton_Confirmar = new JButton("Confirmar");
		Boton_Confirmar.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 11));
		Boton_Confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    // Obtén el texto ingresado en los JTextPane
			    String nombre = Texto_Nombre.getText();
			    String correo = Texto_Correo.getText();
			    String contraseña = new String(Texto_Contraseña.getPassword());
			    String telefono = Texto_Telefono.getText();
			    String direccion = Texto_Direccion.getText();

			    // Verifica si todos los campos están vacíos
			    if (nombre.isEmpty() || correo.isEmpty() || contraseña.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
			        // Si algún campo está vacío, muestra un mensaje de error
			        JOptionPane.showMessageDialog(contentPane, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
			    } else {
			        // Verifica si el correo ingresado contiene el símbolo "@"
			        if (correo.contains("@")) {
			            // Verifica si el nombre y apellidos ingresados contienen solo letras
			            if (nombre.matches("[a-zA-Z\\s]+")) {
			                // Verifica si el teléfono ingresado contiene solo números
			                if (telefono.matches("\\d+")) {
			                    // Si el correo es válido, el nombre y apellidos contienen solo letras,
			                    // y el teléfono contiene solo números, realiza la acción de confirmar
			                    // aquí puedes colocar el código que deseas ejecutar
			                    // cuando todos los campos estén completos y sean válidos
			                    JOptionPane.showMessageDialog(contentPane, "¡Confirmado!", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
			                    // Cierra la ventana después de mostrar el mensaje de confirmación
			                    Window window = SwingUtilities.windowForComponent((Component) e.getSource());
			                    window.dispose();
			                } else {
			                    // Si el teléfono no contiene solo números, muestra un mensaje de error
			                    JOptionPane.showMessageDialog(contentPane, "Por favor, ingrese solo números en el campo de teléfono.", "Error", JOptionPane.ERROR_MESSAGE);
			                }
			            } else {
			                // Si el nombre o apellidos no contienen solo letras, muestra un mensaje de error
			                JOptionPane.showMessageDialog(contentPane, "Por favor, ingrese solo letras en los campos de nombre y apellidos.", "Error", JOptionPane.ERROR_MESSAGE);
			            }
			        } else {
			            // Si el correo no es válido, muestra un mensaje de error
			            JOptionPane.showMessageDialog(contentPane, "Por favor, ingrese un correo válido.", "Error", JOptionPane.ERROR_MESSAGE);
			        }
			    }
			}

		});

		Boton_Confirmar.setBounds(57, 252, 89, 23);
		contentPane.add(Boton_Confirmar);
	}
}
