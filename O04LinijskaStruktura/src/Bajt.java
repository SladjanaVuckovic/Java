/*Napisati program za pretvaranje veličine fajla izražene u kilobajtima u veličinu u bajtima.*/

import java.util.Scanner;

public class Bajt {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pretvaranje veličine memorije iz kilobajta u bajte");
		System.out.println("Veličina datoteke u kilobajtima: ");
		int kb = input.nextInt();
		System.out.print("Veličina datoteke u bajtima: " + kb * 1024);
	}
}