package zadatak6;

/*Matrica realnih brojeva ima zadat broj vrsta i kolona koji mogu da se dohvate. Može da se
postavi ili da se dohvati element sa zadatim indeksima.*/

public class Matrica {

	private double[][] matrica;

	public Matrica(int vrste, int kolone) {
		matrica = new double[vrste][kolone];
	}

	public double getVrste() {
		return matrica.length;
	}

	public double getKolone() {
		return matrica[0].length;
	}

	public Matrica postaviElement(int vrste, int kolone, double vrednost) {
		matrica[vrste][kolone] = vrednost;
		return this;
	}

	public double dohvatiElement(int vrste, int kolone) {
		return matrica[vrste][kolone];
	}

	public void stampanjeMatrice() {
		System.out.println("Izgled niza: ");
		for (int v = 0; v < matrica.length; v++) {
			for (int k = 0; k < matrica[0].length; k++) {
				System.out.print(matrica[v][k] + " ");
			}
			System.out.println();
		}

	}

}
