package regax;
/*Ovaj primer traži korisnika da unese neki tekst i zatim koristi Pattern.matches() metodu da utvrdi da li je uneseni tekst broj ili ne. */

	import java.util.Scanner;
	import java.util.regex.Pattern;

	public class RegaxPrimer {
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Unesite tekst: ");
	        String input = sc.nextLine();
	        
	        String pattern = "[0-9]+";
	        
	        boolean isMatch = Pattern.matches(pattern, input);
	        if (isMatch) {
	            System.out.println("Uneti tekst je broj.");
	        } else {
	            System.out.println("Uneti tekst nije broj.");
	        }
	        sc.close();
	    }
	}

