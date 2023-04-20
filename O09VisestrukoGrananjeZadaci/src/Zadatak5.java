/* Napisati program koji omogucuje da za uneti naziv meseca i broj dana ispise horoskopski znak.*/

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		String mesec = "", horoskopskiZnak = "";
		int dan, redniBrojZnaka = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite mesec rođenja: ");
		mesec = sc.nextLine();
		System.out.println("Unesite dan rođenja: ");
		dan = sc.nextInt();
		sc.close();

		if (mesec.equalsIgnoreCase("januar")) {
			redniBrojZnaka = 1;
		} else if (mesec.equalsIgnoreCase("februar")) {
			redniBrojZnaka = 2;
		} else if (mesec.equalsIgnoreCase("mart")) {
			redniBrojZnaka = 3;
		} else if (mesec.equalsIgnoreCase("april")) {
			redniBrojZnaka = 4;
		} else if (mesec.equalsIgnoreCase("maj")) {
			redniBrojZnaka = 5;
		} else if (mesec.equalsIgnoreCase("jun")) {
			redniBrojZnaka = 6;
		} else if (mesec.equalsIgnoreCase("jul")) {
			redniBrojZnaka = 7;
		} else if (mesec.equalsIgnoreCase("avgust")) {
			redniBrojZnaka = 8;
		} else if (mesec.equalsIgnoreCase("septembar")) {
			redniBrojZnaka = 9;
		} else if (mesec.equalsIgnoreCase("oktobar")) {
			redniBrojZnaka = 10;
		} else if (mesec.equalsIgnoreCase("novembar")) {
			redniBrojZnaka = 11;
		} else if (mesec.equalsIgnoreCase("novembar")) {
			redniBrojZnaka = 11;
		} else if (mesec.equalsIgnoreCase("decembar")) {
			redniBrojZnaka = 12;
		}

		if (dan >= 1 && dan <= 31) {

			switch (redniBrojZnaka) {
			case 1:
				if (dan >= 1 && dan <= 20) {
					horoskopskiZnak = "Jarac";
				} else if (dan >= 21 && dan <= 31) {
					horoskopskiZnak = "Vodolija";
				}
				break;
			case 2:
				if (dan >= 1 && dan <= 19) {
					horoskopskiZnak = "Vodolija";
				} else if (dan >= 20 && dan <= 28) {
					horoskopskiZnak = "Ribe";
				}
				break;
			case 3:
				if (dan >= 1 && dan <= 20) {
					horoskopskiZnak = "Ribe";
				} else if (dan >= 21 && dan <= 31) {
					horoskopskiZnak = "Ovan";
				}
				break;
			case 4:
				if (dan >= 1 && dan <= 20) {
					horoskopskiZnak = "Ovan";
				} else if (dan >= 21 && dan <= 30) {
					horoskopskiZnak = "Bik";
				}
				break;
			case 5:
				if (dan >= 1 && dan <= 21) {
					horoskopskiZnak = "Bik";
				} else if (dan >= 22 && dan <= 31) {
					horoskopskiZnak = "Blizanci";
				}
				break;
			case 6:
				if (dan >= 1 && dan <= 21) {
					horoskopskiZnak = "Blizanci";
				} else if (dan >= 22 && dan <= 30) {
					horoskopskiZnak = "Rak";
				}
				break;
			case 7:
				if (dan >= 1 && dan <= 22) {
					horoskopskiZnak = "Rak";
				} else if (dan >= 23 && dan <= 31) {
					horoskopskiZnak = "Lav";
				}
				break;
			case 8:
				if (dan >= 1 && dan <= 22) {
					horoskopskiZnak = "Lav";
				} else if (dan >= 23 && dan <= 31) {
					horoskopskiZnak = "Devica";
				}
				break;
			case 9:
				if (dan >= 1 && dan <= 22) {
					horoskopskiZnak = "Devica";
				} else if (dan >= 23 && dan <= 30) {
					horoskopskiZnak = "Vaga";
				}
				break;
			case 10:
				if (dan >= 1 && dan <= 23) {
					horoskopskiZnak = "Vaga";
				} else if (dan >= 24 && dan <= 31) {
					horoskopskiZnak = "Škorpija";
				}
				break;
			case 11:
				if (dan >= 1 && dan <= 22) {
					horoskopskiZnak = "Vaga";
				} else if (dan >= 23 && dan <= 30) {
					horoskopskiZnak = "Strelac";
				}
				break;
			case 12:
				if (dan >= 1 && dan <= 21) {
					horoskopskiZnak = "Strelac";
				} else if (dan >= 22 && dan <= 31) {
					horoskopskiZnak = "Jarac";
				}
				break;
			}

		} else {

			System.out.println("Nepravilan unos!");
		}

		System.out.println("Horoskopski znak: " + horoskopskiZnak);

	}

}