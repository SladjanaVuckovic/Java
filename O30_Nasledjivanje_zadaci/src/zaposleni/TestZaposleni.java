package zaposleni;

public class TestZaposleni {

	public static void main(String[] args) {

		Referent r = new Referent();
		Programer p = new Programer();

		r.brojSati = 160;
		r.cenaSata = 100;
		r.bonus = 10000;
		double rplata = r.izracunajPlatu();
		System.out.println("Plata referenta je " + rplata);

		p.brojSati = 160;
		p.cenaSata = 120;
		p.bonus = 8200;
		p.prekRad = 1500;
		double pplata = p.izracunajPlatu();
		System.out.println("Plata programera je: " + pplata);

		/*
		 * Moglo je da se izracuna i drugacije, postavljanjem konstruktora za klase i
		 * unosom vrednosti preko njih, ali meni je ovaj nacin delovao jednostavnije
		 */
	}

}
