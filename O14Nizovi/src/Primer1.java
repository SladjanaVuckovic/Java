/*Napisati program kojim se učitavaju i štampaju članovi niza X od N elemenata.*/

import java.util.Scanner;

public class Primer1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj clanova iza n");
		int n = sc.nextInt();

		// Rezervisanje prostora za niz od n clanova

		int x[] = new int[n];

		System.out.println("Unesite clanove niza");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = sc.nextInt();
		}
		// Stampanje clanova niza

		for (int i = 0; i < x.length; i++)
			System.out.println(x[i]);
		sc.close();
	}

}
