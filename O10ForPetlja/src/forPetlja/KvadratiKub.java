/*Napisati program koji računa kvadrat i kub brojeva od 1 do 5.*/

package forPetlja;

public class KvadratiKub {

	public static void main(String[] args) {
		System.out.println("Broj\tKvadrat\tKub");

		for (int broj = 1; broj <= 5; broj++) {
			int kvadrat = broj * broj;
			int kub = broj * broj * broj;
			System.out.println(broj + "\t" + kvadrat + "\t" + kub);
		}
	}
}
