/*Napisati program kojim se ispisuje najveća cifra članova niza X od N elemenata.*/

import java.util.Scanner;

public class Primer5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza: ");
		int n = sc.nextInt();

		int x[] = new int[n];

		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}

		int cifra;
		for (int i = 0; i < n; i++) {
			int max = 0;
			while (x[i] > 0) {
				cifra = x[i] % 10;
				if (cifra > max)
					max = cifra;
				x[i] /= 10;
			}
			System.out.println(max);
		}
		sc.close();
	}

}
