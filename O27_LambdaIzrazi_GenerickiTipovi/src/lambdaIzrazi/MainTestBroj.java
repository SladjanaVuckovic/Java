package lambdaIzrazi;

public class MainTestBroj {

	public static void main(String[] args) {

		// TestiraBroj paranBroj = /*ovde dolazi lambda izraz*/

		// levaStranaLambdaIzraza -> desnaStranaLambdaIzraza
		// () -> 123.45 isto sto klasicna metoda: double nekaMetoda() {return 123.45}

		TestiraBroj paranBroj = (n) -> (n % 2) == 0;

		if (paranBroj.test(10)) {
			System.out.println("Broj je paran");
		} else
			System.out.println("Broj nije paran");

	}
}
