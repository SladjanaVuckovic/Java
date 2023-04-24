package zaposleni;

public class Programer extends Zaposleni {
	
	double bonus, prekRad;
	
	public double izracunajPlatu() {
		return brojSati * cenaSata + bonus+prekRad;
	}

}
