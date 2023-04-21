package forPetlja;

import java.util.Scanner;

/*Sastaviti algoritam i napisati program kojim se učitava n celih brojeva, 
 * a zatim se izračunava i štampa suma svih pozitivnih i suma svih negativnih učitanih brojeva.*/

public class Primer15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Koiko brojeva zelite da unesete?");
		int n = sc.nextInt();

		int sp = 0, sn = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite " + (i + 1) + ". broj: ");
			int broj = sc.nextInt();

			if (broj > 0) {
				sp += broj;
			} else
				sn += broj;
		}
		System.out.println("Suma pozitivnih brojeva je: " + sp);
		System.out.println("Suma negativnih brojeva je: " + sn);
		sc.close();
	}

}
