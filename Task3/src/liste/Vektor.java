package liste;

import java.util.Vector;

public class Vektor {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		// Dodavanje elemenata
		v.add(11);
		v.add(22);
		v.add(33);
		v.add(44);
		v.add(55);

		// dohvatanje elemenata po indeksu
		System.out.println("Element s indeksom 2: " + v.get(2));

		// ispis svih elemenata
		System.out.println("Svi elementi ");
		for (int i : v) {
			System.out.print(i + " ");
		}

		// uklanjanje elementa
		v.remove(3);
		System.out.println("\nElement sa indeksom 3 je obrisan.");

		// ispis elemenata nakon uklanjanja
		System.out.println("Elementi nakon brisanja:");
		for (int i : v) {
			System.out.print(i + " ");
		}
	}
}