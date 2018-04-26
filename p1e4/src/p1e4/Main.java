/**
 * Escribir un programa que muestre los números del 1 a N uno al lado del otro, separados por un
 * espacio. N es un valor entero ingresado por teclado.
 */
package p1e4;

import java.util.Scanner;

/**
 * @author javie
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("N = ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}

}
