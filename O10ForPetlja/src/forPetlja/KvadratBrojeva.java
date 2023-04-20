/* Napisati niz naredbi kojim se izračunava kvadrat prirodnih brojeva od 15 do 25.*/

package forPetlja;

import java.util.Scanner;

public class KvadratBrojeva {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 15; i <= 25; i++) {
			int kvadrat = i * i;
			System.out.println("Kvadrat broja " + i + " je: " + kvadrat);
			sc.close();
		}

	}

}
