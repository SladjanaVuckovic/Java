import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*Trougao je zadat dužinama stranica a, b i c. Sastaviti algoritam i napisati program za izračunavanje:
• poluprečnika opisanog kruga
• poluprečnika upisanog kruga
• rastojanja između centra opisanog i upisanog kruga*/

public class Krug {

	public static void main(String[] args) throws Exception {
		/*
		 * Trougao je zadat dužinama stranica a, b i c. Sastaviti algoritam i napisati
		 * program za izračunavanje:
		 */

		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite stranice trougla:");
		System.out.print("a = ");
		double a = Double.parseDouble(bfr.readLine());
		System.out.print("b = ");
		double b = Double.parseDouble(bfr.readLine());
		System.out.print("c = ");
		double c = Double.parseDouble(bfr.readLine());

		double s = (a + b + c) / 2;

		double p = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		double R = (a * b * c) / (4 * p);
		double r = (a * b * c) / (2 * R * s);
		double d = Math.sqrt(R * (R - 2 * r));

		System.out.println("R = " + df.format(R) + "\tr = " + df.format(r) + "\td = " + df.format(d));

	}

}
