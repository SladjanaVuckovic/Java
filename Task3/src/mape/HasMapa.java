package mape;

import java.util.HashMap;

public class HasMapa {

	public static void main(String[] args) {

		HashMap<String, Integer> hM = new HashMap<>();

		// Dodavanje elemenata u hash mapu
		hM.put("Jedan", 1);
		hM.put("Dva", 2);
		hM.put("Tri", 3);
		hM.put("Četiri", 4);
		hM.put("Pet", 5);

		// Čitanje vrednosti
		System.out.println("Vrednost ključa Jedan je: " + hM.get("Jedan"));
		System.out.println("Vrednost ključa Tri je: " + hM.get("Tri"));

		// Uklanjanje vrednosti
		hM.remove("Pet");

		// Iteriranje kroz hash mapu
		for (String key : hM.keySet()) {
			System.out.println("Ključ: " + key + ", Vrednost: " + hM.get(key));
		}
	}

}
