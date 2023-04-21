/*Napisati program za izračunavanje sume svih parnih brojeva od 1 do zadatog broja n korišćenjem while i do-while petlje.*/

import java.util.Scanner;

public class Zadatak1b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite n");
		int n = sc.nextInt();

		int i = 1, suma = 0;
		do {
			if (i % 2 == 0)
				suma += i;
			i++;
		} while (i <= n);

		System.out.println("Suma parnih brojeva od 1 do broja " + n + " iznosi: " + suma);
		sc.close();
	}

}
