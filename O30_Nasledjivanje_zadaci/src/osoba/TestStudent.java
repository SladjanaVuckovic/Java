package osoba;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student s = new Student();
		Student s1 = new Student("Pera", "Peric", 20, "Programiranje");

		System.out.println("Unesite ime: ");
		s.setIme(sc.next());
		System.out.println("Unesite prezime: ");
		s.setPrezime(sc.next());
		System.out.println("Unesite godine:");
		s.setStarost(sc.nextInt());
		System.out.println("Unesite ispit: ");
		s.setIspit(sc.next());

		System.out.println("Podaci o prvom studentu: ");
		s.ispisi();
		System.out.println("\nPodaci o drugom studentu:");
		s1.ispisi();
		sc.close();
	}

}
