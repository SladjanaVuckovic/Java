/*Poštar ide ulicom i treba da rasporedi pošiljke. Odlučio je da prvo obiđe jednu stranu ulice (na kojoj su kuće sa parnim brojevima), a da u povratku obiđe drugu stranu ulice (na kojoj su kuće sa neparnim brojevima). Napisati program koji za unete brojeve kuća određuje koje su na parnoj, a koje na neparnoj strani ulice.*/

package nizovi;

import java.util.Scanner;

public class Primer7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] parni = new int[100];
		int[] neparni = new int[100];
		int p = 0, n = 0;

		System.out.println("Unesite vrednost za k:");
		int k = sc.nextInt();

		System.out.println("Unesite brojeve kuca: ");
		for (int i = 1; i <= k; i++) {

			int x = sc.nextInt();
			if (x % 2 == 0)
				parni[p++] = x;
			else
				neparni[n++] = x;
		}

		System.out.println("Parni brojevi kuća");
		for (int i = 0; i < p; i++)
			System.out.println(parni[i]);
		System.out.println("Neparni brojevi kuća");
		for (int i = 0; i < n; i++)
			System.out.println(neparni[i]);
		sc.close();
	}

}
