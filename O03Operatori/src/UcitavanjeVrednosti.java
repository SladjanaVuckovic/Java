import java.util.Scanner;

public class UcitavanjeVrednosti {

	public static void main(String[] args) {
		// Deklaracija stringova

		String ime; // deklaracija stringa
		String izraz = "Andrija"; // Inicijalizacija stringa

		// Ucitavanje (i smestanje unete) vrednosti sa konzole.

		Scanner sc = new Scanner(System.in);

		System.out.println("Kako se zovete?");
		ime = sc.nextLine();
		System.out.println("Vi se zovete: " + ime);

		System.out.println("Koliko imate godina? ");
		int brojGodina = sc.nextInt();
		System.out.println("Imate godina: " + brojGodina);
		sc.close();
	}

}