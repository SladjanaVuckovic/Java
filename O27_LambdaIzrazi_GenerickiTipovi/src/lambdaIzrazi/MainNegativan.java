package lambdaIzrazi;

public class MainNegativan {

	public static void main(String[] args) {

		TestiraBroj negativanBroj = (n) -> n < 0;

		if (negativanBroj.test(-5)) {
			System.out.println("Broj je negativan");
		} else
			System.out.println("Broj je pozitivan");

	}
}
