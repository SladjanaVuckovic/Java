package generickiTipovi;

public class GenTipovi<T> { // genericka klasa. Ovde je T parametar tipa, koji ce biti zamenjen stvarnim
					// tipom kada se napravi objekat klase

	T ob; // int ob; - smo imali kod negenericke klase

	GenTipovi(T o) {
		ob = o;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	void prikaziTip() {
		System.out.println("Tip T je " + ob.getClass().getName());
	}
}
