package grananjeVezbe;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		double x, y;
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite vrednost za x: ");
		x = sc.nextDouble();

		
		if (x > -2 && x <= 2) {
			y = 2 * x;
		} else if (x >= 5 && x < 7) {
			y = 3 * -1;
		} else {
			y = 1 / x;
		}

		
		System.out.println("Vrednost y = " + y);
		sc.close();
	}

}