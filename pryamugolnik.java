package Practice1.Shapes;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends Shape {
	private int left;
	private int top;
	private int height;
	private int width;

	public Rectangle(Color color, int left, int top, int height, int width) {
		super(color);
		this.left = left;
		this.top = top;
		this.height = height;
		this.width = width;
	}

	public int getleft() {
		return left;
	}

	public void setleft(int left) {
		this.left = left;
	}

	public int gettop() {
		return top;
	}

	public void settop(int top) {
		this.top = top;
	}

	public int getheight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getwidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.printf("Rectangle color: %s, left: %d, top: %d, height: %d, width: %d\n", this.getColor().toString(), this.getleft(), this.gettop(), this.getheight(), this.getwidth());
		JFrame window = new JFrame();
		window.setBounds(30, 30, getwidth()+getleft()+50, getheight()+gettop()+50);
		window.getContentPane().add(new Rectangle.MyCanvas());
		window.setVisible(true);
	}

	class MyCanvas extends JComponent {

		public void paint(Graphics g)
		{
			g.setColor(getColor());
			g.drawRect(getX(), getY(), getwidth(), getheight());
			g.fillRect(getX(), getY(), getwidth(), getheight());
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Rectangle rectangle = (Rectangle) o;

		if (left != rectangle.left) return false;
		if (top != rectangle.top) return false;
		if (height != rectangle.height) return false;
		return width == rectangle.width;
	}
}
