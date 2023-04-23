package zadatak2;

import java.util.Scanner;

public class MainOsoba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Osoba o = new Osoba();

		System.out.println("Unesite ime: ");
		o.ime = sc.nextLine();

		System.out.println("Unesite datum rodjenja: ");
		o.datum = sc.nextLine();
		System.out.println("Unesite adresu stanovanja: ");
		o.adresa = sc.nextLine();

		System.out.println(o.ToString());

		sc.close();
	}
}