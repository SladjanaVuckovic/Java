

import java.util.Scanner;

public class ZamenaBrojeva {

	public static void main(String[] args) {
		/*
		 * Napisati program koji izvodi zamenu vrednosti dva broja korišćenjem
		 * privremene promenljive.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Dvsa broja, x i y:");
		int x = input.nextInt();
		int y = input.nextInt();

		System.out.println("Pre zamene\nx = " + x + "\ny = " + y);

		int temp = x;
		x = y;
		y = temp;
		System.out.println("Posle zamene\nx = " + x + "\ny = " + y);
		input.close();

	}

}
