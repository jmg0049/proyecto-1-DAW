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

public class CtgProductosAnimales extends JFrame {

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
					CtgProductosAnimales frame = new CtgProductosAnimales();
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
	public CtgProductosAnimales() {
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
		
		JButton SumBacalaoTroceado = new JButton("+1");
		SumBacalaoTroceado.setBounds(1145, 430, 55, 23);
		contentPane.add(SumBacalaoTroceado);
		
		JButton ResBacalaoTroceado = new JButton("-1");
		ResBacalaoTroceado.setBounds(1210, 430, 55, 23);
		contentPane.add(ResBacalaoTroceado);
		
		JButton SumBeicon = new JButton("+1");
		SumBeicon.setBounds(1305, 430, 55, 23);
		contentPane.add(SumBeicon);
		
		JButton ResBeicon = new JButton("-1");
		ResBeicon.setBounds(1370, 430, 55, 23);
		contentPane.add(ResBeicon);
		
		JButton SumBerenjenas = new JButton("+1");
		SumBerenjenas.setBounds(1465, 430, 55, 23);
		contentPane.add(SumBerenjenas);
		
		JButton ResBerenjenas = new JButton("-1");
		ResBerenjenas.setBounds(1530, 430, 55, 23);
		contentPane.add(ResBerenjenas);
		
		JButton SumBogavante = new JButton("+1");
		SumBogavante.setBounds(1625, 430, 55, 23);
		contentPane.add(SumBogavante);
		
		JButton ResBogavante = new JButton("-1");
		ResBogavante.setBounds(1690, 430, 55, 23);
		contentPane.add(ResBogavante);
		
		JButton SumBrocoli = new JButton("+1");
		SumBrocoli.setBounds(1785, 430, 55, 23);
		contentPane.add(SumBrocoli);
		
		JButton ResBrocoli = new JButton("-1");
		ResBrocoli.setBounds(1850, 430, 55, 23);
		contentPane.add(ResBrocoli);
		
		/*Botones añadir productos a la cesta tercera fila*/
		JButton SumCaballaTroceada = new JButton("+1");
		SumCaballaTroceada.setBounds(25, 613, 55, 23);
		contentPane.add(SumCaballaTroceada);
		
		JButton ResCaballaTroceada = new JButton("-1");
		ResCaballaTroceada.setBounds(90, 613, 55, 23);
		contentPane.add(ResCaballaTroceada);
		
		JButton SumCacahuetes = new JButton("+1");
		SumCacahuetes.setBounds(185, 613, 55, 23);
		contentPane.add(SumCacahuetes);
		
		JButton ResCacahuetes = new JButton("-1");
		ResCacahuetes.setBounds(250, 613, 55, 23);
		contentPane.add(ResCacahuetes);
		
		JButton SumCalamarEntero = new JButton("+1");
		SumCalamarEntero.setBounds(345, 613, 55, 23);
		contentPane.add(SumCalamarEntero);
		
		JButton ResCalamarEntero = new JButton("-1");
		ResCalamarEntero.setBounds(410, 613, 55, 23);
		contentPane.add(ResCalamarEntero);
		
		JButton SumCalamarTroceado = new JButton("+1");
		SumCalamarTroceado.setBounds(505, 613, 55, 23);
		contentPane.add(SumCalamarTroceado);
		
		JButton ResCalamarTroceado = new JButton("-1");
		ResCalamarTroceado.setBounds(570, 613, 55, 23);
		contentPane.add(ResCalamarTroceado);
		
		JButton SumCanelaEnBarra = new JButton("+1");
		SumCanelaEnBarra.setBounds(665, 613, 55, 23);
		contentPane.add(SumCanelaEnBarra);
		
		JButton ResCanelaEnBarra = new JButton("-1");
		ResCanelaEnBarra.setBounds(730, 613, 55, 23);
		contentPane.add(ResCanelaEnBarra);
		
		JButton SumCanelaMolida = new JButton("+1");
		SumCanelaMolida.setBounds(825, 613, 55, 23);
		contentPane.add(SumCanelaMolida);
		
		JButton ResCanelaMolida = new JButton("-1");
		ResCanelaMolida.setBounds(890, 613, 55, 23);
		contentPane.add(ResCanelaMolida);
		
		JButton SumCangrejo = new JButton("+1");
		SumCangrejo.setBounds(985, 613, 55, 23);
		contentPane.add(SumCangrejo);
		
		JButton ResCangrejo = new JButton("-1");
		ResCangrejo.setBounds(1050, 613, 55, 23);
		contentPane.add(ResCangrejo);
		
		JButton SumCañaLomo = new JButton("+1");
		SumCañaLomo.setBounds(1145, 613, 55, 23);
		contentPane.add(SumCañaLomo);
		
		JButton ResCañaLomo = new JButton("-1");
		ResCañaLomo.setBounds(1210, 613, 55, 23);
		contentPane.add(ResCañaLomo);
		
		JButton SumCarnePicadaCerdo = new JButton("+1");
		SumCarnePicadaCerdo.setBounds(1305, 613, 55, 23);
		contentPane.add(SumCarnePicadaCerdo);
		
		JButton ResCarnePicadaCerdo = new JButton("-1");
		ResCarnePicadaCerdo.setBounds(1370, 613, 55, 23);
		contentPane.add(ResCarnePicadaCerdo);
		
		JButton SumCarnePicadaPavo = new JButton("+1");
		SumCarnePicadaPavo.setBounds(1465, 613, 55, 23);
		contentPane.add(SumCarnePicadaPavo);
		
		JButton ResCarnePicadaPavo = new JButton("-1");
		ResCarnePicadaPavo.setBounds(1530, 613, 55, 23);
		contentPane.add(ResCarnePicadaPavo);
		
		JButton SumCarnePicadaPollo = new JButton("+1");
		SumCarnePicadaPollo.setBounds(1625, 613, 55, 23);
		contentPane.add(SumCarnePicadaPollo);
		
		JButton ResCarnePicadaPollo = new JButton("-1");
		ResCarnePicadaPollo.setBounds(1690, 613, 55, 23);
		contentPane.add(ResCarnePicadaPollo);
		
		JButton SumCarnePicadaTernera = new JButton("+1");
		SumCarnePicadaTernera.setBounds(1785, 613, 55, 23);
		contentPane.add(SumCarnePicadaTernera);
		
		JButton ResCarnePicadaTernera = new JButton("-1");
		ResCarnePicadaTernera.setBounds(1850, 613, 55, 23);
		contentPane.add(ResCarnePicadaTernera);
		
		/*Botones añadir productos a la cesta cuarta fila*/
		JButton SumCastañas = new JButton("+1");
		SumCastañas.setBounds(25, 790, 55, 23);
		contentPane.add(SumCastañas);
		
		JButton ResCastañas = new JButton("-1");
		ResCastañas.setBounds(90, 790, 55, 23);
		contentPane.add(ResCastañas);
		
		JButton SumCazonTroceado = new JButton("+1");
		SumCazonTroceado.setBounds(185, 790, 55, 23);
		contentPane.add(SumCazonTroceado);
		
		JButton ResCazonTroceado = new JButton("-1");
		ResCazonTroceado.setBounds(250, 790, 55, 23);
		contentPane.add(ResCazonTroceado);
		
		JButton SumCebollaBlanca = new JButton("+1");
		SumCebollaBlanca.setBounds(345, 790, 55, 23);
		contentPane.add(SumCebollaBlanca);
		
		JButton ResCebollaBlanca = new JButton("-1");
		ResCebollaBlanca.setBounds(410, 790, 55, 23);
		contentPane.add(ResCebollaBlanca);
		
		JButton SumCebollaMorada = new JButton("+1");
		SumCebollaMorada.setBounds(505, 790, 55, 23);
		contentPane.add(SumCebollaMorada);
		
		JButton ResCebollaMorada = new JButton("-1");
		ResCebollaMorada.setBounds(570, 790, 55, 23);
		contentPane.add(ResCebollaMorada);
		
		JButton SumCerezas = new JButton("+1");
		SumCerezas.setBounds(665, 790, 55, 23);
		contentPane.add(SumCerezas);
		
		JButton ResCerezas = new JButton("-1");
		ResCerezas.setBounds(730, 790, 55, 23);
		contentPane.add(ResCerezas);
		
		JButton SumChorizoDulce = new JButton("+1");
		SumChorizoDulce.setBounds(825, 790, 55, 23);
		contentPane.add(SumChorizoDulce);
		
		JButton ResChorizoDulce = new JButton("-1");
		ResChorizoDulce.setBounds(890, 790, 55, 23);
		contentPane.add(ResChorizoDulce);
		
		JButton SumChorizoPicante = new JButton("+1");
		SumChorizoPicante.setBounds(985, 790, 55, 23);
		contentPane.add(SumChorizoPicante);
		
		JButton ResChorizoPicante = new JButton("-1");
		ResChorizoPicante.setBounds(1050, 790, 55, 23);
		contentPane.add(ResChorizoPicante);
		
		JButton SumChuetaCerdo = new JButton("+1");
		SumChuetaCerdo.setBounds(1145, 790, 55, 23);
		contentPane.add(SumChuetaCerdo);
		
		JButton ResChuetaCerdo = new JButton("-1");
		ResChuetaCerdo.setBounds(1210, 790, 55, 23);
		contentPane.add(ResChuetaCerdo);
		
		JButton SumChuetaCordero = new JButton("+1");
		SumChuetaCordero.setBounds(1305, 790, 55, 23);
		contentPane.add(SumChuetaCordero);
		
		JButton ResChuetaCordero = new JButton("-1");
		ResChuetaCordero.setBounds(1370, 790, 55, 23);
		contentPane.add(ResChuetaCordero);
		
		JButton SumChuetaTernera = new JButton("+1");
		SumChuetaTernera.setBounds(1465, 790, 55, 23);
		contentPane.add(SumChuetaTernera);
		
		JButton ResChuetaTernera = new JButton("-1");
		ResChuetaTernera.setBounds(1530, 790, 55, 23);
		contentPane.add(ResChuetaTernera);
		
		JButton SumCocoMarron = new JButton("+1");
		SumCocoMarron.setBounds(1625, 790, 55, 23);
		contentPane.add(SumCocoMarron);
		
		JButton ResCocoMarron = new JButton("-1");
		ResCocoMarron.setBounds(1690, 790, 55, 23);
		contentPane.add(ResCocoMarron);
		
		JButton SumCocoVerde = new JButton("+1");
		SumCocoVerde.setBounds(1785, 790, 55, 23);
		contentPane.add(SumCocoVerde);
		
		JButton ResCocoVerde = new JButton("-1");
		ResCocoVerde.setBounds(1850, 790, 55, 23);
		contentPane.add(ResCocoVerde);
		
		/*Botones añadir productos a la cesta quinta fila*/
		JButton SumColiflor = new JButton("+1");
		SumColiflor.setBounds(25, 970, 55, 23);
		contentPane.add(SumColiflor);
		
		JButton ResColiflor = new JButton("-1");
		ResColiflor.setBounds(90, 970, 55, 23);
		contentPane.add(ResColiflor);
		
		JButton SumCominoMolido = new JButton("+1");
		SumCominoMolido.setBounds(185, 970, 55, 23);
		contentPane.add(SumCominoMolido);
		
		JButton ResCominoMolido = new JButton("-1");
		ResCominoMolido.setBounds(250, 970, 55, 23);
		contentPane.add(ResCominoMolido);
		
		JButton SumCostillasCerdo = new JButton("+1");
		SumCostillasCerdo.setBounds(345, 970, 55, 23);
		contentPane.add(SumCostillasCerdo);
		
		JButton ResCostillasCerdo = new JButton("-1");
		ResCostillasCerdo.setBounds(410, 970, 55, 23);
		contentPane.add(ResCostillasCerdo);
		
		JButton SumFileteBacalao = new JButton("+1");
		SumFileteBacalao.setBounds(505, 970, 55, 23);
		contentPane.add(SumFileteBacalao);
		
		JButton ResFileteBacalao = new JButton("-1");
		ResFileteBacalao.setBounds(570, 970, 55, 23);
		contentPane.add(ResFileteBacalao);
		
		JButton SumFileteCaballa = new JButton("+1");
		SumFileteCaballa.setBounds(665, 970, 55, 23);
		contentPane.add(SumFileteCaballa);
		
		JButton ResFileteCaballa = new JButton("-1");
		ResFileteCaballa.setBounds(730, 970, 55, 23);
		contentPane.add(ResFileteCaballa);
		
		JButton SumFileteCazon = new JButton("+1");
		SumFileteCazon.setBounds(825, 970, 55, 23);
		contentPane.add(SumFileteCazon);
		
		JButton ResFileteCazon = new JButton("-1");
		ResFileteCazon.setBounds(890, 970, 55, 23);
		contentPane.add(ResFileteCazon);
		
		JButton SumFileteCerdo = new JButton("+1");
		SumFileteCerdo.setBounds(985, 970, 55, 23);
		contentPane.add(SumFileteCerdo);
		
		JButton ResFileteCerdo = new JButton("-1");
		ResFileteCerdo.setBounds(1050, 970, 55, 23);
		contentPane.add(ResFileteCerdo);
		
		JButton SumFileteCordero = new JButton("+1");
		SumFileteCordero.setBounds(1145, 970, 55, 23);
		contentPane.add(SumFileteCordero);
		
		JButton ResFileteCordero = new JButton("-1");
		ResFileteCordero.setBounds(1210, 970, 55, 23);
		contentPane.add(ResFileteCordero);
		
		JButton SumFileteMerluza = new JButton("+1");
		SumFileteMerluza.setBounds(1305, 970, 55, 23);
		contentPane.add(SumFileteMerluza);
		
		JButton ResFileteMerluza = new JButton("-1");
		ResFileteMerluza.setBounds(1370, 970, 55, 23);
		contentPane.add(ResFileteMerluza);
		
		JButton SumFiletePavo = new JButton("+1");
		SumFiletePavo.setBounds(1465, 970, 55, 23);
		contentPane.add(SumFiletePavo);
		
		JButton ResFiletePavo = new JButton("-1");
		ResFiletePavo.setBounds(1530, 970, 55, 23);
		contentPane.add(ResFiletePavo);
		
		JButton SumFiletePollo = new JButton("+1");
		SumFiletePollo.setBounds(1625, 970, 55, 23);
		contentPane.add(SumFiletePollo);
		
		JButton ResFiletePollo = new JButton("-1");
		ResFiletePollo.setBounds(1690, 970, 55, 23);
		contentPane.add(ResFiletePollo);
		
		JButton SumFileteSalmon = new JButton("+1");
		SumFileteSalmon.setBounds(1785, 970, 55, 23);
		contentPane.add(SumFileteSalmon);
		
		JButton ResFileteSalmon = new JButton("-1");
		ResFileteSalmon.setBounds(1850, 970, 55, 23);
		contentPane.add(ResFileteSalmon);
		
		
		JLabel Cestas = new JLabel("");
		Cestas.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Cesta frame = new Cesta();
				frame.setVisible(true);
				
			}
		});
		Cestas.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/MegaMarket.png")));
		Cestas.setHorizontalAlignment(SwingConstants.CENTER);
		Cestas.setBounds(86, -15, 147, 133);
		
		contentPane.add(Cestas);
						
		
		//Botones para cambiar de página
		JLabel pagina1 = new JLabel("1");
		pagina1.setForeground(new Color(128, 0, 255));
		pagina1.setBounds(800, 66, 35, 14);
		contentPane.add(pagina1);
		
		JLabel pagina2 = new JLabel("2");
		pagina2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CtgProductosAnimales2 frame = new CtgProductosAnimales2();
				frame.setVisible(true);
			}
			});
		pagina2.setBounds(845, 66, 35, 14);
		contentPane.add(pagina2);
				
		
		/*Todos los productos*/
		JMenuBar Inventario = new JMenuBar();
		Inventario.setBounds(276, 11, 101, 22);
		contentPane.add(Inventario);
		
		JMenu Articulos = new JMenu("Categoría");
		Inventario.add(Articulos);
		
		
		/*Todos los productos de origen animal*/
		JMenu Productos_Animales = new JMenu("Productos Animales");
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
			
			/*Primera Página*/
			
			/*Productos primera fila*/
			JLabel LabelAlmejas = new JLabel("Almejas");
			LabelAlmejas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAlmejas.setBounds(40, 126, 104, 14);
			contentPane.add(LabelAlmejas);
			
			JLabel ImagenAlmejas = new JLabel("");
			ImagenAlmejas.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/almejas.png")));
			ImagenAlmejas.setBounds(40, 126, 91, 111);
			contentPane.add(ImagenAlmejas);
			
			JLabel LabelAngulas = new JLabel("Angulas");
			LabelAngulas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelAngulas.setBounds(200, 126, 104, 14);
			contentPane.add(LabelAngulas);
			
			JLabel ImagenAngulas = new JLabel("");
			ImagenAngulas.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/Angulas.png")));
			ImagenAngulas.setBounds(200, 126, 91, 111);
			contentPane.add(ImagenAngulas);
			
			JLabel LabelBacalao_Troceado = new JLabel("Bacalao Troceado");
			LabelBacalao_Troceado.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelBacalao_Troceado.setBounds(360, 126, 104, 14);
			contentPane.add(LabelBacalao_Troceado);
			
			JLabel ImagenBacalao_Troceado = new JLabel("");
			ImagenBacalao_Troceado.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/Bacalao troceado.png")));
			ImagenBacalao_Troceado.setBounds(360, 126, 91, 111);
			contentPane.add(ImagenBacalao_Troceado);
			
			JLabel LabelBeicon = new JLabel("Beicon");
			LabelBeicon.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelBeicon.setBounds(520, 126, 104, 14);
			contentPane.add(LabelBeicon);
			
			JLabel ImagenBeicon = new JLabel("");
			ImagenBeicon.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/beicon.png")));
			ImagenBeicon.setBounds(520, 126, 91, 111);
			contentPane.add(ImagenBeicon);
			
			JLabel LabelBogavante = new JLabel("Bogavante");
			LabelBogavante.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelBogavante.setBounds(680, 126, 104, 14);
			contentPane.add(LabelBogavante);
			
			JLabel ImagenBogavante = new JLabel(" ");
			ImagenBogavante.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/bogavante.png")));
			ImagenBogavante.setBounds(680, 126, 91, 111);
			contentPane.add(ImagenBogavante);
				
			JLabel LabelCaballa_Troceada = new JLabel("Caballa Troceada");
			LabelCaballa_Troceada.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelCaballa_Troceada.setBounds(840, 126, 104, 14);
			contentPane.add(LabelCaballa_Troceada);
			
			JLabel ImagenCaballa_Troceada = new JLabel(" ");
			ImagenCaballa_Troceada.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/caballa troceada.png")));
			ImagenCaballa_Troceada.setBounds(840, 126, 91, 111);
			contentPane.add(ImagenCaballa_Troceada);
			
			JLabel LabelCalamar = new JLabel("Calamar");
			LabelCalamar.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelCalamar.setBounds(1000, 126, 104, 14);
			contentPane.add(LabelCalamar);
			
			JLabel ImagenCalamar = new JLabel(" ");
			ImagenCalamar.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/calamares.png")));
			ImagenCalamar.setBounds(1000, 126, 91, 111);
			contentPane.add(ImagenCalamar);
			
			JLabel LabelCalamar_Troceado = new JLabel("Calamar Troceado");
			LabelCalamar_Troceado.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelCalamar_Troceado.setBounds(1160, 126, 104, 14);
			contentPane.add(LabelCalamar_Troceado);
			
			JLabel ImagenCalamar_Troceado = new JLabel(" ");
			ImagenCalamar_Troceado.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/calamar troceado.png")));
			ImagenCalamar_Troceado.setBounds(1160, 126, 91, 111);
			contentPane.add(ImagenCalamar_Troceado);
			
			JLabel LabelCangrejo = new JLabel("Cangrejo");
			LabelCangrejo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelCangrejo.setBounds(1320, 126, 104, 14);
			contentPane.add(LabelCangrejo);
			
			JLabel ImagenCangrejo = new JLabel(" ");
			ImagenCangrejo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/cangrejo.png")));
			ImagenCangrejo.setBounds(1320, 126, 91, 111);
			contentPane.add(ImagenCangrejo);
						
			JLabel LabelCaña_de_lomo = new JLabel("Caña de lomo");
			LabelCaña_de_lomo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelCaña_de_lomo.setBounds(1480, 126, 104, 14);
			contentPane.add(LabelCaña_de_lomo);
			
			JLabel ImagenCaña_de_lomo = new JLabel(" ");
			ImagenCaña_de_lomo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/caña de lomo.png")));
			ImagenCaña_de_lomo.setBounds(1480, 126, 91, 111);
			contentPane.add(ImagenCaña_de_lomo);
			
			JLabel LabelCarne_picada_de_cerdo = new JLabel("Carne picada de cerdo");
			LabelCarne_picada_de_cerdo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelCarne_picada_de_cerdo.setBounds(1640, 126, 104, 14);
			contentPane.add(LabelCarne_picada_de_cerdo);
			
			JLabel ImagenCarne_picada_de_cerdo = new JLabel(" ");
			ImagenCarne_picada_de_cerdo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/carne picada de cerdo.png")));
			ImagenCarne_picada_de_cerdo.setBounds(1640, 126, 91, 111);
			contentPane.add(ImagenCarne_picada_de_cerdo);
			
			JLabel LabelCarne_picada_de_pavo = new JLabel("Carne picada de pavo");
			LabelCarne_picada_de_pavo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelCarne_picada_de_pavo.setBounds(1800, 126, 104, 14);
			contentPane.add(LabelCarne_picada_de_pavo);
			
			JLabel ImagenCarne_picada_de_pavo = new JLabel(" ");
			ImagenCarne_picada_de_pavo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/carne picada de pavo.png")));
			ImagenCarne_picada_de_pavo.setBounds(1800, 126, 91, 111);
			contentPane.add(ImagenCarne_picada_de_pavo);
			
			/*Productos segunda fila*/
			JLabel LabelCarne_picada_de_pollo = new JLabel("Carne picada de pollo");
			LabelCarne_picada_de_pollo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelCarne_picada_de_pollo.setBounds(40, 306, 104, 14);
			contentPane.add(LabelCarne_picada_de_pollo);
			
			JLabel ImagenCarne_picada_de_pollo = new JLabel(" ");
			ImagenCarne_picada_de_pollo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/carne picada de pollo.png")));
			ImagenCarne_picada_de_pollo.setBounds(40, 306, 91, 111);
			contentPane.add(ImagenCarne_picada_de_pollo);
						
			JLabel LabelCarne_picada_de_ternera = new JLabel("carne picada de ternera");
			LabelCarne_picada_de_ternera.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelCarne_picada_de_ternera.setBounds(200, 306, 104, 14);
			contentPane.add(LabelCarne_picada_de_ternera);
			
			JLabel ImagenCarne_picada_de_ternera = new JLabel(" ");
			ImagenCarne_picada_de_ternera.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/carne picada de ternera.png")));
			ImagenCarne_picada_de_ternera.setBounds(200, 306, 91, 111);
			contentPane.add(ImagenCarne_picada_de_ternera);
									
			JLabel LabelCazón_Troceado = new JLabel("Cazón troceado");
			LabelCazón_Troceado.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelCazón_Troceado.setBounds(360, 306, 104, 14);
			contentPane.add(LabelCazón_Troceado);
			
			JLabel ImagenCazón_Troceado = new JLabel(" ");
			ImagenCazón_Troceado.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/cazón troceado.png")));
			ImagenCazón_Troceado.setBounds(360, 306, 91, 111);
			contentPane.add(ImagenCazón_Troceado);
			
			JLabel LabelChorizo_dulce = new JLabel("Chorizo dulce");
			LabelChorizo_dulce.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelChorizo_dulce.setBounds(520, 306, 104, 14);
			contentPane.add(LabelChorizo_dulce);
			
			JLabel ImagenChorizo_dulce = new JLabel(" ");
			ImagenChorizo_dulce.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/chorizo dulce.png")));
			ImagenChorizo_dulce.setBounds(520, 306, 91, 111);
			contentPane.add(ImagenChorizo_dulce);
									
			JLabel LabelChorizo_picante = new JLabel("Chorizo Picante");
			LabelChorizo_picante.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelChorizo_picante.setBounds(680, 306, 104, 14);
			contentPane.add(LabelChorizo_picante);
			
			JLabel ImagenChorizo_picante = new JLabel(" ");
			ImagenChorizo_picante.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/chorizo picante.png")));
			ImagenChorizo_picante.setBounds(680, 306, 91, 111);
			contentPane.add(ImagenChorizo_picante);
									
			JLabel LabelChuleta_de_cerdo = new JLabel("Chuleta de cerdo");
			LabelChuleta_de_cerdo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelChuleta_de_cerdo.setBounds(840, 306, 104, 14);
			contentPane.add(LabelChuleta_de_cerdo);
			
			JLabel ImagenChuleta_de_cerdo = new JLabel(" ");
			ImagenChuleta_de_cerdo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/chuleta de cerdo.png")));
			ImagenChuleta_de_cerdo.setBounds(840, 306, 91, 111);
			contentPane.add(ImagenChuleta_de_cerdo);
			
			JLabel LabelChuleta_de_cordero = new JLabel("Chuleta de cordero");
			LabelChuleta_de_cordero.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelChuleta_de_cordero.setBounds(1000, 306, 104, 14);
			contentPane.add(LabelChuleta_de_cordero);
			
			JLabel ImagenChuleta_de_cordero = new JLabel(" ");
			ImagenChuleta_de_cordero.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/chuleta de cordero.png")));
			ImagenChuleta_de_cordero.setBounds(1000, 306, 91, 111);
			contentPane.add(ImagenChuleta_de_cordero);
			
			JLabel LabelChuleta_de_ternera = new JLabel("Chuleta de ternera");
			LabelChuleta_de_ternera.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelChuleta_de_ternera.setBounds(1160, 306, 104, 14);
			contentPane.add(LabelChuleta_de_ternera);
			
			JLabel ImagenChuleta_de_ternera = new JLabel(" ");
			ImagenChuleta_de_ternera.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/chuleta de ternera.png")));
			ImagenChuleta_de_ternera.setBounds(1160, 306, 91, 111);
			contentPane.add(ImagenChuleta_de_ternera);
			
			JLabel LabelCostillas_de_cerdo = new JLabel("Costillas de cerdo");
			LabelCostillas_de_cerdo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelCostillas_de_cerdo.setBounds(1320, 306, 104, 14);
			contentPane.add(LabelCostillas_de_cerdo);
			
			JLabel ImagenCostillas_de_cerdo = new JLabel(" ");
			ImagenCostillas_de_cerdo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/costillas de cerdo.png")));
			ImagenCostillas_de_cerdo.setBounds(1320, 306, 91, 111);
			contentPane.add(ImagenCostillas_de_cerdo);
			
			JLabel LabelFilete_de_bacalao = new JLabel("Filete de bacalao");
			LabelFilete_de_bacalao.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFilete_de_bacalao.setBounds(1480, 306, 104, 14);
			contentPane.add(LabelFilete_de_bacalao);
			
			JLabel ImagenFilete_de_bacalao = new JLabel(" ");
			ImagenFilete_de_bacalao.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/filete de bacalao.png")));
			ImagenFilete_de_bacalao.setBounds(1480, 306, 91, 111);
			contentPane.add(ImagenFilete_de_bacalao);
			
			JLabel LabelFilete_de_caballa = new JLabel("Filete de caballa");
			LabelFilete_de_caballa.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFilete_de_caballa.setBounds(1640, 306, 104, 14);
			contentPane.add(LabelFilete_de_caballa);
			
			JLabel ImagenFilete_de_caballa = new JLabel(" ");
			ImagenFilete_de_caballa.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/filete de caballa.png")));
			ImagenFilete_de_caballa.setBounds(1640, 306, 91, 111);
			contentPane.add(ImagenFilete_de_caballa);
			
			JLabel LabelFilete_de_cazón = new JLabel("Filete de cazón");
			LabelFilete_de_cazón.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFilete_de_cazón.setBounds(1800, 306, 104, 14);
			contentPane.add(LabelFilete_de_cazón);
			
			JLabel ImagenFilete_de_cazón = new JLabel(" ");
			ImagenFilete_de_cazón.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/filete de cazón.png")));
			ImagenFilete_de_cazón.setBounds(1800, 306, 91, 111);
			contentPane.add(ImagenFilete_de_cazón);
			
			/*Productos tercera fila*/
			JLabel LabelFilete_de_cerdo = new JLabel("Filete de cerdo");
			LabelFilete_de_cerdo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFilete_de_cerdo.setBounds(40, 486, 104, 14);
			contentPane.add(LabelFilete_de_cerdo);
			
			JLabel ImagenFilete_de_cerdo = new JLabel(" ");
			ImagenFilete_de_cerdo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/filete de cerdo.png")));
			ImagenFilete_de_cerdo.setBounds(40, 486, 91, 111);
			contentPane.add(ImagenFilete_de_cerdo);
			
			JLabel LabelFilete_de_cordero = new JLabel("Filete de cordero");
			LabelFilete_de_cordero.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFilete_de_cordero.setBounds(200, 486, 104, 14);
			contentPane.add(LabelFilete_de_cordero);
			
			JLabel ImagenFilete_de_cordero = new JLabel(" ");
			ImagenFilete_de_cordero.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/filete de cordero.png")));
			ImagenFilete_de_cordero.setBounds(200, 486, 91, 111);
			contentPane.add(ImagenFilete_de_cordero);
			
			JLabel LabelFilete_de_merluza = new JLabel("Filete de merluza");
			LabelFilete_de_merluza.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFilete_de_merluza.setBounds(360, 486, 104, 14);
			contentPane.add(LabelFilete_de_merluza);
			
			JLabel ImagenFilete_de_merluza = new JLabel(" ");
			ImagenFilete_de_merluza.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/filete de merluza.png")));
			ImagenFilete_de_merluza.setBounds(360, 486, 91, 111);
			contentPane.add(ImagenFilete_de_merluza);
			
			JLabel LabelFilete_de_pavo = new JLabel("Filete de pavo");
			LabelFilete_de_pavo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFilete_de_pavo.setBounds(520, 486, 104, 14);
			contentPane.add(LabelFilete_de_pavo);
			
			JLabel ImagenFilete_de_pavo = new JLabel(" ");
			ImagenFilete_de_pavo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/filete de pavo.png")));
			ImagenFilete_de_pavo.setBounds(520, 486, 91, 111);
			contentPane.add(ImagenFilete_de_pavo);
			
			JLabel LabelFilete_de_pollo = new JLabel("Filete de pollo");
			LabelFilete_de_pollo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFilete_de_pollo.setBounds(680, 486, 104, 14);
			contentPane.add(LabelFilete_de_pollo);
			
			JLabel ImagenFilete_de_pollo = new JLabel(" ");
			ImagenFilete_de_pollo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/filete de pollo.png")));
			ImagenFilete_de_pollo.setBounds(680, 486, 91, 111);
			contentPane.add(ImagenFilete_de_pollo);
			
			JLabel LabelFilete_de_salmon = new JLabel("Filete de salmón");
			LabelFilete_de_salmon.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFilete_de_salmon.setBounds(840, 486, 104, 14);
			contentPane.add(LabelFilete_de_salmon);
			
			JLabel ImagenFilete_de_salmon = new JLabel(" ");
			ImagenFilete_de_salmon.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/filete de salmón.png")));
			ImagenFilete_de_salmon.setBounds(840, 486, 91, 111);
			contentPane.add(ImagenFilete_de_salmon);
			
			JLabel LabelFilete_de_ternera = new JLabel("Filete de ternera");
			LabelFilete_de_ternera.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFilete_de_ternera.setBounds(1000, 486, 104, 14);
			contentPane.add(LabelFilete_de_ternera);
			
			JLabel ImagenFilete_de_ternera = new JLabel(" ");
			ImagenFilete_de_ternera.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/filete de ternera.png")));
			ImagenFilete_de_ternera.setBounds(1000, 486, 91, 111);
			contentPane.add(ImagenFilete_de_ternera);
			
			JLabel LabelFuet = new JLabel("Fuet");
			LabelFuet.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelFuet.setBounds(1160, 486, 104, 14);
			contentPane.add(LabelFuet);
			
			JLabel ImagenFuet = new JLabel(" ");
			ImagenFuet.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/fuet.png")));
			ImagenFuet.setBounds(1160, 486, 91, 111);
			contentPane.add(ImagenFuet);
			
			JLabel LabelGambas = new JLabel("Gambas");
			LabelGambas.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelGambas.setBounds(1320, 486, 110, 14);
			contentPane.add(LabelGambas);
			
			JLabel ImagenGambas = new JLabel(" ");
			ImagenGambas.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/gambas.png")));
			ImagenGambas.setBounds(1320, 486, 91, 111);
			contentPane.add(ImagenGambas);
			
			JLabel LabelHamburguesa_de_cerdo = new JLabel("Hamburguesa de cerdo");
			LabelHamburguesa_de_cerdo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHamburguesa_de_cerdo.setBounds(1480, 486, 104, 14);
			contentPane.add(LabelHamburguesa_de_cerdo);
			
			JLabel ImagenHamburguesa_de_cerdo = new JLabel(" ");
			ImagenHamburguesa_de_cerdo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/hamburguesa de cerdo.png")));
			ImagenHamburguesa_de_cerdo.setBounds(1480, 486, 91, 111);
			contentPane.add(ImagenHamburguesa_de_cerdo);
			
			JLabel LabelHamburguesa_de_pavo = new JLabel("Hamburguesa de pavo");
			LabelHamburguesa_de_pavo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHamburguesa_de_pavo.setBounds(1640, 486, 104, 14);
			contentPane.add(LabelHamburguesa_de_pavo);
			
			JLabel ImagenHamburguesa_de_pavo = new JLabel(" ");
			ImagenHamburguesa_de_pavo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/hamburguesa de pavo.png")));
			ImagenHamburguesa_de_pavo.setBounds(1640, 486, 91, 111);
			contentPane.add(ImagenHamburguesa_de_pavo);
			
			JLabel LabelHamburguesa_de_pollo = new JLabel("Hamburguesa de pollo");
			LabelHamburguesa_de_pollo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHamburguesa_de_pollo.setBounds(1800, 486, 120, 14);
			contentPane.add(LabelHamburguesa_de_pollo);
			
			JLabel ImagenHamburguesa_de_pollo = new JLabel(" ");
			ImagenHamburguesa_de_pollo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/hamburguesa de pollo.png")));
			ImagenHamburguesa_de_pollo.setBounds(1800, 486, 91, 111);
			contentPane.add(ImagenHamburguesa_de_pollo);
			
			/*Productos cuarta fila*/
			JLabel LabelHamburguesa_de_ternera = new JLabel("Hamburguesa de ternera");
			LabelHamburguesa_de_ternera.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHamburguesa_de_ternera.setBounds(40, 666, 104, 14);
			contentPane.add(LabelHamburguesa_de_ternera);
			
			JLabel ImagenHamburguesa_de_ternera = new JLabel(" ");
			ImagenHamburguesa_de_ternera.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/hamburguesa de ternera.png")));
			ImagenHamburguesa_de_ternera.setBounds(40, 666, 91, 111);
			contentPane.add(ImagenHamburguesa_de_ternera);
			
			JLabel LabelHuevos_de_codorniz = new JLabel("Huevos de codorniz");
			LabelHuevos_de_codorniz.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHuevos_de_codorniz.setBounds(200, 666, 104, 14);
			contentPane.add(LabelHuevos_de_codorniz);
			
			JLabel ImagenHuevos_de_codorniz = new JLabel(" ");
			ImagenHuevos_de_codorniz.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/huevos de codorniz.png")));
			ImagenHuevos_de_codorniz.setBounds(200, 666, 91, 111);
			contentPane.add(ImagenHuevos_de_codorniz);
			
			JLabel LabelHuevos_de_gallina_blancos = new JLabel("Huevos de gallina blancos");
			LabelHuevos_de_gallina_blancos.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHuevos_de_gallina_blancos.setBounds(360, 666, 104, 14);
			contentPane.add(LabelHuevos_de_gallina_blancos);
			
			JLabel ImagenHuevos_de_gallina_blancos = new JLabel(" ");
			ImagenHuevos_de_gallina_blancos.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/huevos de gallina blancos.png")));
			ImagenHuevos_de_gallina_blancos.setBounds(360, 666, 91, 111);
			contentPane.add(ImagenHuevos_de_gallina_blancos);
			
			JLabel LabelHuevos_de_gallina_marrones = new JLabel("Huevos de gallina marrones");
			LabelHuevos_de_gallina_marrones.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelHuevos_de_gallina_marrones.setBounds(520, 666, 104, 14);
			contentPane.add(LabelHuevos_de_gallina_marrones);
			
			JLabel ImagenHuevos_de_gallina_marrones = new JLabel(" ");
			ImagenHuevos_de_gallina_marrones.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/huevos de gallina marrones.png")));
			ImagenHuevos_de_gallina_marrones.setBounds(520, 666, 91, 111);
			contentPane.add(ImagenHuevos_de_gallina_marrones);
			
			JLabel LabelJamón_de_bellota = new JLabel("Jamón de bellota");
			LabelJamón_de_bellota.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelJamón_de_bellota.setBounds(680, 666, 104, 14);
			contentPane.add(LabelJamón_de_bellota);
			
			JLabel ImagenJamón_de_bellota = new JLabel(" ");
			ImagenJamón_de_bellota.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/Jamón de bellota.png")));
			ImagenJamón_de_bellota.setBounds(680, 666, 91, 111);
			contentPane.add(ImagenJamón_de_bellota);
			
			JLabel LabelJamón_ibérico = new JLabel("Jamón ibérico");
			LabelJamón_ibérico.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelJamón_ibérico.setBounds(840, 666, 104, 14);
			contentPane.add(LabelJamón_ibérico);
			
			JLabel ImagenJamón_ibérico = new JLabel(" ");
			ImagenJamón_ibérico.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/Jamón ibérico.png")));
			ImagenJamón_ibérico.setBounds(840, 666, 91, 111);
			contentPane.add(ImagenJamón_ibérico);
			
			JLabel LabelJamón_pata_negra = new JLabel("Jamón pata negra");
			LabelJamón_pata_negra.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelJamón_pata_negra.setBounds(1000, 666, 104, 14);
			contentPane.add(LabelJamón_pata_negra);
			
			JLabel ImagenJamón_pata_negra = new JLabel(" ");
			ImagenJamón_pata_negra.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/Jamón pata negra.png")));
			ImagenJamón_pata_negra.setBounds(1000, 666, 91, 111);
			contentPane.add(ImagenJamón_pata_negra);
			
			JLabel LabelJamon_serrano = new JLabel("Jamon serrano");
			LabelJamon_serrano.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelJamon_serrano.setBounds(1160, 666, 104, 14);
			contentPane.add(LabelJamon_serrano);
			
			JLabel ImagenJamon_serrano = new JLabel(" ");
			ImagenJamon_serrano.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/Jamon serrano.png")));
			ImagenJamon_serrano.setBounds(1160, 666, 91, 111);
			contentPane.add(ImagenJamon_serrano);
			
			JLabel LabelLangosta = new JLabel("Langosta");
			LabelLangosta.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLangosta.setBounds(1320, 666, 104, 14);
			contentPane.add(LabelLangosta);
			
			JLabel ImagenLangosta = new JLabel(" ");
			ImagenLangosta.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/langosta.png")));
			ImagenLangosta.setBounds(1320, 666, 91, 111);
			contentPane.add(ImagenLangosta);
			
			JLabel LabelLangostinos = new JLabel("Langostinos");
			LabelLangostinos.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLangostinos.setBounds(1480, 666, 104, 14);
			contentPane.add(LabelLangostinos);
			
			JLabel ImagenLangostinos = new JLabel(" ");
			ImagenLangostinos.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/langostinos.png")));
			ImagenLangostinos.setBounds(1480, 666, 91, 111);
			contentPane.add(ImagenLangostinos);
			
			JLabel LabelLeche_desnatada = new JLabel("Leche desnatada");
			LabelLeche_desnatada.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLeche_desnatada.setBounds(1640, 666, 104, 14);
			contentPane.add(LabelLeche_desnatada);
			
			JLabel ImagenLeche_desnatada = new JLabel(" ");
			ImagenLeche_desnatada.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/leche desnatada.png")));
			ImagenLeche_desnatada.setBounds(1640, 666, 91, 111);
			contentPane.add(ImagenLeche_desnatada);
			
			JLabel LabelLeche_entera = new JLabel("Leche entera");
			LabelLeche_entera.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLeche_entera.setBounds(1800, 666, 104, 14);
			contentPane.add(LabelLeche_entera);
			
			JLabel ImagenLeche_entera = new JLabel(" ");
			ImagenLeche_entera.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/leche entera.png")));
			ImagenLeche_entera.setBounds(1800, 666, 91, 111);
			contentPane.add(ImagenLeche_entera);
			
			/*Productos quinta fila*/
			JLabel LabelLeche_semidesnatada = new JLabel("Leche semidesnatada");
			LabelLeche_semidesnatada.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLeche_semidesnatada.setBounds(40, 846, 104, 14);
			contentPane.add(LabelLeche_semidesnatada);
			
			JLabel ImagenLeche_semidesnatada = new JLabel(" ");
			ImagenLeche_semidesnatada.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/leche semidesnatada.png")));
			ImagenLeche_semidesnatada.setBounds(40, 846, 91, 111);
			contentPane.add(ImagenLeche_semidesnatada);
			
			JLabel LabelLenguado = new JLabel("Lenguado");
			LabelLenguado.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelLenguado.setBounds(200, 846, 104, 14);
			contentPane.add(LabelLenguado);
			
			JLabel ImagenLenguado = new JLabel(" ");
			ImagenLenguado.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/lenguado.png")));
			ImagenLenguado.setBounds(200, 846, 91, 111);
			contentPane.add(ImagenLenguado);
			
			JLabel LabelManteca_de_cerdo = new JLabel("Manteca de cerdo");
			LabelManteca_de_cerdo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelManteca_de_cerdo.setBounds(360, 846, 104, 14);
			contentPane.add(LabelManteca_de_cerdo);
			
			JLabel ImagenManteca_de_cerdo = new JLabel(" ");
			ImagenManteca_de_cerdo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/manteca de cerdo.png")));
			ImagenManteca_de_cerdo.setBounds(360, 846, 91, 111);
			contentPane.add(ImagenManteca_de_cerdo);
			
			JLabel LabelManteca_de_vacuno = new JLabel("Manteca de vacuno");
			LabelManteca_de_vacuno.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelManteca_de_vacuno.setBounds(520, 846, 104, 14);
			contentPane.add(LabelManteca_de_vacuno);
			
			JLabel ImagenManteca_de_vacuno = new JLabel(" ");
			ImagenManteca_de_vacuno.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/manteca de vacuno.png")));
			ImagenManteca_de_vacuno.setBounds(520, 846, 91, 111);
			contentPane.add(ImagenManteca_de_vacuno);
			
			JLabel LabelMantequilla_con_sal = new JLabel("Mantequilla con sal");
			LabelMantequilla_con_sal.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMantequilla_con_sal.setBounds(680, 846, 104, 14);
			contentPane.add(LabelMantequilla_con_sal);
			
			JLabel ImagenMantequilla_con_sal = new JLabel(" ");
			ImagenMantequilla_con_sal.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/mantequilla con sal.png")));
			ImagenMantequilla_con_sal.setBounds(680, 846, 91, 111);
			contentPane.add(ImagenMantequilla_con_sal);
			
			JLabel LabelMantequilla_sin_sal = new JLabel("Mantequilla sin sal");
			LabelMantequilla_sin_sal.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMantequilla_sin_sal.setBounds(840, 846, 104, 14);
			contentPane.add(LabelMantequilla_sin_sal);
			
			JLabel ImagenMantequilla_sin_sal = new JLabel(" ");
			ImagenMantequilla_sin_sal.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/mantequilla sin sal.png")));
			ImagenMantequilla_sin_sal.setBounds(840, 846, 91, 111);
			contentPane.add(ImagenMantequilla_sin_sal);
			
			JLabel LabelMejillones = new JLabel("Mejillones");
			LabelMejillones.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMejillones.setBounds(1000, 846, 104, 14);
			contentPane.add(LabelMejillones);
			
			JLabel ImagenMejillones = new JLabel(" ");
			ImagenMejillones.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/Mejillones.png")));
			ImagenMejillones.setBounds(1000, 846, 91, 111);
			contentPane.add(ImagenMejillones);
			
			JLabel LabelMerluza_trozeada = new JLabel("Merluza trozeada");
			LabelMerluza_trozeada.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMerluza_trozeada.setBounds(1160, 846, 104, 14);
			contentPane.add(LabelMerluza_trozeada);
			
			JLabel ImagenMerluza_trozeada = new JLabel(" ");
			ImagenMerluza_trozeada.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/Merluza_trozeada.png")));
			ImagenMerluza_trozeada.setBounds(1160, 846, 91, 111);
			contentPane.add(ImagenMerluza_trozeada);
			
			JLabel LabelMorcilla = new JLabel("Morcilla");
			LabelMorcilla.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMorcilla.setBounds(1320, 846, 104, 14);
			contentPane.add(LabelMorcilla);
			
			JLabel ImagenMorcilla = new JLabel(" ");
			ImagenMorcilla.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/Morcilla.png")));
			ImagenMorcilla.setBounds(1320, 846, 91, 111);
			contentPane.add(ImagenMorcilla);
			
			JLabel LabelMuslos_Pavo = new JLabel("Muslos Pavo");
			LabelMuslos_Pavo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMuslos_Pavo.setBounds(1480, 846, 104, 14);
			contentPane.add(LabelMuslos_Pavo);
			
			JLabel ImagenMuslos_Pavo = new JLabel(" ");
			ImagenMuslos_Pavo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/Muslos_Pavo.png")));
			ImagenMuslos_Pavo.setBounds(1480, 846, 91, 111);
			contentPane.add(ImagenMuslos_Pavo);
			
			JLabel LabelMuslos_Pollo = new JLabel("Muslos Pollo");
			LabelMuslos_Pollo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelMuslos_Pollo.setBounds(1640, 846, 104, 14);
			contentPane.add(LabelMuslos_Pollo);
			
			JLabel ImagenMuslos_Pollo = new JLabel(" ");
			ImagenMuslos_Pollo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/Muslos_Pollo.png")));
			ImagenMuslos_Pollo.setBounds(1640, 846, 91, 111);
			contentPane.add(ImagenMuslos_Pollo);
			
			JLabel LabelPanceta_Cerdo = new JLabel("Panceta Cerdo");
			LabelPanceta_Cerdo.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			LabelPanceta_Cerdo.setBounds(1800, 846, 104, 14);
			contentPane.add(LabelPanceta_Cerdo);							
			
			JLabel ImagenPanceta_Cerdo = new JLabel(" ");
			ImagenPanceta_Cerdo.setIcon(new ImageIcon(CtgProductosAnimales.class.getResource("/Imagenes/Panceta_Cerdo.png")));
			ImagenPanceta_Cerdo.setBounds(1800, 846, 91, 111);
			contentPane.add(ImagenPanceta_Cerdo);						
			
			
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