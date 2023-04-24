package auto;

public class Auto {
	
	protected String naziv, boja;
	protected int vrata;
	
	public void postaviVrednosti(String naziv, String boja, int vrata) {
		this.naziv = naziv;
		this.boja =boja;
		this.vrata = vrata;
		
	}
	
	public void ispisi() {
		System.out.println("Naziv: " + naziv+ "\nboja: "+boja+"\nBroj vrata: " +vrata);
	}
}
