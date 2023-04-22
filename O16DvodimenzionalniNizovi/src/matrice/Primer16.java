/*Učitati dvodimenzionalni niz i izračunati zbir svih elemenata*/

package matrice;

import java.util.Scanner;

public class Primer16 {

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
		double suma = 0d;
		// Ispisivanje elementa
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				suma += niz[i][j];
			}

		}
		System.out.println("Zbir svih elemanta niza je: " + suma);
		sc.close();

	}

}