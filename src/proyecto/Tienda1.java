package proyecto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tienda1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	/**
	 * Create the frame.
	 */
	public Tienda1() {
		
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblautores = new JLabel("Aautores");
		lblautores.setBounds(180, 23, 61, 16);
		contentPane.add(lblautores);
		
		JLabel lblanita = new JLabel("Anita Cuzado Gamez   (I202333442)");
		lblanita.setBounds(103, 82, 277, 16);
		contentPane.add(lblanita);
		
		JLabel lblrosario = new JLabel("Rosario  Salinas Huamán  (I202336059)");
		lblrosario.setBounds(103, 127, 247, 16);
		contentPane.add(lblrosario);
		
		JLabel lbloscar = new JLabel("José Alonso Gamarra Apaza  (I202335618)");
		lblrosario.setBounds(103, 127, 247, 16);
		contentPane.add(lblrosario);
		
		
		
		JButton brncerrar = new JButton("Cerrar");
		brncerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				setVisible(false);
			}
		});
		brncerrar.setBounds(161, 213, 117, 29);
		contentPane.add(brncerrar);
	}

}
