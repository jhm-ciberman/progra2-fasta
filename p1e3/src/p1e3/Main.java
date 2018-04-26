/**
 * Escribir un programa que imprima tres argumentos tomados desde la l�nea de comando.
 * Para hacer esto, necesitar� usar los �ndices del arreglo de strings que recibe como par�metro.
 * Asegurarse de que se reciban al menos tres par�metros antes de imprimirlos.
 */
package p1e3;

/**
 * @author javie
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length >= 3) {
			for(int i = 0; i < 3; i++) {
				System.out.println(String.format("args[%d] = %s", i, args[i]));
			}
		}
	}

}
