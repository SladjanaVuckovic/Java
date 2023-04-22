/*Učitati dvodimenzionalni niz i ispisati sve elemente na glavnoj i ispod glavne dijagonale.
    */

import java.util.Scanner;

public class GlavnaDijag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] niz = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };

		System.out.println("Početni izgled: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Novi izgled: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j <= i) {
					System.out.print(niz[i][j] + " ");
				}

			}
			System.out.println();
		}

		sc.close();
	}
}
