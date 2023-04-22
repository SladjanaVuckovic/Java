/* Učitati dvodimenzionalni niz - matricu 5x5. Izračunati i ispisati sumu
    elemenata treceg reda niza X[5,5].*/

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.println("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int matrica[][] = new int[red][kolona];

		System.out.println("Unesite elemente: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("matrica[" + i + "," + j + "]" + "= ");
				matrica[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matrica: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

		int s = 0;
		System.out.println("Elementi 3 reda niza su: " + " ");
		for (int i = 0; i < red; i++) {
			if (i == 2) {
				for (int j = 0; j < kolona; j++) {
					System.out.print(matrica[i][j] + " ");
					s += matrica[i][j];
				}
				System.out.println();
			}
		}

		System.out.println("Suma elemenata treceg reda: " + s);
		sc.close();
	}

}