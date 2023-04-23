/*Kreirati klasu "cat" – mačka. Klasa ima atribut ime, odnosi se na ime mačke (objekta cat) 
 * i metodu za prikazivanje imena. Sa glavnog ulaza treba omogućiti unos
imena.*/
package zadatak1;

public class Macka {
	String ime;

	public void prikazatiIme() {
		System.out.println("Ime macke je: " + this.ime);
	}
}