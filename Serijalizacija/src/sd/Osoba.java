package sd;

import java.io.Serializable;

public class Osoba implements Serializable{
	
	private String ime;
    private int godine;

    public Osoba(String ime, int godine) {
        this.ime = ime;
        this.godine = godine;
    }

	public String getIme() {
		return ime;
	}

	public int getGodine() {
		return godine;
	}

	
    

}
