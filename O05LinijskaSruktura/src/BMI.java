
import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		/*
		 * Napisati program koji za unetu visinu i masu izračunava indeks telesne mase
		 * BMI = m[kg]/(h[m])2.
		 */
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite svoju visinu u metrima:");
		double h = sc.nextDouble();
		System.out.println("Unesite svoju masu u kg:");
		double m = sc.nextDouble();

		double bmi = m / (h * h);

		System.out.println("Vas indeks telesne mase(BMI) je: " + df.format(bmi));
		sc.close();

	}

}
