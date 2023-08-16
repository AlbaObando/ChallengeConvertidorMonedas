package Hn.Com.ConvertidorMonedas;

import javax.swing.*;

public class ConvertidorTemperatura {

	// Método para mostrar la ventana de conversión de moneda
	public static void mostrarVentana(double amount) {
		// Opciones de conversión de Temperatura
		String[] opcionesConversion = { "Grados Celsius a Fahrenheit", "Grados Celsius a Kelvin", "Grados Fahrenheit a Celsius",
				"Grados Fahrenheit a Kelvin","Kelvin a Grados Fahrenhei", "Kelvin a Grados Celsius"};
		// Mostrar el menú de conversión utilizando JOptionPane.showInputDialog
		String selectOption = (String) JOptionPane.showInputDialog(null,
				"Elige la opción que deseas convertir: ", "Temperatura", JOptionPane.PLAIN_MESSAGE, null,
				opcionesConversion, opcionesConversion[0]);

		if (selectOption != null) {

			// inicializando la variable
			double montoConvertido = 0;
			// Obtener la tasa de conversión según la opción seleccionada
			switch (selectOption) {
			case "Grados Celsius a Fahrenheit":
				montoConvertido = (amount * 9/5)+ 32 ;// tasa de conversión
				break;
			case "Grados Celsius a Kelvin":
				montoConvertido = amount + 273.15 ; // tasa de conversión
				break;
			case "Grados Fahrenheit a Celsius":
				montoConvertido = (amount - 32)*(5/9) ; // tasa de conversión
				break;
			case "Grados Fahrenheit a Kelvin":
				montoConvertido = (amount - 32)*(5/9) + 273.15; // tasa de conversión
				break;
			case "Kelvin a Grados Fahrenheio":
				montoConvertido = (amount - 273.15)*(9/5) + 32;  // tasa de conversión
				break;
			case "Kelvin a Grados Celsius":
				montoConvertido = amount - 273.15;
				break;
			default:
				System.out.println("Eliga una opción valida");
				break;
			}

			// Formatear el resultado a 2 cifras decimales
			String formatoMonto = String.format("%.2f", montoConvertido);

			// Mostrar el resultado de la conversión al usuario utilizando una función
			// separada
			mostrarResultadoConversion(formatoMonto, selectOption);
		}

	}

	private static void mostrarResultadoConversion(String formatoMonto, String selectOption) {
		// Mostrar el resultado de la conversión al usuario
		JOptionPane.showMessageDialog(null,
				"Tienes " + formatoMonto + " " + selectOption.substring(selectOption.lastIndexOf(" ") + 1));

		// Llama al método ContinuarConversion para preguntar si desea continuar
		ContinuarConversion.continuarConversion();

	}
	 
}
