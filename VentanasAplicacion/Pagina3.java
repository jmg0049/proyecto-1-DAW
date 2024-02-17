package VentanasAplicacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Pagina3 extends JFrame {

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
					Pagina3 frame = new Pagina3();
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
	public Pagina3() {
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
					Registrarse frame = new Registrarse();
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
			JButton SumPimentonAhumado = new JButton("+1");
			SumPimentonAhumado.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contador=contador+1;
				}
			});
			SumPimentonAhumado.setBounds(25, 250, 55, 23);
			contentPane.add(SumPimentonAhumado);
			
			JButton ResPimentonAhumado = new JButton("-1");
			ResPimentonAhumado.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contador=contador-1;
				}
			});
			ResPimentonAhumado.setBounds(90, 250, 55, 23);
			contentPane.add(ResPimentonAhumado);
			
			
			JButton SumPimentonDulce = new JButton("+1");
			SumPimentonDulce.setBounds(185, 250, 55, 23);
			contentPane.add(SumPimentonDulce);
			
			JButton ResPimentonDulce = new JButton("-1");
			ResPimentonDulce.setBounds(250, 250, 55, 23);
			contentPane.add(ResPimentonDulce);
			
			
			JButton SumPimientaNegra = new JButton("+1");
			SumPimientaNegra.setBounds(345, 250, 55, 23);
			contentPane.add(SumPimientaNegra);
			
			JButton ResPimientaNegra = new JButton("-1");
			ResPimientaNegra.setBounds(410, 250, 55, 23);
			contentPane.add(ResPimientaNegra);
			
			JButton SumPimientaRoja = new JButton("+1");
			SumPimientaRoja.setBounds(505, 250, 55, 23);
			contentPane.add(SumPimientaRoja);
			
			JButton ResPimientaRoja = new JButton("-1");
			ResPimientaRoja.setBounds(570, 250, 55, 23);
			contentPane.add(ResPimientaRoja);
			
			JButton SumPimientoAmarillo = new JButton("+1");
			SumPimientoAmarillo.setBounds(665, 250, 55, 23);
			contentPane.add(SumPimientoAmarillo);
			
			JButton ResPimientoAmarillo = new JButton("-1");
			ResPimientoAmarillo.setBounds(730, 250, 55, 23);
			contentPane.add(ResPimientoAmarillo);
			
			JButton SumPimientoRojo = new JButton("+1");
			SumPimientoRojo.setBounds(825, 250, 55, 23);
			contentPane.add(SumPimientoRojo);
			
			JButton ResPimientoRojo = new JButton("-1");
			ResPimientoRojo.setBounds(890, 250, 55, 23);
			contentPane.add(ResPimientoRojo);
			
			JButton SumPimientoVerde = new JButton("+1");
			SumPimientoVerde.setBounds(985, 250, 55, 23);
			contentPane.add(SumPimientoVerde);
			
			JButton ResPimientoVerde = new JButton("-1");
			ResPimientoVerde.setBounds(1050, 250, 55, 23);
			contentPane.add(ResPimientoVerde);
			
			JButton SumPipasCalabaza = new JButton("+1");
			SumPipasCalabaza.setBounds(1145, 250, 55, 23);
			contentPane.add(SumPipasCalabaza);
			
			JButton ResPipasCalabaza = new JButton("-1");
			ResPipasCalabaza.setBounds(1210, 250, 55, 23);
			contentPane.add(ResPipasCalabaza);
			
			JButton SumPipasGirasol = new JButton("+1");
			SumPipasGirasol.setBounds(1305, 250, 55, 23);
			contentPane.add(SumPipasGirasol);
			
			JButton ResPipasGirasol = new JButton("-1");
			ResPipasGirasol.setBounds(1370, 250, 55, 23);
			contentPane.add(ResPipasGirasol);
			
			JButton SumPistachos = new JButton("+1");
			SumPistachos.setBounds(1465, 250, 55, 23);
			contentPane.add(SumPistachos);
			
			JButton ResPistachos = new JButton("-1");
			ResPistachos.setBounds(1530, 250, 55, 23);
			contentPane.add(ResPistachos);
			
			JButton SumPlatanos = new JButton("+1");
			SumPlatanos.setBounds(1625, 250, 55, 23);
			contentPane.add(SumPlatanos);
			
			JButton ResPlatanos = new JButton("-1");
			ResPlatanos.setBounds(1690, 250, 55, 23);
			contentPane.add(ResPlatanos);
			
			JButton SumPuerroCorto = new JButton("+1");
			SumPuerroCorto.setBounds(1785, 250, 55, 23);
			contentPane.add(SumPuerroCorto);
			
			JButton ResPuerroCorto = new JButton("-1");
			ResPuerroCorto.setBounds(1850, 250, 55, 23);
			contentPane.add(ResPuerroCorto);
			
			/*Botones añadir productos a la cesta segunda fila*/
			JButton SumPuerroLargo = new JButton("+1");
			SumPuerroLargo.setBounds(25, 430, 55, 23);
			contentPane.add(SumPuerroLargo);
			
			JButton ResPuerroLargo = new JButton("-1");
			ResPuerroLargo.setBounds(90, 430, 55, 23);
			contentPane.add(ResPuerroLargo);
			
			JButton SumPulpoEntero = new JButton("+1");
			SumPulpoEntero.setBounds(185, 430, 55, 23);
			contentPane.add(SumPulpoEntero);
			
			JButton ResPulpoEntero = new JButton("-1");
			ResPulpoEntero.setBounds(250, 430, 55, 23);
			contentPane.add(ResPulpoEntero);
			
			JButton SumPulpoTroceado = new JButton("+1");
			SumPulpoTroceado.setBounds(345, 430, 55, 23);
			contentPane.add(SumPulpoTroceado);
			
			JButton ResPulpoTroceado = new JButton("-1");
			ResPulpoTroceado.setBounds(410, 430, 55, 23);
			contentPane.add(ResPulpoTroceado);
			
			JButton SumQuesoCabra = new JButton("+1");
			SumQuesoCabra.setBounds(505, 430, 55, 23);
			contentPane.add(SumQuesoCabra);
			
			JButton ResQuesoCabra = new JButton("-1");
			ResQuesoCabra.setBounds(570, 430, 55, 23);
			contentPane.add(ResQuesoCabra);
			
			JButton SumQuesoCurado = new JButton("+1");
			SumQuesoCurado.setBounds(665, 430, 55, 23);
			contentPane.add(SumQuesoCurado);
			
			JButton ResQuesoCurado = new JButton("-1");
			ResQuesoCurado.setBounds(730, 430, 55, 23);
			contentPane.add(ResQuesoCurado);
			
			JButton SumQuesoFresco = new JButton("+1");
			SumQuesoFresco.setBounds(825, 430, 55, 23);
			contentPane.add(SumQuesoFresco);
			
			JButton ResQuesoFresco = new JButton("-1");
			ResQuesoFresco.setBounds(890, 430, 55, 23);
			contentPane.add(ResQuesoFresco);
			
			JButton SumQuesoOveja = new JButton("+1");
			SumQuesoOveja.setBounds(985, 430, 55, 23);
			contentPane.add(SumQuesoOveja);
			
			JButton ResQuesoOveja = new JButton("-1");
			ResQuesoOveja.setBounds(1050, 430, 55, 23);
			contentPane.add(ResQuesoOveja);
			
			JButton SumQuesoViejo = new JButton("+1");
			SumQuesoViejo.setBounds(1145, 430, 55, 23);
			contentPane.add(SumQuesoViejo);
			
			JButton ResQuesoViejo = new JButton("-1");
			ResQuesoViejo.setBounds(1210, 430, 55, 23);
			contentPane.add(ResQuesoViejo);
			
			JButton SumRaizJengibre = new JButton("+1");
			SumRaizJengibre.setBounds(1305, 430, 55, 23);
			contentPane.add(SumRaizJengibre);
			
			JButton ResRaizJengibre = new JButton("-1");
			ResRaizJengibre.setBounds(1370, 430, 55, 23);
			contentPane.add(ResRaizJengibre);
			
			JButton SumRape = new JButton("+1");
			SumRape.setBounds(1465, 430, 55, 23);
			contentPane.add(SumRape);
			
			JButton ResRape = new JButton("-1");
			ResRape.setBounds(1530, 430, 55, 23);
			contentPane.add(ResRape);
			
			JButton SumSandia = new JButton("+1");
			SumSandia.setBounds(1625, 430, 55, 23);
			contentPane.add(SumSandia);
			
			JButton ResSandia = new JButton("-1");
			ResSandia.setBounds(1690, 430, 55, 23);
			contentPane.add(ResSandia);
			
			JButton SumSalFina = new JButton("+1");
			SumSalFina.setBounds(1785, 430, 55, 23);
			contentPane.add(SumSalFina);
			
			JButton ResSalFina = new JButton("-1");
			ResSalFina.setBounds(1850, 430, 55, 23);
			contentPane.add(ResSalFina);
			
			/*Botones añadir productos a la cesta tercera fila*/
			JButton SumSalGruesa = new JButton("+1");
			SumSalGruesa.setBounds(25, 613, 55, 23);
			contentPane.add(SumSalGruesa);
			
			JButton ResSalGruesa = new JButton("-1");
			ResSalGruesa.setBounds(90, 613, 55, 23);
			contentPane.add(ResSalGruesa);
			
			JButton SumSalchichasCerdo = new JButton("+1");
			SumSalchichasCerdo.setBounds(185, 613, 55, 23);
			contentPane.add(SumSalchichasCerdo);
			
			JButton ResSalchichasCerdo = new JButton("-1");
			ResSalchichasCerdo.setBounds(250, 613, 55, 23);
			contentPane.add(ResSalchichasCerdo);
			
			JButton SumSalchichasPavo = new JButton("+1");
			SumSalchichasPavo.setBounds(345, 613, 55, 23);
			contentPane.add(SumSalchichasPavo);
			
			JButton ResSalchichasPavo = new JButton("-1");
			ResSalchichasPavo.setBounds(410, 613, 55, 23);
			contentPane.add(ResSalchichasPavo);
			
			JButton SumSalchichasPollo = new JButton("+1");
			SumSalchichasPollo.setBounds(505, 613, 55, 23);
			contentPane.add(SumSalchichasPollo);
			
			JButton ResSalchichasPollo = new JButton("-1");
			ResSalchichasPollo.setBounds(570, 613, 55, 23);
			contentPane.add(ResSalchichasPollo);
			
			JButton SumSalchichon = new JButton("+1");
			SumSalchichon.setBounds(665, 613, 55, 23);
			contentPane.add(SumSalchichon);
			
			JButton ResSalchichon = new JButton("-1");
			ResSalchichon.setBounds(730, 613, 55, 23);
			contentPane.add(ResSalchichon);
			
			JButton SumSalmonTroceado = new JButton("+1");
			SumSalmonTroceado.setBounds(825, 613, 55, 23);
			contentPane.add(SumSalmonTroceado);
			
			JButton ResSalmonTroceado = new JButton("-1");
			ResSalmonTroceado.setBounds(890, 613, 55, 23);
			contentPane.add(ResSalmonTroceado);
			
			JButton SumSardinas = new JButton("+1");
			SumSardinas.setBounds(985, 613, 55, 23);
			contentPane.add(SumSardinas);
			
			JButton ResSardinas = new JButton("-1");
			ResSardinas.setBounds(1050, 613, 55, 23);
			contentPane.add(ResSardinas);
			
			JButton SumSepiaEntera = new JButton("+1");
			SumSepiaEntera.setBounds(1145, 613, 55, 23);
			contentPane.add(SumSepiaEntera);
			
			JButton ResSepiaEntera = new JButton("-1");
			ResSepiaEntera.setBounds(1210, 613, 55, 23);
			contentPane.add(ResSepiaEntera);
			
			JButton SumSepiaTroceada = new JButton("+1");
			SumSepiaTroceada.setBounds(1305, 613, 55, 23);
			contentPane.add(SumSepiaTroceada);
			
			JButton ResSepiaTroceada = new JButton("-1");
			ResSepiaTroceada.setBounds(1370, 613, 55, 23);
			contentPane.add(ResSepiaTroceada);
			
			JButton SumSolomilloTernera = new JButton("+1");
			SumSolomilloTernera.setBounds(1465, 613, 55, 23);
			contentPane.add(SumSolomilloTernera);
			
			JButton ResSolomilloTernera = new JButton("-1");
			ResSolomilloTernera.setBounds(1530, 613, 55, 23);
			contentPane.add(ResSolomilloTernera);
			
			JButton SumUvasMoradas = new JButton("+1");
			SumUvasMoradas.setBounds(1625, 613, 55, 23);
			contentPane.add(SumUvasMoradas);
			
			JButton ResUvasMoradas = new JButton("-1");
			ResUvasMoradas.setBounds(1690, 613, 55, 23);
			contentPane.add(ResUvasMoradas);
			
			JButton SumUvasVerdes = new JButton("+1");
			SumUvasVerdes.setBounds(1785, 613, 55, 23);
			contentPane.add(SumUvasVerdes);
			
			JButton ResUvasVerdes = new JButton("-1");
			ResUvasVerdes.setBounds(1850, 613, 55, 23);
			contentPane.add(ResUvasVerdes);
			
			/*Botones añadir productos a la cesta cuarta fila*/
			JButton SumVinagreBlanco = new JButton("+1");
			SumVinagreBlanco.setBounds(25, 790, 55, 23);
			contentPane.add(SumVinagreBlanco);
			
			JButton ResVinagreBlanco = new JButton("-1");
			ResVinagreBlanco.setBounds(90, 790, 55, 23);
			contentPane.add(ResVinagreBlanco);
			
			JButton SumVinagreSidra = new JButton("+1");
			SumVinagreSidra.setBounds(185, 790, 55, 23);
			contentPane.add(SumVinagreSidra);
			
			JButton ResVinagreSidra = new JButton("-1");
			ResVinagreSidra.setBounds(250, 790, 55, 23);
			contentPane.add(ResVinagreSidra);
			
			JButton SumVinagreVino = new JButton("+1");
			SumVinagreVino.setBounds(345, 790, 55, 23);
			contentPane.add(SumVinagreVino);
			
			JButton ResVinagreVino = new JButton("-1");
			ResVinagreVino.setBounds(410, 790, 55, 23);
			contentPane.add(ResVinagreVino);
			
			JButton SumZanahorias = new JButton("+1");
			SumZanahorias.setBounds(505, 790, 55, 23);
			contentPane.add(SumZanahorias);
			
			JButton ResZanahorias = new JButton("-1");
			ResZanahorias.setBounds(570, 790, 55, 23);
			contentPane.add(ResZanahorias);
			
			
			JLabel Cestas = new JLabel("");
			Cestas.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					JFrame Cesta = new JFrame();
					Cesta.setVisible(true);
					Cesta.setTitle("Cesta");
					Cesta.setBounds(1450, 100, 450, 300);
					 JPanel contentPane1 = new JPanel();
					contentPane1 = new JPanel();
					contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
					
					Cesta.setContentPane(contentPane1);
					
					JLabel NumManzana = new JLabel("");
					contentPane1.add(NumManzana);
					JButton btnNewButton = new JButton("Cestus");
					contentPane1.add(btnNewButton);
					
					NumManzana.setText(String.valueOf(contador));
				}
			});
			Cestas.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/MegaMarket.png")));
			Cestas.setHorizontalAlignment(SwingConstants.CENTER);
			Cestas.setBounds(86, -15, 147, 133);
			
			contentPane.add(Cestas);
						
			JLabel pagina1 = new JLabel("1");
			pagina1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Pagina1 frame = new Pagina1();
					frame.setVisible(true);
				}
			});
			pagina1.setBounds(800, 66, 35, 14);
			contentPane.add(pagina1);
			
			JLabel pagina2 = new JLabel("2");
			pagina2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Pagina2 frame = new Pagina2();
					frame.setVisible(true);
				}
			});
			pagina2.setBounds(845, 66, 35, 14);
			contentPane.add(pagina2);
			
			JLabel pagina3 = new JLabel("3");
			pagina3.setForeground(new Color(128, 0, 255));
			pagina3.setBounds(890, 66, 35, 14);
			contentPane.add(pagina3);
					
			
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
			Procesados.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					CtgProcesados frame = new CtgProcesados();
					frame.setVisible(true);
				}
			});
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
				
				/*Tercera Página*/
				
				/*Productos primera fila*/
				JLabel LabelPimienton_Ahumado = new JLabel("Pimentón Ahumado");
				LabelPimienton_Ahumado.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPimienton_Ahumado.setBounds(40, 126, 104, 14);
				contentPane.add(LabelPimienton_Ahumado);
				
				JLabel ImagenPimienton_Ahumado = new JLabel(" ");
				ImagenPimienton_Ahumado.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/pimenton ahumado.png")));
				ImagenPimienton_Ahumado.setBounds(40, 126, 91, 111);
				contentPane.add(ImagenPimienton_Ahumado);
				
				JLabel LabelPimienton_Dulce = new JLabel("Pimentón Dulce");
				LabelPimienton_Dulce.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPimienton_Dulce.setBounds(200, 126, 104, 14);
				contentPane.add(LabelPimienton_Dulce);
				
				JLabel ImagenPimienton_Dulce = new JLabel(" ");
				ImagenPimienton_Dulce.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/pimenton dulce.png")));
				ImagenPimienton_Dulce.setBounds(200, 126, 91, 111);
				contentPane.add(ImagenPimienton_Dulce);
				
				JLabel LabelPimienta_Negra = new JLabel("Pimienta Negra");
				LabelPimienta_Negra.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPimienta_Negra.setBounds(360, 126, 104, 14);
				contentPane.add(LabelPimienta_Negra);
				
				JLabel ImagenPimienta_Negra = new JLabel(" ");
				ImagenPimienta_Negra.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/pimienta negra.png")));
				ImagenPimienta_Negra.setBounds(360, 126, 91, 111);
				contentPane.add(ImagenPimienta_Negra);
				
				JLabel LabelPimienta_Roja = new JLabel("Pimienta Roja");
				LabelPimienta_Roja.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPimienta_Roja.setBounds(520, 126, 104, 14);
				contentPane.add(LabelPimienta_Roja);
				
				JLabel ImagenPimienta_Roja = new JLabel(" ");
				ImagenPimienta_Roja.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/pimienta roja.png")));
				ImagenPimienta_Roja.setBounds(520, 126, 91, 111);
				contentPane.add(ImagenPimienta_Roja);
				
				JLabel LabelPimiento_Amarillo = new JLabel("Pimiento Amarillo");
				LabelPimiento_Amarillo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPimiento_Amarillo.setBounds(680, 126, 104, 14);
				contentPane.add(LabelPimiento_Amarillo);
				
				JLabel ImagenPimiento_Amarillo = new JLabel(" ");
				ImagenPimiento_Amarillo.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/pimiento amarillo.png")));
				ImagenPimiento_Amarillo.setBounds(680, 126, 91, 111);
				contentPane.add(ImagenPimiento_Amarillo);
					
				JLabel LabelPimiento_Rojo = new JLabel("Pimiento Rojo");
				LabelPimiento_Rojo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPimiento_Rojo.setBounds(840, 126, 104, 14);
				contentPane.add(LabelPimiento_Rojo);
				
				JLabel ImagenPimiento_Rojo = new JLabel(" ");
				ImagenPimiento_Rojo.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/pimiento rojo.png")));
				ImagenPimiento_Rojo.setBounds(840, 126, 91, 111);
				contentPane.add(ImagenPimiento_Rojo);
				
				JLabel LabelPimiento_Verde = new JLabel("Pimiento Verde");
				LabelPimiento_Verde.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPimiento_Verde.setBounds(1000, 126, 104, 14);
				contentPane.add(LabelPimiento_Verde);
				
				JLabel ImagenPimiento_Verde = new JLabel(" ");
				ImagenPimiento_Verde.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/pimiento verde.png")));
				ImagenPimiento_Verde.setBounds(1000, 126, 91, 111);
				contentPane.add(ImagenPimiento_Verde);
				
				JLabel LabelPipas_Calabaza = new JLabel("Pipas Calabaza");
				LabelPipas_Calabaza.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPipas_Calabaza.setBounds(1160, 126, 104, 14);
				contentPane.add(LabelPipas_Calabaza);
				
				JLabel ImagenPipas_Calabaza = new JLabel(" ");
				ImagenPipas_Calabaza.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/pipas calabaza.png")));
				ImagenPipas_Calabaza.setBounds(1160, 126, 91, 111);
				contentPane.add(ImagenPipas_Calabaza);
				
				JLabel LabelPipas_Girasol = new JLabel("Pipas Girasol");
				LabelPipas_Girasol.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPipas_Girasol.setBounds(1320, 126, 104, 14);
				contentPane.add(LabelPipas_Girasol);
				
				JLabel ImagenPipas_Girasol = new JLabel(" ");
				ImagenPipas_Girasol.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/pipas.png")));
				ImagenPipas_Girasol.setBounds(1320, 126, 91, 111);
				contentPane.add(ImagenPipas_Girasol);
							
				JLabel LabelPistachos = new JLabel("Pistachos");
				LabelPistachos.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPistachos.setBounds(1480, 126, 104, 14);
				contentPane.add(LabelPistachos);
				
				JLabel ImagenPistachos = new JLabel(" ");
				ImagenPistachos.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/pistachos.png")));
				ImagenPistachos.setBounds(1480, 126, 91, 111);
				contentPane.add(ImagenPistachos);
				
				JLabel LabelPlatanos = new JLabel("Plátanos");
				LabelPlatanos.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPlatanos.setBounds(1640, 126, 104, 14);
				contentPane.add(LabelPlatanos);
				
				JLabel ImagenPlatanos = new JLabel(" ");
				ImagenPlatanos.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/platano.png")));
				ImagenPlatanos.setBounds(1640, 126, 91, 111);
				contentPane.add(ImagenPlatanos);
				
				JLabel LabelPuerro_Corto = new JLabel("Puerro Corto");
				LabelPuerro_Corto.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPuerro_Corto.setBounds(1800, 126, 104, 14);
				contentPane.add(LabelPuerro_Corto);
				
				JLabel ImagenPuerro_Corto = new JLabel(" ");
				ImagenPuerro_Corto.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/puerro corto.png")));
				ImagenPuerro_Corto.setBounds(1800, 126, 91, 111);
				contentPane.add(ImagenPuerro_Corto);
				
				/*Productos segunda fila*/
				JLabel LabelPuerro_Largo = new JLabel("Puerro Largo");
				LabelPuerro_Largo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPuerro_Largo.setBounds(40, 306, 104, 14);
				contentPane.add(LabelPuerro_Largo);
				
				JLabel ImagenPuerro_Largo = new JLabel(" ");
				ImagenPuerro_Largo.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/puerro largo.png")));
				ImagenPuerro_Largo.setBounds(40, 306, 91, 111);
				contentPane.add(ImagenPuerro_Largo);
							
				JLabel LabelPulpo_Entero = new JLabel("Pulpo Entero");
				LabelPulpo_Entero.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPulpo_Entero.setBounds(200, 306, 104, 14);
				contentPane.add(LabelPulpo_Entero);
				
				JLabel ImagenPulpo_Entero = new JLabel(" ");
				ImagenPulpo_Entero.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/pulpo entero.png")));
				ImagenPulpo_Entero.setBounds(200, 306, 91, 111);
				contentPane.add(ImagenPulpo_Entero);
										
				JLabel LabelPulpo_Troceado = new JLabel("Pulpo Troceado");
				LabelPulpo_Troceado.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelPulpo_Troceado.setBounds(360, 306, 104, 14);
				contentPane.add(LabelPulpo_Troceado);
				
				JLabel ImagenPulpo_Troceado = new JLabel(" ");
				ImagenPulpo_Troceado.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/pulpo troceado.png")));
				ImagenPulpo_Troceado.setBounds(360, 306, 91, 111);
				contentPane.add(ImagenPulpo_Troceado);
				
				JLabel LabelQueso_Cabra = new JLabel("Queso Cabra");
				LabelQueso_Cabra.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelQueso_Cabra.setBounds(520, 306, 104, 14);
				contentPane.add(LabelQueso_Cabra);
				
				JLabel ImagenQueso_Cabra = new JLabel(" ");
				ImagenQueso_Cabra.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/queso de cabra.png")));
				ImagenQueso_Cabra.setBounds(520, 306, 91, 111);
				contentPane.add(ImagenQueso_Cabra);
										
				JLabel LabelQueso_Curado = new JLabel("Queso Curado");
				LabelQueso_Curado.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelQueso_Curado.setBounds(680, 306, 104, 14);
				contentPane.add(LabelQueso_Curado);
				
				JLabel ImagenQueso_Curado = new JLabel(" ");
				ImagenQueso_Curado.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/queso curado.png")));
				ImagenQueso_Curado.setBounds(680, 306, 91, 111);
				contentPane.add(ImagenQueso_Curado);
										
				JLabel LabelQueso_Fresca = new JLabel("Queso Fresco");
				LabelQueso_Fresca.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelQueso_Fresca.setBounds(840, 306, 104, 14);
				contentPane.add(LabelQueso_Fresca);
				
				JLabel ImagenQueso_Fresca = new JLabel(" ");
				ImagenQueso_Fresca.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/queso fresco.png")));
				ImagenQueso_Fresca.setBounds(840, 306, 91, 111);
				contentPane.add(ImagenQueso_Fresca);
				
				JLabel LabelQueso_Oveja = new JLabel("Queso Oveja");
				LabelQueso_Oveja.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelQueso_Oveja.setBounds(1000, 306, 104, 14);
				contentPane.add(LabelQueso_Oveja);
				
				JLabel ImagenQueso_Oveja = new JLabel(" ");
				ImagenQueso_Oveja.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/queso de oveja.png")));
				ImagenQueso_Oveja.setBounds(1000, 306, 91, 111);
				contentPane.add(ImagenQueso_Oveja);
				
				JLabel LabelQueso_Viejo = new JLabel("Queso Viejo");
				LabelQueso_Viejo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelQueso_Viejo.setBounds(1160, 306, 104, 14);
				contentPane.add(LabelQueso_Viejo);
				
				JLabel ImagenQueso_Viejo = new JLabel(" ");
				ImagenQueso_Viejo.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/queso viejo.png")));
				ImagenQueso_Viejo.setBounds(1160, 306, 91, 111);
				contentPane.add(ImagenQueso_Viejo);
				
				JLabel LabelRaiz_Jengibre = new JLabel("Raíz De Jengibre");
				LabelRaiz_Jengibre.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelRaiz_Jengibre.setBounds(1320, 306, 104, 14);
				contentPane.add(LabelRaiz_Jengibre);
				
				JLabel ImagenRaiz_Jengibre = new JLabel(" ");
				ImagenRaiz_Jengibre.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/raiz de jengibre.png")));
				ImagenRaiz_Jengibre.setBounds(1320, 306, 91, 111);
				contentPane.add(ImagenRaiz_Jengibre);
				
				JLabel LabelRape = new JLabel("Rape");
				LabelRape.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelRape.setBounds(1480, 306, 104, 14);
				contentPane.add(LabelRape);
				
				JLabel ImagenRape = new JLabel(" ");
				ImagenRape.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/rape.png")));
				ImagenRape.setBounds(1480, 306, 91, 111);
				contentPane.add(ImagenRape);
				
				JLabel LabelSal_Fina = new JLabel("Sal Fina");
				LabelSal_Fina.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelSal_Fina.setBounds(1640, 306, 104, 14);
				contentPane.add(LabelSal_Fina);
				
				JLabel ImagenSal_Fina = new JLabel(" ");
				ImagenSal_Fina.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/sal fina.png")));
				ImagenSal_Fina.setBounds(1640, 306, 91, 111);
				contentPane.add(ImagenSal_Fina);
				
				JLabel LabelSal_Gruesa = new JLabel("Sal Gruesa");
				LabelSal_Gruesa.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelSal_Gruesa.setBounds(1800, 306, 104, 14);
				contentPane.add(LabelSal_Gruesa);
				
				JLabel ImagenSal_Gruesa = new JLabel(" ");
				ImagenSal_Gruesa.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/sal gruesa.png")));
				ImagenSal_Gruesa.setBounds(1800, 306, 91, 111);
				contentPane.add(ImagenSal_Gruesa);
				
				/*Productos tercera fila*/
				JLabel LabelSalchichas_Cerdo = new JLabel("Salchichas Cerdo");
				LabelSalchichas_Cerdo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelSalchichas_Cerdo.setBounds(40, 486, 104, 14);
				contentPane.add(LabelSalchichas_Cerdo);
				
				JLabel ImagenSalchichas_Cerdo = new JLabel(" ");
				ImagenSalchichas_Cerdo.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/salchicha de cerdo.png")));
				ImagenSalchichas_Cerdo.setBounds(40, 486, 91, 111);
				contentPane.add(ImagenSalchichas_Cerdo);
				
				JLabel LabelSalchichas_Pavo = new JLabel("Salchichas Pavo");
				LabelSalchichas_Pavo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelSalchichas_Pavo.setBounds(200, 486, 104, 14);
				contentPane.add(LabelSalchichas_Pavo);
				
				JLabel ImagenSalchichas_Pavo = new JLabel(" ");
				ImagenSalchichas_Pavo.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/salchicha de pavo.png")));
				ImagenSalchichas_Pavo.setBounds(200, 486, 91, 111);
				contentPane.add(ImagenSalchichas_Pavo);
				
				JLabel LabelSalchichas_Pollo = new JLabel("Salchichas Pollo");
				LabelSalchichas_Pollo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelSalchichas_Pollo.setBounds(360, 486, 104, 14);
				contentPane.add(LabelSalchichas_Pollo);
				
				JLabel ImagenSalchichas_Pollo = new JLabel(" ");
				ImagenSalchichas_Pollo.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/salchicha de pollo.png")));
				ImagenSalchichas_Pollo.setBounds(360, 486, 91, 111);
				contentPane.add(ImagenSalchichas_Pollo);
				
				JLabel LabelSalchichon = new JLabel("Salchichón");
				LabelSalchichon.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelSalchichon.setBounds(520, 486, 104, 14);
				contentPane.add(LabelSalchichon);
				
				JLabel ImagenSalchichon = new JLabel(" ");
				ImagenSalchichon.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/salchichon.png")));
				ImagenSalchichon.setBounds(520, 486, 91, 111);
				contentPane.add(ImagenSalchichon);
				
				JLabel LabelSalmon_Troceado = new JLabel("Salmon Troceado");
				LabelSalmon_Troceado.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelSalmon_Troceado.setBounds(680, 486, 104, 14);
				contentPane.add(LabelSalmon_Troceado);
				
				JLabel ImagenSalmon_Troceado = new JLabel(" ");
				ImagenSalmon_Troceado.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/salmon troceado.png")));
				ImagenSalmon_Troceado.setBounds(680, 486, 91, 111);
				contentPane.add(ImagenSalmon_Troceado);
				
				JLabel LabelSandia = new JLabel("Sandía");
				LabelSandia.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelSandia.setBounds(840, 486, 104, 14);
				contentPane.add(LabelSandia);
				
				JLabel ImagenSandia = new JLabel(" ");
				ImagenSandia.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/sandia.png")));
				ImagenSandia.setBounds(840, 486, 91, 111);
				contentPane.add(ImagenSandia);
				
				JLabel LabelSardinas = new JLabel("Sardinas");
				LabelSardinas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelSardinas.setBounds(1000, 486, 104, 14);
				contentPane.add(LabelSardinas);
				
				JLabel ImagenSardinas = new JLabel(" ");
				ImagenSardinas.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/sardinas.png")));
				ImagenSardinas.setBounds(1000, 486, 91, 111);
				contentPane.add(ImagenSardinas);
				
				JLabel LabelSepia_Entera = new JLabel("Sepia Entera");
				LabelSepia_Entera.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelSepia_Entera.setBounds(1160, 486, 104, 14);
				contentPane.add(LabelSepia_Entera);
				
				JLabel ImagenSepia_Entera = new JLabel(" ");
				ImagenSepia_Entera.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/sepia entera.png")));
				ImagenSepia_Entera.setBounds(1160, 486, 91, 111);
				contentPane.add(ImagenSepia_Entera);
				
				JLabel LabelSepia_Troceada = new JLabel("Sepia Troceada");
				LabelSepia_Troceada.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelSepia_Troceada.setBounds(1320, 486, 110, 14);
				contentPane.add(LabelSepia_Troceada);
				
				JLabel ImagenSepia_Troceada = new JLabel(" ");
				ImagenSepia_Troceada.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/sepia troceada.png")));
				ImagenSepia_Troceada.setBounds(1320, 486, 91, 111);
				contentPane.add(ImagenSepia_Troceada);
				
				JLabel LabelSolomillo_Ternera = new JLabel("Solomillo Ternera");
				LabelSolomillo_Ternera.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelSolomillo_Ternera.setBounds(1480, 486, 104, 14);
				contentPane.add(LabelSolomillo_Ternera);
				
				JLabel ImagenSolomillo_Ternera = new JLabel(" ");
				ImagenSolomillo_Ternera.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/solomillo ternera.png")));
				ImagenSolomillo_Ternera.setBounds(1480, 486, 91, 111);
				contentPane.add(ImagenSolomillo_Ternera);
				
				JLabel LabelUvas_Moradas = new JLabel("Uvas Moradas");
				LabelUvas_Moradas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelUvas_Moradas.setBounds(1640, 486, 104, 14);
				contentPane.add(LabelUvas_Moradas);
				
				JLabel ImagenUvas_Moradas = new JLabel(" ");
				ImagenUvas_Moradas.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/uvas moradas.png")));
				ImagenUvas_Moradas.setBounds(1640, 486, 91, 111);
				contentPane.add(ImagenUvas_Moradas);
				
				JLabel LabelUvas_Verdes = new JLabel("Uvas Verdes");
				LabelUvas_Verdes.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelUvas_Verdes.setBounds(1800, 486, 120, 14);
				contentPane.add(LabelUvas_Verdes);
				
				JLabel ImagenUvas_Verdes = new JLabel(" ");
				ImagenUvas_Verdes.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/uvas verdes.png")));
				ImagenUvas_Verdes.setBounds(1800, 486, 91, 111);
				contentPane.add(ImagenUvas_Verdes);
				
				/*Productos cuarta fila*/
				JLabel LabelVinagre_Blanco = new JLabel("Vinagre Blanco");
				LabelVinagre_Blanco.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelVinagre_Blanco.setBounds(40, 666, 104, 14);
				contentPane.add(LabelVinagre_Blanco);
				
				JLabel ImagenVinagre_Blanco = new JLabel(" ");
				ImagenVinagre_Blanco.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/vinagre blanco.png")));
				ImagenVinagre_Blanco.setBounds(40, 666, 91, 111);
				contentPane.add(ImagenVinagre_Blanco);
				
				JLabel LabelVinagre_Sidra = new JLabel("Vinagre Sidra");
				LabelVinagre_Sidra.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelVinagre_Sidra.setBounds(200, 666, 104, 14);
				contentPane.add(LabelVinagre_Sidra);
				
				JLabel ImagenVinagre_Sidra = new JLabel(" ");
				ImagenVinagre_Sidra.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/vinagre de sidra.png")));
				ImagenVinagre_Sidra.setBounds(200, 666, 91, 111);
				contentPane.add(ImagenVinagre_Sidra);
				
				JLabel LabelVinagre_Vino = new JLabel("Vinagre Vino");
				LabelVinagre_Vino.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelVinagre_Vino.setBounds(360, 666, 104, 14);
				contentPane.add(LabelVinagre_Vino);
				
				JLabel ImagenVinagre_Vino = new JLabel(" ");
				ImagenVinagre_Vino.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/vinagre de vino.png")));
				ImagenVinagre_Vino.setBounds(360, 666, 91, 111);
				contentPane.add(ImagenVinagre_Vino);
				
				JLabel LabelZanahorias = new JLabel("Zanahorias");
				LabelZanahorias.setFont(new Font("Yu Gothic", Font.BOLD, 11));
				LabelZanahorias.setBounds(520, 666, 104, 14);
				contentPane.add(LabelZanahorias);
				
				JLabel ImagenZanahorias = new JLabel(" ");
				ImagenZanahorias.setIcon(new ImageIcon(Pagina3.class.getResource("/Imagenes/zanahorias.png")));
				ImagenZanahorias.setBounds(520, 666, 91, 111);
				contentPane.add(ImagenZanahorias);
				
				
				//Etiquetas precio productos
				JLabel lblNewLabel = new JLabel("precio");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(40, 235, 46, 14);
				contentPane.add(lblNewLabel);
				
				JLabel lblNewLabel_1_3 = new JLabel("precio");
				lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_3.setBounds(40, 415, 46, 14);
				contentPane.add(lblNewLabel_1_3);
				
				JLabel lblNewLabel_1_4 = new JLabel("precio");
				lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_4.setBounds(40, 595, 46, 14);
				contentPane.add(lblNewLabel_1_4);
				
				JLabel lblNewLabel_1_5 = new JLabel("precio");
				lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_5.setBounds(40, 775, 46, 14);
				contentPane.add(lblNewLabel_1_5);
				
				JLabel lblNewLabel_1 = new JLabel("precio");
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1.setBounds(200, 235, 46, 14);
				contentPane.add(lblNewLabel_1);
				
				JLabel lblNewLabel_21 = new JLabel("precio");
				lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_21.setBounds(200, 415, 46, 14);
				contentPane.add(lblNewLabel_21);
				
				JLabel lblNewLabel_3 = new JLabel("precio");
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setBounds(200, 595, 46, 14);
				contentPane.add(lblNewLabel_3);
				
				JLabel lblNewLabel_11 = new JLabel("precio");
				lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_11.setBounds(200, 775, 46, 14);
				contentPane.add(lblNewLabel_11);
				
				JLabel lblNewLabel_1_1 = new JLabel("precio");
				lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_1.setBounds(360, 235, 46, 14);
				contentPane.add(lblNewLabel_1_1);
				
				JLabel lblNewLabel_1_2 = new JLabel("precio");
				lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_2.setBounds(360, 415, 46, 14);
				contentPane.add(lblNewLabel_1_2);
				
				JLabel lblNewLabel_1_31 = new JLabel("precio");
				lblNewLabel_1_31.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_31.setBounds(360, 595, 46, 14);
				contentPane.add(lblNewLabel_1_31);
				
				JLabel lblNewLabel_1_56 = new JLabel("precio");
				lblNewLabel_1_56.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_56.setBounds(360, 775, 46, 14);
				contentPane.add(lblNewLabel_1_56);
				
				JLabel lblNewLabel_1_0 = new JLabel("precio");
				lblNewLabel_1_0.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_0.setBounds(520, 235, 46, 14);
				contentPane.add(lblNewLabel_1_0);
				
				JLabel lblNewLabel_1_01 = new JLabel("precio");
				lblNewLabel_1_01.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_01.setBounds(520, 415, 46, 14);
				contentPane.add(lblNewLabel_1_01);
				
				JLabel lblNewLabel_1_02 = new JLabel("precio");
				lblNewLabel_1_02.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_02.setBounds(520, 595, 46, 14);
				contentPane.add(lblNewLabel_1_02);
				
				JLabel lblNewLabel_1_03 = new JLabel("precio");
				lblNewLabel_1_03.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_03.setBounds(520, 775, 46, 14);
				contentPane.add(lblNewLabel_1_03);
				
				JLabel lblNewLabel_1_05 = new JLabel("precio");
				lblNewLabel_1_05.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_05.setBounds(680, 235, 46, 14);
				contentPane.add(lblNewLabel_1_05);
				
				JLabel lblNewLabel_1_06 = new JLabel("precio");
				lblNewLabel_1_06.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_06.setBounds(680, 415, 46, 14);
				contentPane.add(lblNewLabel_1_06);
				
				JLabel lblNewLabel_1_07 = new JLabel("precio");
				lblNewLabel_1_07.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_07.setBounds(680, 595, 46, 14);
				contentPane.add(lblNewLabel_1_07);
				
				JLabel lblNewLabel_1_100 = new JLabel("precio");
				lblNewLabel_1_100.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_100.setBounds(840, 235, 46, 14);
				contentPane.add(lblNewLabel_1_100);
				
				JLabel lblNewLabel_1_101 = new JLabel("precio");
				lblNewLabel_1_101.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_101.setBounds(840, 415, 46, 14);
				contentPane.add(lblNewLabel_1_101);
				
				JLabel lblNewLabel_1_102 = new JLabel("precio");
				lblNewLabel_1_102.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_102.setBounds(840, 595, 46, 14);
				contentPane.add(lblNewLabel_1_102);
				
				JLabel lblNewLabel_1_105 = new JLabel("precio");
				lblNewLabel_1_105.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_105.setBounds(1000, 235, 46, 14);
				contentPane.add(lblNewLabel_1_105);
				
				JLabel lblNewLabel_1_106 = new JLabel("precio");
				lblNewLabel_1_106.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_106.setBounds(1000, 415, 46, 14);
				contentPane.add(lblNewLabel_1_106);
				
				JLabel lblNewLabel_1_107 = new JLabel("precio");
				lblNewLabel_1_107.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_107.setBounds(1000, 595, 46, 14);
				contentPane.add(lblNewLabel_1_107);
				
				JLabel lblNewLabel_1_110 = new JLabel("precio");
				lblNewLabel_1_110.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_110.setBounds(1160, 235, 46, 14);
				contentPane.add(lblNewLabel_1_110);
				
				JLabel lblNewLabel_1_111 = new JLabel("precio");
				lblNewLabel_1_111.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_111.setBounds(1160, 415, 46, 14);
				contentPane.add(lblNewLabel_1_111);
				
				JLabel lblNewLabel_1_112 = new JLabel("precio");
				lblNewLabel_1_112.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_112.setBounds(1160, 595, 46, 14);
				contentPane.add(lblNewLabel_1_112);
				
				JLabel lblNewLabel_1_115 = new JLabel("precio");
				lblNewLabel_1_115.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_115.setBounds(1320, 235, 46, 14);
				contentPane.add(lblNewLabel_1_115);
				
				JLabel lblNewLabel_1_116 = new JLabel("precio");
				lblNewLabel_1_116.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_116.setBounds(1320, 415, 46, 14);
				contentPane.add(lblNewLabel_1_116);
				
				JLabel lblNewLabel_1_117 = new JLabel("precio");
				lblNewLabel_1_117.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_117.setBounds(1320, 595, 46, 14);
				contentPane.add(lblNewLabel_1_117);
				
				JLabel lblNewLabel_1_115_1 = new JLabel("precio");
				lblNewLabel_1_115_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_115_1.setBounds(1480, 235, 46, 14);
				contentPane.add(lblNewLabel_1_115_1);
				
				JLabel lblNewLabel_1_115_2 = new JLabel("precio");
				lblNewLabel_1_115_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_115_2.setBounds(1480, 415, 46, 14);
				contentPane.add(lblNewLabel_1_115_2);
				
				JLabel lblNewLabel_1_115_3 = new JLabel("precio");
				lblNewLabel_1_115_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_115_3.setBounds(1480, 595, 46, 14);
				contentPane.add(lblNewLabel_1_115_3);
				
				JLabel lblNewLabel_1_115_6 = new JLabel("precio");
				lblNewLabel_1_115_6.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_115_6.setBounds(1640, 235, 46, 14);
				contentPane.add(lblNewLabel_1_115_6);
				
				JLabel lblNewLabel_1_115_7 = new JLabel("precio");
				lblNewLabel_1_115_7.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_115_7.setBounds(1640, 415, 46, 14);
				contentPane.add(lblNewLabel_1_115_7);
				
				JLabel lblNewLabel_1_115_8 = new JLabel("precio");
				lblNewLabel_1_115_8.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_115_8.setBounds(1640, 595, 46, 14);
				contentPane.add(lblNewLabel_1_115_8);
				
				JLabel lblNewLabel_1_115_11 = new JLabel("precio");
				lblNewLabel_1_115_11.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_115_11.setBounds(1800, 235, 46, 14);
				contentPane.add(lblNewLabel_1_115_11);
				
				JLabel lblNewLabel_1_115_12 = new JLabel("precio");
				lblNewLabel_1_115_12.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_115_12.setBounds(1800, 415, 46, 14);
				contentPane.add(lblNewLabel_1_115_12);
				
				JLabel lblNewLabel_1_115_13 = new JLabel("precio");
				lblNewLabel_1_115_13.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_115_13.setBounds(1800, 595, 46, 14);
				contentPane.add(lblNewLabel_1_115_13);
				
				
				
				//Etiquetas peso productos
				JLabel lblNewLabel_2 = new JLabel("Peso kg");
				lblNewLabel_2.setBounds(90, 235, 46, 14);
				contentPane.add(lblNewLabel_2);
				
				JLabel lblNewLabel_2_1 = new JLabel("Peso kg");
				lblNewLabel_2_1.setBounds(90, 415, 46, 14);
				contentPane.add(lblNewLabel_2_1);
				
				JLabel lblNewLabel_2_2 = new JLabel("Peso kg");
				lblNewLabel_2_2.setBounds(90, 595, 46, 14);
				contentPane.add(lblNewLabel_2_2);
				
				JLabel lblNewLabel_2_3 = new JLabel("Peso kg");
				lblNewLabel_2_3.setBounds(90, 775, 46, 14);
				contentPane.add(lblNewLabel_2_3);
				
				JLabel lblNewLabel_2_5 = new JLabel("Peso kg");
				lblNewLabel_2_5.setBounds(250, 235, 46, 14);
				contentPane.add(lblNewLabel_2_5);
				
				JLabel lblNewLabel_2_6 = new JLabel("Peso kg");
				lblNewLabel_2_6.setBounds(250, 415, 46, 14);
				contentPane.add(lblNewLabel_2_6);
				
				JLabel lblNewLabel_2_7 = new JLabel("Peso kg");
				lblNewLabel_2_7.setBounds(250, 595, 46, 14);
				contentPane.add(lblNewLabel_2_7);
				
				JLabel lblNewLabel_2_8 = new JLabel("Peso kg");
				lblNewLabel_2_8.setBounds(250, 775, 46, 14);
				contentPane.add(lblNewLabel_2_8);
				
				JLabel lblNewLabel_2_10 = new JLabel("Peso kg");
				lblNewLabel_2_10.setBounds(410, 235, 46, 14);
				contentPane.add(lblNewLabel_2_10);
				
				JLabel lblNewLabel_2_11 = new JLabel("Peso kg");
				lblNewLabel_2_11.setBounds(410, 415, 46, 14);
				contentPane.add(lblNewLabel_2_11);
				
				JLabel lblNewLabel_2_12 = new JLabel("Peso kg");
				lblNewLabel_2_12.setBounds(410, 595, 46, 14);
				contentPane.add(lblNewLabel_2_12);
				
				JLabel lblNewLabel_2_13 = new JLabel("Peso kg");
				lblNewLabel_2_13.setBounds(410, 775, 46, 14);
				contentPane.add(lblNewLabel_2_13);
				
				JLabel lblNewLabel_2_15 = new JLabel("Peso kg");
				lblNewLabel_2_15.setBounds(570, 235, 46, 14);
				contentPane.add(lblNewLabel_2_15);
				
				JLabel lblNewLabel_2_16 = new JLabel("Peso kg");
				lblNewLabel_2_16.setBounds(570, 415, 46, 14);
				contentPane.add(lblNewLabel_2_16);
				
				JLabel lblNewLabel_2_17 = new JLabel("Peso kg");
				lblNewLabel_2_17.setBounds(570, 595, 46, 14);
				contentPane.add(lblNewLabel_2_17);
				
				JLabel lblNewLabel_2_18 = new JLabel("Peso kg");
				lblNewLabel_2_18.setBounds(570, 775, 46, 14);
				contentPane.add(lblNewLabel_2_18);
				
				JLabel lblNewLabel_2_20 = new JLabel("Peso kg");
				lblNewLabel_2_20.setBounds(730, 235, 46, 14);
				contentPane.add(lblNewLabel_2_20);
				
				JLabel lblNewLabel_2_21 = new JLabel("Peso kg");
				lblNewLabel_2_21.setBounds(730, 415, 46, 14);
				contentPane.add(lblNewLabel_2_21);
				
				JLabel lblNewLabel_2_22 = new JLabel("Peso kg");
				lblNewLabel_2_22.setBounds(730, 595, 46, 14);
				contentPane.add(lblNewLabel_2_22);
				
				JLabel lblNewLabel_2_25 = new JLabel("Peso kg");
				lblNewLabel_2_25.setBounds(890, 235, 46, 14);
				contentPane.add(lblNewLabel_2_25);
				
				JLabel lblNewLabel_2_26 = new JLabel("Peso kg");
				lblNewLabel_2_26.setBounds(890, 415, 46, 14);
				contentPane.add(lblNewLabel_2_26);
				
				JLabel lblNewLabel_2_27 = new JLabel("Peso kg");
				lblNewLabel_2_27.setBounds(890, 595, 46, 14);
				contentPane.add(lblNewLabel_2_27);
				
				JLabel lblNewLabel_2_30 = new JLabel("Peso kg");
				lblNewLabel_2_30.setBounds(1050, 235, 46, 14);
				contentPane.add(lblNewLabel_2_30);
				
				JLabel lblNewLabel_2_31 = new JLabel("Peso kg");
				lblNewLabel_2_31.setBounds(1050, 415, 46, 14);
				contentPane.add(lblNewLabel_2_31);
				
				JLabel lblNewLabel_2_32 = new JLabel("Peso kg");
				lblNewLabel_2_32.setBounds(1050, 595, 46, 14);
				contentPane.add(lblNewLabel_2_32);
				
				JLabel lblNewLabel_2_35 = new JLabel("Peso kg");
				lblNewLabel_2_35.setBounds(1210, 235, 46, 14);
				contentPane.add(lblNewLabel_2_35);
				
				JLabel lblNewLabel_2_36 = new JLabel("Peso kg");
				lblNewLabel_2_36.setBounds(1210, 415, 46, 14);
				contentPane.add(lblNewLabel_2_36);
				
				JLabel lblNewLabel_2_37 = new JLabel("Peso kg");
				lblNewLabel_2_37.setBounds(1210, 595, 46, 14);
				contentPane.add(lblNewLabel_2_37);
				
				JLabel lblNewLabel_2_40 = new JLabel("Peso kg");
				lblNewLabel_2_40.setBounds(1370, 235, 46, 14);
				contentPane.add(lblNewLabel_2_40);
				
				JLabel lblNewLabel_2_41 = new JLabel("Peso kg");
				lblNewLabel_2_41.setBounds(1370, 415, 46, 14);
				contentPane.add(lblNewLabel_2_41);
				
				JLabel lblNewLabel_2_42 = new JLabel("Peso kg");
				lblNewLabel_2_42.setBounds(1370, 595, 46, 14);
				contentPane.add(lblNewLabel_2_42);
				
				JLabel lblNewLabel_2_45 = new JLabel("Peso kg");
				lblNewLabel_2_45.setBounds(1530, 235, 46, 14);
				contentPane.add(lblNewLabel_2_45);
				
				JLabel lblNewLabel_2_46 = new JLabel("Peso kg");
				lblNewLabel_2_46.setBounds(1530, 415, 46, 14);
				contentPane.add(lblNewLabel_2_46);
				
				JLabel lblNewLabel_2_47 = new JLabel("Peso kg");
				lblNewLabel_2_47.setBounds(1530, 595, 46, 14);
				contentPane.add(lblNewLabel_2_47);
				
				JLabel lblNewLabel_2_50 = new JLabel("Peso kg");
				lblNewLabel_2_50.setBounds(1690, 235, 46, 14);
				contentPane.add(lblNewLabel_2_50);
				
				JLabel lblNewLabel_2_51 = new JLabel("Peso kg");
				lblNewLabel_2_51.setBounds(1690, 415, 46, 14);
				contentPane.add(lblNewLabel_2_51);
				
				JLabel lblNewLabel_2_52 = new JLabel("Peso kg");
				lblNewLabel_2_52.setBounds(1690, 595, 46, 14);
				contentPane.add(lblNewLabel_2_52);
				
				JLabel lblNewLabel_2_55 = new JLabel("Peso kg");
				lblNewLabel_2_55.setBounds(1850, 235, 46, 14);
				contentPane.add(lblNewLabel_2_55);
				
				JLabel lblNewLabel_2_56 = new JLabel("Peso kg");
				lblNewLabel_2_56.setBounds(1850, 415, 46, 14);
				contentPane.add(lblNewLabel_2_56);
				
				JLabel lblNewLabel_2_57 = new JLabel("Peso kg");
				lblNewLabel_2_57.setBounds(1850, 595, 46, 14);
				contentPane.add(lblNewLabel_2_57);
	}

}
