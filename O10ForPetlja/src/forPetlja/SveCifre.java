/*Napisati program koji ispisuje sve cifre*/

package forPetlja;

public class SveCifre {

	public static void main(String[] args) {
		int i;

		System.out.println("I način: ");
		for (i = 0; i <= 9; i++) {
			System.out.println(i);
		}

		System.out.println("\nII način: ");

		for (int c = 9; c >= 0; c--) {
			System.out.println(c);
		}

	}
}
