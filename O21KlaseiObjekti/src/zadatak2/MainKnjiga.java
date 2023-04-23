package zadatak2;

import java.util.Scanner;

public class MainKnjiga {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		Knjiga ime = new Knjiga();
		Knjiga broj = new Knjiga();

		System.out.println("Unesite ime knjige: ");
		ime.imeKnjige = ulaz.nextLine();

		System.out.println("Unesite broj stranica knjige: ");
		broj.brojStranica = ulaz.nextInt();

		ime.prikaziIme();
		broj.prikaziBroj();
		ulaz.close();
	}
}
