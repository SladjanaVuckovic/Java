/*Napisati program za računanje zbira brojeva od 1 do 10.*/

package forPetlja;

public class Zbir {

	public static void main(String[] args) {

		int zbir = 0;
		for (int i = 1; i <= 10; i++)
			zbir += i;
		System.out.println("Zbir = " + zbir);
	}

}
