package liste;

import java.util.Stack;

public class StackPrimer {

	public static void main(String[] args) {
		// stvaranje Stack objekta
		Stack<String> stack = new Stack<String>();

		// dodavanje elemenata na Stack
		stack.push("Jedan");
		stack.push("Dva");
		stack.push("Tri");
		stack.push("Cetiri");

		System.out.println("Elementi :");
		for (String str : stack) {
			System.out.println(str);
		}
		// ispisivanje vrha Stack-a
		System.out.println("Vrh stacka: " + stack.peek());

		// uklanjanje elemenata
		stack.pop();
		stack.pop();

		// ispisivanje elemenata
		System.out.println("Elementi posle uklanjanja:");
		for (String s : stack) {
			System.out.println(s);
		}
	}

}
