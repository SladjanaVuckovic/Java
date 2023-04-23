/*Napisati funkciju kojom se ispituje da li se pravougaonik dužina stranica a i b 
 * može ceo smestiti u pravougaonik dužina stranica c i d 
 * uz uslov da su im stranice paralelne. 
 * U glavnom programu uneti pravougaonik sa stranicama a i b i n pravougaonika sa stranicama c i d.*/

import java.io.*;

public class Primer13 {

	public static boolean uslov(int a, int b, int c, int d) {
		return ((a < c) && (b < d)) || ((a < d) && (b < c));
	}

	public static void main(String[] args) throws Exception {

		int a, b, n;
		int c[] = new int[100];
		int d[] = new int[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka
		System.out.print("Unesite stranicu a: ");
		a = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite stranicu b: ");
		b = Integer.parseInt(ulaz.readLine());
		System.out.print("Koliko novih pravougaonika želite da unesete? ");
		n = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite stranice c i d: \n");

		for (int i = 1; i <= n; i++) {
			System.out.print("c[" + i + "] = ");
			c[i] = Integer.parseInt(ulaz.readLine());
			System.out.print("d[" + i + "] = ");
			d[i] = Integer.parseInt(ulaz.readLine());
		}
		for (int i = 1; i <= n; i++) {
			if (uslov(a, b, c[i], d[i]))
				System.out.println("Pravougaonik sa stranicama a = " + a + " i b = " + b
						+ " nalazi se u pravougaoniku stranica c = " + c[i] + " i d = " + d[i]);
			else
				System.out.println("Pravougaonik sa stranicama a = " + a + " i b = " + b
						+ " ne nalazi se u pravougaoniku stranica c = " + c[i] + " i d = " + d[i]);
		}
	}
}