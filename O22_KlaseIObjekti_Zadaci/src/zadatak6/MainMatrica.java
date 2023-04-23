package zadatak6;

public class MainMatrica {

	public static void main(String[] args) throws Exception {
		Matrica m1 = new Matrica(5, 5);

		System.out.println("Matrica ima redova: " + m1.getVrste());
		System.out.println("Matrica ima kolona: " + m1.getKolone());
		m1.postaviElement(1, 2, 3);
		System.out.println("Dohvatili ste element: " + m1.dohvatiElement(1, 2));
		m1.stampanjeMatrice();

	}

}
