package kartica;

public class Master extends Kartica {
	
	int pinKod;
	
	
	public Master(String tipKartice,String imeVlasnika, int pinKod ) {
		super(tipKartice, imeVlasnika);
		this.pinKod =pinKod;
	}
	public int promeniPin() {
		return pinKod;
	}
	public void ispisi() {
		super.ispisi();
		System.out.println("Pin kod: "+pinKod);
	}

}
