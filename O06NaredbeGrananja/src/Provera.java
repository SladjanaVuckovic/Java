/*Napisati program kojim se za unete vrednosti a i b izračunava z prema izrazu: z = 𝑎 + 𝑏, 𝑎 𝑛𝑒𝑝𝑎𝑟𝑛𝑜, 𝑏 𝑝𝑎𝑟𝑛𝑜; z = 𝑎 ∗ 𝑏, 𝑧𝑎 𝑜𝑠𝑡𝑎𝑙𝑒 𝑠𝑙𝑢č𝑎𝑗𝑒𝑣𝑒*/

import java.util.Scanner;

public class Provera {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite vrednost za a: ");
		int a = input.nextInt();
		System.out.print("Unesite vrednost za b: ");
		int b = input.nextInt();
		
		int z;
		if ((a % 2 != 0) && (b % 2 == 0))
			z = a + b;
		else
			z = a * b;
		
		System.out.println("z = " + z);
		input.close();
	}
}