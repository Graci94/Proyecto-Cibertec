package proyecto;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class GenerarReportes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int tipoReporte;
	private JTextArea ta_salida;
	

	
	

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
		
		
		JComboBox<String> cbtiporeporte = new JComboBox<>();
		cbtiporeporte.setModel(new DefaultComboBoxModel<String>(new String[] {"Ventas por modelo", "Comparación de precios con el precio promedio", "Comparación de cajas vendidas con la cantidad óptima", "Estadística sobre el precio"}));
		cbtiporeporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tipoReporte =cbtiporeporte.getSelectedIndex();
				String reporte= decidirTipoReporte(tipoReporte);
				ta_salida.setText(reporte);
			}
		});
		cbtiporeporte.setBounds(153, 23, 265, 27);
		contentPane.add(cbtiporeporte);
		
		JButton btncerrar = new JButton("Cerrar");
		btncerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				
			}
		});
		btncerrar.setBounds(456, 22, 117, 29);
		contentPane.add(btncerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 74, 567, 303);
		contentPane.add(scrollPane);
		
		ta_salida = new JTextArea();
		scrollPane.setViewportView(ta_salida);
		
		
		
	}
	
	String  decidirTipoReporte(int tipoReporte) {
		
		String reporte ="";
		
		switch (tipoReporte) {
		case 0:
			reporte= generarReporteVentasModelo();
			
			 break;
		case 1:
			reporte= generarReporteComparacionPrecioPromedio();
			 break;	
		case 2:
			reporte= generarReporteComparacionCajasVendidasCantidadOptima();
			 break;	
		case 3:
			reporte= generaReporteEstadisticaPrecio();
			 break;	
	 
		}
		return reporte;
	}
	
	String generarReporteVentasModelo() {
		
		String mensaje = "VENTAS POR MODELO \n\n";
		
		mensaje+= "Modelo : \t\t" + FramePrincipal.modelo0+ "\n";
		mensaje+= "Cantidad de ventas : \t"+ FramePrincipal.cantidadVentas0+"\n";
		mensaje+= "Cantidad de cajas vendidas : \t"+ FramePrincipal.cantidadCajasVendidas0+"\n";
		mensaje+= "Importe total vendido : \tS/"+ FramePrincipal.importeTotalVendido0+"\n";
		mensaje+= "Aporte a la cuota diaria : \t"+ FramePrincipal.calcularPorcentajeCuotaDiaria(FramePrincipal.importeTotalVendido0)+"%\n\n";
		
		
		mensaje+= "Modelo : \t\t" + FramePrincipal.modelo1+ "\n";
		mensaje+= "Cantidad de ventas : \t"+ FramePrincipal.cantidadVentas1+"\n";
		mensaje+= "Cantidad de cajas vendidas : \t"+ FramePrincipal.cantidadCajasVendidas1+"\n";
		mensaje+= "Importe total vendido : \tS/"+ FramePrincipal.importeTotalVendido1+"\n";
		mensaje+= "Aporte a la cuota diaria : \t"+ FramePrincipal.calcularPorcentajeCuotaDiaria(FramePrincipal.importeTotalVendido1)+"%\n\n";
		
		mensaje+= "Modelo : \t\t" + FramePrincipal.modelo2+ "\n";
		mensaje+= "Cantidad de ventas : \t"+ FramePrincipal.cantidadVentas2+"\n";
		mensaje+= "Cantidad de cajas vendidas : \t"+ FramePrincipal.cantidadCajasVendidas2+"\n";
		mensaje+= "Importe total vendido : \tS/"+ FramePrincipal.importeTotalVendido2+"\n";
		mensaje+= "Aporte a la cuota diaria : \t"+ FramePrincipal.calcularPorcentajeCuotaDiaria(FramePrincipal.importeTotalVendido2)+"%\n\n";
		
		mensaje+= "Modelo : \t\t" + FramePrincipal.modelo3+ "\n";
		mensaje+= "Cantidad de ventas : \t"+ FramePrincipal.cantidadVentas3+"\n";
		mensaje+= "Cantidad de cajas vendidas : \t"+ FramePrincipal.cantidadCajasVendidas3+"\n";
		mensaje+= "Importe total vendido : \tS/"+ FramePrincipal.importeTotalVendido3+"\n";
		mensaje+= "Aporte a la cuota diaria : \t"+ FramePrincipal.calcularPorcentajeCuotaDiaria(FramePrincipal.importeTotalVendido3)+"%\n\n";
		
		mensaje+= "Modelo : \t\t" + FramePrincipal.modelo4+ "\n";
		mensaje+= "Cantidad de ventas : \t"+ FramePrincipal.cantidadVentas4+"\n";
		mensaje+= "Cantidad de cajas vendidas : \t"+ FramePrincipal.cantidadCajasVendidas4+"\n";
		mensaje+= "Importe total vendido : \tS/"+ FramePrincipal.importeTotalVendido4+"\n";
		mensaje+= "Aporte a la cuota diaria : \t"+ FramePrincipal.calcularPorcentajeCuotaDiaria(FramePrincipal.importeTotalVendido4)+"%\n\n";
		
		
		return mensaje;
	}
	
	
	String generarReporteComparacionPrecioPromedio(){
		double promedio= FramePrincipal.calcularPrecioPromedio();
		
		String mensaje = "COMPARACIÓN DE PRECIOS CON EL PRECIO PROMEDIO \n\n";
		mensaje+= "Modelo : \t\t"+ FramePrincipal.modelo0+ "\n";
		mensaje+= "Precio  : \t\tS/." + FramePrincipal.precio0+ "\n";
		mensaje+= "Precio promedio  : \tS/. "+ promedio+ "\n";
		mensaje+= "Comparación :\tS/." +compararCantidadesDouble(FramePrincipal.precio0,promedio)+" que el promedio \n\n";
		
		
		mensaje+= "Modelo : \t\t"+ FramePrincipal.modelo1+ "\n";
		mensaje+= "Precio  : \t\tS/." + FramePrincipal.precio1+ "\n";
		mensaje+= "Precio promedio  : \tS/. "+ promedio+"\n";
		mensaje+= "Comparación :\tS/." +compararCantidadesDouble(FramePrincipal.precio1,promedio)+" que el promedio \n\n";
		
		
		mensaje+= "Modelo : \t\t"+ FramePrincipal.modelo2+ "\n";
		mensaje+= "Precio  : \t\tS/." + FramePrincipal.precio2+ "\n";
		mensaje+= "Precio promedio  : \tS/. "+ promedio+"\n";
		mensaje+= "Comparación :\tS/." +compararCantidadesDouble(FramePrincipal.precio2,promedio)+" que el promedio \n\n";
		
		mensaje+= "Modelo : \t\t"+ FramePrincipal.modelo3+ "\n";
		mensaje+= "Precio  : \t\tS/." + FramePrincipal.precio3+ "\n";
		mensaje+= "Precio promedio  : \tS/. "+ promedio+"\n";
		mensaje+= "Comparación :\tS/." +compararCantidadesDouble(FramePrincipal.precio3,promedio)+" que el promedio \n\n";
		
		mensaje+= "Modelo : \t\t"+ FramePrincipal.modelo4+ "\n";
		mensaje+= "Precio  : \t\tS/." + FramePrincipal.precio4+ "\n";
		mensaje+= "Precio promedio  : \tS/. "+ promedio+"\n";
		mensaje+= "Comparación :\tS/." +compararCantidadesDouble(FramePrincipal.precio4,promedio)+"que el promedio \n\n";
		
		
		return mensaje;	
	}
	
	String generarReporteComparacionCajasVendidasCantidadOptima() {
		
		String mensaje = "COMPARACIÓN DE CAJAS VENDIDAS CON LA CANTIDAD ÓPTIMA \n\n";
		mensaje+= "Modelo :\t\t" + FramePrincipal.modelo0+ "\n";
		mensaje+= "Cantidad de cajas vendidas  :\t" +FramePrincipal.cantidadCajasVendidas0+ "\n";
		mensaje+= "Cantidad óptima  :\t"+ FramePrincipal.cantidadOptima+"\n";
		mensaje+= "Comparación :\t\t"+compararCantidadesInt(FramePrincipal.cantidadCajasVendidas0,FramePrincipal.cantidadOptima)+" que la cantidad óptima \n\n";
		
		mensaje+= "Modelo :\t\t" + FramePrincipal.modelo1+ "\n";
		mensaje+= "Cantidad de cajas vendidas  :\t" +FramePrincipal.cantidadCajasVendidas0+ "\n";
		mensaje+= "Cantidad óptima  :\t"+ FramePrincipal.cantidadOptima+"\n";
		mensaje+= "Comparación :\t\t"+ compararCantidadesInt(FramePrincipal.cantidadCajasVendidas1,FramePrincipal.cantidadOptima)+" que la cantidad óptima \n\n";
		
		mensaje+= "Modelo :\t\t" + FramePrincipal.modelo2+ "\n";
		mensaje+= "Cantidad de cajas vendidas  :\t" +FramePrincipal.cantidadCajasVendidas0+ "\n";
		mensaje+= "Cantidad óptima  :\t"+ FramePrincipal.cantidadOptima+"\n";
		mensaje+= "Comparación :\t\t"+ compararCantidadesInt(FramePrincipal.cantidadCajasVendidas2,FramePrincipal.cantidadOptima)+" que la cantidad óptima \n\n";
		
		mensaje+= "Modelo :\t\t" + FramePrincipal.modelo3+ "\n";
		mensaje+= "Cantidad de cajas vendidas  :\t" +FramePrincipal.cantidadCajasVendidas0+ "\n";
		mensaje+= "Cantidad óptima  :\t"+ FramePrincipal.cantidadOptima+"\n";
		mensaje+= "Comparación :\t\t"+ compararCantidadesInt(FramePrincipal.cantidadCajasVendidas3,FramePrincipal.cantidadOptima)+" que la cantidad óptima \n\n";
		
		mensaje+= "Modelo :\t\t" + FramePrincipal.modelo4+ "\n";
		mensaje+= "Cantidad de cajas vendidas  :\t" +FramePrincipal.cantidadCajasVendidas0+ "\n";
		mensaje+= "Cantidad óptima  :\t"+ FramePrincipal.cantidadOptima+"\n";
		mensaje+= "Comparación :\t\t"+ compararCantidadesInt(FramePrincipal.cantidadCajasVendidas4,FramePrincipal.cantidadOptima)+" que la cantidad óptima \n\n";
		
		return mensaje;	
	}
	
	
	String 	generaReporteEstadisticaPrecio() {
		
		String mensaje = "ESTADÍSTICA SOBRE EL PRECIO\n\n";
		mensaje+= "Precio promedio :\tS/." + FramePrincipal.calcularPrecioPromedio()+ "\n";
		mensaje+= "Precio mayor   :\tS/." + precioMayor()+ "\n";
		mensaje+= "Precio menor  :\tS/."+ precioMenor() + "\n\n";
				
		return mensaje;		
	}
	
