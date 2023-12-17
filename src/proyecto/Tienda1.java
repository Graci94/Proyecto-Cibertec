package proyecto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Font;
import javax.swing.JSeparator;

public class Tienda1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	/**
	 * Create the frame.
	 */
	public Tienda1() {
		
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Acerca de Tienda 1.0");
		setBounds(100, 100, 450, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblautores = new JLabel("Autores");
		lblautores.setBounds(161, 35, 98, 28);
		lblautores.setFont(new Font("Arial Black", Font.BOLD, 20));
		contentPane.add(lblautores);
		
		JLabel lblanita = new JLabel("Anita Cruzado Gomez   (I202333442)");
		lblanita.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblanita.setBounds(91, 111, 286, 14);
		contentPane.add(lblanita);
		
		JLabel lblrosario = new JLabel("Rosario  Salinas Huamán  (I202336059)");
		lblrosario.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblrosario.setBounds(91, 156, 286, 14);
		contentPane.add(lblrosario);
		
		JLabel lblalonso = new JLabel("José Alonso Gamarra Apaza  (I202335618)");
		lblalonso.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblalonso.setBounds(91, 206, 286, 14);
		contentPane.add(lblalonso);
		
		
		
		JButton brncerrar = new JButton("Cerrar");
		brncerrar.setFont(new Font("Arial", Font.BOLD, 12));
		brncerrar.setBounds(178, 254, 81, 23);
		brncerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				setVisible(false);
			}
		});
		contentPane.add(brncerrar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 84, 404, 2);
		contentPane.add(separator);
	}
}
