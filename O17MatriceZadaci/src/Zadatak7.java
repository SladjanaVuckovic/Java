/*Učitati dvodimenzionalni niz - matricu nxm. Izračunati i ispisati sumu negativnih elemenata.*/

import java.util.Scanner;

public class Zadatak7 {

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
				System.out.println("niz[" + i + "," + j + "]" + "= ");
				niz[i][j] = sc.nextInt();
			}
		}
		int s = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] < 0)
					s += niz[i][j];
			}
		}

		System.out.println("Suma negativnih clanova matrice: " + s);
		sc.close();
	}

}
