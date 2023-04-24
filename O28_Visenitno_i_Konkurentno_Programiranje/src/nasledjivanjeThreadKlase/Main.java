package nasledjivanjeThreadKlase;

/*Napraviti nove niti za koje imamo posebne klase A, B I C, 
 * da nasledjuju klasu Thread, 
 * svaka od klasa treba da ima metodu run , 
 * moze da ispise bilo koji text I nakon toga 
 * u main klasi napraviti objekte tih klasa i pokrenuti niti*/

public class Main {

	public static void main(String[] args) {

		A a = new A("Ana");
		B b = new B("voli");
		C c = new C("Milovana");

		a.start();
		b.start();
		c.start();

	}
}
