/**
 * Definir una clase que posea un método al que se le pasen 2 números enteros como
 * parámetros y devuelva el resultado de la suma, el producto y la resta de los mismos
 */
package p1e5;

/**
 * @author javie
 *
 */
public class TwoNumbers {
	
	private int a;
	
	private int b;
	
	public TwoNumbers(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getSum() {
		return a + b;
	}
	
	public int getSubstraction() {
		return a - b;
	}
	
	public int getProduct() {
		return a * b;
	}
}
