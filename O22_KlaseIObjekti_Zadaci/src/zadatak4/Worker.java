package zadatak4;

/*Radnik u trgovačkoj firmi ima ime 
 * i kao platu dobija zadati procenat od vrednosti ostvarenog prihoda.
Može da se odredi vrednost ostvarenog prihoda, 
da se izračuna visina plate 
i da se sastavi tekstualni opis u
obliku "ime/plata". */

public class Worker {

	private String ime;
	private double prihod;
	private double procenat;

	Worker(String name, double p, double pr) {
		this.ime = name;
		this.prihod = p;
		this.procenat = pr;

	}

	public double plata() {
		return prihod / 100 * procenat;
	}

	public void ispisiPodatke() {
		System.out.println(ime + "/ " + plata());
	}

}
