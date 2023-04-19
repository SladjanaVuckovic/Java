

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite vrednost x: ");
		double x = sc.nextDouble();

		boolean y = Math.sqrt((2 + x - x * x * x / (x + 2))) > 0 || Math.exp(x) < x - 1 && Math.sqrt(x - 1) <= 0;

		System.out.println(y);

		sc.close();
	}

}
