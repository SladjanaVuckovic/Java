
import java.util.Scanner;

public class ZbirCifara {

	public static void main(String[] args) {
/* Sastaviti algoritam i napisati program za izračunavanje zbira značajnih cifara proizvoljnog trocifrenog broja datog na ulazu. Na izlazu odštampati traženi zbir. */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite trocifreni broj: ");
		int broj = sc.nextInt();

		int j = broj % 10;
		int s = broj / 100;
		int d = (broj / 10) % 10;

		System.out.println("Zbir cifara broja " + broj + " je " + (j + s + d));
		sc.close();

	}

}
