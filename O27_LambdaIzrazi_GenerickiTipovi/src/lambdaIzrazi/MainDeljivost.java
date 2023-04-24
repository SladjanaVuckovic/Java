package lambdaIzrazi;

public class MainDeljivost {

	public static void main(String[] args) {
//Napisati lambda izraz koji ispituje da li je prvi broj deljiv drugim brojem

		Deljivost delj = (n, d) -> (n % d) == 0;

		if (delj.test(10, 2))
			System.out.println("Broj 10 je deljiv sa brojem 2");
		else
			System.out.println("Nije deljiv");
	}
}
