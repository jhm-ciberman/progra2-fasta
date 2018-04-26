/**
 * Escriba un programa que utilize el método static getProperty() de la clase System para
 * obtener información del sistema. La información que se desea obtener es: versión de Java,
 * sistema operativo y su versión.
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
