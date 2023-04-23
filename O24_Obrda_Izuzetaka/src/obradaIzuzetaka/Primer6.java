package obradaIzuzetaka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Primer6 {

	// kljucna rec THROWS

	public static int kolicnik(int im, int br) throws ArithmeticException {
		return br / im;
	}

	/*
	 * Kljucna rec throws koristi se u zaglavlju metode da naznaci tipove izuzetaka
	 * koje ta metode moze da "baci"
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Unesite imenilac:");
			int im = sc.nextInt();
			System.out.println("Unesite brojilac:");
			int br = sc.nextInt();

			System.out.println("Kolicnik je " + kolicnik(im, br));

		} catch (ArithmeticException e) {
			System.out.println("Izuzetak. " + e);
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos. " + e);

		}
	}
}
