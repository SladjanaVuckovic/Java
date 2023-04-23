package obradaIzuzetaka;

/*Optimizovaniji primer 4*/

public class Primer5 {

	public static void main(String[] args) {

		try {
			int a = 0;
			System.out.println("a = " + a);
			int b = 10 / a;
			int c[] = { 1 };
			c[10] = 100;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Uhvacen exception.");
		}
		System.out.println("Nakon try/catch bloka");
	}
}
/*
 * ArithmeticException | ArrayIndexOutOfBoundsException – mozemo ih staviti
 * zajedno zato sto su oba potomci RuntimeException/
 */