String compararCantidadesDouble(double cant1, double cant2) {
	

	if(cant1 > cant2) {
		double resta= cant1 - cant2;
		return  resta + " mas";
		
	}
	else if(cant1 < cant2) { 
		double resta= cant2 - cant1;
		return  resta + " menos";
	
	}
	else {
		return "igual";
	}
}

String compararCantidadesInt(int cant1, int cant2) {
	

	if(cant1 > cant2) {
		int resta= cant1 - cant2;
		return  resta + " mas";
		
	}
	else if(cant1 < cant2) {
		int resta= cant2 - cant1;
		return  resta + " menos";
	
	}
	else {
		return "igual";
	}
}	

double precioMayor() {
	
	List<Double> list = new ArrayList<Double>();
	 
    // Adding element to Vector v
    list.add(FramePrincipal.precio0);
    list.add(FramePrincipal.precio1);
    list.add(FramePrincipal.precio2);
    list.add(FramePrincipal.precio3);
    list.add(FramePrincipal.precio4);
    
        return Collections.max(list);
    
}

double precioMenor() {
	
	List<Double> list = new ArrayList<Double>();
	 
    // Adding element to Vector v
    list.add(FramePrincipal.precio0);
    list.add(FramePrincipal.precio1);
    list.add(FramePrincipal.precio2);
    list.add(FramePrincipal.precio3);
    list.add(FramePrincipal.precio4);
    
        return Collections.min(list);
    
}





	   
}
