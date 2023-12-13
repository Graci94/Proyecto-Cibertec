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

public class configurarCuotaDiaria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_cuotadiaria;
	
	private FramePrincipal appReference;

	

	/**
	 * Create the frame.
	 */
	public configurarCuotaDiaria(FramePrincipal appReference) {
		
		// sirve usar las variables globales del frame principal
				this.appReference = appReference;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblcuotadiaria = new JLabel("Cuota diaria esperada (S/.)");
		lblcuotadiaria.setBounds(6, 44, 231, 16);
		contentPane.add(lblcuotadiaria);
		
		tf_cuotadiaria = new JTextField( );
		tf_cuotadiaria.setBounds(271, 39, 86, 26);
		contentPane.add(tf_cuotadiaria);
		tf_cuotadiaria.setColumns(10);
		
		tf_cuotadiaria.setText(String.valueOf(appReference.cuotaDiaria));
		
		
		JButton btnaceptar = new JButton("Aceptar");
		btnaceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int nuevaCuota = Integer.parseInt(tf_cuotadiaria.getText());
				appReference.cuotaDiaria = nuevaCuota;
				
				setVisible(false);
			}
		});
		btnaceptar.setBounds(358, 31, 117, 29);
		contentPane.add(btnaceptar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				setVisible(false);
			}
		});
		btncancelar.setBounds(358, 67, 117, 29);
		contentPane.add(btncancelar);
	}
}
