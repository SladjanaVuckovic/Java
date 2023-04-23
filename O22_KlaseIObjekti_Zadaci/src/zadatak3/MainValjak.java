package zadatak3;

public class MainValjak {
	public static void main(String[] args) {

		Valjak v1 = new Valjak();
		Valjak v2 = new Valjak(2, 8);

		System.out.println("Dimenzije prvog valjka su: " + v1.opis());
		System.out.println("Dimenzije drugog valjka su: " + v2.opis());

	}

}
