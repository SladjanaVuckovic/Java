/*Napisati program kojim se ispisuje najmanja cifra članova niza X od N elemenata.*/

import java.util.Scanner;

public class Primer21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza: ");
		int n = sc.nextInt();

		int x[] = new int[n];

		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "]");
			x[i] = sc.nextInt();
		}
		int cifra;
		for (int i = 0; i < n; i++) {
			int min = 9, a = x[i];
			while (a > 0) {
				cifra = a % 10;
				if (cifra < min)
					min = cifra;
				a /= 10;
			}
			System.out.println("Najmanja cifra clana niza " + x[i] + " je " + min);
			sc.close();
		}

	}

}
