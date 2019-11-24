import java.util.Comparator;

public class Lakohaz implements Comparator<Lakohaz> {
	double emeletMagassag = 3.2;
	String cim;
	int emeletekSzama;
	double alapterulet;

	public Lakohaz(String cim, int emeletekSzama, double alapterulet) {
		super();
		this.cim = cim;
		this.emeletekSzama = emeletekSzama;
		this.alapterulet = alapterulet;
	}

	public String getCim() {
		return cim;
	}

	public int getEmeletekSzama() {
		return emeletekSzama;
	}

	public double getAlapterulet() {
		return alapterulet;
	}

	public double legkobmeter() {
		return alapterulet * emeletekSzama * emeletMagassag;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(cim);
		sb.append(" ");
		sb.append(legkobmeter());

		return sb.toString();
	}

	@Override
	public int compare(Lakohaz o1, Lakohaz o2) {
		if (o1.legkobmeter() > o2.legkobmeter()) {
			return 1;
		}
		if (o1.legkobmeter() < o2.legkobmeter()) {
			return -1;
		}
		return 0;
	}
}