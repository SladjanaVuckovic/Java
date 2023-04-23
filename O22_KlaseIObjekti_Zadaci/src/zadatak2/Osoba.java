package zadatak2;

/*Podatke o osobi čine ime, datum rođenja i adresa stanovanja.
 *  Omogućiti unošenje podataka o osobi čitanjem sa glavnog ulaza i 
 *  sastavljanje tekstualnog opisa. */

public class Osoba {
	public String ime;
	public String datum;
	public String adresa;

	public String ToString() {
		return "Ime: " + ime + "\nDatum rodjenja: " + datum + "\nAdresa: " + adresa;

	}
}
