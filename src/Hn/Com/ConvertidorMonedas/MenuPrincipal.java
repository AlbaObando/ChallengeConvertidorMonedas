package Hn.Com.ConvertidorMonedas;

// Importaciones necesarias para las clases utilizadas 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

//Definición de la clase MenuPrincipal que hereda de JFrame
public class MenuPrincipal extends JFrame {

	// Método principal main que se ejecuta al iniciar la aplicación
	public static void main(String[] args) {
		 // Utiliza SwingUtilities.invokeLater() para asegurarse de manejar la interfaz gráfica correctamente
        SwingUtilities.invokeLater(() -> {
        // Llama al método menuPrincipal() para mostrar el menú
        	menuPrincipal();
        });
    }

	 // Método para mostrar el menú principal y gestionar las opciones 
    public static void menuPrincipal() {
    	// Opciones del menú a mostrar al usuario
        String[] menuOption = {"Conversor de Moneda", "Conversor Temperatura"};

     // Mostrar el menú principal utilizando JOptionPane.showInputDialog
        String selectOption = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción de conversión:",
                "Menú",
                JOptionPane.PLAIN_MESSAGE,
                null,
                menuOption,
                menuOption[0]);
     // Si el usuario selecciona una opción distinto a null
        if (selectOption != null) {
        	// Pedir al usuario que ingrese una cantidad para la conversión
            String input = showNumericInputDialog("Ingresa la cantidad que deseas convertir:");
            if (input != null && !input.isEmpty()) {
            	// Convertir la cantidad ingresada a un valor numérico
                double amount = Double.parseDouble(input);
                // Según la opción seleccionada, llamar a la clase correspondiente para mostrar los resultados
                if (selectOption.equals("Conversor de Moneda")) {
                	ConvertidorMoneda.mostrarVentana(amount);
                } else if (selectOption.equals("Conversor Temperatura")) {
                	ConvertidorTemperatura.mostrarVentana(amount);
                }
            } else {
            	// Mostrar mensaje de valor no válido si el usuario no ingresó una cantidad
                JOptionPane.showMessageDialog(null, "Valor no valido.");
            }
        } else {
        	// Mostrar mensaje de valor no válido si el usuario no seleccionó una opción
            JOptionPane.showMessageDialog(null, "Valor no valido.");
        }
    }

    // Método auxiliar para mostrar un cuadro de diálogo y obtener una cantidad numérica
    private static String showNumericInputDialog(String message) {
        return JOptionPane.showInputDialog(null, message);
    }
}


