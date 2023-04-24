package generickiTipovi;

public class GenTipovi3 {

	public static <T> void stampajNiz(T[] pocetniNiz) {
		for (T element : pocetniNiz) {
			System.out.printf("%s ", element);
		}
	}

	public static void main(String[] args) {
		Integer[] i = { 1, 2, 3, 4, 5, 6, 7 };
		Double[] d = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] c = { 'a', 'b', 'c', 'd', 'e' };

		System.out.println("Sadrzaj celobrojnog niza: ");
		stampajNiz(i);

		System.out.println("\n\nSadrzaj double niza: ");
		stampajNiz(d);

		System.out.println("\n\nSadrzaj niza karaktera: ");
		stampajNiz(c);
	}

}
