/*Učitati elemente dvodimenzionalnog niza, a zatim ispisati sve parne elemente*/

package matrice;

import java.util.Scanner;

public class Primer5 {

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

		System.out.println("Parni elementi niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] % 2 == 0) {
					System.out.print(niz[i][j] + " ");
				}
			}
		}
		sc.close();

	}

}