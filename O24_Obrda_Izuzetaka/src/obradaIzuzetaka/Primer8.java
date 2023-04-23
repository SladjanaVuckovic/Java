package obradaIzuzetaka;

public class Primer8 {

	public static void main(String[] args) {

		try {

			int a = 0; // 0, 1, 2
			int b = 10 / a;

			System.out.println("a = " + a);

			try {

				if (a == 1)
					a = a / (a - a);
				if (a == 2) {
					int c[] = { 1 };
					c[10] = 100;
				}

			} catch (ArrayIndexOutOfBoundsException e) { // unutrasni catch blok
				System.out.println("Greska sa indexom. " + e);
			}
		} catch (ArithmeticException e) { // spoljasnji catch blok
			System.out.println("Greska prilikom deljenja. " + e);
		}
	}
}
