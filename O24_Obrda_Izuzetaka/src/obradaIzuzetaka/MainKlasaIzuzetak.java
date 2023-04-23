package obradaIzuzetaka;

public class MainKlasaIzuzetak {

	public static void proveraGodina(int godine) throws KlasaIzuzetak {

		System.out.println("Provera godina: " + godine);
		if (godine < 0 || godine > 100)
			throw new KlasaIzuzetak(godine);
		System.out.println("Godine " + godine + " su validne godine");
	}

	public static void main(String[] args) {

		try {
			proveraGodina(25);
			proveraGodina(150);

		} catch (KlasaIzuzetak e) {
			System.out.println("Uhvacen izuzetak:\n" + e);
			// e.printStackTrace(); }
		}
	}

}
