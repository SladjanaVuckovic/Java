package mape;

import java.util.TreeMap;

public class TreeMapa {

	public TreeMapa() {

		TreeMap<String, Integer> treeMap = new TreeMap<>();

		// Dodavanje elemenata
		treeMap.put("Jedan", 1);
		treeMap.put("Dva", 2);
		treeMap.put("Tri", 3);
		treeMap.put("Četiri", 4);
		treeMap.put("Pet", 5);

		// Čitanje vrednosti
		System.out.println("Vrednost ključa Jedan je: " + treeMap.get("Jedan"));
		System.out.println("Vrednost ključa Tri je: " + treeMap.get("Tri"));

		// Uklanjanje vrednosti
		treeMap.remove("Pet");

		// Iteriranje kroz tree mapu
		for (String key : treeMap.keySet()) {
			System.out.println("Ključ: " + key + ", Vrednost: " + treeMap.get(key));
		}
	}

}
