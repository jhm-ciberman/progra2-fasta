/**
 * Escriba un programa que utilize el m�todo static getProperty() de la clase System para
 * obtener informaci�n del sistema. La informaci�n que se desea obtener es: versi�n de Java,
 * sistema operativo y su versi�n.
 */
package p1e7;

/**
 * @author javie
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Java version: " + System.getProperty("java.version"));
		System.out.println("OS: " + System.getProperty("os.name"));
		System.out.println("OS Version: " + System.getProperty("os.version"));
	}

}
