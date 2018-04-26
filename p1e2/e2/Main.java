/**
 * Escribir un programa en el que se ingresen 2 cadenas e invocando a un m�todo privado y
 * est�tico de la clase, devuelva si son iguales o no. De acuerdo al resultado del m�todo, mostrar
 * en consola �Son iguales� o �Son distintas�.
 * �Qu� sucede si el m�todo que hace la comparaci�n no se declara como est�tico? 
 * 
 * RTA: No se podr�a acceder al m�todo sin instanciar la clase ya que el m�todo main es est�tico.
 */
package e2;

import java.util.Scanner;

/**
 * @author Javier Mora
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = getString("String 1: ");
		String str2 = getString("String 2: ");

		if (areEquals(str1, str2)) {
			System.out.println("The strings are equal");
		} else {
			System.out.println("The strings are different");
		}
	}
	
	private static boolean areEquals(String str1, String str2) {
		return str1.equals(str2);
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
