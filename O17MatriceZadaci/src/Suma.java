/* Ispisati dvodimenzionali niz i izračunati sumu kvadrata svih elementa niza.*/

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.println("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int matrica[][] = new int[red][kolona];

		System.out.println("Unesite elemente: ");
		int s = 0;

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("matrica[" + i + "," + j + "]" + "= ");
				matrica[i][j] = sc.nextInt();

				s += Math.pow(matrica[i][j], 2);
			}
		}
		System.out.println("Matrica: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Suma kvadrata svih elementa je: " + s);

		sc.close();
	}

}