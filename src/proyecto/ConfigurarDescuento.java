package proyecto;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConfigurarDescuento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_descuento1;
	private JTextField tf_descuento2;
	private JTextField tf_descuento3;
	private JTextField tf_descuento4;

	
	
	/**
	 * Create the frame.
	 */
	public ConfigurarDescuento() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1unidades = new JLabel("1 a 5 unidades");
		lbl1unidades.setBounds(21, 18, 105, 16);
		contentPane.add(lbl1unidades);
		
		JLabel lbl6unidades = new JLabel("6 a 10 unidades");
		lbl6unidades.setBounds(21, 46, 105, 16);
		contentPane.add(lbl6unidades);
		
		JLabel lbl11unidades = new JLabel("11 a 15 unidades");
		lbl11unidades.setBounds(21, 74, 114, 16);
		contentPane.add(lbl11unidades);
		
		JLabel lblmas15 = new JLabel("Más de 15 unidades");
		lblmas15.setBounds(21, 102, 125, 16);
		contentPane.add(lblmas15);
		
		tf_descuento1 = new JTextField();
		tf_descuento1.setBounds(178, 13, 98, 26);
		contentPane.add(tf_descuento1);
		tf_descuento1.setColumns(10);
		
		tf_descuento2 = new JTextField();
		tf_descuento2.setBounds(171, 41, 105, 26);
		contentPane.add(tf_descuento2);
		tf_descuento2.setColumns(10);
		
		tf_descuento3 = new JTextField();
		tf_descuento3.setBounds(171, 69, 105, 26);
		contentPane.add(tf_descuento3);
		tf_descuento3.setColumns(10);
		
		tf_descuento4 = new JTextField();
		tf_descuento4.setBounds(171, 97, 105, 26);
		contentPane.add(tf_descuento4);
		tf_descuento4.setColumns(10);
		
		JButton btnaceptar = new JButton("Aceptar");
		btnaceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// recoger los nuevos valores
								
				double descuento1Modificado= Double.parseDouble(tf_descuento1.getText());
				double descuento2Modificado= Double.parseDouble(tf_descuento2.getText());
				double descuento3Modificado= Double.parseDouble(tf_descuento3.getText());
				double descuento4Modificado= Double.parseDouble(tf_descuento4.getText());
			
				double [] descuentosModificados= {
						descuento1Modificado,
						descuento2Modificado,
						descuento3Modificado,
						descuento4Modificado,
				};
				//actualizar los valores 
				
				FramePrincipal.actualizarDescuentos(descuentosModificados);
				
				// cerrar ventana
				setVisible(false);
				
				
			}
		});
		btnaceptar.setBounds(363, 33, 117, 29);
		contentPane.add(btnaceptar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		btncancelar.setBounds(363, 69, 117, 29);
		contentPane.add(btncancelar);
		
		JLabel lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setBounds(288, 46, 27, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("%");
		lblNewLabel_4_1.setBounds(288, 74, 27, 16);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("%");
		lblNewLabel_4_2.setBounds(288, 18, 27, 16);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("%");
		lblNewLabel_4_3.setBounds(288, 102, 27, 16);
		contentPane.add(lblNewLabel_4_3);
		
		//traer los porcentajes de descuento
		FramePrincipal.obtenerDescuentos();
		mostrarDescuentos();
	}

	//metodo
	void mostrarDescuentos() {
		
		//traer los porcentajes de descuento
		double[] descuentos= FramePrincipal.obtenerDescuentos();
				
				
				tf_descuento1.setText(descuentos[0] + "");
				tf_descuento2.setText(descuentos[1] + "");
				tf_descuento3.setText(descuentos[2] + "");
				tf_descuento4.setText(descuentos[3] + "");
				
	}
	
}
