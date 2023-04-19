/*Putovanje traje n sekundi. Napisati program za izračunavanje koliko je to sati, minuta i sekundi.*/

import java.util.Scanner;

public class Sekunde {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj sekundi:");
		int s = sc.nextInt();

		int h = s / 3600;
		int min = (s % 3600) / 60;
		int sec = s % 60;

		System.out.println(h + " H\n" + min + " Min\n" + sec + " Sec");

	}
}
