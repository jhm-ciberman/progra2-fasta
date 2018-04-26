/**
 * Escribir un programa en el que se ingresen 2 cadenas e invocando a un método privado y
 * estático de la clase, devuelva si son iguales o no. De acuerdo al resultado del método, mostrar
 * en consola “Son iguales” o “Son distintas”.
 * ¿Qué sucede si el método que hace la comparación no se declara como estático? 
 * 
 * RTA: No se podría acceder al método sin instanciar la clase ya que el método main es estático.
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
