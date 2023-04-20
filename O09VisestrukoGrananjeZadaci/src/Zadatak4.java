/* Napišite program SEDIMDAN koji za uneti datum određuje koji datum će biti kroz 7 dana. Sa standardnog ulaza se unose tri pozitivna cela broja(svaki u zasebnom redu) koji predstavljaju dan, mesec i godinu jednog ispravnog datuma. Na standardni izlaz ispisati tri cela broja koja predstavljaju dan, mesec i godinu datuma koji će nastupiti kroz 7 dana. Svi brojevi se ispisuju u
jednom redu, a iza svakog broja navodi se tačka.*/

import java.util.Scanner;

public class Zadatak4 {
	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		int dan, mesec, godina, limit;
		limit = 0;

		System.out.println("Unesite dan: ");
		dan = ulaz.nextInt();
		System.out.println("Unesite mesec: ");
		mesec = ulaz.nextInt();
		System.out.println("Unesite godinu: ");
		godina = ulaz.nextInt();

		switch (mesec) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:

			limit = 31;

			break;
		case 4:
		case 6:
		case 9:
		case 11:

			limit = 30;

			break;

		case 2:
			if (godina % 4 == 0) {
				limit = 29;
			} else {
				limit = 28;
			}
			break;

		}
		if (dan + 7 > limit) {
			dan = dan + 7 - limit;
			mesec = mesec + 1;

			if (mesec > 12) {
				mesec = 1;
				godina = godina + 1;
			}

		} else {
			dan = dan + 7;

		}

		
		System.out.println("Datum koji ce biti za 7 dana je " + dan + "." + mesec + "." + godina);
		ulaz.close();
	}

}
