/*Napisati program kojim se za uneto n izračunava vrednost sume
𝑆 = 3! + 6! + 9!+. . . +(3𝑛)!.*/

package ciklicnaStruktura;

import java.util.Scanner;

public class Primer8 {
	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();

		int p = 1, s = 0;
		int i = 1;

		while (i <= 3 * n) {
			p *= i;
			if (i % 3 == 0)
				s += p;
			i++;
		}

		System.out.println("Suma s = " + s);
		ulaz.close();
	}
}