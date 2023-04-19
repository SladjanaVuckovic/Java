
import java.util.Scanner;

public class Sekunde {

	public static void main(String[] args) {
		/*
		 * Napisati program koji vreme učitano u satima, minutima i sekundama izračunava
		 * i pretvara u sekundama.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Sati: ");
		int sati = sc.nextInt();
		System.out.print("Minuti: ");
		int min = sc.nextInt();
		System.out.print("Sekunde: ");
		int sec = sc.nextInt();

		int s = sati * 3600 + min * 60 + sec;

		System.out.println(sati + "H " + min + "min " + sec + "sec " + " >>> " + s + " sekundi");
		sc.close();

	}

}
