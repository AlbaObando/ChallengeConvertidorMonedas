package Hn.Com.ConvertidorMonedas;

import javax.swing.JOptionPane;

public class ContinuarConversion {

	public static void continuarConversion() {
		 // Preguntar si el usuario desea continuar
        int response = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Continuar", JOptionPane.YES_NO_CANCEL_OPTION);
        if (response == JOptionPane.NO_OPTION || response == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
        } else if (response == JOptionPane.YES_OPTION) {
     	   // Reiniciar la conversión llamando a la clase MenuPrincipal
     	   MenuPrincipal.menuPrincipal();
        }
		
	}
	
	
}
