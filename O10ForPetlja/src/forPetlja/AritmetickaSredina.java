/*Napisati program za izračunavanje aritmetičke sredine unetih brojeva.*/

package forPetlja;

import java.util.Scanner;

public class AritmetickaSredina {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko brojeva zelite da unesete?");
		int n = sc.nextInt();

		int broj = 0;
		double suma = 0, as;
		for (int i = 1; i <= n; i++) {
			System.out.print("Unesite " + i + ". broj: ");
			broj = sc.nextInt();
			suma += broj;
		}
		
		as = suma / n;
		System.out.println("Aritmeticka sredina unetih brojeva je: " + as);
		sc.close();
	}

}
