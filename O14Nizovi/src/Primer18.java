
import java.util.Scanner;

public class Primer18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza: ");
		int n = sc.nextInt();

		double x[] = new double[n];

		System.out.println("Unesite elemente niza:");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "]");
			x[i] = sc.nextDouble();
		}
		double s1 = 0, s2 = 0, s = 1, p = 1;

		for (int i = 0; i < n; i++) {
			s1 += x[i] * x[i];
			s2 += x[i];

			p *= x[i];
		}
		s = Math.sqrt(s1 / n - Math.pow(s2 / n, 2));
		p = Math.pow(p, 1.0 / n);
		System.out.println("S = " + s + " P = " + p);
		sc.close();
	}

}
