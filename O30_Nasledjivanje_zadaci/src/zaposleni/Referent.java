package zaposleni;

public class Referent extends Zaposleni{
	
	double bonus;
	
	public double izracunajPlatu() {
		return brojSati * cenaSata + bonus;
	}
	

}
