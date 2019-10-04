
class Pont {
	private double x;
	private double y;

	public Pont(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}

public class Hazi {

	public static void main(String[] args) {

		Pont elso = new Pont(2, 3);
		Pont masodik = new Pont(4, 5);
		Pont harmadik = new Pont(6, 7);
		Pont negyedik = new Pont(8, 9);

		elso.setY(elso.getY() + 5);
		masodik.setY(masodik.getY() + 5);
		harmadik.setX(harmadik.getX() - 3.4);
		negyedik.setX(negyedik.getX() - 3.4);

		System.out.println(elso.getX() + " " + elso.getY());
		System.out.println(masodik.getX() + " " + masodik.getY());
		System.out.println(harmadik.getX() + " " + harmadik.getY());
		System.out.println(negyedik.getX() + " " + negyedik.getY());
	}
}