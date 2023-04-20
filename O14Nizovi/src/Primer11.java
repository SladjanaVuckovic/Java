/*Napisati program kojim se određuje maksimalni element i njegov redni broj u celobrojnom vektoru X od N elemenata.*/

import java.util.Scanner;

public class Primer11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza:");
		int n = sc.nextInt();

		int x[] = new int[100];

		System.out.println("Unesite elemente niza");
		for (int i = 1; i <= n; i++) {
			System.out.println("x[" + i + "]");
			x[i] = sc.nextInt();

		}
		int imax = 1, max = x[1];
		for (int i = 2; i <= n; i++)
			if (x[i] > max) {
				imax = i;
				max = x[i];
			}
		System.out.println("Maximalni element niza je: " + max + " Sa rednim brojem " + imax);
		sc.close();
	}

}
