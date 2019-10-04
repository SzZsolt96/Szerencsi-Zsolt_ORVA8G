class Rectangle {
	double wight = 1.0;
	double height = 1.0;

	public Rectangle() {
		super();
		this.wight = 1.0;
		this.height = 1.0;
	}

	public Rectangle(double wight, double height) {
		super();
		this.wight = wight;
		this.height = height;
	}

	public double getArea() {
		return wight * height;
	}

	public double getPerimeter() {
		return 2 * (wight + height);
	}

	@Override
	public String toString() {
		return "wight=" + wight + ", height=" + height + ", T=" + getArea() + ", K=" + getPerimeter();
	}
}

public class Teglalap {
	public static void main(String[] args) {
		Rectangle elso = new Rectangle(4, 40);
		Rectangle masodik = new Rectangle(3.5, 35.9);

		System.out.println(elso.toString());
		System.out.println(masodik.toString());
	}
}
