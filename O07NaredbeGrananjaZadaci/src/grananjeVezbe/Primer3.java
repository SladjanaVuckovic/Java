package grananjeVezbe;

import java.util.Scanner;

public class Primer3 {

	public static void main(String[] args) {
		/*Za uneti broj ispitati da li je deljiv brojem 2 I brojem 3*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = scanner.nextInt();
		
		if (broj %2 ==0 && broj % 3 ==0)
			System.out.println("Uneti broj je deljiv sa 2 i 3");
	}

}
