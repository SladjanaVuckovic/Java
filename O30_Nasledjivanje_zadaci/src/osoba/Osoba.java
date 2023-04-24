package osoba;

public class Osoba {
	
	String ime ="N", prezime = "N";
	int starost =0;
		
	public Osoba() {
		
	}
	public Osoba(String ime, String prezime, int starost) {
		this.ime = ime;
		this.prezime = prezime;
		this.starost = starost;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
			this.ime = ime;
		
			}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getStarost() {
		return starost;
	}
	public void setStarost(int starost) {
		this.starost = starost;
	}
	
	
	

}
