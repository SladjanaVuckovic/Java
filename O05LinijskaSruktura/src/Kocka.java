

import java.util.Scanner;

public class Kocka {

	public static void main(String[] args) {
		/*Sastaviti algoritam i napisati program kojim se na osnovu unete stranice kocke a izračunava površina i zapremina. Na izlazu štampati površinu i zapreminu kocke.*/

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite stranicu kocke: ");
		double a = sc.nextDouble();

		double p = 6 * a * a;
		double v = a * a * a;

		System.out.println("P = " + p + "\nV = " + v);

	}

}
