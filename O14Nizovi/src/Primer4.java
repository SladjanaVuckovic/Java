/*Napisati program kojim se izračunava i ispisuje proizvod članova niza X od N elemenata koji nisu deljivi sa 4.*/

import java.util.Scanner;

public class Primer4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza: ");
		int n = sc.nextInt();

		int x[] = new int[n];

		System.out.println("Unesite elemente niza:");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}
		int p = 1;
		for (int i = 0; i < n; i++) {
			if (x[i] % 4 != 0)
				p *= x[i];
		}
		System.out.print(p);
		sc.close();
	}

}
