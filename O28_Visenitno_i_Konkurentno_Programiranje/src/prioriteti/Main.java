package prioriteti;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		/*
		 * Opsti oblik – void setPriority(Nivo) – parametrom nivo zadajemo nivo
		 * prioriteta niti za koju je metoda pozvana. Vrednost mora biti u opsegu
		 * izmedju MIN_PRIORITY i MAX_PRIORITY. Vrednost MIN je 1, a MAX 10,
		 * Podrazumevana vrednost je 5, a moze se zadati preko NORM_PRIORITY.
		 */
		a.setPriority(Thread.MIN_PRIORITY);
		b.setPriority(Thread.MAX_PRIORITY);

		a.start();
		b.start();

		System.out.println("Kraj glavne niti");

	}
}
