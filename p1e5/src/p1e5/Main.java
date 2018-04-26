/**
 * Definir una clase que posea un método al que se le pasen 2 números enteros como
 * parámetros y devuelva el resultado de la suma, el producto y la resta de los mismos
 */
package p1e5;

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
		int a = getInt("a = ");
		int b = getInt("b = ");
		TwoNumbers twoNumbers = new TwoNumbers(a, b);
		System.out.println("a + b = " + twoNumbers.getSum());
		System.out.println("a - b = " + twoNumbers.getSubstraction());
		System.out.println("a * b = " + twoNumbers.getProduct());

	}
	
	public static int getInt(String message) {
		System.out.println(message);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

}
