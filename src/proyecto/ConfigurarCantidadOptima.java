package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DropMode;

public class ConfigurarCantidadOptima extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_cantidadoptima;
	
	private FramePrincipal appReference;

	

	/**
	 * Create the frame.
	 */
	public ConfigurarCantidadOptima(FramePrincipal appReference) {
		
		// sirve usar las variables globales del frame principal
				this.appReference = appReference;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 176);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblcantidadoptima = new JLabel("Cantidad  óptima de unidades vendidas");
		lblcantidadoptima.setBounds(6, 18, 262, 16);
		contentPane.add(lblcantidadoptima);
		
		tf_cantidadoptima = new JTextField();
		tf_cantidadoptima.setBounds(280, 13, 70, 26);
		contentPane.add(tf_cantidadoptima);
		tf_cantidadoptima.setColumns(10);
		
		tf_cantidadoptima.setText(String.valueOf(appReference.cantidadOptima));
		
		JButton btnaceptar = new JButton("Aceptar");
		btnaceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int nuevaCantidad = Integer.parseInt(tf_cantidadoptima.getText());
				FramePrincipal.cantidadOptima = nuevaCantidad;
				setVisible(false);
			}
		});
		btnaceptar.setBounds(379, 13, 117, 29);
		contentPane.add(btnaceptar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		btncancelar.setBounds(379, 49, 117, 29);
		contentPane.add(btncancelar);
	}

}
