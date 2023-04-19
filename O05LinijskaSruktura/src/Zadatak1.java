import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/**/

		DecimalFormat df = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite vrednosti x, y i z");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();

		double f = ((x + y) * (x + z) * Math.sin(x)) / (2 * x - y);

		System.out.println("Funkcija f = " + df.format(f));
	}

}
