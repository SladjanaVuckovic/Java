package pas;

public class TestPas {
	public static void main(String[] args) {

		Pas p = new Pas();

		System.out.println("Klasa Pas");
		p.laj();
		p.dahci();

		ZlatniRetriver zr = new ZlatniRetriver();
		System.out.println("\nKlasa ZlatniRetriver");
		zr.laj();
		zr.dahci();
		zr.aportiraj();

		LhasaApso la = new LhasaApso();
		System.out.println("\nKlasa LhasaApso");
		la.laj();
		la.dahci();
		la.cuvaj();
	}
}