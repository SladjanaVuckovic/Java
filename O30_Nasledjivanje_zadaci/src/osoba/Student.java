package osoba;

public class Student extends Osoba {
	
	String ispit;
	
	public Student() {
		
	}
	public Student(String ime, String prezime, int starost, String ispit) {
		super(ime, prezime, starost);
		this.ispit=ispit;
	}
	

	public String getIspit() {
		return ispit;
	}

	public void setIspit(String ispit) {
		this.ispit = ispit;
	}
	
	
	public void ispisi() {
		System.out.println("Ime: " +ime+ "\nPrezime: " +prezime+ "\nStarost: " +starost + "\nIspit: "+ispit);
	}
}
