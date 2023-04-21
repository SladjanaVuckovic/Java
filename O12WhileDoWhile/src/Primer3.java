/*Napisati program za ispis sume recipročnih vrednosti prvih n prirodnih brojeva (harmonijski niz: 1 + 1/2 + 1/3 + ... + 1/n) .*/

import java.util.Scanner;

public class Primer3 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		int n, i = 1;
		double s = 0;
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		while (i <= n) {
			s += (double) 1 / i;
			i++;
		}
		System.out.println("Suma recipročnih vrednosti brojeva do " + n + " je: " + s);
		ulaz.close();
	}

}
