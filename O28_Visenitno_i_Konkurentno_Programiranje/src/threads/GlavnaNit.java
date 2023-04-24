package threads;

public class GlavnaNit {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println("Trenutna nit " + t);

		System.out.println("Naziv niti: " + Thread.currentThread().getName());//
		// System.out.println("Naziv niti " + t.getName()); -Pristupanje preko kreiranog
		// objekta
		// System.out.println("Prioritet niti: " + t.getPriority());
		System.out.println("Prioritet niti: " + Thread.currentThread().getPriority());
	}

}
/*Svaki proces ima tu jednu glavnu, kontrolnu ili inicijalnu nit 
 * njen zadatak je, ukoliko je potrebno,  da napravi ostale niti. 
 * Da bismo upravljali tom glavnom niti potrebno je da kreiramo 
 * objekat tipa Thread, I to pozivom metode currentThread() */
 