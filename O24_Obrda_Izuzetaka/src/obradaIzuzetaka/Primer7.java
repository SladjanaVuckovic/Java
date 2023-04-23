package obradaIzuzetaka;

public class Primer7 {

	public static void main(String[] args) {

		try {
			int a = 0;
			int b = 10 / a;
		} catch (ArithmeticException e) {
			System.out.println("Izuzetak");
			// }catch (AritmethicException e) {
			// System.out.println("Izuzetak1");
		}
	}
}
/*
 * Ukoliko postoji vise catch blokova ciji tip parametara odgovara tipu bacenog
 * izuzetka, izvrsava se samo prvi takav catch blok. Greska je navesti dva catch
 * bloka sa istim tipom parametra.
 */