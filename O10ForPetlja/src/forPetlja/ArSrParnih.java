/*Napisati program zy izračunavanje aritmetičke sredine parnih brojeva.*/

package forPetlja;

import java.util.Scanner;

public class ArSrParnih {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko brojeva zelite da unesete?");
		int n = sc.nextInt();

		int broj = 0;
		int brojParnih = 0;
		double suma = 0, as;
		for (int i = 1; i <= n; i++) {
			System.out.print("Unesite " + i + ". broj: ");
			broj = sc.nextInt();
			if (broj % 2 == 0) {
				suma += broj;
				brojParnih++;
			}
		}
		as = suma / brojParnih;
		System.out.println("Aritmeticka sredina parnih brojeva je: " + as);
		sc.close();
	}

}
