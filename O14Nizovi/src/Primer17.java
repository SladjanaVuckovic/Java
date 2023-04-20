
import java.util.Scanner;

public class Primer17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double f[] = new double[1001];

		System.out.println("Unesite broj od 1 do 1000:");
		int broj = sc.nextInt();

		if (broj < 1 || broj > 1000)
			System.out.println("Greška.");
		else {
			f[1] = 0.5;
			for (int n = 2; n <= broj; n++) {
				double s = 0;
				for (int i = 1; i <= n - 1; i++)
					s += f[i] * f[n - i];
				f[n] = s;
			}
			System.out.println("F(" + broj + ") = " + f[broj]);
			sc.close();
		}
	}
}
