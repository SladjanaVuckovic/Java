
import java.text.DecimalFormat;
import java.util.Scanner;

public class Primer15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###"); 
		
		System.out.println("Unesite x");
		double x = sc.nextDouble();

		double LazandrovPolinom[] = new double[100];

		LazandrovPolinom[0] = 1;
		LazandrovPolinom[1] = x;

		for (int n = 1; n <= 10; n++) {
			LazandrovPolinom[n + 1] = (2 * n + 1) * LazandrovPolinom[n] / (n + 1) - n * LazandrovPolinom[n - 1] / (n + 1);
			
		}
		for (int n = 0; n < 10; n++)
			System.out.println("L[" + n + "] = " + df.format(LazandrovPolinom[n]));
		sc.close();
	}

}
