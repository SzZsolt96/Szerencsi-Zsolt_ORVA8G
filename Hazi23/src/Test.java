import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Hatizsak {
	String marka;
	double urtartalom;
	int zsebekSzama;
	boolean vizhatatlan;

	public Hatizsak(String marka, double urtartalom, int zsebekSzama, boolean vizhatatlan) {
		super();
		this.marka = marka;
		this.urtartalom = urtartalom;
		this.zsebekSzama = zsebekSzama;
		this.vizhatatlan = vizhatatlan;
	}

	public String getMarka() {
		return marka;
	}

	public double getUrtartalom() {
		return urtartalom;
	}

	public int getZsebekSzama() {
		return zsebekSzama;
	}

	public boolean isVizhatatlan() {
		return vizhatatlan;
	}

	@Override
	public String toString() {
		return "Hatizsak: " + marka + " " + urtartalom + " " + zsebekSzama + " " + vizhatatlan;
	}

}

public class Test {

	public static void Rendez(ArrayList<Hatizsak> lista) {
		Collections.sort(lista, Comparator.comparing(Hatizsak::getMarka, Comparator.naturalOrder())
				.thenComparing(Hatizsak::getZsebekSzama, Comparator.reverseOrder()));

		for (Hatizsak hatizsak : lista) {
			System.out.println(hatizsak.toString());
		}
	}

	public static void main(String[] args) {
		ArrayList<Hatizsak> list = new ArrayList<Hatizsak>();

		list.add(new Hatizsak("Nike", 42, 3, true));
		list.add(new Hatizsak("Adidas", 28, 3, true));
		list.add(new Hatizsak("Fila", 29, 3, false));
		list.add(new Hatizsak("Converse", 30, 4, true));
		list.add(new Hatizsak("CalvinKlein", 42, 3, true));
		list.add(new Hatizsak("Guess", 42, 3, false));
		list.add(new Hatizsak("Puma", 60, 4, false));
		list.add(new Hatizsak("TommyHilfiger", 28, 3, true));
		list.add(new Hatizsak("TomTailor", 20, 3, true));
		list.add(new Hatizsak("No Fear", 42, 3, false));

		Rendez(list);
	}

}
