package obradaIzuzetaka;

public class Primer9Main {

	public static void main(String[] args) {

		Primer9 pr = new Primer9();
		try {
			pr.procA();
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		pr.procB();
		pr.procC();
	}
}
