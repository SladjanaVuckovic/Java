import java.util.Scanner;

public class TrocifrenBroj {

	public static void main(String[] args) {
		
		/* Napisati program za izdvajanje cifara trocifrenog broja. */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite trocifreni broj: ");
		int broj = sc.nextInt();

		int j = broj % 10;
		int s = broj / 100;
		int d = (broj / 10) % 10;

		System.out.println("Broj stotice: " + s + "\nBroj desetice: " + d + "\nBroj jedinice: " + j);


	}

}
