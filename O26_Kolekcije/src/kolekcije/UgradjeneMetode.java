package kolekcije;

import java.util.ArrayList;
import java.util.List;

public class UgradjeneMetode {

	public static void main(String[] args) {

		List<String> kolekcija = new ArrayList<String>();

		System.out.println("Pocetna duzina: " + kolekcija.size());

		kolekcija.add("Prvi");
		kolekcija.add("Drugi");
		kolekcija.add("Treci");
		kolekcija.add("Cetvrti");

		for (String s : kolekcija)
			System.out.printf("%s ", s);
		System.out.println("\nTrenutna duzina: " + kolekcija.size());

		boolean sadrzi = kolekcija.contains("Treci");

		System.out.println(sadrzi);

		if (sadrzi) {
			System.out.println("Trazeni element se nalazi u zadatoj kolekciji");
		} else
			System.out.println("Trazeni element se ne nalazi u zadatoj kolekciji");

		String element = kolekcija.get(2);
		System.out.println("Element sa indexom 2 u kolekciji je " + element);

		int pozicija = kolekcija.indexOf("Drugi");
		System.out.println("Element Drugi je na poziciji " + pozicija);

		String[] niz = new String[kolekcija.size()];
		kolekcija.toArray(niz);
		for (String s1 : niz)
			System.out.printf("%s\n", s1);

		kolekcija.clear();
		System.out.println("Velicina kolekcije nakon brisanja: " + kolekcija.size());

	}

}
