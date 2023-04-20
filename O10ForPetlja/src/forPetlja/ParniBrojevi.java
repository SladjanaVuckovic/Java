/*U intervalu brojeva od 1 .. 100 ispitati sve parne brojeve.*/

package forPetlja;

public class ParniBrojevi {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}

	}

}
