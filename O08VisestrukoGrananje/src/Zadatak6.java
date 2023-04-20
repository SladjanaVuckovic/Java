/*Napisati program koji se učita znak za operaciju (+,-,*,/) i dva realna operanda, a zatim štampa
rezultat.*/

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		double x, y;
		char operator;

		// Unos podataka
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite željeni operator: ");
		operator = ulaz.next().charAt(0);
		System.out.println("Unesite operand x: ");
		x = ulaz.nextDouble();
		System.out.println("Unesite operand y: ");
		y = ulaz.nextDouble();

		// Obrada podataka
		System.out.println("Rešenje sa SWITCH:");
		switch (operator) {
		case '+':
			System.out.println("X + Y = " + (x + y));
			break;
		case '-':
			System.out.println("X - Y = " + (x - y));
			break;
		case '*':
			System.out.println("X * Y = " + (x * y));
			break;
		case '/':
			System.out.println("X / Y = " + (x / y));
		}

		// Obrada podataka sa IF/ELSE
		System.out.println("\nRešenje sa ELSE/IF: ");
		if (operator == '+') {
			System.out.println("X + Y = " + (x + y));
		} else if (operator == '-') {
			System.out.println("X - Y = " + (x - y));
		} else if (operator == '*') {
			System.out.println("X * Y = " + (x * y));
		} else if (operator == '/') {
			System.out.println("X / Y = " + (x / y));
		} else {
			System.out.println("Nepravilan unos.");
		}

		ulaz.close();
	}

}