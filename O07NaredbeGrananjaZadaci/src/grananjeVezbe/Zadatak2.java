package grananjeVezbe;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		double x, y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite vrednost za x: ");
		x = sc.nextDouble();

		if (x < 0) {
			y = 5;

		} else if (x >= 0 && x < 1) {
			y = x + 2;
		} else if (x >= 1 && x < 5) {
			y = 3 * x - 1;
		} else {
			y = 2 * x;
		}

		System.out.println("Vrednost funkcije y je: " + y);

		sc.close();
	}

}