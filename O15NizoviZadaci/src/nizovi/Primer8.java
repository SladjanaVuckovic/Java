/*Dat je niz brojeva sa vrednostima između 0 i 99. Prebrojati koliko puta se pojavljuje svaka cifra dekadnog brojnog sistema u nizu brojeva kao značajna cifra, kao i na kom mestu (desetica i jedinica). */

package nizovi;

import java.util.Scanner;

public class Primer8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] bj = new int[10];
		int[] bd = new int[10];
		int broj, j, d;

		for (int i = 0; i <= 9; i++) {
			bj[i] = 0;
			bd[i] = 0;
		}
		System.out.println("Koliko brojeva želite da unesete? ");
		int n = sc.nextInt();

		System.out.println("Unesite brojeve: ");
		for (int i = 1; i <= n; i++) {
			broj = sc.nextInt();

			if (broj >= 0 && broj <= 99) {
				if (broj < 10)
					j = broj;
				else {
					d = broj / 10;
					bd[d]++;
					j = broj - 10 * d;
				}
				bj[j]++;
			}
		}
		System.out.println("Cifra\tKao desetica\tKao jedinica ");
		for (int i = 0; i <= 9; i++)
			System.out.println(i + "\t" + bd[i] + "\t\t" + bj[i]);
		sc.close();
	}

}
