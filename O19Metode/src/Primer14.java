/*Neka je danas u Nišu izmerena temperatura 25 stepeni C 
 * Napisati program za prevođenje Celzijusovih u Farenthajtove stepene. 
 * Na izlazu štampati vrednost izmerene temperature u Farenthajtovim stepenima.*/

public class Primer14 {
// Metoda za prevođenje Celzijusovih u Farenthajtove stepene
	public static double CuF(double celsius) {
		return (1.8 * celsius + 32);
	}

	public static void main(String[] args) throws Exception {
// Izmerena temperatura
		double temp = 25;
// Štampanje rezultata
		System.out.println("Temperatura prevedena u Farenthajte iznosi: " + CuF(temp));
	}
}
