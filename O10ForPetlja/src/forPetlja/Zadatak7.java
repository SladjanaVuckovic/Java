/* Napisati program kojim se za date prirodne brojeve m i n, izračunava:
S = n*(n+m)*(n+2m)*(n+3m)...*(n+m*m)*/

package forPetlja;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vrednost za n: ");
		int n = sc.nextInt();
		System.out.println("Unesite vrednost za m: ");
		int m = sc.nextInt();

		int s = 1;
		for (int i = 1; i <= m; i++) {
			s *= n + i * m;
		}

		System.out.println("Vrednost za S je: " + s);
		sc.close();

	}

}
