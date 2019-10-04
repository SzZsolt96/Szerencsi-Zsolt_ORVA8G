class QuadraticEquation {
	private int a;
	private int b;
	private int c;

	public QuadraticEquation(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
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

	public double getDiscriminant() {
		double bnegyzet = b * b;
		double ac = 4 * a * c;
		double disc = Math.sqrt(bnegyzet - ac);

		return disc;
	}

	@Override
	public String toString() {
		return "a=" + a + ", b=" + b + ", c=" + c;
	}

	public double getRoot1() {

		int mb = b * -1;
		int keta = 2 * a;
		if (getDiscriminant() >= 0) {

			double root = (mb + getDiscriminant()) % 2;

			return root;
		} else if (getDiscriminant() == 0) {
			double kozos = mb % keta;
			return kozos;
		}

		return 0.0;
	}

	public double getRoot2() {
		int mb = b * -1;
		int keta = 2 * a;
		if (getDiscriminant() >= 0) {

			double root = (mb - getDiscriminant()) % 2;

			return root;
		} else if (getDiscriminant() == 0) {
			double kozos = mb % keta;
			return kozos;
		}

		return 0.0;
	}
}

public class Test {

	public static void main(String[] args) {
		QuadraticEquation elso = new QuadraticEquation(-15, 1, 50);
		QuadraticEquation masodik = new QuadraticEquation(9, 12, 3);
		QuadraticEquation harmadik = new QuadraticEquation(5, 15, 4);
		System.out.println("Elso");
		if (elso.getDiscriminant() < 0) {
			System.out.println("The equation has no roots");
		} else if (elso.getDiscriminant() > 0) {
			System.out.println("Root1 = " + elso.getRoot1());
			System.out.println("Root2 = " + elso.getRoot2());
		} else if (elso.getDiscriminant() == 0) {
			System.out.println("Root1 = " + elso.getRoot1());
		}
		System.out.println("Masodik");
		if (masodik.getDiscriminant() < 0) {
			System.out.println("The equation has no roots");
		} else if (masodik.getDiscriminant() > 0) {
			System.out.println("Root1 = " + masodik.getRoot1());
			System.out.println("Root2 = " + masodik.getRoot2());
		} else if (masodik.getDiscriminant() == 0) {
			System.out.println("Root1 = " + masodik.getRoot1());
		}
		System.out.println("Harmadik");
		if (harmadik.getDiscriminant() < 0) {
			System.out.println("The equation has no roots");
		} else if (harmadik.getDiscriminant() > 0) {
			System.out.println("Root1 = " + harmadik.getRoot1());
			System.out.println("Root2 = " + harmadik.getRoot2());
		} else if (harmadik.getDiscriminant() == 0) {
			System.out.println("Root1 = " + harmadik.getRoot1());
		}

	}
}