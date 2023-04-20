/*Napisati program kojim se ispisuje suma članova niza X od N elemenata čija je cifra jedinica 5.*/

import java.util.Scanner;

public class Primer7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Broj elemenata niza: ");
		int n = sc.nextInt();

		int x[] = new int[n];

		System.out.println("Elementi niza:");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}
		int s = 0;
		for (int i = 0; i < n; i++) {
			if (x[i] % 10 == 5)
				s += x[i];
		}
		System.out.print("Suma je " + s);
		sc.close();
	}

}
