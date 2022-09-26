package Practice1.Shapes;

import java.awt.*;

public class Main {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(Color.RED,100,100);
		shapes[1] = new Rectangle(Color.BLUE, 10,10,100,100);

		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}
