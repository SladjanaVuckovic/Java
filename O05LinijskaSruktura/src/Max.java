
/*Napisati program kojim se za unete vrednosti a i b izračunava y prema formuli
		  y = 5 * max(a 2, b 2)*/

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za a: ");
		double a = input.nextDouble();
		System.out.print("Unesite vrednost za b: ");
		double b = input.nextDouble();
		System.out.println("y = " + (5 + Math.max(a * a, b * b)));
	}
}