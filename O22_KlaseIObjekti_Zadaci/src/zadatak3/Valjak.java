package zadatak3;
/*Valjak se zadaje poluprečnikom i visinom. Napisati klasu Valjak i predvideti:
- stvaranje valjka zadatog poluprečnika i visine,
- dohvatanje poluprečnika i visine,
- izračunavanje zapremine,
- izračunavanje površine valjka,
- sastavljanje tekstualnog opisa valjka.*/

public class Valjak {

	private double poluprecnik;
	private double visina;

	Valjak(double p, double h) {
		this.poluprecnik = p;
		this.visina = h;
	}

	Valjak() {
		poluprecnik = 1;
		visina = 1;
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public double getVisina() {
		return visina;
	}

	public double zapremina() {
		return 3.14 * poluprecnik * poluprecnik * visina;
	}

	public String opis() {
		return "\nPoluprecnik: " + poluprecnik + "\nVisina: " + visina + "\nZapremina: " + zapremina();
	}

}
