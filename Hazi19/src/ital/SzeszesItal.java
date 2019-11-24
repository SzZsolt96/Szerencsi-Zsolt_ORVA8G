package ital;

public class SzeszesItal extends Ital {
	private double alkohlolTartalom;

	public SzeszesItal(String nev, String kiszereles, int ar, double alkohlolTartalom) {
		super(nev, kiszereles, ar);
		this.alkohlolTartalom = alkohlolTartalom;
	}

	public double getAlkohlolTartalom() {
		return alkohlolTartalom;
	}

	@Override
	public String toString() {
		return alkohlolTartalom + "% " + nev + ", " + kiszereles + "dl, " + ar + "Ft";
	}

}
