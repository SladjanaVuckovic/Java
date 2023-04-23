package obradaIzuzetaka;

public class Primer9 {

	static void procA() {
		try {
			System.out.println("Inside procA ");
			throw new RuntimeException("demo"); // u ovom slucaju mi bacamo izuzetak
		} finally {
			System.out.println("procA");
		}
	}

	static void procB() {
		try {
			System.out.println("procB");
			return; // break, continue, System.exit(0)
		} finally {
			System.out.println("procB's finally");
		}
	}

	static void procC() {
		try {
			System.out.println("Inside procC");
		} finally {
			System.out.println("procC's finally");
		}
	}
}
/*
 * THROW – koristi se za bacanje izuzetaka u telu metode Finally blok se
 * izvrsava bez obzira da li je doslo do izuzetka ili ne
 */
