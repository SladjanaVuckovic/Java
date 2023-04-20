/*Napisati program kojim se ispisuje recipročna vrednost člana niza X od N elemenata ako je on paran, a ako je neparan ispisuje se njegov kvadrat, pri čemu se ne unosi nula za člana niza X.*/

import java.util.Scanner;

public class Primer8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Broj elemenata niza:");
		int n = sc.nextInt();

		int x[] = new int[n];

		System.out.println("Elementi niza :");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "]");
			x[i] = sc.nextInt();
		}
		double y;
		for (int i = 0; i < n; i++) {
			if (x[i] % 2 == 0)
				y = (double) 1 / x[i];
			else
				y = x[i] * x[i];
			System.out.println("Za " + x[i] + " dobija se y = " + y);
		}

		sc.close();

	}

}
