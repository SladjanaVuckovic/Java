import java.util.Scanner;

public class Primer14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double LP[] = new double[100];
				
		System.out.println("Unesite x: ");
		double x = sc.nextDouble();
		
		LP[0] = 1;
		LP[1] = 1 - x;
		
		for(int n =1; n<=9; n++) {
			LP[n+1]= (2 * n -1 - x) * LP[n] - n*n * LP[n-1];
		   
		}
		for(int n=0; n<10; n++)
			System.out.println("L[" +n+ "] = " + LP[n]);
		sc.close();
	}

}
