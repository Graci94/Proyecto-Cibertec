package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class GenerarReportes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarReportes frame = new GenerarReportes();
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
	public GenerarReportes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltipodereporte = new JLabel("Tipo de reporte");
		lbltipodereporte.setBounds(6, 27, 135, 16);
		contentPane.add(lbltipodereporte);
		
		JComboBox cbtiporeporte = new JComboBox();
		cbtiporeporte.setBounds(153, 23, 265, 27);
		contentPane.add(cbtiporeporte);
		
		JButton btncerrar = new JButton("Cerrar");
		btncerrar.setBounds(456, 22, 117, 29);
		contentPane.add(btncerrar);
		
		JTextArea ta_salida = new JTextArea();
		ta_salida.setBounds(6, 74, 567, 303);
		contentPane.add(ta_salida);
	}
}
