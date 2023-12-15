package proyecto;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ConsultarCeramico extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfPrecio;
	private JTextField tfLargo;
	private JTextField tfAncho;
	private JTextField tfEspesor;
	private JTextField tfContenido;
	private JComboBox<String> cbModelo;
	

	
	/**
	 * Create the frame.
	 */
	public ConsultarCeramico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(21, 42, 102, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecio.setBounds(21, 86, 102, 28);
		contentPane.add(lblPrecio);
		
		JLabel lblAncho = new JLabel("Largo");
		lblAncho.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAncho.setBounds(21, 125, 102, 28);
		contentPane.add(lblAncho);
		
		JLabel lblAncho_1 = new JLabel("Ancho");
		lblAncho_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAncho_1.setBounds(21, 169, 102, 28);
		contentPane.add(lblAncho_1);
		
		JLabel lblEspesor = new JLabel("Espesor");
		lblEspesor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEspesor.setBounds(21, 208, 102, 28);
		contentPane.add(lblEspesor);
		
		JLabel lblCantidad = new JLabel("Contenido");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCantidad.setBounds(21, 247, 102, 28);
		contentPane.add(lblCantidad);
		
		String[] listaCeramicos= {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thalía"};
		
		cbModelo = new JComboBox<>(listaCeramicos);
		cbModelo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			}
		});
		cbModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//DECLARACION VARIABLES
				int tipo, contenido;
				double precio, ancho, largo, espesor;
				
				//PRESENTACION UTILIZANDO LOS METODOS
				tipo = determinarCeramico(); 
				precio = FramePrincipal.determinarPrecio(tipo);
				ancho = determinarAncho(tipo);
				largo = determinaLargo(tipo);
				espesor = determinaEspesor(tipo);
				contenido = determinaContenido(tipo);
				mostrarResultados(precio, ancho, largo, espesor, contenido);
									
			}	
				
		});
		cbModelo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cbModelo.setBounds(109, 47, 217, 28);
		contentPane.add(cbModelo);
		
		tfPrecio = new JTextField();
		tfPrecio.setEditable(false);
		tfPrecio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tfPrecio.setBounds(109, 87, 217, 28);
		contentPane.add(tfPrecio);
		tfPrecio.setColumns(10);
		
		tfLargo = new JTextField();
		tfLargo.setEditable(false);
		tfLargo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tfLargo.setColumns(10);
		tfLargo.setBounds(109, 126, 217, 28);
		contentPane.add(tfLargo);
		
		tfAncho = new JTextField();
		tfAncho.setEditable(false);
		tfAncho.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tfAncho.setColumns(10);
		tfAncho.setBounds(109, 165, 217, 28);
		contentPane.add(tfAncho);
		
		tfEspesor = new JTextField();
		tfEspesor.setEditable(false);
		tfEspesor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tfEspesor.setColumns(10);
		tfEspesor.setBounds(109, 208, 217, 28);
		contentPane.add(tfEspesor);
		
		tfContenido = new JTextField();
		tfContenido.setEditable(false);
		tfContenido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tfContenido.setColumns(10);
		tfContenido.setBounds(109, 247, 217, 28);
		contentPane.add(tfContenido);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				setVisible(false);
				
				    }
			
		});
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCerrar.setBounds(376, 51, 118, 38);
		contentPane.add(btnCerrar);
		
		//TRAER INFORMACION DE VENTANA PRINCIPAL
				cbModelo.setToolTipText(FramePrincipal.modelo0);
				tfPrecio.setText(""+FramePrincipal.precio0);
				tfAncho.setText(""+FramePrincipal.ancho0);
				tfLargo.setText(""+FramePrincipal.largo0);
				tfEspesor.setText(""+FramePrincipal.espesor0);
				tfContenido.setText(""+FramePrincipal.contenido0);
					
	}
	
		//METODOS
			int determinarCeramico() {
				return cbModelo.getSelectedIndex();
			}
		
		
		
			double determinarAncho(int tipo) {
				switch (tipo) {
				case 0:
					return FramePrincipal.ancho0;
				case 1:
					return FramePrincipal.ancho1;	
				case 2:
					return FramePrincipal.ancho2;	
				case 3:
					return FramePrincipal.ancho3;	
				case 4:
					return FramePrincipal.ancho4;								
				}
				return tipo;
			}
		
			double determinaLargo(int tipo) {
				switch (tipo) {
				case 0:
					return FramePrincipal.largo0;
				case 1:
					return FramePrincipal.largo1;	
				case 2:
					return FramePrincipal.largo2;	
				case 3:
					return FramePrincipal.largo3;	
				case 4:
					return FramePrincipal.largo4;								
				}
				return tipo;
			}
			
			double determinaEspesor(int tipo) {
				switch (tipo) {
				case 0:
					return FramePrincipal.espesor0;
				case 1:
					return FramePrincipal.espesor1;	
				case 2:
					return FramePrincipal.espesor2;	
				case 3:
					return FramePrincipal.espesor3;	
				case 4:
					return FramePrincipal.espesor4;								
				}
				return tipo;
			}
			
			int determinaContenido(int tipo) {
				switch (tipo) {
				case 0:
					return FramePrincipal.contenido0;
				case 1:
					return FramePrincipal.contenido1;	
				case 2:
					return FramePrincipal.contenido2;	
				case 3:
					return FramePrincipal.contenido3;	
				case 4:
					return FramePrincipal.contenido4;								
				}
				return tipo;
			}
			
			void mostrarResultados(double precio, double ancho, double largo, double espesor, int contenido) {
				tfPrecio.setText(precio + "\n\n");
				tfAncho.setText(ancho + "\n\n");
				tfLargo.setText(largo + "\n\n");
				tfEspesor.setText(espesor + "\n\n");
				tfContenido.setText(contenido + "\n\n");
			}	
		
}
