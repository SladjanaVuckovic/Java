package obradaIzuzetaka;

/*Try/catch/catch*/

public class Primer4 {

	public static void main(String[] args) {

		try {
			int a = 0;
			System.out.println("a = " + a);
			int b = 10 / a;

			int c[] = { 1 }; // jedan od nacina inicijalizacije niza
			c[10] = 100;

		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nepostojeci index");
		}
		System.out.println("Nakon try/catc/catch bloka");
	}
}
