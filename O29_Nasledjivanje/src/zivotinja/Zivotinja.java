package zivotinja;

/*Napisati definiciju klase Zivotinja. 
 * Svaku životinju karakteriše njena životinjska vrsta. 
 * Iz klase Zivotinja izvesti klasu Pas. 
 * Za psa je poznato njegovo ime i rasa.
Ako se prilikom kreiranja psa ne navede njegova rasa, postaviti je na "bernardinac". 
Napisati test klasu*/

public class Zivotinja {

	private String vrsta;

	public Zivotinja() {
	}

	public Zivotinja(String vrsta) {
		this.vrsta = new String(vrsta);
	}

	public String toString() {
		return "Ovo je " + vrsta;
	}
}