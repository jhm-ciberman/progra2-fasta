/**
 * Escribir un programa que calcule la ra�z cuadrada de un n�mero real ingresado por teclado
 * (validar que el valor ingresado sea un n�mero) y muestre su parte entera. �C�mo modificar�a el
 * programa para que el resultado se redondee al entero m�s pr�ximo?
 * 
 * Cambiar�a Math.floor por Math.round
 */
package p1e8;

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
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a real number: ");
	    while (!sc.hasNextFloat()) {
	        System.out.println("That's not a number!");
	        sc.next(); // this is important!
	    }
	    float number = sc.nextFloat();
		System.out.println("Square root: " + (int) Math.floor(Math.sqrt(number)));

	}

}
