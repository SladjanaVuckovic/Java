package zadatak1;

import java.util.Scanner;

public class MainMacka {
	public static void main(String[] args) {

		Macka macka = new Macka();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Unesite ime macke:");

		macka.ime = scanner.nextLine();

		macka.prikazatiIme();
	}
}