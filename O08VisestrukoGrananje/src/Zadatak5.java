/*Napisati program koji za nalaženje ekvivalentnog kapaciteta dva kondenzatora kapaciteta C1= 10nF i C2 = 15 nF ako su vezana:
a) Redno
b) Paralelno
Rešenje: Ekvivalnentni kapacitet redne veze izračunava se po formuli Ce= C1*C2/(C1+C2), a paralelne veze po formuli: Ce = C1 + C2.*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak5 {
	public static void main(String[] args) {
		double c1, c2;
		String veza;

		DecimalFormat df = new DecimalFormat("#.##");
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite da li je 'Redno' ili 'Paralelno' vezivanje: ");
		veza = ulaz.nextLine();
		System.out.println("Unesite vrednost za c1: ");
		c1 = ulaz.nextInt();
		System.out.println("Unesite vrednost za c2: ");
		c2 = ulaz.nextInt();

		if (veza.equalsIgnoreCase("Redno")) {
			System.out.println("Ekvivalnentni kapacitet redne veze: " + df.format(c1 * c2 / (c1 + c2)));
		} else if (veza.equalsIgnoreCase("Paralelno")) {
			System.out.println("Paralelna veza: " + df.format((c1 + c2)));
		} else {
			System.out.println("Pogrešan unos!");
		}

		ulaz.close();

	}

}
