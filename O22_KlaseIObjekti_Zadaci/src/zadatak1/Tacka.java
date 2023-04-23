package zadatak1;

/*Tačka u ravni se zadaje pomoću realnih koordinata, mogu da joj se dohvate vrednosti koordinata 
 * i može da se konvertuje u tip String.*/

public class Tacka {

	private double x;
	private double y;

	Tacka(double xx, double yy) {
		x = xx;
		y = yy;
	}

	public double getx() {
		return x;
	}

	public double gety() {
		return y;
	}

	public String ispisi() {
		return "(" + x + " , " + y + " )";
	}
}
