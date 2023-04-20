package sd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainOsoba {

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		
		Osoba osoba = new Osoba("Bane", 99);
		 
		// serijalizacija objekta
		try {
			FileOutputStream fos = new FileOutputStream("osoba.ser");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(osoba);
			out.close();
			fos.close();
			System.out.println("Objekt je serijalizovan u datoteku.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
          e.printStackTrace();
		}
       
		 // deserijalizacija objekta
        try {
			FileInputStream fis = new FileInputStream("osoba.ser");
			ObjectInputStream in = new ObjectInputStream(fis);
			Osoba dsrOsoba = (Osoba) in.readObject();
			
			in.close();
	        fis.close();
	        System.out.println("Objekt je deserijalizovan iz datoteke.");
	        System.out.println("Ime: " + dsrOsoba.getIme());
	        System.out.println("Godine: " + dsrOsoba.getGodine());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
	          e.printStackTrace();
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
/*1. Zbog cega se radi Serijalizacija i deserijalizacija objekta?
 * Serijalizacija i deserijalizacija se koriste u Javi kako bi se omogućilo cuvanje objekata u datoteke ili prenošenje preko mreže.
 * */

/*2Koje klase omogucuju serijalizaciju i deserijalizaciju objekta u javi?
 Klase koje omogućuju serijalizaciju i deserijalizaciju objekata su ObjectOutputStream i ObjectInputStream.
*/

/*Serializable je interfejs koji se koristi za označavanje objekata koji se mogu serijalizovati. 
Serializable interfejs nema metoda, već se koristi samo za označavanje da je objekt sposoban za serijalizaciju.*/

/*serialVersionUID je posebna varijabla koja se koristi prilikom serijalizacije i deserijalizacije objekata, tj identifikator.
 * Kada se objekt deserijalizuje, serijski identifikator se koristi kako bi se proverilo da li li verzija klase koja je deserijalizovana jednaka verziji klase koja je koriscena prilikom serijalizacije.*/

/**/