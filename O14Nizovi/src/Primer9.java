
import java.util.Scanner;

public class Primer9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Broj elemenata niza:");
		int n = sc.nextInt();

		double x[] = new double[100];

		System.out.println("Clanovi niza:");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "]");
			x[i] = sc.nextDouble();

		}
		double sd;
		double s1 = 0, s2 = 0;
		for (int i = 0; i < n; i++) {

			s1 += x[i] * x[i];
			s2 += x[i];

		}
		sd = Math.sqrt((s1 / n) - ((s2) / n) * (s2 / n));
		System.out.println("Standardna devijacija je " + sd);
		sc.close();
	}

}
