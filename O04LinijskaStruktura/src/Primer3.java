import java.util.Scanner;

public class Primer3 {

	public static void main(String[] args) {

		// Sastaviti algoritam i napisati program kojim se izračunava vrednost funkcije
		// na osnovu unetih vrednosti za x, y i z. Na izlazu štampati vrednost funkcije.

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost za x, y i z:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();

		double f = Math.pow((x + 3 * z + y) / (2 * x), 4) - x / (x + 3 * z - y);

		System.out.println(f);
	}

}

