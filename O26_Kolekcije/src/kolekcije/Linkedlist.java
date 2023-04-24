package kolekcije;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<String>();

		// Dodavanje elementa u povezanoj listi
		ll.add("A"); // index 0
		ll.add("B"); // index 1
		ll.add(2, "C"); // index 2

		System.out.println("Elementi povezane liste su: " + ll);

		// Brisanje elementa iz povezane liste
		ll.remove(0); // brisanje preko indexa
		ll.remove("B"); // brisanje preko vrednosti

		System.out.println("Povezana lista nakon brisanja elemenata: " + ll);

		ll.add("D");
		ll.add("E");
		ll.add("F");

		System.out.println("Elementi povezane liste su: " + ll);

		// Trazenje elemenata u povezanoj listi
		boolean sadrzi = ll.contains("E");
		System.out.println("Lista sadrzi element E - " + sadrzi);
		if (sadrzi)
			System.out.println("Lista sadzi element E");
		else
			System.out.println("Lista ne sadzi element E");

		// Pristupanje (uzimanje) elementa iz povezane liste
		Object element = ll.get(3);
		System.out.println("Zatrazeni element je: " + element);

		// Postavljanje vrednosti elementa u poveznoj listi
		ll.set(1, "Z");
		System.out.println("Povezana lista nakon promene: " + ll);
	}

}
