package matrice;

import java.util.Scanner;

public class Primer15 {
	public static void main(String[] args) {
		int[][] a = new int[20][20];
		int[][] b = new int[20][20];
		int[][] c = new int[20][20];

		Scanner ulaz = new Scanner(System.in);

// Unos dimenzija matrica
		System.out.println("Unesite dimenzije matrica m, n, k: ");
		// m = Broj redova prve matrice
		System.out.println("m = ");
		int m = ulaz.nextInt();
		// n = Broj kolona prve matrice & broj redova druge matrice
		System.out.println("n = ");
		int n = ulaz.nextInt();
		// k = Broj kolona druge matrice
		System.out.println("k = ");
		int k = ulaz.nextInt();
		System.out.println("Vrednost skalara: ");
		int s = ulaz.nextInt();

		// Unos matrice A
		System.out.println("Unesite elemente matrica a: ");
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("a[" + i + "][" + j + "] = ");
				a[i][j] = ulaz.nextInt();
			}
		}

		// Unos matrice B
		System.out.println("Unesite elemente matrica b: ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				System.out.println("b[" + i + "][" + j + "] = ");
				b[i][j] = ulaz.nextInt();
			}
		}

		// Nalazenje proizvoda dve matrice
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= k; j++) {
				c[i][j] = 0;
				for (int t = 1; t <= n; t++) {
					c[i][j] += s * a[i][t] * b[t][j];
				}
			}
		}

		// Izgled niza A
		System.out.println("Izgled niza A: ");
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// Izgled niza B
		System.out.println("Izgled niza B: ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		// Stampanje izlaznog rezultata
		System.out.println("Proizvod matrice skalarom (" + s + ") iznosi: ");
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= k; j++) {
				System.out.println(c[i][j] + " ");
			}
			System.out.println();
		}

		ulaz.close();

	}
}