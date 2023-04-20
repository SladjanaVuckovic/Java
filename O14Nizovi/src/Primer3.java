/*Napisati program kojim se ispisuju susedni članovi niza X od N elemenata čija je suma parna.*/

import java.util.Scanner;

public class Primer3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza:");
		int n = sc.nextInt();

		int x[] = new int[n];

		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}

		for (int i = 1; i < n; i++)
			if ((x[i] + x[i - 1]) % 2 == 0)
				System.out.println(x[i - 1] + " " + x[i]);

		sc.close();
	}

}
