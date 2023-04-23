package zadatak2;
/*Napraviti klasu koja se zove knjiga; 
 * od podataka ima ime I broj stranica. 
 * Omoguciti ucitavanja ime knjige I broja stranica sa ulaza. 
 * Nakon toga mozete napraviti razlicite konstruktore za poziv i ispisivanje poruke*/

public class Knjiga {

	String imeKnjige;
	int brojStranica;

	public void prikaziIme() {
		System.out.println("Ime knjige je: " + imeKnjige);

	}

	public void prikaziBroj() {
		System.out.println("Broj stranica: " + brojStranica);
	}
}
