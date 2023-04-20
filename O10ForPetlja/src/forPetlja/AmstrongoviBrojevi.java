/*Napisati program kojim se štampaju Amstrongovi brojevi. Broj je Armstrongov ako je jednak zbiru
kubova svojih cifara.*/

package forPetlja;

public class AmstrongoviBrojevi {

	public static void main(String[] args) {

		int broj, s, d, j;

		for (int i = 100; i < 1000; i++) {

			broj = i;
			s = broj / 100;
			d = (broj / 10) % 10;
			j = broj % 10;

			if (broj == (s * s * s + d * d * d + j * j * j)) {
				System.out.println("Broj " + broj + " je Armstrongov broj.");
			}
		}

	}

}
