package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import main.ConsultarCeramico;
//import main.Exception;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;

//import java.util.ArrayList;
//import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;


import javax.swing.JLabel;

import javax.swing.ImageIcon;


public class FramePrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// Datos mínimos del primer producto
	public static String modelo0 = "Cinza Plus";
	public static double precio0 = 92.56;
	public static double ancho0 = 62.0;
	public static double largo0 = 62.0;
	public static double espesor0 = 8;
	public static int contenido0 = 6;
	
	public static int cantidadVentas0 = 0;
	public static int cantidadCajasVendidas0 = 0;
	public static double importeTotalVendido0 = 0;
		
	// Datos mínimos del segundo producto
	public static String modelo1 = "Luxury";
	public static double precio1 = 42.77;
	public static double ancho1 = 60;
	public static double largo1 = 60;
	public static double espesor1 = 8.5;
	public static int contenido1 = 4;
	
	public static int cantidadVentas1 = 0;
	public static int cantidadCajasVendidas1 = 0;
	public static double importeTotalVendido1 = 0;
		
	// Datos mínimos del tercer producto
	public static String modelo2 = "Austria";
	public static double precio2 = 52.45;
	public static double ancho2 = 45;
	public static double largo2 = 45;
	public static double espesor2 = 6.5;
	public static int contenido2 = 12;
	
	public  static int cantidadVentas2 = 0;
	public  static int cantidadCajasVendidas2 = 0;
	public static double importeTotalVendido2 = 0;
		
	// Datos mínimos del cuarto producto
	public static String modelo3 = "Yungay Mix";
	public static double precio3 = 55.89;
	public static double ancho3 = 80;
	public static double largo3 = 120;
	public static double espesor3 = 6.8;
	public static int contenido3 = 9;
	
	public static int cantidadVentas3 = 0;
	public static int cantidadCajasVendidas3 = 0;
	public static double importeTotalVendido3 = 0;
		
	// Datos mínimos del quinto producto
	public static String modelo4 = "Thalía";
	public static double precio4 = 45;
	public static double ancho4 = 45;
	public static double largo4 = 11.8;
	public static double espesor4 = 7.2;
	public static int contenido4 = 10;
	
	public static int cantidadVentas4 = 0;
	public static int cantidadCajasVendidas4 = 0;
	public  static double importeTotalVendido4 = 0;
		
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequio
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	// Cantidad óptima de unidades vendidas por día
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 30000;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
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
	public FramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Bienvenido a la Tienda 1.0");
		setBounds(100, 100, 594, 353);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 240));
		setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setIcon(new ImageIcon(FramePrincipal.class.getResource("/Imagenes/Archivo.png")));
		mnArchivo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		menuBar.add(mnArchivo);

		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		mnArchivo.add(mntmNewMenuItem);

		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setIcon(new ImageIcon(FramePrincipal.class.getResource("/Imagenes/Mantenimiento.png")));
		mnMantenimiento.setFont(new Font("Arial Black", Font.PLAIN, 14));
		menuBar.add(mnMantenimiento);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consultar cerámico");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {

			// crear el action con anticlic.
			public void actionPerformed(ActionEvent e) {
				try {
					// crear el objeto jframe y mostrarlo cuando se hace clic
					ConsultarCeramico frameConsultar = new ConsultarCeramico();
					frameConsultar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameConsultar.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}
			}

		});
		mnMantenimiento.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Modificar cerámicos\n");
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// crear el objeto jframe y mostrarlo cuando se hace clic
					ModificarCeramico frameModificar = new ModificarCeramico();
					frameModificar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameModificar.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}
			}
		});
		mnMantenimiento.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Listar cerámicos");
		mntmNewMenuItem_3.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					// crear el objeto jframe y mostrarlo cuando se hace clic
					ListarCeramicos frameListar = new ListarCeramicos();
					frameListar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameListar.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}
			}
		});
		mnMantenimiento.add(mntmNewMenuItem_3);

		JMenu mnVentas = new JMenu("Ventas");
		mnVentas.setIcon(new ImageIcon(FramePrincipal.class.getResource("/Imagenes/Ventas.png")));
		mnVentas.setFont(new Font("Arial Black", Font.PLAIN, 14));
		menuBar.add(mnVentas);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Vender");
		mntmNewMenuItem_4.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// crear el objeto jframe y mostrarlo cuando se hace clic
					Vender frameVender = new Vender();
					frameVender.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameVender.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}

			}
		});
		mnVentas.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Generar reportes");
		mntmNewMenuItem_5.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// crear el objeto jframe y mostrarlo cuando se hace clic
					GenerarReportes frameGenerar = new GenerarReportes();
					frameGenerar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameGenerar.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}

			}
		});
		mnVentas.add(mntmNewMenuItem_5);

		JMenu mnConfiguracion = new JMenu("Configuración");
		mnConfiguracion.setIcon(new ImageIcon(FramePrincipal.class.getResource("/Imagenes/Configuracion.png")));
		mnConfiguracion.setFont(new Font("Arial Black", Font.PLAIN, 14));
		menuBar.add(mnConfiguracion);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Configurar descuentos");
		mntmNewMenuItem_7.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// crear el objeto jframe y mostrarlo cuando se hace clic
					ConfigurarDescuento frameDescuento = new ConfigurarDescuento();
					frameDescuento.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameDescuento.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}

			}
		});
		mnConfiguracion.add(mntmNewMenuItem_7);

		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Configurar obsequios");
		mntmNewMenuItem_8.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					// crear el objeto jframe y mostrarlo cuando se hace clic
					ConfigurarObsequios frameObsequio = new ConfigurarObsequios();
					frameObsequio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameObsequio.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}
			}
		});
		mnConfiguracion.add(mntmNewMenuItem_8);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Configurar cantidad óptima");
		mntmNewMenuItem_6.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					// crear el objeto jframe y mostrarlo cuando se hace clic
					ConfigurarCantidadOptima frameCantidadOptima = new ConfigurarCantidadOptima();
					frameCantidadOptima.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameCantidadOptima.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}

			}
		});
		mnConfiguracion.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Configurar cuota diaria\n");
		mntmNewMenuItem_9.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					// crear el objeto jframe y mostrarlo cuando se hace clic
					configurarCuotaDiaria frameCuotaDiaria = new configurarCuotaDiaria();
					frameCuotaDiaria.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameCuotaDiaria.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}
			}
		});
		mnConfiguracion.add(mntmNewMenuItem_9);

		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setIcon(new ImageIcon(FramePrincipal.class.getResource("/Imagenes/Ayuda.png")));
		mnAyuda.setFont(new Font("Arial Black", Font.PLAIN, 14));
		menuBar.add(mnAyuda);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Acerca de Tienda");
		mntmNewMenuItem_10.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					// crear el objeto jframe y mostrarlo cuando se hace clic
					Tienda1 frameTienda = new Tienda1();
					frameTienda.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameTienda.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}

			}
		});
		mnAyuda.add(mntmNewMenuItem_10);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(248, 246, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_imagen = new JLabel("");
		lbl_imagen.setIcon(new ImageIcon(FramePrincipal.class.getResource("/Imagenes/Tienda.png")));
		lbl_imagen.setBounds(10, 11, 558, 265);
		
		contentPane.add(lbl_imagen);
		
		
		
	}

	// METODOS

	static double[] obtenerDescuentos() {
		double[] descuentos = {

				porcentaje1, porcentaje2, porcentaje3, porcentaje4, };
		return descuentos;
	}

	static void actualizarDescuentos(double[] descuentosNuevos) {
		porcentaje1 = descuentosNuevos[0];
		porcentaje2 = descuentosNuevos[1];
		porcentaje3 = descuentosNuevos[2];
		porcentaje4 = descuentosNuevos[3];
	}

	static int[] obtenerObsequios() {
		int[] obsequios = {

				obsequioCantidad1, obsequioCantidad2, obsequioCantidad3

		};
		return obsequios;
	}

	static void actualizarObsequios(int[] ObsequiosNuevos) {
		obsequioCantidad1 = ObsequiosNuevos[0];
		obsequioCantidad2 = ObsequiosNuevos[1];
		obsequioCantidad3 = ObsequiosNuevos[2];

	}

	
	static double determinarPrecio(int tipo) {
		double precio = 0.0;
		
		switch (tipo) {
		case 0:
			precio= precio0;
			break;
			
		case 1:
			precio= precio1;
			break;	
		case 2:
			precio= precio2;
			break;
		case 3:
			precio= precio3;
			break;
		case 4:
			precio= precio4;
			break;								
		}
		return precio;
	}
	
	
	static int determinarCantidadUnidades(int tipo) {
		int contenido=0;
		
		switch (tipo) {
		case 0:
			 contenido= contenido0;
			 break;
		case 1:
			contenido= contenido1;
			 break;	
		case 2:
			contenido= contenido2;
			 break;	
		case 3:
			contenido= contenido3;
			 break;	
		case 4:
			contenido= contenido4;
			 break;								
		}
		return contenido;
		
	}
	static void  comprobarQuintavaVenta() {
		int cantidadVentasTotales= calcularCantidadVentasTotales();
		
		if(cantidadVentasTotales% 5 == 0 && cantidadVentasTotales > 0) {
			mostrarMensajeQuintaVenta( cantidadVentasTotales);
			
		}
			
	}
	
	static double calcularPorcentajeCuotaDiaria(double cantidad) {
		
		double porcentaje= (cantidad * 100) / cuotaDiaria;
		
		return porcentaje;
	}
	
	static void mostrarMensajeQuintaVenta(int numeroVenta) {
		int cantidadVentasTotales= calcularCantidadVentasTotales();
		double cantidadImportesTotales= calcularImportesTotales();
		
		String mensaje = "Venta nro. " + cantidadVentasTotales + "\n";
		mensaje+= "Importe Total General Acumulado : S/." + cantidadImportesTotales+ "\n";
		mensaje+= "Porcentaje de la cuota diaria : "+ calcularPorcentajeCuotaDiaria(cantidadImportesTotales)+"%";
		
		JOptionPane.showMessageDialog(null, mensaje, "Avance de ventas", JOptionPane.INFORMATION_MESSAGE);
	}
	
	static int calcularCantidadVentasTotales() {
		int suma = cantidadVentas0 + cantidadVentas1 + cantidadVentas2 + cantidadVentas3 +cantidadVentas4;
		
		return suma;
	}
	static double calcularImportesTotales() {
		double suma = importeTotalVendido0 + importeTotalVendido1 + importeTotalVendido2 + importeTotalVendido3 +importeTotalVendido4;
		
		return suma;
	}
	
	
	static void acumularVenta(int tipo,double importePagar, int cantidadCajas) {
		
	
		 
		switch (tipo) {
		case 0:
			cantidadVentas0++;
			importeTotalVendido0 += importePagar ;
			cantidadCajasVendidas0 += cantidadCajas;
			 break;
		case 1:
			cantidadVentas1++;
			importeTotalVendido1+= importePagar ;
			cantidadCajasVendidas1+= cantidadCajas;
			 break;	
		case 2:
			cantidadVentas2++;
			importeTotalVendido2 += importePagar ;
			cantidadCajasVendidas2+= cantidadCajas;
			 break;	
		case 3:
			cantidadVentas3++;
			importeTotalVendido3+= importePagar ;
			cantidadCajasVendidas3+= cantidadCajas;
			 break;	
		case 4:
			cantidadVentas4++;
			importeTotalVendido4+= importePagar ;
			cantidadCajasVendidas4+= cantidadCajas;
			 break;								
		}
	
		
	}
	
	static double calcularPrecioPromedio() {
		
		double promedio = (precio0 + precio1+ precio2+ precio3+ precio4)/ 5;
		
		return promedio;
	}
}
