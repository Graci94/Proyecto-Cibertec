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

public class configurarCuotaDiaria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_cuotadiaria;
	
	

	

	/**
	 * Create the frame.
	 */
	public configurarCuotaDiaria() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Configurar cuota diaria");
		setBounds(100, 100, 481, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblcuotadiaria = new JLabel("Cuota diaria esperada (S/.)");
		lblcuotadiaria.setFont(new Font("Arial", Font.PLAIN, 12));
		lblcuotadiaria.setBounds(30, 44, 231, 16);
		contentPane.add(lblcuotadiaria);
		
		tf_cuotadiaria = new JTextField( );
		tf_cuotadiaria.setFont(new Font("Arial", Font.PLAIN, 12));
		tf_cuotadiaria.setBounds(245, 39, 86, 26);
		contentPane.add(tf_cuotadiaria);
		tf_cuotadiaria.setColumns(10);
		
		tf_cuotadiaria.setText(String.valueOf(FramePrincipal.cuotaDiaria));
		
		
		JButton btnaceptar = new JButton("Aceptar");
		btnaceptar.setFont(new Font("Arial", Font.BOLD, 12));
		btnaceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int nuevaCuota = Integer.parseInt(tf_cuotadiaria.getText());
				FramePrincipal.cuotaDiaria = nuevaCuota;
				
				setVisible(false);
			}
		});
		btnaceptar.setBounds(341, 21, 117, 29);
		contentPane.add(btnaceptar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btncancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				setVisible(false);
			}
		});
		btncancelar.setBounds(341, 61, 117, 29);
		contentPane.add(btncancelar);
	}
}
