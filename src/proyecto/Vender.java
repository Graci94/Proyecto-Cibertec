package proyecto;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vender extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_precio;
	private JTextField ft_cantidad;
	private JTextArea ta_salida;
	private JComboBox<String> cbmodelo ;
	double precio;
	double importeCompra;
	double importeDescuento;
	double importePagar;
	int unidadesObsequiadas;
	int cajasAdquiridas;
	int productoSeleccionadoIndex;
	int UnidadesAdquiridas;

	
	/**
	 * Create the frame.
	 */
	public Vender() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Vender");
		setBounds(100, 100, 451, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblmodelo = new JLabel("Modelo");
		lblmodelo.setBounds(26, 35, 82, 16);
		contentPane.add(lblmodelo);
		
		String []modelo={"Cinza Plus", "Luxury", "Austria","Yungay Mix", "Thalía"};
		
		cbmodelo  = new JComboBox<>(modelo);
		cbmodelo.setBounds(129, 30, 117, 27);
		cbmodelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 productoSeleccionadoIndex= cbmodelo.getSelectedIndex();
				mostrarPrecio();
			}
		});
		contentPane.add(cbmodelo);
		
		JLabel lblprecio = new JLabel("Precio (S/)");
		lblprecio.setBounds(26, 75, 82, 16);
		contentPane.add(lblprecio);
		
		tf_precio = new JTextField();
		tf_precio.setBounds(129, 70, 117, 26);
		tf_precio.setEditable(false);
		contentPane.add(tf_precio);
		tf_precio.setColumns(10);
		
		
		
		JLabel lblcantidad = new JLabel("Cantidad");
		lblcantidad.setBounds(26, 114, 61, 16);
		contentPane.add(lblcantidad);
		
		ft_cantidad = new JTextField();
		ft_cantidad.setBounds(129, 109, 117, 26);
		contentPane.add(ft_cantidad);
		ft_cantidad.setColumns(10);
		
		
		JButton btnvender = new JButton("Vender");
		btnvender.setBounds(295, 30, 117, 29);
		btnvender.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			cajasAdquiridas= Integer.parseInt(ft_cantidad.getText());	
			calcularImporteCompra();
			calcularImporteDescuento();
			calcularImportePagar();
			unidadesObsequiadas= calcularUnidadesObsequiadas(calcularUnidadesAdquiridas(productoSeleccionadoIndex));
			ta_salida.setText(generarBoletaVenta());
			FramePrincipal.acumularVenta(productoSeleccionadoIndex, importePagar, cajasAdquiridas);
			FramePrincipal.comprobarQuintavaVenta();
			
			
			}
		});
		contentPane.add(btnvender);
		
		JButton btncerrar = new JButton("Cerrar");
		btncerrar.setBounds(295, 69, 117, 29);
		btncerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		contentPane.add(btncerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 166, 381, 296);
		contentPane.add(scrollPane);
		
		ta_salida = new JTextArea();
		scrollPane.setViewportView(ta_salida);
		
		mostrarPrecio();
	}
	
	//METODOS
	
	
	
	void mostrarPrecio() {
		
		precio = FramePrincipal.determinarPrecio( productoSeleccionadoIndex);
		tf_precio.setText(precio+"");
		
	}
	
	String generarBoletaVenta() {
		String mensaje="";
		mensaje="BOLETA DE VENTA" ;
		mensaje+="\n \n Modelo \t\t: "+ cbmodelo.getSelectedItem();
		mensaje+="\n \n Precio \t\t: "+ tf_precio.getText() ;
		mensaje+="\n \n cantidad Adquirida \t: "+ cajasAdquiridas;
		mensaje+="\n \n Importe de Compra \t: "+importeCompra;
		mensaje+="\n \n Importe de Descuento \t: "+importeDescuento;
		mensaje+="\n \n Importe a pagar \t: "+importePagar;
		mensaje+="\n \n Tipo de Obsequio \t: "+FramePrincipal.tipoObsequio;
		mensaje+="\n \n Unidades Obsequiadas \t: "+ unidadesObsequiadas;
		
		
		return mensaje;
	}
	void calcularImporteCompra() {
		importeCompra= precio * cajasAdquiridas;
		
		
	}
	void calcularImporteDescuento() {
		double porcentajeDescuento= determinarPorcentajeDescuento(cajasAdquiridas);
		
		importeDescuento = importeCompra * (porcentajeDescuento / 100);
		
	}
	
	void calcularImportePagar() {
		
		importePagar= importeCompra - importeDescuento;
		
	}
	
	int calcularUnidadesAdquiridas(int productoIndex) {
		
		int unidadesAdquiridas= cajasAdquiridas * FramePrincipal.determinarCantidadUnidades(productoIndex);
		 return unidadesAdquiridas;
	}
	
	int calcularUnidadesObsequiadas(int cantidadUnidades) {
		int cantidadObsequios= 0;
		
		if(cantidadUnidades > 0 && cantidadUnidades<=5 ) {
			cantidadObsequios= FramePrincipal.obsequioCantidad1;
		}
		else if(cantidadUnidades <= 10) {
			cantidadObsequios= FramePrincipal.obsequioCantidad2;
		}
		else {
			cantidadObsequios= FramePrincipal.obsequioCantidad3;
		}
		return cantidadObsequios;
	}
	
	double determinarPorcentajeDescuento(int cajasAdquiridas) {
		double porcentajeDescuento= 0.0;
		
		if(cajasAdquiridas > 0 && cajasAdquiridas<=5 ) {
			porcentajeDescuento= FramePrincipal.porcentaje1;
		}
		else if(cajasAdquiridas <= 10) {
			porcentajeDescuento= FramePrincipal.porcentaje2;
		}
		else if(cajasAdquiridas <= 15) {
			porcentajeDescuento= FramePrincipal.porcentaje3;
		}
		else  {
			porcentajeDescuento= FramePrincipal.porcentaje4;
		}
		
		return porcentajeDescuento;
	}
	
	
}
