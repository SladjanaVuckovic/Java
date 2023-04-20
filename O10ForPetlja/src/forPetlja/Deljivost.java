/*U zadatom intervalu ispitati i ispisati sve brojeve deljive brojem 3.*/

package forPetlja;

import java.util.Scanner;

public class Deljivost {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite pocetni broj n: ");
		int n = sc.nextInt();
		System.out.println("Unesite poslednji broj m: ");
		int m = sc.nextInt();

		for (int i = n; i <= m; i++) {
			if (i % 3 == 0)
				System.out.println(i);
			sc.close();
		}

	}

}
