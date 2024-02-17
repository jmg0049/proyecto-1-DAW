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

public class Pagina2 extends JFrame {

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
					Pagina2 pagina2 = new Pagina2();
					pagina2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pagina2() {
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
		JButton SumFileteTernera = new JButton("+1");
		SumFileteTernera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador=contador+1;
				JLabel manzanacomprada = new JLabel("Manzana");
				manzanacomprada.setBounds(185, 200, 72, 14);
				contentPane.add(manzanacomprada);
			}
		});
		SumFileteTernera.setBounds(25, 250, 55, 23);
		contentPane.add(SumFileteTernera);
		
		JButton ResFileteTernera = new JButton("-1");
		ResFileteTernera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador=contador-1;
			}
		});
		ResFileteTernera.setBounds(90, 250, 55, 23);
		contentPane.add(ResFileteTernera);
		
		
		JButton SumFresas = new JButton("+1");
		SumFresas.setBounds(185, 250, 55, 23);
		contentPane.add(SumFresas);
		
		JButton ResFresas = new JButton("-1");
		ResFresas.setBounds(250, 250, 55, 23);
		contentPane.add(ResFresas);
		
		
		JButton SumFuet = new JButton("+1");
		SumFuet.setBounds(345, 250, 55, 23);
		contentPane.add(SumFuet);
		
		JButton ResFuet = new JButton("-1");
		ResFuet.setBounds(410, 250, 55, 23);
		contentPane.add(ResFuet);
		
		JButton SumGambas = new JButton("+1");
		SumGambas.setBounds(505, 250, 55, 23);
		contentPane.add(SumGambas);
		
		JButton ResGambas = new JButton("-1");
		ResGambas.setBounds(570, 250, 55, 23);
		contentPane.add(ResGambas);
		
		JButton SumGarbanzos = new JButton("+1");
		SumGarbanzos.setBounds(665, 250, 55, 23);
		contentPane.add(SumGarbanzos);
		
		JButton ResGarbanzos = new JButton("-1");
		ResGarbanzos.setBounds(730, 250, 55, 23);
		contentPane.add(ResGarbanzos);
		
		JButton SumGuisantes = new JButton("+1");
		SumGuisantes.setBounds(825, 250, 55, 23);
		contentPane.add(SumGuisantes);
		
		JButton ResGuisantes = new JButton("-1");
		ResGuisantes.setBounds(890, 250, 55, 23);
		contentPane.add(ResGuisantes);
		
		JButton SumHamburguesaCerdo = new JButton("+1");
		SumHamburguesaCerdo.setBounds(985, 250, 55, 23);
		contentPane.add(SumHamburguesaCerdo);
		
		JButton ResHamburguesaCerdo = new JButton("-1");
		ResHamburguesaCerdo.setBounds(1050, 250, 55, 23);
		contentPane.add(ResHamburguesaCerdo);
		
		JButton SumHamburguesaPavo = new JButton("+1");
		SumHamburguesaPavo.setBounds(1145, 250, 55, 23);
		contentPane.add(SumHamburguesaPavo);
		
		JButton ResHamburguesaPavo = new JButton("-1");
		ResHamburguesaPavo.setBounds(1210, 250, 55, 23);
		contentPane.add(ResHamburguesaPavo);
		
		JButton SumHamburguesaPollo = new JButton("+1");
		SumHamburguesaPollo.setBounds(1305, 250, 55, 23);
		contentPane.add(SumHamburguesaPollo);
		
		JButton ResHamburguesaPollo = new JButton("-1");
		ResHamburguesaPollo.setBounds(1370, 250, 55, 23);
		contentPane.add(ResHamburguesaPollo);
		
		JButton SumHamburguesaTernera = new JButton("+1");
		SumHamburguesaTernera.setBounds(1465, 250, 55, 23);
		contentPane.add(SumHamburguesaTernera);
		
		JButton ResHamburguesaTernera = new JButton("-1");
		ResHamburguesaTernera.setBounds(1530, 250, 55, 23);
		contentPane.add(ResHamburguesaTernera);
		
		JButton SumHojasOregano = new JButton("+1");
		SumHojasOregano.setBounds(1625, 250, 55, 23);
		contentPane.add(SumHojasOregano);
		
		JButton ResHojasOregano = new JButton("-1");
		ResHojasOregano.setBounds(1690, 250, 55, 23);
		contentPane.add(ResHojasOregano);
		
		JButton SumHojasPerejil = new JButton("+1");
		SumHojasPerejil.setBounds(1785, 250, 55, 23);
		contentPane.add(SumHojasPerejil);
		
		JButton ResHojasPerejil = new JButton("-1");
		ResHojasPerejil.setBounds(1850, 250, 55, 23);
		contentPane.add(ResHojasPerejil);
		
		/*Botones añadir productos a la cesta segunda fila*/
		JButton SumHuevosCodorniz = new JButton("+1");
		SumHuevosCodorniz.setBounds(25, 430, 55, 23);
		contentPane.add(SumHuevosCodorniz);
		
		JButton ResHuevosCodorniz = new JButton("-1");
		ResHuevosCodorniz.setBounds(90, 430, 55, 23);
		contentPane.add(ResHuevosCodorniz);
		
		JButton SumHuevosGallinaBlancos = new JButton("+1");
		SumHuevosGallinaBlancos.setBounds(185, 430, 55, 23);
		contentPane.add(SumHuevosGallinaBlancos);
		
		JButton ResHuevosGallinaBlancos = new JButton("-1");
		ResHuevosGallinaBlancos.setBounds(250, 430, 55, 23);
		contentPane.add(ResHuevosGallinaBlancos);
		
		JButton SumHuevosGallinaMarrones = new JButton("+1");
		SumHuevosGallinaMarrones.setBounds(345, 430, 55, 23);
		contentPane.add(SumHuevosGallinaMarrones);
		
		JButton ResHuevosGallinaMarrones = new JButton("-1");
		ResHuevosGallinaMarrones.setBounds(410, 430, 55, 23);
		contentPane.add(ResHuevosGallinaMarrones);
		
		JButton SumJamonBellota = new JButton("+1");
		SumJamonBellota.setBounds(505, 430, 55, 23);
		contentPane.add(SumJamonBellota);
		
		JButton ResJamonBellota = new JButton("-1");
		ResJamonBellota.setBounds(570, 430, 55, 23);
		contentPane.add(ResJamonBellota);
		
		JButton SumJamonIberico = new JButton("+1");
		SumJamonIberico.setBounds(665, 430, 55, 23);
		contentPane.add(SumJamonIberico);
		
		JButton ResJamonIberico = new JButton("-1");
		ResJamonIberico.setBounds(730, 430, 55, 23);
		contentPane.add(ResJamonIberico);
		
		JButton SumJamonPataNegra = new JButton("+1");
		SumJamonPataNegra.setBounds(825, 430, 55, 23);
		contentPane.add(SumJamonPataNegra);
		
		JButton ResJamonPataNegra = new JButton("-1");
		ResJamonPataNegra.setBounds(890, 430, 55, 23);
		contentPane.add(ResJamonPataNegra);
		
		JButton SumJamonSerrano = new JButton("+1");
		SumJamonSerrano.setBounds(985, 430, 55, 23);
		contentPane.add(SumJamonSerrano);
		
		JButton ResJamonSerrano = new JButton("-1");
		ResJamonSerrano.setBounds(1050, 430, 55, 23);
		contentPane.add(ResJamonSerrano);
		
		JButton SumJengibreMolido = new JButton("+1");
		SumJengibreMolido.setBounds(1145, 430, 55, 23);
		contentPane.add(SumJengibreMolido);
		
		JButton ResJengibreMolido = new JButton("-1");
		ResJengibreMolido.setBounds(1210, 430, 55, 23);
		contentPane.add(ResJengibreMolido);
		
		JButton SumKikos = new JButton("+1");
		SumKikos.setBounds(1305, 430, 55, 23);
		contentPane.add(SumKikos);
		
		JButton ResKikos = new JButton("-1");
		ResKikos.setBounds(1370, 430, 55, 23);
		contentPane.add(ResKikos);
		
		JButton SumLangosta = new JButton("+1");
		SumLangosta.setBounds(1465, 430, 55, 23);
		contentPane.add(SumLangosta);
		
		JButton ResLangosta = new JButton("-1");
		ResLangosta.setBounds(1530, 430, 55, 23);
		contentPane.add(ResLangosta);
		
		JButton SumLangostinos = new JButton("+1");
		SumLangostinos.setBounds(1625, 430, 55, 23);
		contentPane.add(SumLangostinos);
		
		JButton ResLangostinos = new JButton("-1");
		ResLangostinos.setBounds(1690, 430, 55, 23);
		contentPane.add(ResLangostinos);
		
		JButton SumLecheDesnatada = new JButton("+1");
		SumLecheDesnatada.setBounds(1785, 430, 55, 23);
		contentPane.add(SumLecheDesnatada);
		
		JButton ResLecheDesnatada = new JButton("-1");
		ResLecheDesnatada.setBounds(1850, 430, 55, 23);
		contentPane.add(ResLecheDesnatada);
		
		/*Botones añadir productos a la cesta tercera fila*/
		JButton SumLecheEntera = new JButton("+1");
		SumLecheEntera.setBounds(25, 613, 55, 23);
		contentPane.add(SumLecheEntera);
		
		JButton ResLecheEntera = new JButton("-1");
		ResLecheEntera.setBounds(90, 613, 55, 23);
		contentPane.add(ResLecheEntera);
		
		JButton SumLecheSemidesnatada = new JButton("+1");
		SumLecheSemidesnatada.setBounds(185, 613, 55, 23);
		contentPane.add(SumLecheSemidesnatada);
		
		JButton ResLecheSemidesnatada = new JButton("-1");
		ResLecheSemidesnatada.setBounds(250, 613, 55, 23);
		contentPane.add(ResLecheSemidesnatada);
		
		JButton SumLechuga = new JButton("+1");
		SumLechuga.setBounds(345, 613, 55, 23);
		contentPane.add(SumLechuga);
		
		JButton ResLechuga = new JButton("-1");
		ResLechuga.setBounds(410, 613, 55, 23);
		contentPane.add(ResLechuga);
		
		JButton SumLenguado = new JButton("+1");
		SumLenguado.setBounds(505, 613, 55, 23);
		contentPane.add(SumLenguado);
		
		JButton ResLenguado = new JButton("-1");
		ResLenguado.setBounds(570, 613, 55, 23);
		contentPane.add(ResLenguado);
		
		JButton SumLentejas = new JButton("+1");
		SumLentejas.setBounds(665, 613, 55, 23);
		contentPane.add(SumLentejas);
		
		JButton ResLentejas = new JButton("-1");
		ResLentejas.setBounds(730, 613, 55, 23);
		contentPane.add(ResLentejas);
		
		JButton SumMandarinas = new JButton("+1");
		SumMandarinas.setBounds(825, 613, 55, 23);
		contentPane.add(SumMandarinas);
		
		JButton ResMandarinas = new JButton("-1");
		ResMandarinas.setBounds(890, 613, 55, 23);
		contentPane.add(ResMandarinas);
		
		JButton SumMantecaCerdo = new JButton("+1");
		SumMantecaCerdo.setBounds(985, 613, 55, 23);
		contentPane.add(SumMantecaCerdo);
		
		JButton ResMantecaCerdo = new JButton("-1");
		ResMantecaCerdo.setBounds(1050, 613, 55, 23);
		contentPane.add(ResMantecaCerdo);
		
		JButton SumMantecaVacuno = new JButton("+1");
		SumMantecaVacuno.setBounds(1145, 613, 55, 23);
		contentPane.add(SumMantecaVacuno);
		
		JButton ResMantecaVacuno = new JButton("-1");
		ResMantecaVacuno.setBounds(1210, 613, 55, 23);
		contentPane.add(ResMantecaVacuno);
		
		JButton SumMantequillaConSal = new JButton("+1");
		SumMantequillaConSal.setBounds(1305, 613, 55, 23);
		contentPane.add(SumMantequillaConSal);
		
		JButton ResMantequillaConSal = new JButton("-1");
		ResMantequillaConSal.setBounds(1370, 613, 55, 23);
		contentPane.add(ResMantequillaConSal);
		
		JButton SumMantequillaSinSal = new JButton("+1");
		SumMantequillaSinSal.setBounds(1465, 613, 55, 23);
		contentPane.add(SumMantequillaSinSal);
		
		JButton ResMantequillaSinSal = new JButton("-1");
		ResMantequillaSinSal.setBounds(1530, 613, 55, 23);
		contentPane.add(ResMantequillaSinSal);
		
		JButton SumManzanasAmarillas = new JButton("+1");
		SumManzanasAmarillas.setBounds(1625, 613, 55, 23);
		contentPane.add(SumManzanasAmarillas);
		
		JButton ResManzanasAmarillas = new JButton("-1");
		ResManzanasAmarillas.setBounds(1690, 613, 55, 23);
		contentPane.add(ResManzanasAmarillas);
		
		JButton SumManzanasRojas = new JButton("+1");
		SumManzanasRojas.setBounds(1785, 613, 55, 23);
		contentPane.add(SumManzanasRojas);
		
		JButton ResManzanasRojas = new JButton("-1");
		ResManzanasRojas.setBounds(1850, 613, 55, 23);
		contentPane.add(ResManzanasRojas);
		
		/*Botones añadir productos a la cesta cuarta fila*/
		JButton SumManzanasVerdes = new JButton("+1");
		SumManzanasVerdes.setBounds(25, 790, 55, 23);
		contentPane.add(SumManzanasVerdes);
		
		JButton ResManzanasVerdes = new JButton("-1");
		ResManzanasVerdes.setBounds(90, 790, 55, 23);
		contentPane.add(ResManzanasVerdes);
		
		JButton SumMejillones = new JButton("+1");
		SumMejillones.setBounds(185, 790, 55, 23);
		contentPane.add(SumMejillones);
		
		JButton ResMejillones = new JButton("-1");
		ResMejillones.setBounds(250, 790, 55, 23);
		contentPane.add(ResMejillones);
		
		JButton SumMelonAmarillo = new JButton("+1");
		SumMelonAmarillo.setBounds(345, 790, 55, 23);
		contentPane.add(SumMelonAmarillo);
		
		JButton ResMelonAmarillo = new JButton("-1");
		ResMelonAmarillo.setBounds(410, 790, 55, 23);
		contentPane.add(ResMelonAmarillo);
		
		JButton SumMelonBlanco = new JButton("+1");
		SumMelonBlanco.setBounds(505, 790, 55, 23);
		contentPane.add(SumMelonBlanco);
		
		JButton ResMelonBlanco = new JButton("-1");
		ResMelonBlanco.setBounds(570, 790, 55, 23);
		contentPane.add(ResMelonBlanco);
		
		JButton SumMelonVerde = new JButton("+1");
		SumMelonVerde.setBounds(665, 790, 55, 23);
		contentPane.add(SumMelonVerde);
		
		JButton ResMelonVerde = new JButton("-1");
		ResMelonVerde.setBounds(730, 790, 55, 23);
		contentPane.add(ResMelonVerde);
		
		JButton SumMerluzaTroceada = new JButton("+1");
		SumMerluzaTroceada.setBounds(825, 790, 55, 23);
		contentPane.add(SumMerluzaTroceada);
		
		JButton ResMerluzaTroceada = new JButton("-1");
		ResMerluzaTroceada.setBounds(890, 790, 55, 23);
		contentPane.add(ResMerluzaTroceada);
		
		JButton SumMielDulce = new JButton("+1");
		SumMielDulce.setBounds(985, 790, 55, 23);
		contentPane.add(SumMielDulce);
		
		JButton ResMielDulce = new JButton("-1");
		ResMielDulce.setBounds(1050, 790, 55, 23);
		contentPane.add(ResMielDulce);
		
		JButton SumMielMelaza = new JButton("+1");
		SumMielMelaza.setBounds(1145, 790, 55, 23);
		contentPane.add(SumMielMelaza);
		
		JButton ResMielMelaza = new JButton("-1");
		ResMielMelaza.setBounds(1210, 790, 55, 23);
		contentPane.add(ResMielMelaza);
		
		JButton SumMorcilla = new JButton("+1");
		SumMorcilla.setBounds(1305, 790, 55, 23);
		contentPane.add(SumMorcilla);
		
		JButton ResMorcilla = new JButton("-1");
		ResMorcilla.setBounds(1370, 790, 55, 23);
		contentPane.add(ResMorcilla);
		
		JButton SumMuslosPavo = new JButton("+1");
		SumMuslosPavo.setBounds(1465, 790, 55, 23);
		contentPane.add(SumMuslosPavo);
		
		JButton ResMuslosPavo = new JButton("-1");
		ResMuslosPavo.setBounds(1530, 790, 55, 23);
		contentPane.add(ResMuslosPavo);
		
		JButton SumMuslosPollo = new JButton("+1");
		SumMuslosPollo.setBounds(1625, 790, 55, 23);
		contentPane.add(SumMuslosPollo);
		
		JButton ResMuslosPollo = new JButton("-1");
		ResMuslosPollo.setBounds(1690, 790, 55, 23);
		contentPane.add(ResMuslosPollo);
		
		JButton SumNueces = new JButton("+1");
		SumNueces.setBounds(1785, 790, 55, 23);
		contentPane.add(SumNueces);
		
		JButton ResNueces = new JButton("-1");
		ResNueces.setBounds(1850, 790, 55, 23);
		contentPane.add(ResNueces);
		
		/*Botones añadir productos a la cesta quinta fila*/
		JButton SumOreganoMolido = new JButton("+1");
		SumOreganoMolido.setBounds(25, 970, 55, 23);
		contentPane.add(SumOreganoMolido);
		
		JButton ResOreganoMolido = new JButton("-1");
		ResOreganoMolido.setBounds(90, 970, 55, 23);
		contentPane.add(ResOreganoMolido);
		
		JButton SumPancetaCerdo = new JButton("+1");
		SumPancetaCerdo.setBounds(185, 970, 55, 23);
		contentPane.add(SumPancetaCerdo);
		
		JButton ResPancetaCerdo = new JButton("-1");
		ResPancetaCerdo.setBounds(250, 970, 55, 23);
		contentPane.add(ResPancetaCerdo);
		
		JButton SumPataCordero = new JButton("+1");
		SumPataCordero.setBounds(345, 970, 55, 23);
		contentPane.add(SumPataCordero);
		
		JButton ResPataCordero = new JButton("-1");
		ResPataCordero.setBounds(410, 970, 55, 23);
		contentPane.add(ResPataCordero);
		
		JButton SumPatatas = new JButton("+1");
		SumPatatas.setBounds(505, 970, 55, 23);
		contentPane.add(SumPatatas);
		
		JButton ResPatatas = new JButton("-1");
		ResPatatas.setBounds(570, 970, 55, 23);
		contentPane.add(ResPatatas);
		
		JButton SumPateCerdo = new JButton("+1");
		SumPateCerdo.setBounds(665, 970, 55, 23);
		contentPane.add(SumPateCerdo);
		
		JButton ResPateCerdo = new JButton("-1");
		ResPateCerdo.setBounds(730, 970, 55, 23);
		contentPane.add(ResPateCerdo);
		
		JButton SumPatePavo = new JButton("+1");
		SumPatePavo.setBounds(825, 970, 55, 23);
		contentPane.add(SumPatePavo);
		
		JButton ResPatePavo = new JButton("-1");
		ResPatePavo.setBounds(890, 970, 55, 23);
		contentPane.add(ResPatePavo);
		
		JButton SumPatePato = new JButton("+1");
		SumPatePato.setBounds(985, 970, 55, 23);
		contentPane.add(SumPatePato);
		
		JButton ResPatePato = new JButton("-1");
		ResPatePato.setBounds(1050, 970, 55, 23);
		contentPane.add(ResPatePato);
		
		JButton SumPatePollo = new JButton("+1");
		SumPatePollo.setBounds(1145, 970, 55, 23);
		contentPane.add(SumPatePollo);
		
		JButton ResPatePollo = new JButton("-1");
		ResPatePollo.setBounds(1210, 970, 55, 23);
		contentPane.add(ResPatePollo);
		
		JButton SumPasas = new JButton("+1");
		SumPasas.setBounds(1305, 970, 55, 23);
		contentPane.add(SumPasas);
		
		JButton ResPasas = new JButton("-1");
		ResPasas.setBounds(1370, 970, 55, 23);
		contentPane.add(ResPasas);
		
		JButton SumPerasAmarillas = new JButton("+1");
		SumPerasAmarillas.setBounds(1465, 970, 55, 23);
		contentPane.add(SumPerasAmarillas);
		
		JButton ResPerasAmarillas = new JButton("-1");
		ResPerasAmarillas.setBounds(1530, 970, 55, 23);
		contentPane.add(ResPerasAmarillas);
		
		JButton SumPerasVerdes = new JButton("+1");
		SumPerasVerdes.setBounds(1625, 970, 55, 23);
		contentPane.add(SumPerasVerdes);
		
		JButton ResPerasVerdes = new JButton("-1");
		ResPerasVerdes.setBounds(1690, 970, 55, 23);
		contentPane.add(ResPerasVerdes);
		
		JButton SumPerejilMolido = new JButton("+1");
		SumPerejilMolido.setBounds(1785, 970, 55, 23);
		contentPane.add(SumPerejilMolido);
		
		JButton ResPerejilMolido = new JButton("-1");
		ResPerejilMolido.setBounds(1850, 970, 55, 23);
		contentPane.add(ResPerejilMolido);
		
		
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
		Cestas.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/MegaMarket.png")));
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
		pagina2.setForeground(new Color(128, 0, 255));
		pagina2.setBounds(845, 66, 35, 14);
		contentPane.add(pagina2);
		
		JLabel pagina3 = new JLabel("3");
		pagina3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Pagina3 frame = new Pagina3();
				frame.setVisible(true);
			}
		});
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
			
			/*Segunda Página*/
			
			/*Productos primera fila*/
			JLabel LabelFilete_Ternera = new JLabel("Filete de Ternera");
			LabelFilete_Ternera.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFilete_Ternera.setBounds(40, 126, 104, 14);
			contentPane.add(LabelFilete_Ternera);
			
			JLabel ImagenFilete_Ternera = new JLabel(" ");
			ImagenFilete_Ternera.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/filete de ternera.png")));
			ImagenFilete_Ternera.setBounds(40, 126, 91, 111);
			contentPane.add(ImagenFilete_Ternera);
			
			JLabel LabelFresas = new JLabel("Fresas");
			LabelFresas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFresas.setBounds(200, 126, 104, 14);
			contentPane.add(LabelFresas);
			
			JLabel ImagenFresas = new JLabel(" ");
			ImagenFresas.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/fresas.png")));
			ImagenFresas.setBounds(200, 126, 91, 111);
			contentPane.add(ImagenFresas);
			
			JLabel LabelFuet = new JLabel("Fuet");
			LabelFuet.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFuet.setBounds(360, 126, 104, 14);
			contentPane.add(LabelFuet);
			
			JLabel ImagenFuet = new JLabel(" ");
			ImagenFuet.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/fuet.png")));
			ImagenFuet.setBounds(360, 126, 91, 111);
			contentPane.add(ImagenFuet);
			
			JLabel LabelGambas = new JLabel("Gambas");
			LabelGambas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelGambas.setBounds(520, 126, 104, 14);
			contentPane.add(LabelGambas);
			
			JLabel ImagenGambas = new JLabel(" ");
			ImagenGambas.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/gambas.png")));
			ImagenGambas.setBounds(520, 126, 91, 111);
			contentPane.add(ImagenGambas);
			
			JLabel LabelGarbanzos = new JLabel("Garbanzos");
			LabelGarbanzos.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelGarbanzos.setBounds(680, 126, 104, 14);
			contentPane.add(LabelGarbanzos);
			
			JLabel ImagenGarbanzos = new JLabel(" ");
			ImagenGarbanzos.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/garbanzos.png")));
			ImagenGarbanzos.setBounds(680, 126, 91, 111);
			contentPane.add(ImagenGarbanzos);
				
			JLabel LabelGuisantes = new JLabel("Guisantes");
			LabelGuisantes.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelGuisantes.setBounds(840, 126, 104, 14);
			contentPane.add(LabelGuisantes);
			
			JLabel ImagenGuisantes = new JLabel(" ");
			ImagenGuisantes.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/guisantes.png")));
			ImagenGuisantes.setBounds(840, 126, 91, 111);
			contentPane.add(ImagenGuisantes);
			
			JLabel LabelHamburguesa_Cerdo = new JLabel("Hamburguesa de cerdo");
			LabelHamburguesa_Cerdo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHamburguesa_Cerdo.setBounds(1000, 126, 104, 14);
			contentPane.add(LabelHamburguesa_Cerdo);
			
			JLabel ImagenHamburguesa_Cerdo = new JLabel(" ");
			ImagenHamburguesa_Cerdo.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/hamburguesa de cerdo.png")));
			ImagenHamburguesa_Cerdo.setBounds(1000, 126, 91, 111);
			contentPane.add(ImagenHamburguesa_Cerdo);
			
			JLabel LabelHamburguesa_Pavo = new JLabel("Hamburguesa de pavo");
			LabelHamburguesa_Pavo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHamburguesa_Pavo.setBounds(1160, 126, 104, 14);
			contentPane.add(LabelHamburguesa_Pavo);
			
			JLabel ImagenHamburguesa_Pavo = new JLabel(" ");
			ImagenHamburguesa_Pavo.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/carne picada de pavo.png")));
			ImagenHamburguesa_Pavo.setBounds(1160, 126, 91, 111);
			contentPane.add(ImagenHamburguesa_Pavo);
			
			JLabel LabelHamburguesa_Pollo = new JLabel("Hamburguesa de pollo");
			LabelHamburguesa_Pollo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHamburguesa_Pollo.setBounds(1320, 126, 104, 14);
			contentPane.add(LabelHamburguesa_Pollo);
			
			JLabel ImagenHamburguesa_Pollo = new JLabel(" ");
			ImagenHamburguesa_Pollo.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/hamburguesa de pollo.png")));
			ImagenHamburguesa_Pollo.setBounds(1320, 126, 91, 111);
			contentPane.add(ImagenHamburguesa_Pollo);
						
			JLabel LabelHamburguesa_Ternera = new JLabel("Hamburguesa de Ternera");
			LabelHamburguesa_Ternera.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHamburguesa_Ternera.setBounds(1480, 126, 104, 14);
			contentPane.add(LabelHamburguesa_Ternera);
			
			JLabel ImagenHamburguesa_Ternera = new JLabel(" ");
			ImagenHamburguesa_Ternera.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/hamburguesa de ternera.png")));
			ImagenHamburguesa_Ternera.setBounds(1480, 126, 91, 111);
			contentPane.add(ImagenHamburguesa_Ternera);
			
			JLabel LabelHojas_Oregano = new JLabel("Hojas de orégano");
			LabelHojas_Oregano.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHojas_Oregano.setBounds(1640, 126, 104, 14);
			contentPane.add(LabelHojas_Oregano);
			
			JLabel ImagenHojas_Oregano = new JLabel(" ");
			ImagenHojas_Oregano.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Hojas de orégano.png")));
			ImagenHojas_Oregano.setBounds(1640, 126, 91, 111);
			contentPane.add(ImagenHojas_Oregano);
			
			JLabel LabelHojas_Perejil = new JLabel("Hojas de perejil");
			LabelHojas_Perejil.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHojas_Perejil.setBounds(1800, 126, 104, 14);
			contentPane.add(LabelHojas_Perejil);
			
			JLabel ImagenHojas_Perejil = new JLabel(" ");
			ImagenHojas_Perejil.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/hojas de perejil.png")));
			ImagenHojas_Perejil.setBounds(1800, 126, 91, 111);
			contentPane.add(ImagenHojas_Perejil);
			
			/*Productos segunda fila*/
			JLabel LabelHuevos_Codorniz = new JLabel("Huevos de codorniz");
			LabelHuevos_Codorniz.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHuevos_Codorniz.setBounds(40, 306, 104, 14);
			contentPane.add(LabelHuevos_Codorniz);
			
			JLabel ImagenHuevos_Codorniz = new JLabel(" ");
			ImagenHuevos_Codorniz.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/huevos de codorniz.png")));
			ImagenHuevos_Codorniz.setBounds(40, 306, 91, 111);
			contentPane.add(ImagenHuevos_Codorniz);
						
			JLabel LabelHuevos_Gallina_Blancos = new JLabel("Huevos de gallina blancos");
			LabelHuevos_Gallina_Blancos.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHuevos_Gallina_Blancos.setBounds(200, 306, 104, 14);
			contentPane.add(LabelHuevos_Gallina_Blancos);
			
			JLabel ImagenHuevos_Gallina_Blancos = new JLabel(" ");
			ImagenHuevos_Gallina_Blancos.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/huevos de gallina blancos.png")));
			ImagenHuevos_Gallina_Blancos.setBounds(200, 306, 91, 111);
			contentPane.add(ImagenHuevos_Gallina_Blancos);
									
			JLabel LabelHuevos_Gallina_Marrones = new JLabel("Huevos de gallina marrones");
			LabelHuevos_Gallina_Marrones.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHuevos_Gallina_Marrones.setBounds(360, 306, 104, 14);
			contentPane.add(LabelHuevos_Gallina_Marrones);
			
			JLabel ImagenHuevos_Gallina_Marrones = new JLabel(" ");
			ImagenHuevos_Gallina_Marrones.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/huevos de gallina marrones.png")));
			ImagenHuevos_Gallina_Marrones.setBounds(360, 306, 91, 111);
			contentPane.add(ImagenHuevos_Gallina_Marrones);
			
			JLabel LabelJamon_Bellota = new JLabel("Jamón Bellota");
			LabelJamon_Bellota.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelJamon_Bellota.setBounds(520, 306, 104, 14);
			contentPane.add(LabelJamon_Bellota);
			
			JLabel ImagenJamon_Bellota = new JLabel(" ");
			ImagenJamon_Bellota.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Jamón de bellota.png")));
			ImagenJamon_Bellota.setBounds(520, 306, 91, 111);
			contentPane.add(ImagenJamon_Bellota);
									
			JLabel LabelJamon_Iberico = new JLabel("Jamón Ibérico");
			LabelJamon_Iberico.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelJamon_Iberico.setBounds(680, 306, 104, 14);
			contentPane.add(LabelJamon_Iberico);
			
			JLabel ImagenJamon_Iberico = new JLabel(" ");
			ImagenJamon_Iberico.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Jamón ibérico.png")));
			ImagenJamon_Iberico.setBounds(680, 306, 91, 111);
			contentPane.add(ImagenJamon_Iberico);
									
			JLabel LabelJamon_Pata_Negra = new JLabel("Jamón Pata Negra");
			LabelJamon_Pata_Negra.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelJamon_Pata_Negra.setBounds(840, 306, 104, 14);
			contentPane.add(LabelJamon_Pata_Negra);
			
			JLabel ImagenJamon_Pata_Negra = new JLabel(" ");
			ImagenJamon_Pata_Negra.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Jamón pata negra.png")));
			ImagenJamon_Pata_Negra.setBounds(840, 306, 91, 111);
			contentPane.add(ImagenJamon_Pata_Negra);
			
			JLabel LabelJamon_Serrano = new JLabel("Jamón Serrano");
			LabelJamon_Serrano.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelJamon_Serrano.setBounds(1000, 306, 104, 14);
			contentPane.add(LabelJamon_Serrano);
			
			JLabel ImagenJamon_Serrano = new JLabel(" ");
			ImagenJamon_Serrano.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Jamon serrano.png")));
			ImagenJamon_Serrano.setBounds(1000, 306, 91, 111);
			contentPane.add(ImagenJamon_Serrano);
			
			JLabel LabelJengibre_Molido = new JLabel("Jengibre molido");
			LabelJengibre_Molido.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelJengibre_Molido.setBounds(1160, 306, 104, 14);
			contentPane.add(LabelJengibre_Molido);
			
			JLabel ImagenJengibre_Molido = new JLabel(" ");
			ImagenJengibre_Molido.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/jengibre molido.png")));
			ImagenJengibre_Molido.setBounds(1160, 306, 91, 111);
			contentPane.add(ImagenJengibre_Molido);
			
			JLabel LabelKikos = new JLabel("Kikos");
			LabelKikos.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelKikos.setBounds(1320, 306, 104, 14);
			contentPane.add(LabelKikos);
			
			JLabel ImagenKikos = new JLabel(" ");
			ImagenKikos.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/kikos.png")));
			ImagenKikos.setBounds(1320, 306, 91, 111);
			contentPane.add(ImagenKikos);
			
			JLabel LabelLangosta = new JLabel("Langosta");
			LabelLangosta.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLangosta.setBounds(1480, 306, 104, 14);
			contentPane.add(LabelLangosta);
			
			JLabel ImagenLangosta = new JLabel(" ");
			ImagenLangosta.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/langosta.png")));
			ImagenLangosta.setBounds(1480, 306, 91, 111);
			contentPane.add(ImagenLangosta);
			
			JLabel LabelLangostinos = new JLabel("Langostinos");
			LabelLangostinos.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLangostinos.setBounds(1640, 306, 104, 14);
			contentPane.add(LabelLangostinos);
			
			JLabel ImagenLangostinos = new JLabel(" ");
			ImagenLangostinos.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/langostinos.png")));
			ImagenLangostinos.setBounds(1640, 306, 91, 111);
			contentPane.add(ImagenLangostinos);
			
			JLabel LabelLeche_Desnatada = new JLabel("Leche Desnatada");
			LabelLeche_Desnatada.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLeche_Desnatada.setBounds(1800, 306, 104, 14);
			contentPane.add(LabelLeche_Desnatada);
			
			JLabel ImagenLeche_Desnatada = new JLabel(" ");
			ImagenLeche_Desnatada.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/leche desnatada.png")));
			ImagenLeche_Desnatada.setBounds(1800, 306, 91, 111);
			contentPane.add(ImagenLeche_Desnatada);
			
			/*Productos tercera fila*/
			JLabel LabelLeche_Entera = new JLabel("Leche Entera");
			LabelLeche_Entera.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLeche_Entera.setBounds(40, 486, 104, 14);
			contentPane.add(LabelLeche_Entera);
			
			JLabel ImagenLeche_Entera = new JLabel(" ");
			ImagenLeche_Entera.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/leche entera.png")));
			ImagenLeche_Entera.setBounds(40, 486, 91, 111);
			contentPane.add(ImagenLeche_Entera);
			
			JLabel LabelLeche_Semidesnatada = new JLabel("Leche Semidesnatada");
			LabelLeche_Semidesnatada.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLeche_Semidesnatada.setBounds(200, 486, 104, 14);
			contentPane.add(LabelLeche_Semidesnatada);
			
			JLabel ImagenLeche_Semidesnatada = new JLabel(" ");
			ImagenLeche_Semidesnatada.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/leche semidesnatada.png")));
			ImagenLeche_Semidesnatada.setBounds(200, 486, 91, 111);
			contentPane.add(ImagenLeche_Semidesnatada);
			
			JLabel LabelLechuga = new JLabel("Lechuga");
			LabelLechuga.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLechuga.setBounds(360, 486, 104, 14);
			contentPane.add(LabelLechuga);
			
			JLabel ImagenLechuga = new JLabel(" ");
			ImagenLechuga.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/lechuga.png")));
			ImagenLechuga.setBounds(360, 486, 91, 111);
			contentPane.add(ImagenLechuga);
			
			JLabel LabelLenguado = new JLabel("Lenguado");
			LabelLenguado.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLenguado.setBounds(520, 486, 104, 14);
			contentPane.add(LabelLenguado);
			
			JLabel ImagenLenguado = new JLabel(" ");
			ImagenLenguado.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/lenguado.png")));
			ImagenLenguado.setBounds(520, 486, 91, 111);
			contentPane.add(ImagenLenguado);
			
			JLabel LabelLentejas = new JLabel("Lentejas");
			LabelLentejas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLentejas.setBounds(680, 486, 104, 14);
			contentPane.add(LabelLentejas);
			
			JLabel ImagenLentejas = new JLabel(" ");
			ImagenLentejas.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/lentejas.png")));
			ImagenLentejas.setBounds(680, 486, 91, 111);
			contentPane.add(ImagenLentejas);
			
			JLabel LabelMandarinas = new JLabel("Mandarinas");
			LabelMandarinas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMandarinas.setBounds(840, 486, 104, 14);
			contentPane.add(LabelMandarinas);
			
			JLabel ImagenMandarinas = new JLabel(" ");
			ImagenMandarinas.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/mandarina.png")));
			ImagenMandarinas.setBounds(840, 486, 91, 111);
			contentPane.add(ImagenMandarinas);
			
			JLabel LabelManteca_Cerdo = new JLabel("Manteca Cerdo");
			LabelManteca_Cerdo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelManteca_Cerdo.setBounds(1000, 486, 104, 14);
			contentPane.add(LabelManteca_Cerdo);
			
			JLabel ImagenManteca_Cerdo = new JLabel(" ");
			ImagenManteca_Cerdo.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/manteca de cerdo.png")));
			ImagenManteca_Cerdo.setBounds(1000, 486, 91, 111);
			contentPane.add(ImagenManteca_Cerdo);
			
			JLabel LabelManteca_Vacuno = new JLabel("Manteca Vacuno");
			LabelManteca_Vacuno.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelManteca_Vacuno.setBounds(1160, 486, 104, 14);
			contentPane.add(LabelManteca_Vacuno);
			
			JLabel ImagenManteca_Vacuno = new JLabel(" ");
			ImagenManteca_Vacuno.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/manteca de vacuno.png")));
			ImagenManteca_Vacuno.setBounds(1160, 486, 91, 111);
			contentPane.add(ImagenManteca_Vacuno);
			
			JLabel LabelMantequilla_Con_Sal = new JLabel("Mantequilla Con Sal");
			LabelMantequilla_Con_Sal.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMantequilla_Con_Sal.setBounds(1320, 486, 110, 14);
			contentPane.add(LabelMantequilla_Con_Sal);
			
			JLabel ImagenMantequilla_Con_Sal = new JLabel(" ");
			ImagenMantequilla_Con_Sal.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/mantequilla con sal.png")));
			ImagenMantequilla_Con_Sal.setBounds(1320, 486, 91, 111);
			contentPane.add(ImagenMantequilla_Con_Sal);
			
			JLabel LabelMantequilla_Sin_Sal = new JLabel("Mantequilla Sin Sal");
			LabelMantequilla_Sin_Sal.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMantequilla_Sin_Sal.setBounds(1480, 486, 104, 14);
			contentPane.add(LabelMantequilla_Sin_Sal);
			
			JLabel ImagenMantequilla_Sin_Sal = new JLabel(" ");
			ImagenMantequilla_Sin_Sal.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/mantequilla sin sal.png")));
			ImagenMantequilla_Sin_Sal.setBounds(1480, 486, 91, 111);
			contentPane.add(ImagenMantequilla_Sin_Sal);
			
			JLabel LabelManzanas_Amarillas = new JLabel("Manzanas Amarillas");
			LabelManzanas_Amarillas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelManzanas_Amarillas.setBounds(1640, 486, 104, 14);
			contentPane.add(LabelManzanas_Amarillas);
			
			JLabel ImagenManzanas_Amarillas = new JLabel(" ");
			ImagenManzanas_Amarillas.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/manzana amarilla.png")));
			ImagenManzanas_Amarillas.setBounds(1640, 486, 91, 111);
			contentPane.add(ImagenManzanas_Amarillas);
			
			JLabel LabelManzanas_Rojas = new JLabel("Manzanas Rojas");
			LabelManzanas_Rojas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelManzanas_Rojas.setBounds(1800, 486, 120, 14);
			contentPane.add(LabelManzanas_Rojas);
			
			JLabel ImagenManzanas_Rojas = new JLabel(" ");
			ImagenManzanas_Rojas.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Manzana_Roja.png")));
			ImagenManzanas_Rojas.setBounds(1800, 486, 91, 111);
			contentPane.add(ImagenManzanas_Rojas);
			
			/*Productos cuarta fila*/
			JLabel LabelManzanas_Verdes = new JLabel("Manzanas Verdes");
			LabelManzanas_Verdes.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelManzanas_Verdes.setBounds(40, 666, 104, 14);
			contentPane.add(LabelManzanas_Verdes);
			
			JLabel ImagenManzanas_Verdes = new JLabel(" ");
			ImagenManzanas_Verdes.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Manzana_Verde.png")));
			ImagenManzanas_Verdes.setBounds(40, 666, 91, 111);
			contentPane.add(ImagenManzanas_Verdes);
			
			JLabel LabelMejillones = new JLabel("Mejillones");
			LabelMejillones.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMejillones.setBounds(200, 666, 104, 14);
			contentPane.add(LabelMejillones);
			
			JLabel ImagenMejillones = new JLabel(" ");
			ImagenMejillones.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Mejillones.png")));
			ImagenMejillones.setBounds(200, 666, 91, 111);
			contentPane.add(ImagenMejillones);
			
			JLabel LabelMelon_Amarillo = new JLabel("Melón Amarillo");
			LabelMelon_Amarillo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMelon_Amarillo.setBounds(360, 666, 104, 14);
			contentPane.add(LabelMelon_Amarillo);
			
			JLabel ImagenMelon_Amarillo = new JLabel(" ");
			ImagenMelon_Amarillo.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Melon_Amarillo.png")));
			ImagenMelon_Amarillo.setBounds(360, 666, 91, 111);
			contentPane.add(ImagenMelon_Amarillo);
			
			JLabel LabelMelon_Blanco = new JLabel("Melón Blanco");
			LabelMelon_Blanco.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMelon_Blanco.setBounds(520, 666, 104, 14);
			contentPane.add(LabelMelon_Blanco);
			
			JLabel ImagenMelon_Blanco = new JLabel(" ");
			ImagenMelon_Blanco.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Melon_Blanca.png")));
			ImagenMelon_Blanco.setBounds(520, 666, 91, 111);
			contentPane.add(ImagenMelon_Blanco);
			
			JLabel LabelMelon_Verde = new JLabel("Melón Verde");
			LabelMelon_Verde.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMelon_Verde.setBounds(680, 666, 104, 14);
			contentPane.add(LabelMelon_Verde);
			
			JLabel ImagenMelon_Verde = new JLabel(" ");
			ImagenMelon_Verde.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Melon_Verde.png")));
			ImagenMelon_Verde.setBounds(680, 666, 91, 111);
			contentPane.add(ImagenMelon_Verde);
			
			JLabel LabelMerluza_Troceada = new JLabel("Merluza Troceada");
			LabelMerluza_Troceada.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMerluza_Troceada.setBounds(840, 666, 104, 14);
			contentPane.add(LabelMerluza_Troceada);
			
			JLabel ImagenMerluza_Troceada = new JLabel(" ");
			ImagenMerluza_Troceada.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Merluza_trozeada.png")));
			ImagenMerluza_Troceada.setBounds(840, 666, 91, 111);
			contentPane.add(ImagenMerluza_Troceada);
			
			JLabel LabelMiel_Dulce = new JLabel("Miel Dulce");
			LabelMiel_Dulce.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMiel_Dulce.setBounds(1000, 666, 104, 14);
			contentPane.add(LabelMiel_Dulce);
			
			JLabel ImagenMiel_Dulce = new JLabel(" ");
			ImagenMiel_Dulce.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Miel_Dulce.png")));
			ImagenMiel_Dulce.setBounds(1000, 666, 91, 111);
			contentPane.add(ImagenMiel_Dulce);
			
			JLabel LabelMiel_Melaza = new JLabel("Miel Melaza");
			LabelMiel_Melaza.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMiel_Melaza.setBounds(1160, 666, 104, 14);
			contentPane.add(LabelMiel_Melaza);
			
			JLabel ImagenMiel_Melaza = new JLabel(" ");
			ImagenMiel_Melaza.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Miel_Melaza.png")));
			ImagenMiel_Melaza.setBounds(1160, 666, 91, 111);
			contentPane.add(ImagenMiel_Melaza);
			
			JLabel LabelMorcilla = new JLabel("Morcilla");
			LabelMorcilla.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMorcilla.setBounds(1320, 666, 104, 14);
			contentPane.add(LabelMorcilla);
			
			JLabel ImagenMorcilla = new JLabel(" ");
			ImagenMorcilla.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Morcilla.png")));
			ImagenMorcilla.setBounds(1320, 666, 91, 111);
			contentPane.add(ImagenMorcilla);
			
			JLabel LabelMuslos_Pavo = new JLabel("Muslos Pavo");
			LabelMuslos_Pavo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMuslos_Pavo.setBounds(1480, 666, 104, 14);
			contentPane.add(LabelMuslos_Pavo);
			
			JLabel ImagenMuslos_Pavo = new JLabel(" ");
			ImagenMuslos_Pavo.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Muslos_Pavo.png")));
			ImagenMuslos_Pavo.setBounds(1480, 666, 91, 111);
			contentPane.add(ImagenMuslos_Pavo);
			
			JLabel LabelMuslos_Pollo = new JLabel("Muslos Pollo");
			LabelMuslos_Pollo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMuslos_Pollo.setBounds(1640, 666, 104, 14);
			contentPane.add(LabelMuslos_Pollo);
			
			JLabel ImagenMuslos_Pollo = new JLabel(" ");
			ImagenMuslos_Pollo.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Muslos_Pollo.png")));
			ImagenMuslos_Pollo.setBounds(1640, 666, 91, 111);
			contentPane.add(ImagenMuslos_Pollo);
			
			JLabel LabelNueces = new JLabel("Nueces");
			LabelNueces.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelNueces.setBounds(1800, 666, 104, 14);
			contentPane.add(LabelNueces);
			
			JLabel ImagenNueces = new JLabel(" ");
			ImagenNueces.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Nueces.png")));
			ImagenNueces.setBounds(1800, 666, 91, 111);
			contentPane.add(ImagenNueces);
			
			/*Productos quinta fila*/
			JLabel LabelOregano_Molido = new JLabel("Orégano Molido");
			LabelOregano_Molido.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelOregano_Molido.setBounds(40, 846, 104, 14);
			contentPane.add(LabelOregano_Molido);
			
			JLabel ImagenOregano_Molido = new JLabel(" ");
			ImagenOregano_Molido.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/orégano molido.png")));
			ImagenOregano_Molido.setBounds(40, 846, 91, 111);
			contentPane.add(ImagenOregano_Molido);
			
			JLabel LabelPanceta_Cerdo = new JLabel("Panceta Cerdo");
			LabelPanceta_Cerdo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelPanceta_Cerdo.setBounds(200, 846, 104, 14);
			contentPane.add(LabelPanceta_Cerdo);
			
			JLabel ImagenPanceta_Cerdo = new JLabel(" ");
			ImagenPanceta_Cerdo.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Panceta_Cerdo.png")));
			ImagenPanceta_Cerdo.setBounds(200, 846, 91, 111);
			contentPane.add(ImagenPanceta_Cerdo);
			
			JLabel LabelPasas = new JLabel("Pasas");
			LabelPasas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelPasas.setBounds(360, 846, 104, 14);
			contentPane.add(LabelPasas);
			
			JLabel ImagenPasas = new JLabel(" ");
			ImagenPasas.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/pasas.png")));
			ImagenPasas.setBounds(360, 846, 91, 111);
			contentPane.add(ImagenPasas);
			
			JLabel LabelPata_Cordero = new JLabel("Pata Cordero");
			LabelPata_Cordero.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelPata_Cordero.setBounds(520, 846, 104, 14);
			contentPane.add(LabelPata_Cordero);
			
			JLabel ImagenPata_Cordero = new JLabel(" ");
			ImagenPata_Cordero.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Pata_Cordero.png")));
			ImagenPata_Cordero.setBounds(520, 846, 91, 111);
			contentPane.add(ImagenPata_Cordero);
			
			JLabel LabelPatatas = new JLabel("Patatas");
			LabelPatatas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelPatatas.setBounds(680, 846, 104, 14);
			contentPane.add(LabelPatatas);
			
			JLabel ImagenPatatas = new JLabel(" ");
			ImagenPatatas.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Patatas.png")));
			ImagenPatatas.setBounds(680, 846, 91, 111);
			contentPane.add(ImagenPatatas);
			
			JLabel LabelPate_Cerdo = new JLabel("Paté Cerdo");
			LabelPate_Cerdo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelPate_Cerdo.setBounds(840, 846, 104, 14);
			contentPane.add(LabelPate_Cerdo);
			
			JLabel ImagenPate_Cerdo = new JLabel(" ");
			ImagenPate_Cerdo.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/pate de cerdo.png")));
			ImagenPate_Cerdo.setBounds(840, 846, 91, 111);
			contentPane.add(ImagenPate_Cerdo);
			
			JLabel LabelPate_Pavo = new JLabel("Paté Pavo");
			LabelPate_Pavo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelPate_Pavo.setBounds(1000, 846, 104, 14);
			contentPane.add(LabelPate_Pavo);
			
			JLabel ImagenPate_Pavo = new JLabel(" ");
			ImagenPate_Pavo.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Pate_Pavo.png")));
			ImagenPate_Pavo.setBounds(1000, 846, 91, 111);
			contentPane.add(ImagenPate_Pavo);
			
			JLabel LabelPate_Pato = new JLabel("Paté Pato");
			LabelPate_Pato.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelPate_Pato.setBounds(1160, 846, 104, 14);
			contentPane.add(LabelPate_Pato);
			
			JLabel ÏmagenPate_Pato = new JLabel(" ");
			ÏmagenPate_Pato.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/pate de pato.png")));
			ÏmagenPate_Pato.setBounds(1160, 846, 91, 111);
			contentPane.add(ÏmagenPate_Pato);
			
			JLabel LabelPate_Pollo = new JLabel("Paté Pollo");
			LabelPate_Pollo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelPate_Pollo.setBounds(1320, 846, 104, 14);
			contentPane.add(LabelPate_Pollo);
			
			JLabel ImagenPate_Pollo = new JLabel(" ");
			ImagenPate_Pollo.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/Pate_Pollo.png")));
			ImagenPate_Pollo.setBounds(1320, 846, 91, 111);
			contentPane.add(ImagenPate_Pollo);
			
			JLabel LabelPeras_Amarillas = new JLabel("Peras Amarillas");
			LabelPeras_Amarillas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelPeras_Amarillas.setBounds(1480, 846, 104, 14);
			contentPane.add(LabelPeras_Amarillas);
			
			JLabel ImagenPeras_Amarillas = new JLabel(" ");
			ImagenPeras_Amarillas.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/peras amarillas.png")));
			ImagenPeras_Amarillas.setBounds(1480, 846, 91, 111);
			contentPane.add(ImagenPeras_Amarillas);
			
			JLabel LabelPeras_Verdes = new JLabel("Peras Verdes");
			LabelPeras_Verdes.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelPeras_Verdes.setBounds(1640, 846, 104, 14);
			contentPane.add(LabelPeras_Verdes);
			
			JLabel ImagenPeras_Verdes = new JLabel(" ");
			ImagenPeras_Verdes.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/peras.png")));
			ImagenPeras_Verdes.setBounds(1640, 846, 91, 111);
			contentPane.add(ImagenPeras_Verdes);
			
			JLabel LabelPerejil_Molido = new JLabel("Perejil Molido");
			LabelPerejil_Molido.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelPerejil_Molido.setBounds(1800, 846, 104, 14);
			contentPane.add(LabelPerejil_Molido);							
			
			JLabel ImagenPerejil_Molido = new JLabel(" ");
			ImagenPerejil_Molido.setIcon(new ImageIcon(Pagina2.class.getResource("/Imagenes/perejil molido.png")));
			ImagenPerejil_Molido.setBounds(1800, 846, 91, 111);
			contentPane.add(ImagenPerejil_Molido);
			
			
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
			
			JLabel lblNewLabel_1_6 = new JLabel("precio");
			lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_6.setBounds(40, 955, 46, 14);
			contentPane.add(lblNewLabel_1_6);
			
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
			
			JLabel lblNewLabel_12 = new JLabel("precio");
			lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_12.setBounds(200, 955, 46, 14);
			contentPane.add(lblNewLabel_12);
			
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
			
			JLabel lblNewLabel_1_7 = new JLabel("precio");
			lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_7.setBounds(360, 955, 46, 14);
			contentPane.add(lblNewLabel_1_7);
			
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
			
			JLabel lblNewLabel_1_04 = new JLabel("precio");
			lblNewLabel_1_04.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_04.setBounds(520, 955, 46, 14);
			contentPane.add(lblNewLabel_1_04);
			
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
			
			JLabel lblNewLabel_1_08 = new JLabel("precio");
			lblNewLabel_1_08.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_08.setBounds(680, 775, 46, 14);
			contentPane.add(lblNewLabel_1_08);
			
			JLabel lblNewLabel_1_09 = new JLabel("precio");
			lblNewLabel_1_09.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_09.setBounds(680, 955, 46, 14);
			contentPane.add(lblNewLabel_1_09);
			
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
			
			JLabel lblNewLabel_1_103 = new JLabel("precio");
			lblNewLabel_1_103.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_103.setBounds(840, 775, 46, 14);
			contentPane.add(lblNewLabel_1_103);
			
			JLabel lblNewLabel_1_104 = new JLabel("precio");
			lblNewLabel_1_104.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_104.setBounds(840, 955, 46, 14);
			contentPane.add(lblNewLabel_1_104);
			
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
			
			JLabel lblNewLabel_1_108 = new JLabel("precio");
			lblNewLabel_1_108.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_108.setBounds(1000, 775, 46, 14);
			contentPane.add(lblNewLabel_1_108);
			
			JLabel lblNewLabel_1_109 = new JLabel("precio");
			lblNewLabel_1_109.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_109.setBounds(1000, 955, 46, 14);
			contentPane.add(lblNewLabel_1_109);
			
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
			
			JLabel lblNewLabel_1_113 = new JLabel("precio");
			lblNewLabel_1_113.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_113.setBounds(1160, 775, 46, 14);
			contentPane.add(lblNewLabel_1_113);
			
			JLabel lblNewLabel_1_114 = new JLabel("precio");
			lblNewLabel_1_114.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_114.setBounds(1160, 955, 46, 14);
			contentPane.add(lblNewLabel_1_114);
			
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
			
			JLabel lblNewLabel_1_118 = new JLabel("precio");
			lblNewLabel_1_118.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_118.setBounds(1320, 775, 46, 14);
			contentPane.add(lblNewLabel_1_118);
			
			JLabel lblNewLabel_1_119 = new JLabel("precio");
			lblNewLabel_1_119.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_119.setBounds(1320, 955, 46, 14);
			contentPane.add(lblNewLabel_1_119);
			
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
			
			JLabel lblNewLabel_1_115_4 = new JLabel("precio");
			lblNewLabel_1_115_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_115_4.setBounds(1480, 775, 46, 14);
			contentPane.add(lblNewLabel_1_115_4);
			
			JLabel lblNewLabel_1_115_5 = new JLabel("precio");
			lblNewLabel_1_115_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_115_5.setBounds(1480, 955, 46, 14);
			contentPane.add(lblNewLabel_1_115_5);
			
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
			
			JLabel lblNewLabel_1_115_9 = new JLabel("precio");
			lblNewLabel_1_115_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_115_9.setBounds(1640, 775, 46, 14);
			contentPane.add(lblNewLabel_1_115_9);
			
			JLabel lblNewLabel_1_115_10 = new JLabel("precio");
			lblNewLabel_1_115_10.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_115_10.setBounds(1640, 955, 46, 14);
			contentPane.add(lblNewLabel_1_115_10);
			
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
			
			JLabel lblNewLabel_1_115_14 = new JLabel("precio");
			lblNewLabel_1_115_14.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_115_14.setBounds(1800, 775, 46, 14);
			contentPane.add(lblNewLabel_1_115_14);
			
			JLabel lblNewLabel_1_115_15 = new JLabel("precio");
			lblNewLabel_1_115_15.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_115_15.setBounds(1800, 955, 46, 14);
			contentPane.add(lblNewLabel_1_115_15);
			
			
			
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
			
			JLabel lblNewLabel_2_4 = new JLabel("Peso kg");
			lblNewLabel_2_4.setBounds(90, 955, 46, 14);
			contentPane.add(lblNewLabel_2_4);
			
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
			
			JLabel lblNewLabel_2_9 = new JLabel("Peso kg");
			lblNewLabel_2_9.setBounds(250, 955, 46, 14);
			contentPane.add(lblNewLabel_2_9);
			
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
			
			JLabel lblNewLabel_2_14 = new JLabel("Peso kg");
			lblNewLabel_2_14.setBounds(410, 955, 46, 14);
			contentPane.add(lblNewLabel_2_14);
			
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
			
			JLabel lblNewLabel_2_19 = new JLabel("Peso kg");
			lblNewLabel_2_19.setBounds(570, 955, 46, 14);
			contentPane.add(lblNewLabel_2_19);
			
			JLabel lblNewLabel_2_20 = new JLabel("Peso kg");
			lblNewLabel_2_20.setBounds(730, 235, 46, 14);
			contentPane.add(lblNewLabel_2_20);
			
			JLabel lblNewLabel_2_21 = new JLabel("Peso kg");
			lblNewLabel_2_21.setBounds(730, 415, 46, 14);
			contentPane.add(lblNewLabel_2_21);
			
			JLabel lblNewLabel_2_22 = new JLabel("Peso kg");
			lblNewLabel_2_22.setBounds(730, 595, 46, 14);
			contentPane.add(lblNewLabel_2_22);
			
			JLabel lblNewLabel_2_23 = new JLabel("Peso kg");
			lblNewLabel_2_23.setBounds(730, 775, 46, 14);
			contentPane.add(lblNewLabel_2_23);
			
			JLabel lblNewLabel_2_24 = new JLabel("Peso kg");
			lblNewLabel_2_24.setBounds(730, 955, 46, 14);
			contentPane.add(lblNewLabel_2_24);
			
			JLabel lblNewLabel_2_25 = new JLabel("Peso kg");
			lblNewLabel_2_25.setBounds(890, 235, 46, 14);
			contentPane.add(lblNewLabel_2_25);
			
			JLabel lblNewLabel_2_26 = new JLabel("Peso kg");
			lblNewLabel_2_26.setBounds(890, 415, 46, 14);
			contentPane.add(lblNewLabel_2_26);
			
			JLabel lblNewLabel_2_27 = new JLabel("Peso kg");
			lblNewLabel_2_27.setBounds(890, 595, 46, 14);
			contentPane.add(lblNewLabel_2_27);
			
			JLabel lblNewLabel_2_28 = new JLabel("Peso kg");
			lblNewLabel_2_28.setBounds(890, 775, 46, 14);
			contentPane.add(lblNewLabel_2_28);
			
			JLabel lblNewLabel_2_29 = new JLabel("Peso kg");
			lblNewLabel_2_29.setBounds(890, 955, 46, 14);
			contentPane.add(lblNewLabel_2_29);
			
			JLabel lblNewLabel_2_30 = new JLabel("Peso kg");
			lblNewLabel_2_30.setBounds(1050, 235, 46, 14);
			contentPane.add(lblNewLabel_2_30);
			
			JLabel lblNewLabel_2_31 = new JLabel("Peso kg");
			lblNewLabel_2_31.setBounds(1050, 415, 46, 14);
			contentPane.add(lblNewLabel_2_31);
			
			JLabel lblNewLabel_2_32 = new JLabel("Peso kg");
			lblNewLabel_2_32.setBounds(1050, 595, 46, 14);
			contentPane.add(lblNewLabel_2_32);
			
			JLabel lblNewLabel_2_33 = new JLabel("Peso kg");
			lblNewLabel_2_33.setBounds(1050, 775, 46, 14);
			contentPane.add(lblNewLabel_2_33);
			
			JLabel lblNewLabel_2_34 = new JLabel("Peso kg");
			lblNewLabel_2_34.setBounds(1050, 955, 46, 14);
			contentPane.add(lblNewLabel_2_34);
			
			JLabel lblNewLabel_2_35 = new JLabel("Peso kg");
			lblNewLabel_2_35.setBounds(1210, 235, 46, 14);
			contentPane.add(lblNewLabel_2_35);
			
			JLabel lblNewLabel_2_36 = new JLabel("Peso kg");
			lblNewLabel_2_36.setBounds(1210, 415, 46, 14);
			contentPane.add(lblNewLabel_2_36);
			
			JLabel lblNewLabel_2_37 = new JLabel("Peso kg");
			lblNewLabel_2_37.setBounds(1210, 595, 46, 14);
			contentPane.add(lblNewLabel_2_37);
			
			JLabel lblNewLabel_2_38 = new JLabel("Peso kg");
			lblNewLabel_2_38.setBounds(1210, 775, 46, 14);
			contentPane.add(lblNewLabel_2_38);
			
			JLabel lblNewLabel_2_39 = new JLabel("Peso kg");
			lblNewLabel_2_39.setBounds(1210, 955, 46, 14);
			contentPane.add(lblNewLabel_2_39);
			
			JLabel lblNewLabel_2_40 = new JLabel("Peso kg");
			lblNewLabel_2_40.setBounds(1370, 235, 46, 14);
			contentPane.add(lblNewLabel_2_40);
			
			JLabel lblNewLabel_2_41 = new JLabel("Peso kg");
			lblNewLabel_2_41.setBounds(1370, 415, 46, 14);
			contentPane.add(lblNewLabel_2_41);
			
			JLabel lblNewLabel_2_42 = new JLabel("Peso kg");
			lblNewLabel_2_42.setBounds(1370, 595, 46, 14);
			contentPane.add(lblNewLabel_2_42);
			
			JLabel lblNewLabel_2_43 = new JLabel("Peso kg");
			lblNewLabel_2_43.setBounds(1370, 775, 46, 14);
			contentPane.add(lblNewLabel_2_43);
			
			JLabel lblNewLabel_2_44 = new JLabel("Peso kg");
			lblNewLabel_2_44.setBounds(1370, 955, 46, 14);
			contentPane.add(lblNewLabel_2_44);
			
			JLabel lblNewLabel_2_45 = new JLabel("Peso kg");
			lblNewLabel_2_45.setBounds(1530, 235, 46, 14);
			contentPane.add(lblNewLabel_2_45);
			
			JLabel lblNewLabel_2_46 = new JLabel("Peso kg");
			lblNewLabel_2_46.setBounds(1530, 415, 46, 14);
			contentPane.add(lblNewLabel_2_46);
			
			JLabel lblNewLabel_2_47 = new JLabel("Peso kg");
			lblNewLabel_2_47.setBounds(1530, 595, 46, 14);
			contentPane.add(lblNewLabel_2_47);
			
			JLabel lblNewLabel_2_48 = new JLabel("Peso kg");
			lblNewLabel_2_48.setBounds(1530, 775, 46, 14);
			contentPane.add(lblNewLabel_2_48);
			
			JLabel lblNewLabel_2_49 = new JLabel("Peso kg");
			lblNewLabel_2_49.setBounds(1530, 955, 46, 14);
			contentPane.add(lblNewLabel_2_49);
			
			JLabel lblNewLabel_2_50 = new JLabel("Peso kg");
			lblNewLabel_2_50.setBounds(1690, 235, 46, 14);
			contentPane.add(lblNewLabel_2_50);
			
			JLabel lblNewLabel_2_51 = new JLabel("Peso kg");
			lblNewLabel_2_51.setBounds(1690, 415, 46, 14);
			contentPane.add(lblNewLabel_2_51);
			
			JLabel lblNewLabel_2_52 = new JLabel("Peso kg");
			lblNewLabel_2_52.setBounds(1690, 595, 46, 14);
			contentPane.add(lblNewLabel_2_52);
			
			JLabel lblNewLabel_2_53 = new JLabel("Peso kg");
			lblNewLabel_2_53.setBounds(1690, 775, 46, 14);
			contentPane.add(lblNewLabel_2_53);
			
			JLabel lblNewLabel_2_54 = new JLabel("Peso kg");
			lblNewLabel_2_54.setBounds(1690, 955, 46, 14);
			contentPane.add(lblNewLabel_2_54);
			
			JLabel lblNewLabel_2_55 = new JLabel("Peso kg");
			lblNewLabel_2_55.setBounds(1850, 235, 46, 14);
			contentPane.add(lblNewLabel_2_55);
			
			JLabel lblNewLabel_2_56 = new JLabel("Peso kg");
			lblNewLabel_2_56.setBounds(1850, 415, 46, 14);
			contentPane.add(lblNewLabel_2_56);
			
			JLabel lblNewLabel_2_57 = new JLabel("Peso kg");
			lblNewLabel_2_57.setBounds(1850, 595, 46, 14);
			contentPane.add(lblNewLabel_2_57);
			
			JLabel lblNewLabel_2_58 = new JLabel("Peso kg");
			lblNewLabel_2_58.setBounds(1850, 775, 46, 14);
			contentPane.add(lblNewLabel_2_58);
			
			JLabel lblNewLabel_2_59 = new JLabel("Peso kg");
			lblNewLabel_2_59.setBounds(1850, 955, 46, 14);
			contentPane.add(lblNewLabel_2_59);
	}

}
