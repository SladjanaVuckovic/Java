package obradaIzuzetaka;

//Korisnicki exception

public class KlasaIzuzetak extends Throwable {

	private int godine;

	KlasaIzuzetak(int a) {
		godine = a;
	}

	public String toString() {
		return "Godine: " + godine + " nisu validne godine";
	}
}
