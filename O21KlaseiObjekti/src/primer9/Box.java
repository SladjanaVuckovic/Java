package primer9;

/*Preklapanje konstruktora (navodjenje vise oblika konstruktora)*/

public class Box {

	private double width;
	private double height;
	private double depth;

	Box() {
		width = 1;
		height = 1;
		depth = 1;
	}

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	Box(double len) {
		width = height = depth = len;
	}

	Box(Box b) {
		width = b.width;
		height = b.height;
		depth = b.depth;
	}

	double volume() {
		return width * height * depth;
	}
}
