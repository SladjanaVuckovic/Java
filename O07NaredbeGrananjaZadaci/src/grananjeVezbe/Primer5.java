package grananjeVezbe;

import java.util.Scanner;

public class Primer5 {

	public static void main(String[] args) {
		/*
		 * ispitati da li je broj pozitivna, negativan ili jednak nuli uz pomoc if/else
		 * if
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj");
		int broj = sc.nextInt();

		if (broj > 0) {
			System.out.println("Broj je pozitivan");
		} else if (broj < 0) {
			System.out.println("Broj je negativan");
		} else if (broj == 0) {
			System.out.println("Uneti broj je nula");
		} else {
			System.out.println("Pogresan unos");
		}
	}
}
