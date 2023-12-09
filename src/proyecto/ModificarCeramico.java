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
	
	FramePrincipal appReference;
	
	// Agregar un campo para almacenar la instancia de FramePrincipal
    private FramePrincipal framePrincipal;
    
 // Constructor que acepta una instancia de FramePrincipal
   //public ModificarCeramico(FramePrincipal FramePrincipal) {
     //  this.framePrincipal = FramePrincipal;
   //}

	/**
	 * Create the frame.
	 */
	public ModificarCeramico(FramePrincipal framePrincipal) {
		this.framePrincipal = framePrincipal;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 321);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblmodelo = new JLabel("Modelo");
		lblmodelo.setBounds(24, 37, 61, 16);
		contentPane.add(lblmodelo);
		
		JLabel lblprecio = new JLabel("Precio (S/)");
		lblprecio.setBounds(24, 83, 73, 16);
		contentPane.add(lblprecio);
		
		JLabel lblancho = new JLabel("Ancho (cm)");
		lblancho.setBounds(24, 126, 73, 16);
		contentPane.add(lblancho);
		
		JLabel lbllargo = new JLabel("Largo (cm)");
		lbllargo.setBounds(24, 170, 73, 16);
		contentPane.add(lbllargo);
		
		JLabel lblespesor = new JLabel("Espesor (mm)");
		lblespesor.setBounds(24, 209, 96, 16);
		contentPane.add(lblespesor);
		
		JLabel lblcontenido = new JLabel("Contenido");
		lblcontenido.setBounds(24, 246, 81, 16);
		contentPane.add(lblcontenido);
		
		tf_precio = new JTextField();
		tf_precio.setBounds(144, 78, 130, 26);
		contentPane.add(tf_precio);
		tf_precio.setColumns(10);
		
		tf_ancho = new JTextField();
		tf_ancho.setBounds(144, 121, 127, 26);
		contentPane.add(tf_ancho);
		tf_ancho.setColumns(10);
		
		tf_largo = new JTextField();
		tf_largo.setBounds(144, 165, 130, 26);
		contentPane.add(tf_largo);
		tf_largo.setColumns(10);
		
		tf_espesor = new JTextField();
		tf_espesor.setBounds(144, 204, 130, 26);
		contentPane.add(tf_espesor);
		tf_espesor.setColumns(10);
		
		tf_contenido = new JTextField();
		tf_contenido.setColumns(10);
		tf_contenido.setBounds(144, 241, 130, 26);
		contentPane.add(tf_contenido);
		
		JButton btngrabar = new JButton("Grabar");
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
		btncerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btncerrar.setBounds(349, 52, 117, 29);
		contentPane.add(btncerrar);
		String []modelo={"Cinza Plus", "Luxury", "Austria","Yungay Mix", "Thalía"};
		
		JComboBox cbmodelo = new JComboBox(modelo);
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
    			framePrincipal.precio0,
                framePrincipal.ancho0,
                framePrincipal.largo0 ,
                framePrincipal.espesor0,
                framePrincipal.contenido0		
    			
    			);
	}
	//crear metodos
	
	public void verCeramicos(JComboBox cbmodelo) {
		
		String modelo = (String) cbmodelo.getSelectedItem();
		
		
		switch (modelo) {
        case "Cinza Plus":
        	mostrarResultados(
        			framePrincipal.precio0,
                    framePrincipal.ancho0,
                    framePrincipal.largo0 ,
                    framePrincipal.espesor0,
                    framePrincipal.contenido0		
        			
        			);
            
            break;
        case "Luxury":
        	mostrarResultados(
        			framePrincipal.precio1,
                    framePrincipal.ancho1,
                    framePrincipal.largo1 ,
                    framePrincipal.espesor1,
                    framePrincipal.contenido1		
        			
        			);
            break;

        case "Austria":
        	mostrarResultados(
        			framePrincipal.precio2,
                    framePrincipal.ancho2,
                    framePrincipal.largo2 ,
                    framePrincipal.espesor2,
                    framePrincipal.contenido2		
        			
        			);
            break;

        case "Yungay Mix":
        	mostrarResultados(
        			framePrincipal.precio3,
                    framePrincipal.ancho3,
                    framePrincipal.largo3,
                    framePrincipal.espesor3,
                    framePrincipal.contenido3		
        			
        			);
            break;

        case "Thalía":
        	mostrarResultados(
        			framePrincipal.precio4,
                    framePrincipal.ancho4,
                    framePrincipal.largo4 ,
                    framePrincipal.espesor4,
                    framePrincipal.contenido4		
        			
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
	        	framePrincipal.precio0= precioActual;
	        	framePrincipal.ancho0= anchoActual;
	        	framePrincipal.largo0= largoActual;
	        	framePrincipal.espesor0= espesorActual;
	        	framePrincipal.contenido0= contenidoActual;
	        	
	       
	     
	            
	            break;
	        case 1:
	        	framePrincipal.precio1= precioActual;
	        	framePrincipal.ancho1= anchoActual;
	        	framePrincipal.largo1= largoActual;
	        	framePrincipal.espesor1= espesorActual;
	        	framePrincipal.contenido1= contenidoActual;
	            break;

	        case 2:
	        	framePrincipal.precio2= precioActual;
	        	framePrincipal.ancho2= anchoActual;
	        	framePrincipal.largo2= largoActual;
	        	framePrincipal.espesor2= espesorActual;
	        	framePrincipal.contenido2= contenidoActual;
	            break;

	        case 3:
	        	framePrincipal.precio3= precioActual;
	        	framePrincipal.ancho3= anchoActual;
	        	framePrincipal.largo3= largoActual;
	        	framePrincipal.espesor3= espesorActual;
	        	framePrincipal.contenido3= contenidoActual;
	            break;

	        case 4:
	        	framePrincipal.precio4= precioActual;
	        	framePrincipal.ancho4= anchoActual;
	        	framePrincipal.largo4= largoActual;
	        	framePrincipal.espesor4= espesorActual;
	        	framePrincipal.contenido4= contenidoActual;
	            break;
		 }	 
	 }
	 
}

