/*Učitati dvodimenzionalni niz i pronaći najveći i najmanji element.*/

package matrice;

import java.util.Scanner;

public class Primer17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Broj redova: ");
		int red = sc.nextInt();

		System.out.println("Broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("a[" + i + ", " + j + "]" + " = ");
				niz[i][j] = sc.nextInt();
			}
		}

		// Izgled niza
		System.out.println("Izgled niza A: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		int max = 0;

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (max < niz[i][j]) {
					max = niz[i][j];
				}

			}
		}
		int min = niz[0][0];

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {

				if (min >= niz[i][j]) {
					min = niz[i][j];
				}

			}

		}
		System.out.println("Najveci element: " + max);
		System.out.println("Najmanji element: " + min);
		sc.close();

	}

}
