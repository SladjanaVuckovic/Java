/*Učitati dvodimenzionalni niz i ispisati elemente na glavnoj dijagonali.*/

package matrice;

import java.util.Scanner;

public class Primer18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Broj redova i kolona: ");
		int n = sc.nextInt();

		int niz[][] = new int[n][n];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("a[" + i + ", " + j + "]" + " = ");
				niz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Izgled niza: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.print("Glavna dijagonala: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == j) {
					System.out.print(niz[i][j] + ", ");
				}
			}
		}
		System.out.println("");
		sc.close();
	}

}