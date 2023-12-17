package proyecto;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;


public class ConfigurarCantidadOptima extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_cantidadoptima;
	
	/**
	 * Create the frame.
	 */
	public ConfigurarCantidadOptima() {
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Configurar cantidad óptima");
		setBounds(100, 100, 502, 176);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblcantidadoptima = new JLabel("Cantidad  óptima de unidades vendidas");
		lblcantidadoptima.setFont(new Font("Arial", Font.PLAIN, 12));
		lblcantidadoptima.setBounds(22, 18, 252, 16);
		contentPane.add(lblcantidadoptima);
		
		tf_cantidadoptima = new JTextField();
		tf_cantidadoptima.setBounds(280, 13, 70, 26);
		contentPane.add(tf_cantidadoptima);
		tf_cantidadoptima.setColumns(10);
		
		tf_cantidadoptima.setText(String.valueOf(FramePrincipal.cantidadOptima));
		
		JButton btnaceptar = new JButton("Aceptar");
		btnaceptar.setFont(new Font("Arial", Font.BOLD, 12));
		btnaceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int nuevaCantidad = Integer.parseInt(tf_cantidadoptima.getText());
				FramePrincipal.cantidadOptima = nuevaCantidad;
				setVisible(false);
			}
		});
		btnaceptar.setBounds(360, 12, 117, 29);
		contentPane.add(btnaceptar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btncancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		btncancelar.setBounds(360, 52, 117, 29);
		contentPane.add(btncancelar);
	}

}
