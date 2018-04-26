/**
 * Escribir un programa que imprima los factoriales de los primeros diez números naturales. (n! =
 * n * (n-1) * (n-2) * ... * 2 * 1
 */
package p1e6;

/**
 * @author javie
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 1;
		for (int i = 1; i <= 10; i++) {
			n *= i;
			System.out.println(i + "! = " + n);
		}
	}

}
