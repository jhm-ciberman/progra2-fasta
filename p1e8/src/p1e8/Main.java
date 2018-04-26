/**
 * Escribir un programa que calcule la raíz cuadrada de un número real ingresado por teclado
 * (validar que el valor ingresado sea un número) y muestre su parte entera. ¿Cómo modificaría el
 * programa para que el resultado se redondee al entero más próximo?
 * 
 * Cambiaría Math.floor por Math.round
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
