package proizvod;

public class Proizvod {

	String naziv, proizvodjac;
	double cena;
	String rokTrajanja;
	
	public Proizvod() {
		naziv = "nepoznat";
		proizvodjac = "nepoznat";
		cena = 0.0;
		rokTrajanja = "29.12.2022";
	}

	public Proizvod(String naziv, String proizvodjac, double cena, String rokTrajanja) {
		if(naziv.isBlank()|| naziv.isEmpty() || proizvodjac.isBlank() || proizvodjac.isEmpty() || cena< 0)
			System.out.println("Greska");
		this.naziv = naziv;
		this.proizvodjac = proizvodjac;
		this.cena = cena;
		this.rokTrajanja = rokTrajanja;
	}
	
	
	
}
