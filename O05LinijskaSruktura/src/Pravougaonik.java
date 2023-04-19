/*Napisati program kojim se logičkoj promenljivoj p dodeljuje vrednost true, ako se pravougaonik sa stranicama a i b
može ceo smestiti u pravougaonik sa stranicama c i d.*/

import java.util.Scanner;

public class Pravougaonik {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite stranicu prvog pravougaonika a: ");
		int a = input.nextInt();
		
		System.out.print("Unesite stranicu prvog pravougaonika b: ");
		int b = input.nextInt();
		
		System.out.print("Unesite stranicu drugog pravougaonika c: ");
		int c = input.nextInt();
		
		System.out.print("Unesite stranicu drugog pravougaonika d: ");
		int d = input.nextInt();
		boolean p = ((a < c) && (b < d)) || ((a < d) && (b < c));
		
		System.out.println("p = " + p);
	}
}