/* Učitati dvodimenzionalni niz - matricu nxm. Izračunati i ispisati 
    a) aritmetičku sredinu parnih elemenata na kolonama*/

import java.util.Scanner;

public class Zadatak11 {

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

		int brojac = 0;
		double s = 0d;
		double artSredina = 0d;
		System.out.println("\nIzgled niza: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < red; i++) {
			s = 0;
			artSredina = 0;
			System.out.println("Aritmeticka sredina parnih elemenata na koloni " + (i + 1) + " iznosi: ");
			for (int j = 0; j < kolona; j++) {

				if (niz[j][i] % 2 == 0) {
					s += niz[j][i];
					artSredina = s / ++brojac;
				}
			}
			brojac = 0;
			System.out.println(artSredina);
			System.out.println();
		}

		sc.close();
	}

}
