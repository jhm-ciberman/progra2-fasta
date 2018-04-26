import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Escribir un programa que en el método main, solicite un nombre y muestre "Hola <nombre
 * ingresado>" y debajo, la fecha y hora actual con el siguiente formato de ejemplo "viernes
 * 20/04/2018 18:00". Validar que el mensaje no se muestre hasta tanto no se haya ingresado un
 * nombre. 
 */


/**
 * @author Javier Mora
 *
 */
public class Main {

	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args) {
		String name = getString("Enter your name: ");
		System.out.println("Hello " + name);
		System.out.println("Now is: " + formatDate(new Date()));
	}
	
	/**
	 * Formats the passed date
	 * @param date The date
	 * @return The formatted date
	 */
	private static String formatDate(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return simpleDateFormat.format(date);
	}

	/**
	 * Ask the user for a string
	 * @param message The message to show to the user
	 * @return The entered string
	 */
	private static String getString(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String str;
		do {
			System.out.print(message);
			str = scanner.nextLine();
		} while (str.isEmpty());
		return str;
	}
}
