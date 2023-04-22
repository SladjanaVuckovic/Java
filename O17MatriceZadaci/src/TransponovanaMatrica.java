
import java.util.Scanner;

public class TransponovanaMatrica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Broj redova: ");
		int red = sc.nextInt();

		System.out.println("Broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.println("a[" + i + ", " + j + "]" + " = ");
				niz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matrica: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {

				System.out.print(niz[i][j] + " ");

			}
			System.out.println("");

		}

		System.out.println("Transponovana matrica: ");
		for (int i = 0; i < kolona; i++) {
			for (int j = 0; j < red; j++) {

				System.out.print(niz[j][i] + " ");

			}
			System.out.println("");
		}

		sc.close();
	}

}
