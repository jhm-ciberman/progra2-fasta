/**
 * aaaa
 */
package p2e2;

import java.util.Date;

/**
 * bbb
 * @author Javier Mora
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Enterprise e = new Enterprise();
		e.addClient(new Client("a", new Date()));
		
		for (Client c : e.getClients()) {
			System.out.println(c.getName());
		}
	}

}
