
package proyecto;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListarCeramicos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	
	/**
	 * Create the frame.
	 */
	public ListarCeramicos() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 498, 430);
		contentPane.add(scrollPane);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		textArea_1.setEditable(false);
		
			
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				
			}
		});
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCerrar.setBounds(82, 484, 118, 29);
		contentPane.add(btnCerrar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llenarDatos(textArea_1);
			}
		});
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnListar.setBounds(258, 484, 118, 29);
		contentPane.add(btnListar);
	}
	//METODOS
	
	public void llenarDatos(JTextArea textArea) {
		
		String titulo = "LISTADO DE CERAMICOS\n\n";
		String contenido = titulo;
		contenido = contenido + "Modelo: " + FramePrincipal.modelo0 + "\n";
		contenido = contenido + "Precio: " + FramePrincipal.precio0 + " soles\n";
		contenido = contenido + "Ancho: " + FramePrincipal.ancho0 + " cm\n";
		contenido = contenido + "Largo: " + FramePrincipal.largo0 + " cm\n";
		contenido = contenido + "Espesor: " + FramePrincipal.espesor0 + " mm\n";
		contenido = contenido + "Contenido: " + FramePrincipal.contenido0 + " unidades\n\n";
		
		contenido = contenido + "Modelo: " + FramePrincipal.modelo1 + "\n";
		contenido = contenido + "Precio: " + FramePrincipal.precio1 + " soles\n";
		contenido = contenido + "Ancho: " + FramePrincipal.ancho1 + " cm\n";
		contenido = contenido + "Largo: " + FramePrincipal.largo1 + " cm\n";
		contenido = contenido + "Espesor: " + FramePrincipal.espesor1 + " mm\n";
		contenido = contenido + "Contenido: " + FramePrincipal.contenido1 + " unidades\n\n";		
		
		contenido = contenido + "Modelo: " + FramePrincipal.modelo2 + "\n";
		contenido = contenido + "Precio: " + FramePrincipal.precio2 + " soles\n";
		contenido = contenido + "Ancho: " + FramePrincipal.ancho2 + " cm\n";
		contenido = contenido + "Largo: " + FramePrincipal.largo2 + " cm\n";
		contenido = contenido + "Espesor: " + FramePrincipal.espesor2 + " mm\n";
		contenido = contenido + "Contenido: " + FramePrincipal.contenido2 + " unidades\n\n";
		
		contenido = contenido + "Modelo: " + FramePrincipal.modelo3 + "\n";
		contenido = contenido + "Precio: " + FramePrincipal.precio3 + " soles\n";
		contenido = contenido + "Ancho: " + FramePrincipal.ancho3 + " cm\n";
		contenido = contenido + "Largo: " + FramePrincipal.largo3 + " cm\n";
		contenido = contenido + "Espesor: " + FramePrincipal.espesor3 + " mm\n";
		contenido = contenido + "Contenido: " + FramePrincipal.contenido3 + " unidades\n\n";
						
		contenido = contenido + "Modelo: " + FramePrincipal.modelo4 + "\n";
		contenido = contenido + "Precio: " + FramePrincipal.precio4 + " soles\n";
		contenido = contenido + "Ancho: " + FramePrincipal.ancho4 + " cm\n";
		contenido = contenido + "Largo: " + FramePrincipal.largo4 + " cm\n";
		contenido = contenido + "Espesor: " + FramePrincipal.espesor4 + " mm\n";
		contenido = contenido + "Contenido: " + FramePrincipal.contenido4 + " unidades\n\n";
		textArea.setText(contenido);
		
		
	}
		
	
	
	
}

