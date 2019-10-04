
class LinearEquation {
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;

	public LinearEquation(int a, int b, int c, int d, int e, int f) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public int getD() {
		return d;
	}

	public int getE() {
		return e;
	}

	public int getF() {
		return f;
	}

	public boolean isSolvable() {
		if ((a * d - b * c) != 0) {
			return true;
		}
		return false;
	}

	public int getX() {
		int felso = e * d - b * f;
		int also = a * d - b * c;

		return felso / also;
	}

	public int getY() {
		int felso = a * f - e * c;
		int also = a * d - b * c;

		return felso / also;
	}

}

public class Algebra {
	public static void main(String[] args) {
		LinearEquation elso = new LinearEquation(2, 3, 4, 5, 6, 7);
		LinearEquation masodik = new LinearEquation(2, 3, 5, 7, 11, 13);
		LinearEquation harmadik = new LinearEquation(12, 14, 2, 5, 3, 7);
		System.out.println("Elso");
		if (elso.isSolvable()) {
			System.out.println("X= " + elso.getX());
			System.out.println("Y= " + elso.getY());
		} else {
			System.out.println("The equation has no solution.");
		}
		System.out.println("Masodik");
		if (masodik.isSolvable()) {
			System.out.println("X= " + masodik.getX());
			System.out.println("Y= " + masodik.getY());
		} else {
			System.out.println("The equation has no solution.");
		}
		System.out.println("Harmadik");
		if (harmadik.isSolvable()) {
			System.out.println("X= " + harmadik.getX());
			System.out.println("Y= " + harmadik.getY());
		} else {
			System.out.println("The equation has no solution.");
		}
	}

}
