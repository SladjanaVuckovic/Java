/*Za unetu kategoriju vozačke dozvole, ispisati kojom vrstom vozila je moguće upravljati. (IF-
ELSE).*/

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		char n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite kategoriju: ");
		n = sc.nextLine().charAt(0);

		if (n == 'A' || n == 'a') {
			System.out.println("Mozete voziti Motor.");
		} else if (n == 'B' || n == 'b') {
			System.out.println("Mozete voziti Automobil.");
		} else if (n == 'C' || n == 'c') {
			System.out.println("Mozete voziti Auto i Kamion");
		} else if (n == 'D' || n == 'd') {
			System.out.println("Mozete voziti Autobus, Kamion i Auto.");
		} else if (n == 'E' || n == 'e') {
			System.out.println("Mozete voziti Auto, Kamion i Autobus.");
		} else {
			System.out.println("Neispravan unos!");
		}
		sc.close();

	}

}
