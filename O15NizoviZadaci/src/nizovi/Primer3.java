package nizovi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Primer3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.println("Unesite broj clanova nizova: ");
		int n = sc.nextInt();
		
		double a[] = new double[n+1];
		double x[] = new double[n+1];
		double y[] = new double[n+1];
		
		System.out.println("Unesite clanove niza a:");
		for(int i =1; i<=n; i++) {
			System.out.println("a[" + i + "]");
			a[i] = sc.nextDouble();
		}
		System.out.println("Unesite clanove niza x:");
		for(int i =1; i<=n; i++) {
			System.out.println("x[" + i + "]");
			x[i] = sc.nextDouble();
		}
		System.out.println("Unesite clanove niza y:");
		for(int i =1; i<=n; i++) {
			System.out.println("y[" + i + "]");
			y[i] = sc.nextDouble();
		}
		double s =0, s1 =0, s2 = 0; double A = 0, xt = 1, yt = 1;
		for(int i = 1; i <= n; i++) {
			s += a[i];
			A = s;
			s1 += a[i] * x[i];
			xt =  s1/A;
			s2 += a[i] * y[i];
			yt = s2/A;
			
		}
		System.out.println("A = " +df.format(A) + "\nXT = "  +df.format(xt) + " \nYT = "  + df.format(yt));
		sc.close();
	}

}
