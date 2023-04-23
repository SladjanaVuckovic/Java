package primer8;

public class Box {

	private double width;
	private double height;
	private double depth;

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	double volume() {
		return width * height * depth;
	}
}
/*
 * THIS se u praksi najcesce koristi - kada hocemo da pristupimo podacima nekog
 * objekta (taj objekat moze biti zasticen lokalnim prominljivama ili
 * parametrima metode) – u tom slucaju najbolje je koristiti klucnu rec THIS. -
 * Da odredimo tacno objekat sa kojim trenutno radimo.
 */