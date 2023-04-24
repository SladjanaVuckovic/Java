package voce;

public class Jabuka extends Voce {
	
	String vrsta;
	
	public Jabuka(String naziv, String boja, double cena, double kolicina, String vrsta ) {
		super(naziv, boja, cena, kolicina);
		this.vrsta=vrsta;
	}
	public double izracunajUplatu() {
		return kolicina*cena;
	}
	

}
