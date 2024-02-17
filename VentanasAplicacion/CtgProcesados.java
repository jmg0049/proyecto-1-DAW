package VentanasAplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;

public class CtgProcesados extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBuscar;
	public int contador=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CtgProcesados frame = new CtgProcesados();
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
	public CtgProcesados() {
		setTitle("MegaMarket");
		setBounds(100, 100, 1407, 1002);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(227, 170, 83));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setBounds(426, 13, 1115, 20);
		contentPane.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JLabel LabelRegistrarse = new JLabel("Registrarse");
		LabelRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Registrarse frame = new Registrarse ();
				frame.setVisible(true);
			}
		});
		LabelRegistrarse.setBounds(1800, 14, 81, 19);
		contentPane.add(LabelRegistrarse);
		
		JLabel LabelIniciar_Sesion = new JLabel("Iniciar Sesión");
		LabelIniciar_Sesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Inicio_secion frame = new Inicio_secion ();
				frame.setVisible (true);
			}
		});
		LabelIniciar_Sesion.setBounds(1700, 16, 101, 14);
		contentPane.add(LabelIniciar_Sesion);
		
		
		/*Botones añadir productos a la cesta primera fila*/
		JButton SumAceitePalma = new JButton("+1");
		SumAceitePalma.addActionListener(new ActionListener() {
			int A;
			public void actionPerformed(ActionEvent e) {
				A=A+1;
			}
		});
		SumAceitePalma.setBounds(25, 250, 55, 23);
		contentPane.add(SumAceitePalma);
		
		JButton ResAceitePalma = new JButton("-1");
		ResAceitePalma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador=contador-1;
			}
		});
		ResAceitePalma.setBounds(90, 250, 55, 23);
		contentPane.add(ResAceitePalma);
		
		
		JButton SumAceiteGirasol = new JButton("+1");
		SumAceiteGirasol.setBounds(185, 250, 55, 23);
		contentPane.add(SumAceiteGirasol);
		
		JButton ResAceiteGirasol = new JButton("-1");
		ResAceiteGirasol.setBounds(250, 250, 55, 23);
		contentPane.add(ResAceiteGirasol);
		
		
		JButton SumAceiteOliva = new JButton("+1");
		SumAceiteOliva.setBounds(345, 250, 55, 23);
		contentPane.add(SumAceiteOliva);
		
		JButton ResAceiteOliva = new JButton("-1");
		ResAceiteOliva.setBounds(410, 250, 55, 23);
		contentPane.add(ResAceiteOliva);
		
		JButton SumAceitunaNegra = new JButton("+1");
		SumAceitunaNegra.setBounds(505, 250, 55, 23);
		contentPane.add(SumAceitunaNegra);
		
		JButton ResAceitunaNegra = new JButton("-1");
		ResAceitunaNegra.setBounds(570, 250, 55, 23);
		contentPane.add(ResAceitunaNegra);
		
		JButton SumAceitunaVerde = new JButton("+1");
		SumAceitunaVerde.setBounds(665, 250, 55, 23);
		contentPane.add(SumAceitunaVerde);
		
		JButton ResAceitunaVerde = new JButton("-1");
		ResAceitunaVerde.setBounds(730, 250, 55, 23);
		contentPane.add(ResAceitunaVerde);
		
		JButton SumAjoBlanco = new JButton("+1");
		SumAjoBlanco.setBounds(825, 250, 55, 23);
		contentPane.add(SumAjoBlanco);
		
		JButton ResAjoBlanco = new JButton("-1");
		ResAjoBlanco.setBounds(890, 250, 55, 23);
		contentPane.add(ResAjoBlanco);
		
		JButton SumAjoMorado = new JButton("+1");
		SumAjoMorado.setBounds(985, 250, 55, 23);
		contentPane.add(SumAjoMorado);
		
		JButton ResAjoMorado = new JButton("-1");
		ResAjoMorado.setBounds(1050, 250, 55, 23);
		contentPane.add(ResAjoMorado);
		
		JButton SumAlmejas = new JButton("+1");
		SumAlmejas.setBounds(1145, 250, 55, 23);
		contentPane.add(SumAlmejas);
		
		JButton ResAlmejas = new JButton("-1");
		ResAlmejas.setBounds(1210, 250, 55, 23);
		contentPane.add(ResAlmejas);
		
		JButton SumAlmendras = new JButton("+1");
		SumAlmendras.setBounds(1305, 250, 55, 23);
		contentPane.add(SumAlmendras);
		
		JButton ResAlmendras = new JButton("-1");
		ResAlmendras.setBounds(1370, 250, 55, 23);
		contentPane.add(ResAlmendras);
		
		JButton SumAlubiasBlancas = new JButton("+1");
		SumAlubiasBlancas.setBounds(1465, 250, 55, 23);
		contentPane.add(SumAlubiasBlancas);
		
		JButton ResAlubiasBlancas = new JButton("-1");
		ResAlubiasBlancas.setBounds(1530, 250, 55, 23);
		contentPane.add(ResAlubiasBlancas);
		
		JButton SumAlubiasNegras = new JButton("+1");
		SumAlubiasNegras.setBounds(1625, 250, 55, 23);
		contentPane.add(SumAlubiasNegras);
		
		JButton ResAlubiasNegras = new JButton("-1");
		ResAlubiasNegras.setBounds(1690, 250, 55, 23);
		contentPane.add(ResAlubiasNegras);
		
		JButton SumAlubiasRojas = new JButton("+1");
		SumAlubiasRojas.setBounds(1785, 250, 55, 23);
		contentPane.add(SumAlubiasRojas);
		
		JButton ResAlubiasRojas = new JButton("-1");
		ResAlubiasRojas.setBounds(1850, 250, 55, 23);
		contentPane.add(ResAlubiasRojas);
		
		/*Botones añadir productos a la cesta segunda fila*/
		JButton SumAlubiasVerdes = new JButton("+1");
		SumAlubiasVerdes.setBounds(25, 430, 55, 23);
		contentPane.add(SumAlubiasVerdes);
		
		JButton ResAlubiasVerdes = new JButton("-1");
		ResAlubiasVerdes.setBounds(90, 430, 55, 23);
		contentPane.add(ResAlubiasVerdes);
		
		JButton SumAnacardos = new JButton("+1");
		SumAnacardos.setBounds(185, 430, 55, 23);
		contentPane.add(SumAnacardos);
		
		JButton ResAnacardos = new JButton("-1");
		ResAnacardos.setBounds(250, 430, 55, 23);
		contentPane.add(ResAnacardos);
		
		JButton SumAngulas = new JButton("+1");
		SumAngulas.setBounds(345, 430, 55, 23);
		contentPane.add(SumAngulas);
		
		JButton ResAngulas = new JButton("-1");
		ResAngulas.setBounds(410, 430, 55, 23);
		contentPane.add(ResAngulas);
		
		JButton SumAvellanas = new JButton("+1");
		SumAvellanas.setBounds(505, 430, 55, 23);
		contentPane.add(SumAvellanas);
		
		JButton ResAvellanas = new JButton("-1");
		ResAvellanas.setBounds(570, 430, 55, 23);
		contentPane.add(ResAvellanas);
		
		JButton SumAzucarBlanco = new JButton("+1");
		SumAzucarBlanco.setBounds(665, 430, 55, 23);
		contentPane.add(SumAzucarBlanco);
		
		JButton ResAzucarBlanco = new JButton("-1");
		ResAzucarBlanco.setBounds(730, 430, 55, 23);
		contentPane.add(ResAzucarBlanco);
		
		JButton SumAzucarGlas = new JButton("+1");
		SumAzucarGlas.setBounds(825, 430, 55, 23);
		contentPane.add(SumAzucarGlas);
		
		JButton ResAzucarGlas = new JButton("-1");
		ResAzucarGlas.setBounds(890, 430, 55, 23);
		contentPane.add(ResAzucarGlas);
		
		JButton SumAzucarMoreno = new JButton("+1");
		SumAzucarMoreno.setBounds(985, 430, 55, 23);
		contentPane.add(SumAzucarMoreno);
		
		JButton ResAzucarMoreno = new JButton("-1");
		ResAzucarMoreno.setBounds(1050, 430, 55, 23);
		contentPane.add(ResAzucarMoreno);
	
		
		
		JLabel Cestas = new JLabel("");
		Cestas.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Cesta frame = new Cesta();
				frame.setVisible(true);
				
			}
		});
		Cestas.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/MegaMarket.png")));
		Cestas.setHorizontalAlignment(SwingConstants.CENTER);
		Cestas.setBounds(86, -15, 147, 133);
		
		contentPane.add(Cestas);
						
		
		//Botones para cambiar de página
		JLabel pagina1 = new JLabel("1");
		pagina1.setForeground(new Color(128, 0, 255));
		pagina1.setBounds(800, 66, 35, 14);
		contentPane.add(pagina1);
				
		
		/*Todos los productos*/
		JMenuBar Inventario = new JMenuBar();
		Inventario.setBounds(276, 11, 101, 22);
		contentPane.add(Inventario);
		
		JMenu Articulos = new JMenu("Categoría");
		Inventario.add(Articulos);
		
		
		/*Todos los productos de origen animal*/
		JMenu Productos_Animales = new JMenu("Productos Animales");
		Productos_Animales.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgProductosAnimales frame = new CtgProductosAnimales();
				frame.setVisible(true);
			}
		});
		Articulos.add(Productos_Animales);
		
		
		/*Todas las carnes*/
		JMenu Carne = new JMenu("Carne");
		Carne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgCarnes frame = new CtgCarnes();
				frame.setVisible(true);
			}
		});
		Productos_Animales.add(Carne);
		
		/*La Ternera*/
		JMenu Ternera = new JMenu("Ternera");
		Carne.add(Ternera);
		
			JMenuItem Ternera_Filete = new JMenuItem("Filete");
			Ternera.add(Ternera_Filete);
		
			JMenuItem Ternera_Hamburguesa = new JMenuItem("Hamburguesa");
			Ternera.add(Ternera_Hamburguesa);
		
			JMenuItem Ternera_Cane_Picada = new JMenuItem("Carne Picada");
			Ternera.add(Ternera_Cane_Picada);
		
			JMenuItem Ternera_Chuleta = new JMenuItem("Chuleta");
			Ternera.add(Ternera_Chuleta);
		
			JMenuItem Ternera_Solomillo = new JMenuItem("Solomillo");
			Ternera.add(Ternera_Solomillo);
		
		/*El Cerdo*/
		JMenu Cerdo = new JMenu("Cerdo");
		Carne.add(Cerdo);
		
			JMenuItem Cerdo_Filete = new JMenuItem("Filete");
			Cerdo.add(Cerdo_Filete);
		
			JMenuItem Cerdo_Hamburguesa = new JMenuItem("Hamburgesa");
			Cerdo.add(Cerdo_Hamburguesa);
		
			JMenuItem Cerdo_Beicon = new JMenuItem("Beicon");
			Cerdo.add(Cerdo_Beicon);
		
			JMenuItem Cerdo_Carne_Picada = new JMenuItem("Carne Picada");
			Cerdo.add(Cerdo_Carne_Picada);
		
			JMenuItem Cerdo_Chuleta = new JMenuItem("Chuleta");
			Cerdo.add(Cerdo_Chuleta);
		
			JMenuItem Cerdo_Costillas = new JMenuItem("Costillas");
			Cerdo.add(Cerdo_Costillas);
		
			JMenuItem Cerdo_Panceta = new JMenuItem("Panceta");
			Cerdo.add(Cerdo_Panceta);
		
		/*El Pollo*/
		JMenu Pollo = new JMenu("Pollo");
		Carne.add(Pollo);
		
			JMenuItem Pollo_Filete = new JMenuItem("Filete");
			Pollo.add(Pollo_Filete);
		
			JMenuItem Pollo_Hamburguesa = new JMenuItem("Hamburguesa");
			Pollo.add(Pollo_Hamburguesa);
		
			JMenuItem Pollo_Carne_Picada = new JMenuItem("Carne Picada");
			Pollo.add(Pollo_Carne_Picada);
		
			JMenuItem Pollo_Muslos = new JMenuItem("Muslos");
			Pollo.add(Pollo_Muslos);
		
		/*El Pavo*/
		JMenu Pavo = new JMenu("Pavo");
		Carne.add(Pavo);
		
			JMenuItem Pavo_Hamburguesa = new JMenuItem("Hamburguesa");
			Pavo.add(Pavo_Hamburguesa);
		
			JMenuItem Pavo_Muslos = new JMenuItem("Muslos");
			Pavo.add(Pavo_Muslos);
		
			JMenuItem Pavo_Carne_Picada = new JMenuItem("Carne Picada");
			Pavo.add(Pavo_Carne_Picada);
		
			JMenuItem Pavo_Filete = new JMenuItem("Filete");
			Pavo.add(Pavo_Filete);
		
		/*El Cordero*/
		JMenu Cordero = new JMenu("Cordero");
		Carne.add(Cordero);
		
			JMenuItem Cordero_Filete = new JMenuItem("Filete");
			Cordero.add(Cordero_Filete);
		
			JMenuItem Cordero_Pata = new JMenuItem("Pata");
			Cordero.add(Cordero_Pata);
		
			JMenuItem Cordero_Chuleta = new JMenuItem("Chuleta");
			Cordero.add(Cordero_Chuleta);
		
		
		/*Todos los lacteos*/
		JMenu Lacteos = new JMenu("Lacteos");
		Lacteos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgLacteos frame = new CtgLacteos();
				frame.setVisible(true);
			}
		});
		Productos_Animales.add(Lacteos);
		
		/*El queso*/
		JMenu Queso = new JMenu("Queso");
		Lacteos.add(Queso);
		
			JMenuItem Queso_Fresco = new JMenuItem("Fresco");
			Queso.add(Queso_Fresco);
		
			JMenuItem Queso_Cabra = new JMenuItem("Cabra");
			Queso.add(Queso_Cabra);
		
			JMenuItem Queso_Oveja = new JMenuItem("Oveja");
			Queso.add(Queso_Oveja);
		
			JMenuItem Queso_Viejo = new JMenuItem("Viejo");
			Queso.add(Queso_Viejo);
		
			JMenuItem Queso_Curado = new JMenuItem("Curado");
			Queso.add(Queso_Curado);
			
		/*La leche*/
		JMenu Leche = new JMenu("Leche");
		Lacteos.add(Leche);
		
			JMenuItem Leche_Entera = new JMenuItem("Entera");
			Leche.add(Leche_Entera);
		
			JMenuItem Leche_Semidesnatada = new JMenuItem("Semidesnatada");
			Leche.add(Leche_Semidesnatada);
		
			JMenuItem Leche_Desnatada = new JMenuItem("Desnatada");
			Leche.add(Leche_Desnatada);
		
		/*La mantequilla*/
		JMenu Mantequilla = new JMenu("Mantequilla");
		Lacteos.add(Mantequilla);
		
			JMenuItem Mantequilla_Con_Sal = new JMenuItem("Con Sal");
			Mantequilla.add(Mantequilla_Con_Sal);
		
			JMenuItem Mantequilla_Sin_Sal = new JMenuItem("Sin Sal");
			Mantequilla.add(Mantequilla_Sin_Sal);
		
		
		/*Todos los huevos*/
		JMenu Huevos = new JMenu("Huevos");
		Huevos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgHuevos frame = new CtgHuevos();
				frame.setVisible(true);
			}
		});
		Productos_Animales.add(Huevos);
		
		/*De Gallina*/
		JMenu Gallina = new JMenu("Gallina");
		Huevos.add(Gallina);
		
			JMenuItem Gallina_Blanco = new JMenuItem("Blanco");
			Gallina.add(Gallina_Blanco);
		
			JMenuItem Gallina_Marron = new JMenuItem("Marrón");
			Gallina.add(Gallina_Marron);
		
		/*De Codorniz*/
			JMenuItem Codorniz = new JMenuItem("Codorniz");
			Huevos.add(Codorniz);
		
		
		/*Todos los pescados*/
		JMenu Pescado = new JMenu("Pescado");
		Pescado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgPescado frame = new CtgPescado();
				frame.setVisible(true);
			}
		});
		Productos_Animales.add(Pescado);
		
		/*Todos los pescados blancos*/
		JMenu Blanco = new JMenu("Blanco");
		Pescado.add(Blanco);
		
		/*El bacalao*/
		JMenu Bacalao = new JMenu("Bacalao");
		Blanco.add(Bacalao);
		
			JMenuItem Bacalao_Filete = new JMenuItem("Filete");
			Bacalao.add(Bacalao_Filete);
		
			JMenuItem Bacalao_Troceado = new JMenuItem("Troceado");
			Bacalao.add(Bacalao_Troceado);
		
		/*La merluza*/
		JMenu Merluza = new JMenu("Merluza");
		Blanco.add(Merluza);
		
			JMenuItem Merluza_Filete = new JMenuItem("Filete");
			Merluza.add(Merluza_Filete);
		
			JMenuItem Merluza_Troceada = new JMenuItem("Troceada");
			Merluza.add(Merluza_Troceada);
		
		/*El lenguado*/
			JMenuItem Lenguado = new JMenuItem("Lenguado");
			Blanco.add(Lenguado);
		
		/*El rape*/
			JMenuItem Rape = new JMenuItem("Rape");
			Blanco.add(Rape);
		
		
		/*Todos los pescados azules*/
		JMenu Azul = new JMenu("Azul");
		Pescado.add(Azul);
		
		/*La caballa*/
		JMenu Caballa = new JMenu("Caballa");
		Azul.add(Caballa);
		
			JMenuItem Caballa_Filete = new JMenuItem("Filete");
			Caballa.add(Caballa_Filete);
		
			JMenuItem Caballa_Troceado = new JMenuItem("Troceada");
			Caballa.add(Caballa_Troceado);
		
		/*El salmón*/
		JMenu Salmon = new JMenu("Salmón");
		Azul.add(Salmon);
		
			JMenuItem Salmon_Filete = new JMenuItem("Filete");
			Salmon.add(Salmon_Filete);
		
			JMenuItem Salmon_Troceado = new JMenuItem("Troceado");
			Salmon.add(Salmon_Troceado);
		
		/*El cazón*/
		JMenu Cazon = new JMenu("Cazón");
		Azul.add(Cazon);
		
			JMenuItem Cazo_Filete = new JMenuItem("Filete");
			Cazon.add(Cazo_Filete);
		
			JMenuItem Cazo_Troceado = new JMenuItem("Troceado");
			Cazon.add(Cazo_Troceado);
		
		/*Las angulas*/
			JMenuItem Angulas = new JMenuItem("Angulas");
			Azul.add(Angulas);
		
		/*Las sardinas*/
			JMenuItem Sardinas = new JMenuItem("Sardinas");
			Azul.add(Sardinas);
		
		
		/*Todo el marisco*/
		JMenu Marisco = new JMenu("Marisco");
		Marisco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgMarisco frame = new CtgMarisco();
				frame.setVisible(true);
			}
		});
		Productos_Animales.add(Marisco);
		
		/*Todos los crustáceos*/
		JMenu Crustaceos = new JMenu("Crustáceos");
		Marisco.add(Crustaceos);
		
			JMenuItem Bogavante = new JMenuItem("Bogavante");
			Crustaceos.add(Bogavante);
		
			JMenuItem Gambas = new JMenuItem("Gambas");
			Crustaceos.add(Gambas);
		
			JMenuItem Cangrejo = new JMenuItem("Cangrejo");
			Crustaceos.add(Cangrejo);
		
			JMenuItem Langosta = new JMenuItem("Langosta");
			Crustaceos.add(Langosta);
		
			JMenuItem Langostinos = new JMenuItem("Langostinos");
			Crustaceos.add(Langostinos);
		
		
		/*Todos los moluscos*/
		JMenu Moluscos = new JMenu("Moluscos");
		Marisco.add(Moluscos);
		
		/*El calamar*/
		JMenu Calamar = new JMenu("Calamar");
		Moluscos.add(Calamar);
		
			JMenuItem Calamar_Entero = new JMenuItem("Entero");
			Calamar.add(Calamar_Entero);
		
			JMenuItem Calamar_Troceado = new JMenuItem("Troceado");
			Calamar.add(Calamar_Troceado);
		
		/*El pulpo*/
		JMenu Pulpo = new JMenu("Pulpo");
		Moluscos.add(Pulpo);
		
			JMenuItem Pulpo_Entero = new JMenuItem("Entero");
			Pulpo.add(Pulpo_Entero);
		
			JMenuItem Pulpo_Troceado = new JMenuItem("Troceado");
			Pulpo.add(Pulpo_Troceado);
		
		/*Los mejillones*/
			JMenuItem Mejillones = new JMenuItem("Mejillones");
			Moluscos.add(Mejillones);
		
		/*La sepia*/
		JMenu Sepia = new JMenu("Sepia");
		Moluscos.add(Sepia);
		
			JMenuItem Sepia_Entero = new JMenuItem("Entero");
			Sepia.add(Sepia_Entero);
		
			JMenuItem Sepia_Troceado = new JMenuItem("Troceado");
			Sepia.add(Sepia_Troceado);
		
		/*Las almejas*/
			JMenuItem Almejas = new JMenuItem("Almejas");
			Moluscos.add(Almejas);
		
		
		/*Todos los productos procesados*/
		JMenu Procesados = new JMenu("Procesados");
		Productos_Animales.add(Procesados);
		
		/*Las salchichas*/
		JMenu Salchichas = new JMenu("Salchichas");
		Procesados.add(Salchichas);
		
			JMenuItem Salchicha_Cerdo = new JMenuItem("Cerdo");
			Salchichas.add(Salchicha_Cerdo);
		
			JMenuItem Salchicha_Pollo = new JMenuItem("Pollo");
			Salchichas.add(Salchicha_Pollo);
		
			JMenuItem Salchicha_Pavo = new JMenuItem("Pavo");
			Salchichas.add(Salchicha_Pavo);
		
		/*La manteca*/
		JMenu Manteca = new JMenu("Manteca");
		Procesados.add(Manteca);
		
			JMenuItem Manteca_Cerdo = new JMenuItem("Cerdo");
			Manteca.add(Manteca_Cerdo);
		
			JMenuItem Manteca_Vacuno = new JMenuItem("Vacuno");
			Manteca.add(Manteca_Vacuno);
		
		/*El paté*/
		JMenu Pate = new JMenu("Paté");
		Procesados.add(Pate);
		
			JMenuItem Pate_Cerdo = new JMenuItem("Cerdo");
			Pate.add(Pate_Cerdo);
		
			JMenuItem Pate_Pollo = new JMenuItem("Pollo");
			Pate.add(Pate_Pollo);
		
			JMenuItem Pate_Pavo = new JMenuItem("Pavo");
			Pate.add(Pate_Pavo);
		
			JMenuItem Pate_Pato = new JMenuItem("Pato");
			Pate.add(Pate_Pato);
		
		/*El jamón*/
		JMenu Jamon = new JMenu("Jamón");
		Procesados.add(Jamon);
		
			JMenuItem Jamon_Pata_Negra = new JMenuItem("Pata Negra");
			Jamon.add(Jamon_Pata_Negra);
		
			JMenuItem Jamon_Bellota = new JMenuItem("Bellota");
			Jamon.add(Jamon_Bellota);
		
			JMenuItem Jamon_Serrano = new JMenuItem("Serrano");
			Jamon.add(Jamon_Serrano);
		
			JMenuItem Jamon_Iberico = new JMenuItem("Ibérico");
			Jamon.add(Jamon_Iberico);
		
		/*El chorizo*/
		JMenu Chorizo = new JMenu("Chorizo");
		Procesados.add(Chorizo);
		
			JMenuItem Chorizo_Dulce = new JMenuItem("Dulce");
			Chorizo.add(Chorizo_Dulce);
		
			JMenuItem Chorizo_Picante = new JMenuItem("Picante");
			Chorizo.add(Chorizo_Picante);
		
		/*El salchichón*/
			JMenuItem Salchichon = new JMenuItem("Salchichón");
			Procesados.add(Salchichon);
		
		/*El fuet*/
			JMenuItem Fuet = new JMenuItem("Fuet");
			Procesados.add(Fuet);
		
		/*La caña de lomo*/
			JMenuItem Caña_Lomo = new JMenuItem("Caña de Lomo");
			Procesados.add(Caña_Lomo);
		
		/*La morcilla*/
			JMenuItem Morcilla = new JMenuItem("Morcilla");
			Procesados.add(Morcilla);
		
		
		
		/*Todos los productos de origen vegetal*/
		JMenu Productos_Vegetales = new JMenu("Productos Vegetales");
		Productos_Vegetales.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgProductosVegetales frame = new CtgProductosVegetales();
				frame.setVisible(true);
			}
		});
		Articulos.add(Productos_Vegetales);
		
		
		/*Todas las verduras*/
		JMenu Verduras = new JMenu("Verduras");
		Verduras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgVerduras frame = new CtgVerduras();
				frame.setVisible(true);
			}
		});
		Productos_Vegetales.add(Verduras);
		
		/*El pimiento*/
		JMenu Pimiento = new JMenu("Pimiento");
		Verduras.add(Pimiento);
		
			JMenuItem Pimiento_Rojo = new JMenuItem("Rojo");
			Pimiento.add(Pimiento_Rojo);
		
			JMenuItem Pimiento_Verde = new JMenuItem("Verde");
			Pimiento.add(Pimiento_Verde);
		
			JMenuItem Pimiento_Amarilla = new JMenuItem("Amarillo");
			Pimiento.add(Pimiento_Amarilla);
		
		/*El puerro*/
		JMenu Puerro = new JMenu("Puerro");
		Verduras.add(Puerro);
		
			JMenuItem Puerro_Corto = new JMenuItem("Corto");
			Puerro.add(Puerro_Corto);
		
			JMenuItem Puerro_Largo = new JMenuItem("Largo");
			Puerro.add(Puerro_Largo);
		
		/*La cebolla*/
		JMenu Cebolla = new JMenu("Cebolla");
		Verduras.add(Cebolla);
		
			JMenuItem Cebolla_Blanca = new JMenuItem("Blanca");
			Cebolla.add(Cebolla_Blanca);
		
			JMenuItem Cebolla_Morada = new JMenuItem("Morada");
			Cebolla.add(Cebolla_Morada);
		
		/*El ajo*/
		JMenu Ajo = new JMenu("Ajo");
		Verduras.add(Ajo);
		
			JMenuItem Ajo_Blanco = new JMenuItem("Blanco");
			Ajo.add(Ajo_Blanco);
		
			JMenuItem Ajo_Morado = new JMenuItem("Morado");
			Ajo.add(Ajo_Morado);
		
		/*Las berenjenas*/
			JMenuItem Berenjenas = new JMenuItem("Berenjenas");
			Verduras.add(Berenjenas);
		
		/*Las zanahorias*/
			JMenuItem Zanahorias = new JMenuItem("Zanahorias");
			Verduras.add(Zanahorias);
		
		/*El brocoli*/
			JMenuItem Brocoli = new JMenuItem("Brocoli");
			Verduras.add(Brocoli);
		
		/*La lechuga*/
			JMenuItem Lechuga = new JMenuItem("Lechuga");
			Verduras.add(Lechuga);
		
		/*Las patatas*/
			JMenuItem Patatas = new JMenuItem("Patatas");
			Verduras.add(Patatas);
		
		/*La coliflor*/
			JMenuItem Coliflor = new JMenuItem("Coliflor");
			Verduras.add(Coliflor);
		
		
		/*Todas las frutas*/
		JMenu Frutas = new JMenu("Frutas");
		Frutas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgFrutas frame = new CtgFrutas();
				frame.setVisible(true);
			}
		});
		Productos_Vegetales.add(Frutas);
		
		/*Las manzanas*/
		JMenu Manzanas = new JMenu("Manzanas");
		Frutas.add(Manzanas);
		
			JMenuItem Manzanas_Rojas = new JMenuItem("Rojas");
			Manzanas.add(Manzanas_Rojas);
		
			JMenuItem Manzanas_Verdes = new JMenuItem("Verdes");
			Manzanas.add(Manzanas_Verdes);
		
			JMenuItem Manzanas_Amarillas = new JMenuItem("Amarillas");
			Manzanas.add(Manzanas_Amarillas);
		
		/*Las peras*/
		JMenu Peras = new JMenu("Peras");
		Frutas.add(Peras);
		
			JMenuItem Peras_Verdes = new JMenuItem("Verdes");
			Peras.add(Peras_Verdes);
		
			JMenuItem Peras_Amarillas = new JMenuItem("Amarillas");
			Peras.add(Peras_Amarillas);
		
		/*Las mandarinas*/
			JMenuItem Mandarinas = new JMenuItem("Mandarinas");
			Frutas.add(Mandarinas);
		
		/*Las fresas*/
			JMenuItem Fresas = new JMenuItem("Fresas");
			Frutas.add(Fresas);
		
		/*Las cerezas*/
			JMenuItem Cerezas = new JMenuItem("Cerezas");
			Frutas.add(Cerezas);
		
		/*Las uvas*/
		JMenu Uvas = new JMenu("Uvas");
		Frutas.add(Uvas);
		
			JMenuItem Uvas_Verdes = new JMenuItem("Verdes");
			Uvas.add(Uvas_Verdes);
		
			JMenuItem Uvas_Moradas = new JMenuItem("Moradas");
			Uvas.add(Uvas_Moradas);
		
		/*Las aceitunas*/
		JMenu Aceitunas = new JMenu("Aceitunas");
		Frutas.add(Aceitunas);
		
			JMenuItem Aceitunas_Verdes = new JMenuItem("Verdes");
			Aceitunas.add(Aceitunas_Verdes);
		
			JMenuItem Aceitunas_Negras = new JMenuItem("Negras");
			Aceitunas.add(Aceitunas_Negras);
		
		/*Los plátanos*/
			JMenuItem Platanos = new JMenuItem("Plátanos");
			Frutas.add(Platanos);
		
		/*La sandía*/
			JMenuItem Sandia = new JMenuItem("Sandía");
			Frutas.add(Sandia);
		
		/*El melón*/
		JMenu Melon = new JMenu("Melón");
		Frutas.add(Melon);
		
			JMenuItem Melon_Amarillo = new JMenuItem("Amarillo");
			Melon.add(Melon_Amarillo);
		
			JMenuItem Melon_Blanco = new JMenuItem("Blanco");
			Melon.add(Melon_Blanco);
		
			JMenuItem Melon_Verde = new JMenuItem("Verde");
			Melon.add(Melon_Verde);
		
		/*El coco*/
		JMenu Coco = new JMenu("Coco");
		Frutas.add(Coco);
		
			JMenuItem Coco_Marron = new JMenuItem("Marrón");
			Coco.add(Coco_Marron);
		
			JMenuItem Coco_Verde = new JMenuItem("Verde");
			Coco.add(Coco_Verde);
		
		
		/*Todos los frutos secos*/
		JMenu Frutos_Secos = new JMenu("Frutos Secos");
		Frutos_Secos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgFrutosSecos frame = new CtgFrutosSecos();
				frame.setVisible(true);
			}
		});
		Productos_Vegetales.add(Frutos_Secos);
		
		/*Las almendras*/
			JMenuItem Almendras = new JMenuItem("Almendras");
			Frutos_Secos.add(Almendras);
		
		/*Los anacardos*/
			JMenuItem Anacardos = new JMenuItem("Anacardos");
			Frutos_Secos.add(Anacardos);
		
		/*Las nueces*/
			JMenuItem Nueces = new JMenuItem("Nueces");
			Frutos_Secos.add(Nueces);
		
		/*Las pipas*/
		JMenu Pipas = new JMenu("Pipas");
		Frutos_Secos.add(Pipas);
		
			JMenuItem Pipas_Girasol = new JMenuItem("Girasol");
			Pipas.add(Pipas_Girasol);
		
			JMenuItem Pipas_Calabaza = new JMenuItem("Calabaza");
			Pipas.add(Pipas_Calabaza);
		
		/*Los pistachos*/
			JMenuItem Pistachos = new JMenuItem("Pistachos");
			Frutos_Secos.add(Pistachos);
		
		/*Las pasas*/
			JMenuItem Pasas = new JMenuItem("Pasas");
			Frutos_Secos.add(Pasas);
		
		/*Los kikos*/
			JMenuItem Kikos = new JMenuItem("Kikos");
			Frutos_Secos.add(Kikos);
		
		/*Los cacahuetes*/
			JMenuItem Cacahuetes = new JMenuItem("Cacahuetes");
			Frutos_Secos.add(Cacahuetes);
		
		/*Las avellanas*/
			JMenuItem Avellanas = new JMenuItem("Avellanas");
			Frutos_Secos.add(Avellanas);
		
		/*Las castañas*/
			JMenuItem Castañas = new JMenuItem("Castañas");
			Frutos_Secos.add(Castañas);
		
		
		/*Todas las legumbres*/
		JMenu Legumbres = new JMenu("Legumbres");
		Legumbres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgLegumbres frame = new CtgLegumbres();
				frame.setVisible(true);
			}
		});
		Productos_Vegetales.add(Legumbres);
		
		/*Los garbanzos*/
			JMenuItem Garbanzos = new JMenuItem("Garbanzos");
			Legumbres.add(Garbanzos);
		
		/*Las lentejas*/
			JMenuItem Lentejas = new JMenuItem("Lentejas");
			Legumbres.add(Lentejas);
		
		/*Los guisantes*/
			JMenuItem Guisantes = new JMenuItem("Guisantes");
			Legumbres.add(Guisantes);
		
		/*Las alubias*/
		JMenu Alubias = new JMenu("Alubias");
		Legumbres.add(Alubias);
		
			JMenuItem Alubias_Blancas = new JMenuItem("Blancas");
			Alubias.add(Alubias_Blancas);
		
			JMenuItem Alubias_Verdes = new JMenuItem("Verdes");
			Alubias.add(Alubias_Verdes);
		
			JMenuItem Alubias_Rojas = new JMenuItem("Rojas");
			Alubias.add(Alubias_Rojas);
		
			JMenuItem Alubias_Negras = new JMenuItem("Negras");
			Alubias.add(Alubias_Negras);
		
		/*Los aceites*/
		JMenu Aceites = new JMenu("Aceites");
		Aceites.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgAceites frame = new CtgAceites();
				frame.setVisible(true);
			}
		});
		Productos_Vegetales.add(Aceites);
		
			JMenuItem Aceite_Oliva = new JMenuItem("Oliva");
			Aceites.add(Aceite_Oliva);
		
			JMenuItem Aceite_Girasol = new JMenuItem("Girasol");
			Aceites.add(Aceite_Girasol);
		
			JMenuItem Aceite_De_Palma = new JMenuItem("De Palma");
			Aceites.add(Aceite_De_Palma);
		
		
		
		/*Todos los Condimentos*/
		JMenu Condimentos = new JMenu("Condimentos");
		Condimentos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgCondimentos frame = new CtgCondimentos();
				frame.setVisible(true);
			}
		});
		Articulos.add(Condimentos);
		
		/*La canela*/
		JMenu Canela = new JMenu("Canela");
		Condimentos.add(Canela);
		
			JMenuItem Canela_Barra = new JMenuItem("Barra");
			Canela.add(Canela_Barra);
		
			JMenuItem Canela_Molida = new JMenuItem("Molida");
			Canela.add(Canela_Molida);
		
		/*El perejil*/
		JMenu Perejil = new JMenu("Perejil");
		Condimentos.add(Perejil);
		
			JMenuItem Perejil_Hojas = new JMenuItem("Hojas");
			Perejil.add(Perejil_Hojas);
		
			JMenuItem Perejil_Molido = new JMenuItem("Molido");
			Perejil.add(Perejil_Molido);
		
		/*La pimienta*/
		JMenu Pimienta = new JMenu("Pimienta");
		Condimentos.add(Pimienta);
		
			JMenuItem Pimienta_Negra = new JMenuItem("Negra");
			Pimienta.add(Pimienta_Negra);
		
			JMenuItem Pimienta_Roja = new JMenuItem("Roja");
			Pimienta.add(Pimienta_Roja);
		
		/*El orégano*/
		JMenu Oregano = new JMenu("Orégano");
		Condimentos.add(Oregano);
		
			JMenuItem Oregano_Hoja = new JMenuItem("Hoja");
			Oregano.add(Oregano_Hoja);
		
			JMenuItem Oregano_Molido = new JMenuItem("Molido");
			Oregano.add(Oregano_Molido);
		
		/*El pimentón*/
		JMenu Pimenton = new JMenu("Pimentón");
		Condimentos.add(Pimenton);
		
			JMenuItem Pimenton_Dulce = new JMenuItem("Dulce");
			Pimenton.add(Pimenton_Dulce);
		
			JMenuItem Pimenton_Ahumado = new JMenuItem("Ahumado");
			Pimenton.add(Pimenton_Ahumado);
		
		/*El comino*/
			JMenuItem Comino = new JMenuItem("Comino Molido");
			Condimentos.add(Comino);
		
		/*El jengibre*/
		JMenu Jengibre = new JMenu("Jengibre");
		Condimentos.add(Jengibre);
		
			JMenuItem Jengibre_Raiz = new JMenuItem("Raíz");
			Jengibre.add(Jengibre_Raiz);
		
			JMenuItem Jengibre_Molido = new JMenuItem("Molido");
			Jengibre.add(Jengibre_Molido);
		
		/*El azúcar*/
		JMenu Azucar = new JMenu("Azúcar");
		Condimentos.add(Azucar);
		
			JMenuItem Azucar_Glas = new JMenuItem("Glas");
			Azucar.add(Azucar_Glas);
		
			JMenuItem Azucar_Blanco = new JMenuItem("Blanco");
			Azucar.add(Azucar_Blanco);
		
			JMenuItem Azucar_Moreno = new JMenuItem("Moreno");
			Azucar.add(Azucar_Moreno);
		
		/*La sal*/
		JMenu Sal = new JMenu("Sal");
		Condimentos.add(Sal);
		
			JMenuItem Sal_Fina = new JMenuItem("Fina");
			Sal.add(Sal_Fina);
		
			JMenuItem Sal_Gruesa = new JMenuItem("Gruesa");
			Sal.add(Sal_Gruesa);
		
		/*El vinagre*/
		JMenu Vinagre = new JMenu("Vinagre");
		Condimentos.add(Vinagre);
		
			JMenuItem Vinagre_Blanco = new JMenuItem("Blanco");
			Vinagre.add(Vinagre_Blanco);
		
			JMenuItem Vinagre_Sidra = new JMenuItem("Sidra");
			Vinagre.add(Vinagre_Sidra);
		
			JMenuItem Vinagre_Vino = new JMenuItem("Vino");
			Vinagre.add(Vinagre_Vino);
		
		/*La miel*/
		JMenu Miel = new JMenu("Miel");
		Condimentos.add(Miel);
		
			JMenuItem Miel_Dulce = new JMenuItem("Dulce");
			Miel.add(Miel_Dulce);
		
			JMenuItem Miel_Melaza= new JMenuItem("Melaza");
			Miel.add(Miel_Melaza);
			
			
			
			/*Posicionamiento Productos*/
			
			/*Primera Página*/
			
			/*Productos primera fila*/
			JLabel LabelAceite_Palma = new JLabel("Aceite De Palma");
			LabelAceite_Palma.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAceite_Palma.setBounds(40, 126, 104, 14);
			contentPane.add(LabelAceite_Palma);
			
			JLabel ImagenAceite_Palma = new JLabel(" ");
			ImagenAceite_Palma.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/caña de lomo.png")));
			ImagenAceite_Palma.setBounds(40, 126, 91, 111);
			contentPane.add(ImagenAceite_Palma);
			
			JLabel LabelAceite_Girasol = new JLabel("Aceite Girasol");
			LabelAceite_Girasol.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAceite_Girasol.setBounds(200, 126, 104, 14);
			contentPane.add(LabelAceite_Girasol);
			
			JLabel ImagenAceite_Girasol = new JLabel(" ");
			ImagenAceite_Girasol.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/chorizo dulce.png")));
			ImagenAceite_Girasol.setBounds(200, 126, 91, 111);
			contentPane.add(ImagenAceite_Girasol);
			
			JLabel LabelAceite_Oliva = new JLabel("Aceite Oliva");
			LabelAceite_Oliva.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAceite_Oliva.setBounds(360, 126, 104, 14);
			contentPane.add(LabelAceite_Oliva);
			
			JLabel ImagenAceite_Oliva = new JLabel(" ");
			ImagenAceite_Oliva.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/chorizo picante.png")));
			ImagenAceite_Oliva.setBounds(360, 126, 91, 111);
			contentPane.add(ImagenAceite_Oliva);
			
			JLabel LabelAceitunas_Negras = new JLabel("Aceitunas Negras");
			LabelAceitunas_Negras.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAceitunas_Negras.setBounds(520, 126, 104, 14);
			contentPane.add(LabelAceitunas_Negras);
			
			JLabel ImagenAceitunas_Negras = new JLabel(" ");
			ImagenAceitunas_Negras.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/fuet.png")));
			ImagenAceitunas_Negras.setBounds(520, 126, 91, 111);
			contentPane.add(ImagenAceitunas_Negras);
			
			JLabel LabelAceitunas_Verdes = new JLabel("Aceitunas Verdes");
			LabelAceitunas_Verdes.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAceitunas_Verdes.setBounds(680, 126, 104, 14);
			contentPane.add(LabelAceitunas_Verdes);
			
			JLabel ImagenAceitunas_Verdes = new JLabel(" ");
			ImagenAceitunas_Verdes.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/Jamón de bellota.png")));
			ImagenAceitunas_Verdes.setBounds(680, 126, 91, 111);
			contentPane.add(ImagenAceitunas_Verdes);
				
			JLabel LabelAjo_Blanco = new JLabel("Ajo Blanco");
			LabelAjo_Blanco.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAjo_Blanco.setBounds(840, 126, 104, 14);
			contentPane.add(LabelAjo_Blanco);
			
			JLabel ImagenAjo_Blanco = new JLabel(" ");
			ImagenAjo_Blanco.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/Jamón ibérico.png")));
			ImagenAjo_Blanco.setBounds(840, 126, 91, 111);
			contentPane.add(ImagenAjo_Blanco);
			
			JLabel LabelAjo_Morado = new JLabel("Ajo Morado");
			LabelAjo_Morado.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAjo_Morado.setBounds(1000, 126, 104, 14);
			contentPane.add(LabelAjo_Morado);
			
			JLabel ImagenAjo_Morado = new JLabel(" ");
			ImagenAjo_Morado.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/Jamón pata negra.png")));
			ImagenAjo_Morado.setBounds(1000, 126, 91, 111);
			contentPane.add(ImagenAjo_Morado);
			
			JLabel LabelAlmejas = new JLabel("Almejas");
			LabelAlmejas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAlmejas.setBounds(1160, 126, 104, 14);
			contentPane.add(LabelAlmejas);
			
			JLabel ImagenAlmejas = new JLabel(" ");
			ImagenAlmejas.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/Jamon serrano.png")));
			ImagenAlmejas.setBounds(1160, 126, 91, 111);
			contentPane.add(ImagenAlmejas);
			
			JLabel LabelAlmendras = new JLabel("Almendras");
			LabelAlmendras.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAlmendras.setBounds(1320, 126, 104, 14);
			contentPane.add(LabelAlmendras);
			
			JLabel ImagenAlmendras = new JLabel(" ");
			ImagenAlmendras.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/manteca de cerdo.png")));
			ImagenAlmendras.setBounds(1320, 126, 91, 111);
			contentPane.add(ImagenAlmendras);
						
			JLabel LabelAlubias_Blancas = new JLabel("Alubias Blancas");
			LabelAlubias_Blancas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAlubias_Blancas.setBounds(1480, 126, 104, 14);
			contentPane.add(LabelAlubias_Blancas);
			
			JLabel ImagenAlubias_Blancas = new JLabel(" ");
			ImagenAlubias_Blancas.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/manteca de vacuno.png")));
			ImagenAlubias_Blancas.setBounds(1480, 126, 91, 111);
			contentPane.add(ImagenAlubias_Blancas);
			
			JLabel LabelAlubias_Negras = new JLabel("Alubias Negras");
			LabelAlubias_Negras.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAlubias_Negras.setBounds(1640, 126, 104, 14);
			contentPane.add(LabelAlubias_Negras);
			
			JLabel ImagenAlubias_Negras = new JLabel(" ");
			ImagenAlubias_Negras.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/Morcilla.png")));
			ImagenAlubias_Negras.setBounds(1640, 126, 91, 111);
			contentPane.add(ImagenAlubias_Negras);
			
			JLabel LabelAlubias_Rojas = new JLabel("Alubias Rojas");
			LabelAlubias_Rojas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAlubias_Rojas.setBounds(1800, 126, 104, 14);
			contentPane.add(LabelAlubias_Rojas);
			
			JLabel ImagenAlubias_Rojas = new JLabel(" ");
			ImagenAlubias_Rojas.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/pate de cerdo.png")));
			ImagenAlubias_Rojas.setBounds(1800, 126, 91, 111);
			contentPane.add(ImagenAlubias_Rojas);
			
			/*Productos segunda fila*/
			JLabel LabelAlubias_Verdes = new JLabel("Alubias Verdes");
			LabelAlubias_Verdes.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAlubias_Verdes.setBounds(40, 306, 104, 14);
			contentPane.add(LabelAlubias_Verdes);
			
			JLabel ImagenAlubias_Verdes = new JLabel(" ");
			ImagenAlubias_Verdes.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/Pate_Pavo.png")));
			ImagenAlubias_Verdes.setBounds(40, 306, 91, 111);
			contentPane.add(ImagenAlubias_Verdes);
						
			JLabel LabelAnacardos = new JLabel("Anarcados");
			LabelAnacardos.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAnacardos.setBounds(200, 306, 104, 14);
			contentPane.add(LabelAnacardos);
			
			JLabel ImagenAnacardos = new JLabel(" ");
			ImagenAnacardos.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/pate de pato.png")));
			ImagenAnacardos.setBounds(200, 306, 91, 111);
			contentPane.add(ImagenAnacardos);
									
			JLabel LabelAngulas = new JLabel("Angulas");
			LabelAngulas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAngulas.setBounds(360, 306, 104, 14);
			contentPane.add(LabelAngulas);
			
			JLabel ImagenAngulas = new JLabel(" ");
			ImagenAngulas.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/Pate_Pollo.png")));
			ImagenAngulas.setBounds(360, 306, 91, 111);
			contentPane.add(ImagenAngulas);
			
			JLabel LabelAvellanas = new JLabel("Avellanas");
			LabelAvellanas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAvellanas.setBounds(520, 306, 104, 14);
			contentPane.add(LabelAvellanas);
			
			JLabel ImagenAvellanas = new JLabel(" ");
			ImagenAvellanas.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/salchicha de cerdo.png")));
			ImagenAvellanas.setBounds(520, 306, 91, 111);
			contentPane.add(ImagenAvellanas);
									
			JLabel LabelAzucar_Blanco = new JLabel("Azúcar Blanco");
			LabelAzucar_Blanco.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAzucar_Blanco.setBounds(680, 306, 104, 14);
			contentPane.add(LabelAzucar_Blanco);
			
			JLabel ImagenAzucar_Blanco = new JLabel(" ");
			ImagenAzucar_Blanco.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/salchicha de pavo.png")));
			ImagenAzucar_Blanco.setBounds(680, 306, 91, 111);
			contentPane.add(ImagenAzucar_Blanco);
									
			JLabel LabelAzucar_Glas = new JLabel("Azúcar Glas");
			LabelAzucar_Glas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAzucar_Glas.setBounds(840, 306, 104, 14);
			contentPane.add(LabelAzucar_Glas);
			
			JLabel ImagenAzucar_Glas = new JLabel(" ");
			ImagenAzucar_Glas.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/salchicha de pollo.png")));
			ImagenAzucar_Glas.setBounds(840, 306, 91, 111);
			contentPane.add(ImagenAzucar_Glas);
			
			JLabel LabelAzucar_Moreno = new JLabel("Azúcar Moreno");
			LabelAzucar_Moreno.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAzucar_Moreno.setBounds(1000, 306, 104, 14);
			contentPane.add(LabelAzucar_Moreno);
			
			JLabel ImagenAzucar_Moreno = new JLabel(" ");
			ImagenAzucar_Moreno.setIcon(new ImageIcon(CtgProcesados.class.getResource("/Imagenes/salchichon.png")));
			ImagenAzucar_Moreno.setBounds(1000, 306, 91, 111);
			contentPane.add(ImagenAzucar_Moreno);
								
			
			
			//Etiquetas precio productos
			JLabel lblNewLabel = new JLabel("precio");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(40, 235, 46, 14);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1_3 = new JLabel("precio");
			lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_3.setBounds(40, 415, 46, 14);
			contentPane.add(lblNewLabel_1_3);
			
			JLabel lblNewLabel_1 = new JLabel("precio");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(200, 235, 46, 14);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_21 = new JLabel("precio");
			lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_21.setBounds(200, 415, 46, 14);
			contentPane.add(lblNewLabel_21);
			
			JLabel lblNewLabel_1_1 = new JLabel("precio");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setBounds(360, 235, 46, 14);
			contentPane.add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_1_2 = new JLabel("precio");
			lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2.setBounds(360, 415, 46, 14);
			contentPane.add(lblNewLabel_1_2);
			
			JLabel lblNewLabel_1_0 = new JLabel("precio");
			lblNewLabel_1_0.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_0.setBounds(520, 235, 46, 14);
			contentPane.add(lblNewLabel_1_0);
			
			JLabel lblNewLabel_1_01 = new JLabel("precio");
			lblNewLabel_1_01.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_01.setBounds(520, 415, 46, 14);
			contentPane.add(lblNewLabel_1_01);
			
			JLabel lblNewLabel_1_05 = new JLabel("precio");
			lblNewLabel_1_05.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_05.setBounds(680, 235, 46, 14);
			contentPane.add(lblNewLabel_1_05);
			
			JLabel lblNewLabel_1_06 = new JLabel("precio");
			lblNewLabel_1_06.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_06.setBounds(680, 415, 46, 14);
			contentPane.add(lblNewLabel_1_06);
			
			JLabel lblNewLabel_1_100 = new JLabel("precio");
			lblNewLabel_1_100.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_100.setBounds(840, 235, 46, 14);
			contentPane.add(lblNewLabel_1_100);
			
			JLabel lblNewLabel_1_101 = new JLabel("precio");
			lblNewLabel_1_101.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_101.setBounds(840, 415, 46, 14);
			contentPane.add(lblNewLabel_1_101);
			
			JLabel lblNewLabel_1_105 = new JLabel("precio");
			lblNewLabel_1_105.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_105.setBounds(1000, 235, 46, 14);
			contentPane.add(lblNewLabel_1_105);
			
			JLabel lblNewLabel_1_106 = new JLabel("precio");
			lblNewLabel_1_106.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_106.setBounds(1000, 415, 46, 14);
			contentPane.add(lblNewLabel_1_106);
			
			JLabel lblNewLabel_1_110 = new JLabel("precio");
			lblNewLabel_1_110.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_110.setBounds(1160, 235, 46, 14);
			contentPane.add(lblNewLabel_1_110);

			JLabel lblNewLabel_1_115 = new JLabel("precio");
			lblNewLabel_1_115.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_115.setBounds(1320, 235, 46, 14);
			contentPane.add(lblNewLabel_1_115);

			JLabel lblNewLabel_1_115_1 = new JLabel("precio");
			lblNewLabel_1_115_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_115_1.setBounds(1480, 235, 46, 14);
			contentPane.add(lblNewLabel_1_115_1);
			
			JLabel lblNewLabel_1_115_6 = new JLabel("precio");
			lblNewLabel_1_115_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_115_6.setBounds(1640, 235, 46, 14);
			contentPane.add(lblNewLabel_1_115_6);
			
			JLabel lblNewLabel_1_115_11 = new JLabel("precio");
			lblNewLabel_1_115_11.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_115_11.setBounds(1800, 235, 46, 14);
			contentPane.add(lblNewLabel_1_115_11);
			
			
			//Etiquetas peso productos
			JLabel lblNewLabel_2 = new JLabel("Peso kg");
			lblNewLabel_2.setBounds(90, 235, 46, 14);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_2_1 = new JLabel("Peso kg");
			lblNewLabel_2_1.setBounds(90, 415, 46, 14);
			contentPane.add(lblNewLabel_2_1);
			
			JLabel lblNewLabel_2_5 = new JLabel("Peso kg");
			lblNewLabel_2_5.setBounds(250, 235, 46, 14);
			contentPane.add(lblNewLabel_2_5);
			
			JLabel lblNewLabel_2_6 = new JLabel("Peso kg");
			lblNewLabel_2_6.setBounds(250, 415, 46, 14);
			contentPane.add(lblNewLabel_2_6);
			
			JLabel lblNewLabel_2_10 = new JLabel("Peso kg");
			lblNewLabel_2_10.setBounds(410, 235, 46, 14);
			contentPane.add(lblNewLabel_2_10);
			
			JLabel lblNewLabel_2_11 = new JLabel("Peso kg");
			lblNewLabel_2_11.setBounds(410, 415, 46, 14);
			contentPane.add(lblNewLabel_2_11);
			
			JLabel lblNewLabel_2_15 = new JLabel("Peso kg");
			lblNewLabel_2_15.setBounds(570, 235, 46, 14);
			contentPane.add(lblNewLabel_2_15);
			
			JLabel lblNewLabel_2_16 = new JLabel("Peso kg");
			lblNewLabel_2_16.setBounds(570, 415, 46, 14);
			contentPane.add(lblNewLabel_2_16);
			
			JLabel lblNewLabel_2_20 = new JLabel("Peso kg");
			lblNewLabel_2_20.setBounds(730, 235, 46, 14);
			contentPane.add(lblNewLabel_2_20);
			
			JLabel lblNewLabel_2_21 = new JLabel("Peso kg");
			lblNewLabel_2_21.setBounds(730, 415, 46, 14);
			contentPane.add(lblNewLabel_2_21);
			
			JLabel lblNewLabel_2_25 = new JLabel("Peso kg");
			lblNewLabel_2_25.setBounds(890, 235, 46, 14);
			contentPane.add(lblNewLabel_2_25);
			
			JLabel lblNewLabel_2_26 = new JLabel("Peso kg");
			lblNewLabel_2_26.setBounds(890, 415, 46, 14);
			contentPane.add(lblNewLabel_2_26);
			
			JLabel lblNewLabel_2_30 = new JLabel("Peso kg");
			lblNewLabel_2_30.setBounds(1050, 235, 46, 14);
			contentPane.add(lblNewLabel_2_30);
			
			JLabel lblNewLabel_2_31 = new JLabel("Peso kg");
			lblNewLabel_2_31.setBounds(1050, 415, 46, 14);
			contentPane.add(lblNewLabel_2_31);
			
			JLabel lblNewLabel_2_35 = new JLabel("Peso kg");
			lblNewLabel_2_35.setBounds(1210, 235, 46, 14);
			contentPane.add(lblNewLabel_2_35);
	
			JLabel lblNewLabel_2_40 = new JLabel("Peso kg");
			lblNewLabel_2_40.setBounds(1370, 235, 46, 14);
			contentPane.add(lblNewLabel_2_40);
	
			JLabel lblNewLabel_2_45 = new JLabel("Peso kg");
			lblNewLabel_2_45.setBounds(1530, 235, 46, 14);
			contentPane.add(lblNewLabel_2_45);
			
			JLabel lblNewLabel_2_50 = new JLabel("Peso kg");
			lblNewLabel_2_50.setBounds(1690, 235, 46, 14);
			contentPane.add(lblNewLabel_2_50);
			
			JLabel lblNewLabel_2_55 = new JLabel("Peso kg");
			lblNewLabel_2_55.setBounds(1850, 235, 46, 14);
			contentPane.add(lblNewLabel_2_55);
	
			
	}
}