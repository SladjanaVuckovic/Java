/*Sastaviti algoritam i napisati program kojim se određuje maksimalni i minimalni element u celobrojnom nizu X od N elemenata.*/

import java.util.Scanner;

public class Primer10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza");
		int n = sc.nextInt();

		int x[] = new int[100];

		System.out.println("Unesite elemente niza: ");
		for (int i = 1; i <= n; i++) {
			System.out.println("x[" + i + "]");
			x[i] = sc.nextInt();
		}

		int min, max;
		min = max = x[1];
		for (int i = 1; i <= n; i++) {
			if (x[i] > max)
				max = x[i];
			if (x[i] < min)
				min = x[i];
		}
		System.out.println("Maksimalni element je " + max + "\nMinimalni element je " + min);
		sc.close();
	}

}
