/*Učitati dvodimenzionalni niz - matricu nxm. Izračunati i ispisati sumu
    elemenata pete kolone niza*/

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.println("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Unesite elemente: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("matrica[" + i + "," + j + "]" + "= ");
				niz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matrica: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		int s = 0;
		System.out.print("Elemenati pete kolone niza su: " + " ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (j == 4) {
					System.out.print(niz[i][j] + " ");
					s += niz[i][j];
				}
			}
			System.out.println();
		}

		System.out.println("Suma elemenata je pete kolone: " + s);

		sc.close();
	}

}