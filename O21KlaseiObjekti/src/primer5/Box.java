package primer5;

/*Inicijalizacija vrednosti u podrazumevanom konstruktoru*/
public class Box {

	private double width;
	private double height;
	private double depth;

	void initBox(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}
}
