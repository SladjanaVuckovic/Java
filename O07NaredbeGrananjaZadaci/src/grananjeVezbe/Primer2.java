package grananjeVezbe;

import java.util.Scanner;

/*Za uneti broj ispitati da li je pozitivan, negativan ili jednak nuli.*/

public class Primer2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int broj;
		
		System.out.println("Unesite broj: ");
		broj = sc.nextInt();
		
		if(broj >0) {
			System.out.println("Broj je pozitivan");
		}
		if(broj<0) {
			System.out.println("Broj je negativan");
		}
		if(broj ==0) {
			System.out.println("Uneti broj je nula");
		}
	}
}
