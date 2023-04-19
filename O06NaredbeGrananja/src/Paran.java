/* Napisati program kojim se unosi prirodan broj a i ako je neparan ispisuje njegova recipročna vrednost, a ako je paran ispisuje kvadrat njegovog prethodnika. */

import java.util.Scanner;

public class Paran {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("a = ");
		double a = sc.nextDouble();

		double y;
		if (a % 2 != 0)
			y = 1 / a;
		else
			y = (a - 1) * (a - 1);

		System.out.println("y = " + y);
		sc.close();

	}

}
