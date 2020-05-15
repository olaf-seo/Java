package chapter3.section4;

public class Rectangle extends Shape{
	public int width;
	public int height;

	public Rectangle(int width, int height) {
		super("Rectangle");
		this.width = width;
		this.height = height;
	}

	@Override
	public double computeArea() {
		return (double)width*height;
	}

	@Override
	public double computePerimeter() {
		return 2.0*(width+height);
	}
	
	@Override
	public String toString() {
		return "Rectangle : width is " + width + ", height is "+ height;
	}

}
