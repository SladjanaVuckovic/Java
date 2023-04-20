
import java.util.Scanner;

public class Primer19 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj clanova nizova:");
		int n = sc.nextInt();
		
		double x[] = new double[n];
		double y[] = new double[n];
		
		System.out.println("Unesite elemente niza x: ");
		for(int i =0; i<n; i++) {
			System.out.println("x[" + i + "]");
			x[i] = sc.nextDouble();
		} 
		System.out.println("Unesite elemente niza y: ");
		for(int i =0; i<n; i++) {
			System.out.println("y[" + i + "]");
			y[i] = sc.nextDouble();
		} double f = 1;
		for(int i =0; i<n; i++) {
			f = (x[i] + y[i]) * (x[i] - y[i]);
			System.out.println(" Za " + x[i] +  " i "  + y[i] +  " Dobija se f = " +f );
		}
		sc.close();
	}

}
