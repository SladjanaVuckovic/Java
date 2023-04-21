/*Napisati program kojim se štampaju prvih deset prirodnih brojeva korišćenjem for i while petlje.*/

public class Primer1 {
	public static void main(String[] args) {

		System.out.println("Prvih 10 brojeva sa for petljom: ");
		for (int i = 1; i <= 10; i++)
			System.out.print(i + " ");

		System.out.println("\nPrvih 10 brojeva uz pomoc while petlje: ");
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}

	}
}