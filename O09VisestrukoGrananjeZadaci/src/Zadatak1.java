/* Za uneta tri broja, ispisati najveci broj.*/

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		int najveciBroj;

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite prvi broj: ");
		int br1 = sc.nextInt();

		System.out.println("Unesite drugi broj: ");
		int br2 = sc.nextInt();

		System.out.println("Unesite treci broj: ");
		int br3 = sc.nextInt();

		if (br1 > br2) {
			if (br1 > br3) {
				najveciBroj = br1;
			} else {
				najveciBroj = br3;
			}
		} else {
			if (br2 > br3) {
				najveciBroj = br2;
			} else {
				najveciBroj = br3;
			}
		}

		System.out.println("Najveci od unetih brojeva je: " + najveciBroj);
		sc.close();
	}

}