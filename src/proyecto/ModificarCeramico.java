package proyecto;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import main.JTextArea;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class ModificarCeramico extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tf_precio;
	private JTextField tf_ancho;
	private JTextField tf_largo;
	private JTextField tf_espesor;
	private JTextField tf_contenido;
	
	String nombreActual= "";
	double precioActual=0;
	double anchoActual=0;
	double largoActual=0;
	double espesorActual=0;
	int contenidoActual=0;
	
	int productoSeleccionadoIndex=0;
	
	
	/**
	 * Create the frame.
	 */
	public ModificarCeramico() {
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Modificar Cerámico");
		setBounds(100, 100, 497, 321);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblmodelo = new JLabel("Modelo");
		lblmodelo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblmodelo.setBounds(24, 37, 61, 16);
		contentPane.add(lblmodelo);
		
		JLabel lblprecio = new JLabel("Precio (S/)");
		lblprecio.setFont(new Font("Arial", Font.PLAIN, 12));
		lblprecio.setBounds(24, 83, 73, 16);
		contentPane.add(lblprecio);
		
		JLabel lblancho = new JLabel("Ancho (cm)");
		lblancho.setFont(new Font("Arial", Font.PLAIN, 12));
		lblancho.setBounds(24, 126, 73, 16);
		contentPane.add(lblancho);
		
		JLabel lbllargo = new JLabel("Largo (cm)");
		lbllargo.setFont(new Font("Arial", Font.PLAIN, 12));
		lbllargo.setBounds(24, 170, 73, 16);
		contentPane.add(lbllargo);
		
		JLabel lblespesor = new JLabel("Espesor (mm)");
		lblespesor.setFont(new Font("Arial", Font.PLAIN, 12));
		lblespesor.setBounds(24, 209, 96, 16);
		contentPane.add(lblespesor);
		
		JLabel lblcontenido = new JLabel("Contenido");
		lblcontenido.setFont(new Font("Arial", Font.PLAIN, 12));
		lblcontenido.setBounds(24, 246, 81, 16);
		contentPane.add(lblcontenido);
		
		tf_precio = new JTextField();
		tf_precio.setFont(new Font("Arial", Font.PLAIN, 12));
		tf_precio.setBounds(144, 78, 130, 26);
		contentPane.add(tf_precio);
		tf_precio.setColumns(10);
		
		tf_ancho = new JTextField();
		tf_ancho.setFont(new Font("Arial", Font.PLAIN, 12));
		tf_ancho.setBounds(144, 121, 127, 26);
		contentPane.add(tf_ancho);
		tf_ancho.setColumns(10);
		
		tf_largo = new JTextField();
		tf_largo.setFont(new Font("Arial", Font.PLAIN, 12));
		tf_largo.setBounds(144, 165, 130, 26);
		contentPane.add(tf_largo);
		tf_largo.setColumns(10);
		
		tf_espesor = new JTextField();
		tf_espesor.setFont(new Font("Arial", Font.PLAIN, 12));
		tf_espesor.setBounds(144, 204, 130, 26);
		contentPane.add(tf_espesor);
		tf_espesor.setColumns(10);
		
		tf_contenido = new JTextField();
		tf_contenido.setFont(new Font("Arial", Font.PLAIN, 12));
		tf_contenido.setColumns(10);
		tf_contenido.setBounds(144, 241, 130, 26);
		contentPane.add(tf_contenido);
		
		JButton btngrabar = new JButton("Guardar");
		btngrabar.setFont(new Font("Arial", Font.BOLD, 12));
		btngrabar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// leer valores nuevos
				
				
				anchoActual= Double.parseDouble(tf_ancho.getText());
				largoActual= Double.parseDouble(tf_largo.getText());
				precioActual= Double.parseDouble(tf_precio.getText());
				espesorActual= Double.parseDouble(tf_espesor.getText());
				contenidoActual= Integer.parseInt(tf_contenido.getText());
				
				modificarCeramico();	
				
				setVisible(false);
			}
		});
		btngrabar.setBounds(349, 83, 117, 29);
		contentPane.add(btngrabar);
		
		JButton btncerrar = new JButton("Cerrar");
		btncerrar.setFont(new Font("Arial", Font.BOLD, 12));
		btncerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btncerrar.setBounds(349, 52, 117, 29);
		contentPane.add(btncerrar);
		
		String []modelo={"Cinza Plus", "Luxury", "Austria","Yungay Mix", "Thalía"};
		
		JComboBox<String>cbmodelo = new JComboBox<>(modelo);
		cbmodelo.setFont(new Font("Arial", Font.PLAIN, 12));
		cbmodelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//leer valores
				nombreActual= cbmodelo.getSelectedItem().toString();
				anchoActual= Double.parseDouble(tf_ancho.getText());
				largoActual= Double.parseDouble(tf_largo.getText());
				precioActual= Double.parseDouble(tf_precio.getText());
				espesorActual= Double.parseDouble(tf_espesor.getText());
				contenidoActual= Integer.parseInt(tf_contenido.getText());
				
				productoSeleccionadoIndex=cbmodelo.getSelectedIndex();
				verCeramicos(cbmodelo);
			}
		});
		cbmodelo.setBounds(144, 33, 127, 27);
		contentPane.add(cbmodelo);
		
		
		
		mostrarResultados(
    			FramePrincipal.precio0,
                FramePrincipal.ancho0,
                FramePrincipal.largo0 ,
                FramePrincipal.espesor0,
                FramePrincipal.contenido0		
    			
    			);
	}
	//crear metodos
	
	public void verCeramicos(JComboBox<String> cbmodelo) {
		
		String modelo = (String) cbmodelo.getSelectedItem();
		
		
		switch (modelo) {
        case "Cinza Plus":
        	mostrarResultados(
        			FramePrincipal.precio0,
        			FramePrincipal.ancho0,
        			FramePrincipal.largo0 ,
        			FramePrincipal.espesor0,
        			FramePrincipal.contenido0		
        			
        			);
            
            break;
        case "Luxury":
        	mostrarResultados(
        			FramePrincipal.precio1,
        			FramePrincipal.ancho1,
        			FramePrincipal.largo1 ,
                    FramePrincipal.espesor1,
                    FramePrincipal.contenido1		
        			
        			);
            break;

        case "Austria":
        	mostrarResultados(
        			FramePrincipal.precio2,
        			FramePrincipal.ancho2,
        			FramePrincipal.largo2 ,
        			FramePrincipal.espesor2,
        			FramePrincipal.contenido2		
        			
        			);
            break;

        case "Yungay Mix":
        	mostrarResultados(
        			FramePrincipal.precio3,
        			FramePrincipal.ancho3,
        			FramePrincipal.largo3,
        			FramePrincipal.espesor3,
        			FramePrincipal.contenido3		
        			
        			);
            break;

        case "Thalía":
        	mostrarResultados(
        			FramePrincipal.precio4,
        			FramePrincipal.ancho4,
        			FramePrincipal.largo4 ,
        			FramePrincipal.espesor4,
        			FramePrincipal.contenido4		
        			
        			);
            break;
		}
		
	}
	
	 void mostrarResultados(double precio, double ancho,double espesor, double largo, int contenido) {
		tf_precio.setText(precio + "");
     	tf_ancho.setText(ancho + "");
     	tf_largo.setText(largo + "");
     	tf_espesor.setText(espesor + "");
     	tf_contenido.setText(contenido + "");
     	
		 
	 }
	 void modificarCeramico() {
		 switch (productoSeleccionadoIndex) {
		 
	        case 0:
	        	FramePrincipal.precio0= precioActual;
	        	FramePrincipal.ancho0= anchoActual;
	        	FramePrincipal.largo0= largoActual;
	        	FramePrincipal.espesor0= espesorActual;
	        	FramePrincipal.contenido0= contenidoActual;
	        	
	       
	     
	            
	            break;
	        case 1:
	        	FramePrincipal.precio1= precioActual;
	        	FramePrincipal.ancho1= anchoActual;
	        	FramePrincipal.largo1= largoActual;
	        	FramePrincipal.espesor1= espesorActual;
	        	FramePrincipal.contenido1= contenidoActual;
	            break;

	        case 2:
	        	FramePrincipal.precio2= precioActual;
	        	FramePrincipal.ancho2= anchoActual;
	        	FramePrincipal.largo2= largoActual;
	        	FramePrincipal.espesor2= espesorActual;
	        	FramePrincipal.contenido2= contenidoActual;
	            break;

	        case 3:
	        	FramePrincipal.precio3= precioActual;
	        	FramePrincipal.ancho3= anchoActual;
	        	FramePrincipal.largo3= largoActual;
	        	FramePrincipal.espesor3= espesorActual;
	        	FramePrincipal.contenido3= contenidoActual;
	            break;

	        case 4:
	        	FramePrincipal.precio4= precioActual;
	        	FramePrincipal.ancho4= anchoActual;
	        	FramePrincipal.largo4= largoActual;
	        	FramePrincipal.espesor4= espesorActual;
	        	FramePrincipal.contenido4= contenidoActual;
	            break;
		 }	 
		 
		 
	 }
	 
}

