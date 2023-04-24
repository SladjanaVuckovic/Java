package proizvod;

public class PrehrambeniProizvod extends Proizvod {

	String vrsta;

	public PrehrambeniProizvod(String naziv, String proizvodjac, double cena, String rokTrajanja) {
		super(naziv, proizvodjac, cena, rokTrajanja);
		vrsta = "nepoznata";
	}

	public void ispisi() {
		System.out.println("Naziv: " + naziv + "\nProizvodjac: " + proizvodjac + "\ncena: " + cena + "\nRok trajanja: "
				+ rokTrajanja + "\nVrsta: " + vrsta);
	}
}
