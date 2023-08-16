package Hn.Com.ConvertidorMonedas;

import javax.swing.*;

public class ConvertidorMoneda {
	// Método para mostrar la ventana de conversión de moneda
	public static void mostrarVentana(double amount) {
		// Opciones de conversión de moneda
		String[] opcionesConversion = { "De Lempiras a Dolar", "De Lempiras a Euros", "De Lempiras a Libras Esterlinas",
				"De Lempiras a Yen Japonés", "De Lempiras a Won sul-coreano", "De Dolar a Lempiras",
				"De Euros a Lempiras", "De Libras Esterlinas a Lempiras", "De Yen Japonés a Lempiras",
				"De Won sul-coreano a Lempiras" };
		// Mostrar el menú de conversión utilizando JOptionPane.showInputDialog
		String selectOption = (String) JOptionPane.showInputDialog(null,
				"Elige la moneda a la que deseas convertir tu dinero:", "Monedas", JOptionPane.PLAIN_MESSAGE, null,
				opcionesConversion, opcionesConversion[0]);

		if (selectOption != null) {

			// inicializando la variable
			double tasaConversion = 0;

			// Obtener la tasa de conversión según la opción seleccionada
			switch (selectOption) {
			case "De Lempiras a Dolar":
				tasaConversion = 0.041; // tasa de conversión
				break;
			case "De Lempiras a Euros":
				tasaConversion = 0.037; // tasa de conversión
				break;
			case "De Lempiras a Libras Esterlinas":
				tasaConversion = 0.032; // tasa de conversión
				break;
			case "De Lempiras a Yen Japonés":
				tasaConversion = 5.91; // tasa de conversión
				break;
			case "De Lempiras a Won sul-coreano":
				tasaConversion = 54.30; // tasa de conversión
				break;
			case "De Dolar a Lempiras":
				tasaConversion = 24.62; // tasa de conversión
				break;
			case "De Euros a Lempiras":
				tasaConversion = 26.85; // tasa de conversión
				break;
			case "De Libras Esterlinas a Lempiras":
				tasaConversion = 31.26; // tasa de conversión
				break;
			case "De Yen Japonés a Lempiras":
				tasaConversion = 0.17; // tasa de conversión
				break;
			case "De Won sul-coreano a Lempiras":
				tasaConversion = 0.018; // tasa de conversión
				break;
			default:
				System.out.println("Eliga una opción valida");
				break;
			}

			// Obteniendo el monto con su tasaconversion
			double montoConvertido = amount * tasaConversion;

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