
import java.util.Scanner;

public class IncToCm {

	public static void main(String[] args) {
		/*
		 * Sastaviti algoritam i napisati program za prevođenje dužine zadate u inčima u
		 * centimetre, ako važi relacija 1 inč = 2.54 cm. Na izlazu štampati koliko
		 * iznosi u centimetrima dijagonala televizora od 26 inča.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite duzinu u incima");
		double inc = sc.nextDouble();

		double cm = inc * 2.54;

		System.out.println(inc + " inca je = " + cm + " cm");
		sc.close();

	}

}
