package generickiTipovi;

public class MainGenTipovi {

	public static void main(String[] args) {

		GenTipovi<Integer> intObjekat = new GenTipovi<Integer>(100);
		GenTipovi<String> stringOb = new GenTipovi<String>("Tekst");
		GenTipovi<Character> charOb = new GenTipovi<Character>('S');

		intObjekat.prikaziTip();
		int vrednostIntObjekta = intObjekat.getOb();
		System.out.println("Vrednost: " + vrednostIntObjekta);

		stringOb.prikaziTip();
		System.out.println("Vrednost: " + stringOb.getOb());

		charOb.prikaziTip();
		System.out.println("Vrednost: " + charOb.getOb());
	}
}
