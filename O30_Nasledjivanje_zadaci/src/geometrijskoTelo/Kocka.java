package geometrijskoTelo;

public class Kocka extends GeometrijskoTelo {
	
	double stranica;
	
	public Kocka(double stranica) {
		if(stranica<0)
			System.out.println("Greska");
		else
			this.stranica=stranica;
	}
	public double izracunajPovrsinu() {
		return stranica * stranica *6;
	}
	public double izracunajZapreminu() {
		return stranica* stranica * stranica;
	}
	

}
