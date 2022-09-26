package Practice1.Shapes;

import javax.swing.*;
import java.awt.*;

public class Circle extends Shape {
	private int x;
	private int y;

	public Circle(Color color, int x, int y) {
		super(color);
		this.x = x;
		this.y = y;
	}

	public int getx() {
		return x;
	}

	public void setx(int x) {
		this.x = x;
	}

	public int gety() {
		return y;
	}

	public void sety(int y) {
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.printf("Circle color: %s, x: %d, y: %d\n", this.getColor().toString(), this.getx(), this.gety());
		
		JFrame window = new JFrame();

	
		window.setBounds(30, 30, getx()+50, gety()+50);


		window.getContentPane().add(new MyCanvas());


		window.setVisible(true);

	}

	class MyCanvas extends JComponent {

		public void paint(Graphics g)
		{
			g.setColor(getColor());
			g.drawOval(10,10,getx(),gety());
			g.fillOval(10,10,getx(),gety());
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Circle circle = (Circle) o;

		if (x != circle.x) return false;
		return y == circle.y;
	}

}
