package implementsRunnable;

/*Napraviti nove niti za koje imamo posebne klase A, B I C, 
 da implementiraju interfejs Runnable, 
 * svaka od klasa treba da ima metodu run , 
 * moze da ispise bilo koji text I nakon toga 
 * u main klasi napraviti objekte tih klasa i pokrenuti niti*/

public class Main {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		C c = new C();

		Thread t1 = new Thread(a, "Ana");
		Thread t2 = new Thread(b, "ne voli");
		Thread t3 = new Thread(c, "Milovana");

		t1.start();
		t2.start();
		t3.start();

	}
}
