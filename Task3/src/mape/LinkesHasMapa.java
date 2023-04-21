package mape;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkesHasMapa {

	public static void main(String[] args) {

		Map<String, Integer> lhm = new LinkedHashMap<>();

		// Dodavanje elemenata
		lhm.put("Jedan", 11);
		lhm.put("Dva", 22);
		lhm.put("Tri", 33);
		lhm.put("Četiri", 44);
		lhm.put("Pet", 55);

		// Ispisivanje elemenata
		System.out.println("Elementi: " + lhm);

		// Pokušaj promene vrednosti za postojeći ključ
		lhm.put("Dva", 2);

		// Ispisivanje elemenata nakon promene
		System.out.println("Nakon promene vrednosti za ključ 'Dva': " + lhm);
	}
}
