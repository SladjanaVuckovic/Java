package zadatak7;

import java.util.Scanner;

public class MainApsVrednost {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj");
		double broj = sc.nextDouble();

		ApsolutnaVrednost av = new ApsolutnaVrednost(broj);

		System.out.println("Apsolutna vrednost broja " + broj + " je: " + av.abs());
		sc.close();
	}

}
