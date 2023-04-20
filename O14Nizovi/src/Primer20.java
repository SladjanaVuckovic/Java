/*Napisati program kojim se ispisuje proizvod najvećih cifara članova niza X od N elemenata.*/

import java.util.Scanner;

public class Primer20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza: ");
		int n = sc.nextInt();

		int x[] = new int[n];

		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "]");
			x[i] = sc.nextInt();
		}
		int cifra;
		int p = 1;
		for (int i = 0; i < n; i++) {
			int max = 0, a = x[i];
			while (a > 0) {
				cifra = a % 10;
				if (cifra > max)
					max = cifra;

				a /= 10;
			}
			System.out.println("Najveca cifra clana niza " + x[i] + " je " + max);
			p *= max;
		}
		System.out.println("Proizvod najvecih cifara je " + p);
		sc.close();
	}

}
