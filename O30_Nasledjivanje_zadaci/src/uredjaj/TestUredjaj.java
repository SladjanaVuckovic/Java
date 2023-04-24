package uredjaj;

public class TestUredjaj {

	public static void main(String[] args) {

		Uredjaj u = new Uredjaj("Samsung", true);

		KlimaUredjaj ku = new KlimaUredjaj("Gorenje", false, 25);

		u.iskljuci();

		ku.ukljuci();
		ku.povecajTemperaturu();
		System.out.println("Podaci o uredjaju: ");

		u.ispisi();

		System.out.println("\nPodaci o klima uredjaju");

		ku.ispisi();

	}

}
