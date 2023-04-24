package kartica;

public class Kartica {
	
	protected String tipKartice;
	protected String imeVlasnika;

	public Kartica(String tipKartice,String imeVlasnika) {
		this.tipKartice= tipKartice;
		this.imeVlasnika=imeVlasnika;
	}
	public void ispisi() {
		System.out.println("Tip kartice: " +tipKartice + " \nIme vlsnika: "+imeVlasnika);
	}
}
