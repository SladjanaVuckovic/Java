/*Učitati elemente dvodimenzionalnog niza, a zatim ispisati elemente sa parnim indexima i redova i kolona*/

package matrice;

import java.util.Scanner;

public class Primer11 {

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

		// Stampanje elementa dvodimenzionalnog niza:
		System.out.println("Izgled niza: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Elementi sa parnim indeksima i redova i kolona: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if ((i + 1) % 2 == 0 && (j + 1) % 2 == 0) {
					System.out.print(niz[i][j] + " ");
				}
			}
			System.out.println();

		}
		sc.close();

	}

}