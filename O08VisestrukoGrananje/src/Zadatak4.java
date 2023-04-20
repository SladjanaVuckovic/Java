import java.util.Scanner;

/*Napisati program kojim se ispisuju moguće vrednosti koordinata x i y zavisno od broja kvadranta koji se unosi*/

public class Zadatak4 {
	public static void main(String[] args) {
		int ugao;

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite ugao: ");
		ugao = ulaz.nextInt();

		if (ugao > 0 && ugao < 90) {
			System.out.println("Prvi kvadrant.");
		} else if (ugao > 90 && ugao < 180) {
			System.out.println("Drugi kvadrant.");
		} else if (ugao > 180 && ugao < 270) {
			System.out.println("Treći kvadrant.");
		} else if (ugao > 270 && ugao < 360) {
			System.out.println("Četvrti kvadrant.");
		} else {
			System.out.println("Unet ugao se nalazi na x ili y osi.");
		}
		ulaz.close();
	}

}
