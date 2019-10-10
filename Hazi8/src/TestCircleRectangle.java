import java.util.Date;

class GeometricShape {
	String color;
	boolean filled;
	Date dataCreated = new Date();

	public GeometricShape() {
		super();
		this.color = "white";
		this.filled = false;
	}

	public GeometricShape(String color, boolean filled, Date dataCreated) {
		super();
		this.color = color;
		this.filled = filled;
		this.dataCreated.setTime(15201);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDataCreated() {
		return dataCreated;
	}

	@Override
	public String toString() {
		return "created on " + dataCreated.toString() + " color: " + color + " and filled: " + filled;
	}
}

class Circle extends GeometricShape {
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super();
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		double terulet = radius * radius * Math.PI;

		return terulet;
	}

	public double getPerimeter() {
		double kerulet = 2 * radius * Math.PI;

		return kerulet;
	}

	public double getDiameter() {
		double atmero = 2 * radius;

		return atmero;
	}
}

class Rectangle extends GeometricShape {
	double width;
	double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
		this.filled = filled;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		double terulet = width * height;
		return terulet;
	}

	public double getPerimeter() {
		double kerulet = 2 * (width + height);
		return kerulet;
	}
}

public class TestCircleRectangle {

	public static void main(String[] args) {
		Circle circle = new Circle(1.0);
		System.out.println("A circle " + circle.toString());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The perimeter is " + circle.getPerimeter());
		System.out.println("The diameter is " + circle.getDiameter());

		System.out.println();
		Rectangle rectangle = new Rectangle(2.0, 4.0);
		System.out.println("A rectangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());

	}

}
