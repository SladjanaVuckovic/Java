
import java.util.Scanner;

public class Primer13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata nizova: ");
		int n = sc.nextInt();

		int x[] = new int[n];
		int y[] = new int[n];

		System.out.println("Unesite elemente prvog niza : ");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "]");
			x[i] = sc.nextInt();
		}
		System.out.println("Unesite elemente drugog niza : ");
		for (int i = 0; i < n; i++) {
			System.out.println("y[" + i + "]");
			y[i] = sc.nextInt();

		}
		double f;
		for (int i = 0; i < n; i++) {
			if (x[i] > y[i])
				f = Math.sqrt((x[i] - 0.2) / (2 + y[i]));
			else
				f = Math.sqrt((y[i] - 0.2) / (2 + x[i]));
			System.out.println("Za " + x[i] + " i " + y[i] + " funkcija f je: " + f);
		}
		sc.close();
	}
}