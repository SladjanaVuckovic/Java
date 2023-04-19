/*Napisati program kojim se od tri učitana broja a, b i c nalazi najveći broj.*/

import java.util.Scanner;

public class NajveciBroj {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite a, b i c:");
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
		System.out.print("c = ");
		int c = sc.nextInt();
		
		int max = a;
		if (b>max )
			max=b;
		if(c>max )
			max = c;
		System.out.println("Najveci broj je " + max);
	}

}
