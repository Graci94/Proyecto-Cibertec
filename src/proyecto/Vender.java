package proyecto;

import java.awt.EventQueue;

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

public class Vender extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_cantidad;
	private JTextField ft_cantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender frame = new Vender();
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
	public Vender() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblmodelo = new JLabel("Modelo");
		lblmodelo.setBounds(6, 35, 82, 16);
		contentPane.add(lblmodelo);
		
		JComboBox cbprecio = new JComboBox();
		cbprecio.setBounds(119, 31, 121, 27);
		contentPane.add(cbprecio);
		
		JLabel lblprecio = new JLabel("Precio (S/)");
		lblprecio.setBounds(6, 74, 82, 16);
		contentPane.add(lblprecio);
		
		tf_cantidad = new JTextField();
		tf_cantidad.setBounds(129, 70, 117, 26);
		contentPane.add(tf_cantidad);
		tf_cantidad.setColumns(10);
		
		JLabel lblcantidad = new JLabel("Cantidad");
		lblcantidad.setBounds(6, 114, 61, 16);
		contentPane.add(lblcantidad);
		
		ft_cantidad = new JTextField();
		ft_cantidad.setBounds(129, 109, 121, 26);
		contentPane.add(ft_cantidad);
		ft_cantidad.setColumns(10);
		
		JButton btnvender = new JButton("Vender");
		btnvender.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnvender.setBounds(295, 30, 117, 29);
		contentPane.add(btnvender);
		
		JButton btncerrar = new JButton("Cerrar");
		btncerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		btncerrar.setBounds(295, 69, 117, 29);
		contentPane.add(btncerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 166, 313, 101);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
