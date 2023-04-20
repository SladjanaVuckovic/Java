/*Napisati program kojim se ispisuje proizvod cifara članova niza X od N elemenata.*/

import java.util.Scanner;

public class Primer6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Broj elemenata niza");
		int n = sc.nextInt();

		int x[] = new int[n];

		System.out.println("Clanovi niza: ");
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}
		int cifra;
		for (int i = 0; i < n; i++) {
			int p = 1;
			int a = x[i];
			while (a != 0) {
				cifra = a % 10;
				p *= cifra;
				a /= 10;
			}
			System.out.println("Proizvod cifara broja " + x[i] + " je " + p);
		}
		sc.close();
	}

}
