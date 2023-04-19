package grananjeVezbe;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*Napisati program kojim se utvrdjuje da li je uneti znak malo ili veliko slovo, cifra ili specijalni znak*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite karakter");
		char a = sc.next().charAt(0);
		
		if (a >='A' && a <='Z') {
			System.out.println("Uneti znak je veliko slovo");
		}
		else if(a>='a' && a<='z' ) {
			System.out.println("Uneti znak je malo slovo");
		}
		else if(a >='0' && a<='9') {
			System.out.println("Uneti karakter je cifra");
		}	
		else
			System.out.println("Uneti karakter je specijalni simbol");
		
	}
}
