package kolekcije;

import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {

	public static void main(String[] args) {

		String imena[] = { "Mika", "Zika", "Fica" };

		List<String> listaImena = new LinkedList<String>();

		for (String s : imena)
			listaImena.add(s);

		String imena1[] = { "Ana", "Lena", "Hana", "Una" };
		List<String> listaImena1 = new LinkedList<String>();

		for (String s1 : imena1)
			listaImena1.add(s1);

		System.out.println("Prva lista: " + listaImena);
		System.out.println("Druga lista: " + listaImena1);

		listaImena.addAll(listaImena1);
		System.out.println("Lista nakon dodavanja: " + listaImena);

		// sublist(indexFrom, indexTo)
		// indexFrom - pocevsi od zadatog indexa, ukljucujuci i njega
		// indexTo do zadatog indexa, NE ukljucujuci njega
		listaImena.subList(0, 2).clear();
		System.out.println("Lista nakon brisanja: " + listaImena);

	}

}
