package forPetlja;

/*Sastaviti algoritam i napisati program kojim se štampaju svi trocifreni brojevi koji su istovremeno deljivi i sa 2 i sa 3.*/

public class Primer14 {

	public static void main(String[] args) {

		// m - trocifreni broj
		System.out.println("Celi trocifreni brojevi deljivi sa 2 i 3 su: ");
		for (int m = 100; m <= 999; m++)
			if (m % 2 == 0 && m % 3 == 0)
				System.out.print(m);
	}
}
