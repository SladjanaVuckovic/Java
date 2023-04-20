/* Napisati program koji prebrojava brojeve od 1 .. 20 koji su deljivi brojem 3.*/

package forPetlja;

public class DeljiviSa3 {

	public static void main(String[] args) {

		int br = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0)
				br++;
		}
		System.out.println("U intervalu od 1 do 20 ima " + br + " brojeva deljivih sa 3");

	}

}
