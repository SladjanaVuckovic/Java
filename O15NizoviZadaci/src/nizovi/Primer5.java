/*Sastaviti algoritam i napisati program kojim se uređuju elementi niza A u nerastući redosled. Broj elemenata niza A je N. Štampati niz A pre i posle sortiranja.*/

package nizovi;

import java.util.Scanner;

public class Primer5 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		int[] a = new int[100];

		System.out.println("Unesite broj elemenata n niza a:");
		int n = ulaz.nextInt();

		System.out.println("Unesite elemente niza a: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = ulaz.nextInt();
		}

		System.out.println("Niz pre sortiranja: ");
		for (int i = 1; i <= n; i++)
			System.out.print(a[i] + " ");

		// Sortiranje elemenata niza
		for (int i = 1; i <= n - 1; i++)
			for (int j = i + 1; j <= n; j++) {
				if (a[i] <= a[j]) {

					// Zamena elemenata niza a
					int pom = a[i];
					a[i] = a[j];
					a[j] = pom;
				}
			}

		System.out.println("\nNiz posle sortiranja: ");
		for (int i = 1; i <= n; i++)
			System.out.print(a[i] + " ");
		ulaz.close();
	}

}
