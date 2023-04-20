/*Napisati naredbe kojima se za dato n izračunava faktorijel prirodnog broja n: fakt = n! = 1*2*3*...*n*/

package forPetlja;

import java.util.Scanner;

public class Faktorijel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();

		int f = 1;
		for (int i = 1; i <= n; i++)
			f *= i;
		System.out.println("Faktorijel broja " + n + " je: " + f);
		sc.close();
	}

}
