package threads;

public class NovaNitMAin {

	public static void main(String[] args) {

		// Pokretanje nove niti
		// Novu nit pokrecete tako sto napravite instancu objekta tipa Thread
		// To se moze uraditi na dva nacina:
		// 1. Implementacija interfejsa Runnable
		// 2. Prosirivanjem klase Thread.

		// U main klasi:
		// Nakon kreiranja kalse koja implementira interfejs Runnable, potrebno je
		// napraviti instancu objekta tima Thread

		NovaNit n = new NovaNit();

		Thread t1 = new Thread(n, "Nit1");
		Thread t2 = new Thread(n, "Nit2");
		Thread t3 = new Thread(n, "Nit3");

		t1.start();// metoda start() poziva metodu run()
		t2.start();
		t3.start();
	}
}
