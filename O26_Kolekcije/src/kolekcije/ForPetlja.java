package kolekcije;

import java.util.Scanner;

public class ForPetlja {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] brojevi = new int[5];

		for (int i = 0; i < brojevi.length; i++) {
			System.out.println("Unesite broj " + i);
			brojevi[i] = scanner.nextInt();

			if ((i + 1) == brojevi.length)
				System.out.println("Niz je neapunjen");
		}
		System.out.println("elementi niza su:");
		for (int i = 0; i < brojevi.length; i++) {
			System.out.println(brojevi[i]);
		}
		scanner.close();
	}
}
