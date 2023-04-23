package primer7;

/*Inicijalizacija objekta sa parametrizovanim konstruktorom*/
public class Box {

	private double width;
	private double height;
	private double depth;

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}
}
