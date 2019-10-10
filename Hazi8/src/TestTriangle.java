class Triangle extends GeometricShape {
	double side1;
	double side2;
	double side3;

	public Triangle() {
		super();
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(double side1, double side2, double side3, String color) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.color = color;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double terulet = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return terulet;
	}

	public double getPerimeter() {
		double kerulet = side1 + side2 + side3;
		return kerulet;
	}

	@Override
	public String toString() {
		return "Triangle side1= " + side1 + ", side2 =" + side2 + ", side3 =" + side3 + "]";
	}

}

public class TestTriangle {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(1, 1.5, 1, "yellow");

		System.out.println("Triangle area: " + triangle.getArea());
		System.out.println("Triangle perimeter: " + triangle.getPerimeter());
		System.out.println("Triangle color is " + triangle.getColor() + "  filled: " + triangle.isFilled());
	}

}
