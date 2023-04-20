package nizovi;

import java.util.Scanner;

public class Primer1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza: ");
		int n = sc.nextInt();

		double x[] = new double[100];
		double y[] = new double[100];

		System.out.println("Unesite koordinate tacaka x i y:");
		for (int i = 1; i <= n; i++) {
			System.out.println("x[" + i + "]");
			x[i] = sc.nextDouble();
			System.out.println("y[" + i + "]");
			y[i] = sc.nextDouble();
		}
		x[0] = x[n];
		x[n + 1] = x[1];
		x[n + 1] = x[1];
		y[n + 1] = y[1];

		double s = 0, p = 1;
		for (int i = 1; i <= n; i++)
			s += y[i] * (x[i - 1] - x[i + 1]);
		p = 0.5 * s;
		System.out.println("povrsina parcele je " + p);
		sc.close();

	}

}
