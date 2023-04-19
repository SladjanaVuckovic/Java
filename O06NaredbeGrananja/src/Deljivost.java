/*Napisati program kojim se za unete vrednosti a i b izračunava z prema izrazu - z = 𝑎 + 𝑏, 𝑎 𝑑𝑒𝑙𝑗𝑖𝑣𝑜 𝑠𝑎 2, 𝑏 𝑑𝑒𝑙𝑗𝑖𝑣𝑜 𝑠𝑎 3; z = 𝑎 − 𝑏, 𝑧𝑎 𝑜𝑠𝑡𝑎𝑙𝑒 𝑠𝑙𝑢č𝑎𝑗𝑒𝑣𝑒*/

import java.util.Scanner;

public class Deljivost {
	public static void main(String[] args) {
		int a, b, z;
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite vrednost za a i b:");
		System.out.print("a = ");
		a = ulaz.nextInt();
		System.out.print("b = ");
		b = ulaz.nextInt();

		if (a % 2 == 0 && b % 3 == 0)
			z = a + b;
		else
			z = a - b;
		System.out.println("z = " +z);
		ulaz.close();
	}
}
