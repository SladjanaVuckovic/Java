/*Napisati metodu kojom se utvrđuje da li je godina prestupna ili nije. 
 * U glavnom programu uneti godinu i ispitati da
li je prestupna ili nije. Na primer, 1972. godina je prestupna.*/

import java.io.*;

public class Primer16a {

	public static void prestupna(int godina) {
		// Ispitivanje da li je godina prestupna ili nije
		if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0)

			System.out.println("Godina " + godina + " je prestupna.");
		else
			System.out.println("Godina " + godina + " nije prestupna.");
	}

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite godinu: ");
		int godina = Integer.parseInt(ulaz.readLine());
		prestupna(godina);
	}

}
