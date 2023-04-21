/*Napisati program za ispisivanje sume brojeva u intervalu od 1 do zadatog broja n čija je cifra jedinica 8.*/

import java.util.Scanner;

public class Primer7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite n");
		int n = sc.nextInt();

		int suma = 0, i = 1;
		while (i <= n) {
			if (i % 10 == 8)
				suma += i;
			i++;
		}
		System.out.println("Suma brojeva od 1 do " + n + " cija je cifra jedinica 8 je " + suma);
		sc.close();
	}
}