package generickiTipovi;

public class MainGenTip2 {

	public static void main(String[] args) {

		GenTip2<Integer, String> gt1 = new GenTip2<Integer, String>(100, "JAVA");
		gt1.prikaziTip();
		int iVrednost = gt1.getObj1();
		String sVrednost = gt1.getObj2();
		System.out.println("Int vrednost : " + iVrednost);
		System.out.println("String vrednost : " + sVrednost);
		System.out.println();

		GenTip2<String, Double> gt2 = new GenTip2<String, Double>("tekst", 55.23);
		gt2.prikaziTip();

		System.out.println("String vrednost : " + gt2.getObj1());
		System.out.println("String vrednost : " + gt2.getObj2());

		System.out.println();

		GenTip2<Boolean, Integer> gt3 = new GenTip2<Boolean, Integer>(true, 101);
		gt3.prikaziTip();
		System.out.println("Boolean vrednost " + gt3.getObj1());
		System.out.println("Int vrednost " + gt3.getObj2());
	}
}
