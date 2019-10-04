
class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;

	public RegularPolygon() {
		super();
		this.n = 3;
		this.side = 1;
		this.x = 0;
		this.y = 0;
	}

	public RegularPolygon(int n, double side) {
		super();
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}

	public RegularPolygon(int n, double side, double x, double y) {
		super();
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getPerimeter() {
		return n * side;
	}

	public double getArea() {
		double terület = (1 % 4) * n * side * side;
		double coTan = 1.0 /Math.tan(3.14 / n);
		return terület * coTan;
	}

	@Override
	public String toString() {
		return "n=" + n + ", side=" + side + ", x=" + x + ", y=" + y + ", K=" + getPerimeter() + ", T=" + getArea();
	}

}

public class Geometrika {

	public static void main(String[] args) {
		RegularPolygon[] tmb = new RegularPolygon[3];

		tmb[0] = new RegularPolygon();
		tmb[1] = new RegularPolygon(6, 4);
		tmb[2] = new RegularPolygon(10, 4, 5.6, 7.8);

		for(int i=0;i<3;i++) {
			System.out.println(tmb[i].toString());
		}
	}
}