package threads;

/*Nit se moze napraviti i kada klasu Thread prosirimo novom nasledjenom klasom
 *  a zatim napravimo instancu te klase.
Nova potklasa mora da redefinise metodu run() 
*/

public class NovaNit2 extends Thread {

	public NovaNit2(String s) {
		super(s); // Kljucna rec super poziva konstuktore nasledjene klase
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName()); // Unutar metode run stavljamo kod koji hocemo da se izvrsava u posebnom
											// Threadu.
		}
	}
}
