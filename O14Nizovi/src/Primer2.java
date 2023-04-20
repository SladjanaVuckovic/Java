/*Napisati program kojim se izračunava proizvod članova niza X od N elemenata čija je vrednost u intervalu [3, 9].*/

import java.util.Scanner;

public class Primer2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza:");
		int n = sc.nextInt();

		int x[] = new int[n];

		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "] =");
			x[i] = sc.nextInt();

		}
		int s = 1;
		for (int i = 0; i < n; i++) {
			if (x[i] >= 3 && x[i] <= 9)
				s *= x[i];
		}
		System.out.print(s);
		sc.close();
	}

}
