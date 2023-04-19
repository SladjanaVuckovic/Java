/* Napisati program za izdvajanje cifara dvocifrenog broja i ispisivanje unazad.*/

import java.util.Scanner;

public class DvocifrenBroj {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite dvocifren broj:");
		int a = sc.nextInt();

		int j = a % 10;
		int d = a / 10;

		System.out.println(j + "" + d);
		sc.close();
	}

}
