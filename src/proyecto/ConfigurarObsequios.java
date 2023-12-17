package proyecto;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ConfigurarObsequios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_nombreobsequio;
	private JTextField tf_tipoobsequio1;
	private JTextField tf_tipoobsequio2;
	private JTextField tf_tipoobsequio3;

	

	/**
	 * Create the frame.
	 */
	public ConfigurarObsequios() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Configurar obsequios");
		setBounds(100, 100, 450, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltipodeobs = new JLabel("Tipo de Obsequio");
		lbltipodeobs.setFont(new Font("Arial", Font.PLAIN, 12));
		lbltipodeobs.setBounds(22, 24, 129, 16);
		contentPane.add(lbltipodeobs);
		
		tf_nombreobsequio = new JTextField();
		tf_nombreobsequio.setFont(new Font("Arial", Font.PLAIN, 12));
		tf_nombreobsequio.setEditable(true);
		tf_nombreobsequio.setBounds(163, 19, 130, 26);
		contentPane.add(tf_nombreobsequio);
		tf_nombreobsequio.setColumns(10);
		
		JLabel lbla5unidades = new JLabel("1 a 5 unidades");
		lbla5unidades.setFont(new Font("Arial", Font.PLAIN, 12));
		lbla5unidades.setBounds(22, 62, 104, 16);
		contentPane.add(lbla5unidades);
		
		JLabel lbla10unidades = new JLabel("6 a 10 unidades");
		lbla10unidades.setFont(new Font("Arial", Font.PLAIN, 12));
		lbla10unidades.setBounds(22, 95, 104, 16);
		contentPane.add(lbla10unidades);
		
		JLabel lbl11amas = new JLabel("11 a más unidades");
		lbl11amas.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl11amas.setBounds(22, 133, 129, 16);
		contentPane.add(lbl11amas);
		
		tf_tipoobsequio1 = new JTextField();
		tf_tipoobsequio1.setFont(new Font("Arial", Font.PLAIN, 12));
		tf_tipoobsequio1.setBounds(163, 57, 130, 26);
		contentPane.add(tf_tipoobsequio1);
		tf_tipoobsequio1.setColumns(10);
		
		tf_tipoobsequio2 = new JTextField();
		tf_tipoobsequio2.setFont(new Font("Arial", Font.PLAIN, 12));
		tf_tipoobsequio2.setBounds(163, 90, 130, 26);
		contentPane.add(tf_tipoobsequio2);
		tf_tipoobsequio2.setColumns(10);
		
		tf_tipoobsequio3 = new JTextField();
		tf_tipoobsequio3.setFont(new Font("Arial", Font.PLAIN, 12));
		tf_tipoobsequio3.setBounds(163, 128, 130, 26);
		contentPane.add(tf_tipoobsequio3);
		tf_tipoobsequio3.setColumns(10);
		
		JButton btnaceptar = new JButton("Aceptar");
		btnaceptar.setFont(new Font("Arial", Font.BOLD, 12));
		btnaceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// recoger los nuevos valores
				
				int obsequioCantidad1Modificado;
				int obsequioCantidad2Modificado;
				int obsequioCantidad3Modificado;
				
			
				obsequioCantidad1Modificado= Integer.parseInt(tf_tipoobsequio1.getText());
				obsequioCantidad2Modificado= Integer.parseInt(tf_tipoobsequio2.getText());
				obsequioCantidad3Modificado= Integer.parseInt(tf_tipoobsequio3.getText());
				
				
				int [] obsequiosModificados= {
						 obsequioCantidad1Modificado,
						 obsequioCantidad2Modificado,
						 obsequioCantidad3Modificado
				};
				//actualizar los valores 
				
				FramePrincipal.actualizarObsequios(obsequiosModificados);
				conf1 (tf_nombreobsequio);
				
				// cerrar ventana
				setVisible(false);
				
			}
		});
		btnaceptar.setBounds(303, 18, 117, 29);
		contentPane.add(btnaceptar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btncancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btncancelar.setBounds(303, 56, 117, 29);
		contentPane.add(btncancelar);
		
		//traer los porcentajes de descuento
		FramePrincipal.obtenerObsequios();
				mostrarObsequios();
				mostrarTipoDeObsequio();
	}
	//metodo
		void mostrarObsequios() {
			
			//traer los porcentajes de descuento
			int[] obsequios= FramePrincipal.obtenerObsequios();
					
					
			tf_tipoobsequio1.setText(obsequios[0] + "");
			tf_tipoobsequio2.setText(obsequios[1] + "");
			tf_tipoobsequio3.setText(obsequios[2] + "");
					
					
		}
		
	void mostrarTipoDeObsequio() {
		String nombre= FramePrincipal.tipoObsequio;
		tf_nombreobsequio.setText(nombre);
	}
	
	String conf1 (JTextField tf_nombreobsequio) {
		return FramePrincipal.tipoObsequio=tf_nombreobsequio.getText();
	}
	
}
