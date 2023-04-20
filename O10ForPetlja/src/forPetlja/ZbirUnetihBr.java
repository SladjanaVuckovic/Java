/*Napisati program koji sabira zadati broj sabiraka.*/

package forPetlja;

import java.util.Scanner;

public class ZbirUnetihBr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Koliko brojeva zelite da saberete?");
		int n = sc.nextInt();

		int zbir = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("Unesite " + i + ". broj");
			int broj = sc.nextInt();
			zbir += broj;
		}

		System.out.println("Zbir unetih brojeva je: " + zbir);
		sc.close();
	}

}
