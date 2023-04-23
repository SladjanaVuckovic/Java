package zadatak7;

/* Apsolutna vrednost negativnog broja je pozitivan broj, 
 * apsolutna vrednost pozitivnog broja je poztivan broj, 
 * apsolutna vrednost nule je nula, |0|=0. 
 * Napisati program koji za unetu vrednost ispisuje njegovu
apsolutnu vrednost*/

public class ApsolutnaVrednost {

	private double broj;

	public ApsolutnaVrednost(double broj) {
		this.broj = broj;
	}

	public double abs() {
		return broj = Math.abs(broj);
	}
}
