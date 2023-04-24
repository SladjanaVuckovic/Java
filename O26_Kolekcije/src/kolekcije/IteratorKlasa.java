package kolekcije;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorKlasa {

	public static void main(String[] args) {

		// niz
		String imena[] = { "Mika", "Zika", "Ana", "Lana", "Hana", "Una" };
		// ArrayList
		List<String> listaImena = new ArrayList<String>();

		// Smestanje imena iza niza u kolekciju
		for (String s : imena)

			listaImena.add(s);

		// novi niz
		String[] imenaZaBrisanje = { "mika", "Lana", "Hana" };
		// novi din. niz
		List<String> listaImenaZaBrisanje = new ArrayList<String>();

		// smestanje novog niza u novu kolekciju
		for (String s1 : imenaZaBrisanje)
			listaImenaZaBrisanje.add(s1);

		// kreiranje iteratora kolekcije i stampanje lioste pomocu iteratora
		Iterator<String> iter = listaImena.iterator();

		System.out.println("Stampanje elemenata pomocu iteratora: ");
		while (iter.hasNext())
			System.out.print(iter.next() + " ");

		// Brisanje elemenata liste koja se nalaze u listi imena za brisanje
		iter = listaImena.iterator();
		while (iter.hasNext())
			if (listaImenaZaBrisanje.contains(iter.next()))
				iter.remove();

		System.out.println("\nLista nakon brisanja: ");
		for (int i = 0; i < listaImena.size(); i++)
			System.out.print(listaImena.get(i) + " ");

	}

}
