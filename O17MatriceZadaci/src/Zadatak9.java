/* Ucitati dvodimenzionalni niz - matricu 5x5. Izracunati
    i ispisati a) aritmeticku sredinu pozitivnih elemenata*/

import java.util.Scanner;

public class Zadatak9 {

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

		int brojac = 0;
		double s = 0d;
		System.out.println("\nIzgled niza: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
				if (niz[i][j] > 0) {
					brojac++;
					s += niz[i][j];
				}
			}
			System.out.println();
		}

		double arSredina = s / brojac;

		System.out.println("\nAritmetička sredina pozitivinih elemenata je: " + arSredina);

		sc.close();
	}

}