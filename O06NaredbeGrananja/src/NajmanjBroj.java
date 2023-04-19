/*Napisati program kojim se od tri učitana broja a, b i c nalazi najmanji broj.*/


import java.util.Scanner;

public class NajmanjBroj {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite a, b i c: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int min = a;
		if(b<min)
			min =b;
		if(c<min)
			min = c;
		
		System.out.println("Najmanji broj je " +min);
		
		
	}

}
