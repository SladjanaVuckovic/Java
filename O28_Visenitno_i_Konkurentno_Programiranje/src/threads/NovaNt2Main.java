package threads;

public class NovaNt2Main {

	public static void main(String[] args) {

		NovaNit2 b1 = new NovaNit2("Nit1");
		NovaNit2 b2 = new NovaNit2("Nit2");
		NovaNit2 b3 = new NovaNit2("Nit3");

		b1.start();
		b2.start();
		b3.start();

	}
}
