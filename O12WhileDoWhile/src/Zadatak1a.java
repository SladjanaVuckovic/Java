/*Napisati program za izračunavanje sume svih parnih brojeva od 1 do zadatog broja n korišćenjem while i do-while petlje.*/

import java.util.Scanner;

public class Zadatak1a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();

		int i = 1, suma = 0;
		while (i <= n) {
			if (i % 2 == 0)
				suma += i;
			i++;
		}
		System.out.println("Suma parnih brojeva od 1 do broja " + n + " iznosi: " + suma);
		sc.close();
	}

}
