package vista;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaBienvenida {
	
	private Icon imagenBienvenida;

	// Crea la Ventana de Bienvenida
	public VentanaBienvenida() {
		imagenBienvenida = new ImageIcon("imagenes/biblioteca.jfif");
		JOptionPane.showMessageDialog(null, "", " **********"  
		+ "\nĦBienvenid@s a BIDEBARRIETA!\n"+ "**********", 
		JOptionPane.DEFAULT_OPTION,imagenBienvenida);	
	}
}
