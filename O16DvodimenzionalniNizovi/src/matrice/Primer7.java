/*Učitati elemente dvodimenzionalnog niza, a zatim ispisati elemente sa parnim indexima redova*/

package matrice;

import java.util.Scanner;

public class Primer7 {

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

		System.out.println("Elementi sa parnim indeksima redova: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if ((i + 1) % 2 == 0) {
					System.out.print(niz[i][j] + " ");
				}
			}

		}
		sc.close();

	}

}