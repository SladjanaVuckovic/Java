package primer1;

public class InstanceOf {
	public static void main(String[] args) {

		ABC a = new ABC();
		XYZ x = new XYZ();

		if (a instanceof ABC) {
			System.out.println("a je instanca klase ABC");
		} else {
			System.out.println("a nije instanca klase ABC");
		}

		if (x instanceof XYZ) {
			System.out.println("x je instanca klase XYZ");
		} else {
			System.out.println("x nije instanca klase XYZ");
		}
	}
}
/*
 * Kljucna rec instanceof ispituje da li je objekat sa leve strane kljucne
 * reci(a, x) zaista objekat klase koja je navedena sa desne strane (ABC, XYZ).
 */
