/*Učitati dvodimenzionalni niz - matricu nxm. Izračunati i ispisati sumu svih članova većih od 3.*/

import java.util.Scanner;

public class Zadatak6 {

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
		int s = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] > 3)
					s += niz[i][j];
			}
		}

		System.out.println("Suma clanova matrice vecih od 3: " + s);
		sc.close();
	}

}
