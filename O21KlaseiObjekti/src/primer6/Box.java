package primer6;

/*Inicijalizacija objekta koristeci podrazumevani konstruktor*/
public class Box {

	private double width;
	private double height;
	private double depth;

	Box() { // Konstruktor bez argumenata
		width = 10;
		height = 10;
		depth = 10;
	}

	double volume() {
		return width * height * depth;
	}
}
