package UUP;

/*Napisati program za izračunavanje obima kruga korišćenjem deklarisane konstante PI. Zadatak ne rešavati korišćenjem konstante PI deklarisane
u klasi Math.*/

public class ObimKruga {
	public static void main(String[] args) {
		final float PI = 3.14159f;
		float r = 5, obim;
		obim = 2 * r * PI;
		System.out.println("Obim kruga je " + obim + " za poluprečnik " + r);
	}
}