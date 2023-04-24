package voce;

public class TestVoce {

	public static void main(String[] args) {
		
		Jabuka j = new Jabuka("Jabuka", "Crevena", 55.70, 10, "Ajdared");
		
		System.out.println("Naziv: " + j.naziv+ "\nboja: "+j.boja+"\ncena: " +j.cena+ "\nKolicina: "+j.kolicina+"\nvrsta: " + j.vrsta + "\nUkupno za uplatu: " + j.izracunajUplatu());

	}

}
