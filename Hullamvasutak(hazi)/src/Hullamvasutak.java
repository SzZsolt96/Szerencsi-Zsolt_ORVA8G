import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Adatok {
	String hNev;
	String vNev;
	int magassag;
	int vIdo;

	public Adatok(String hNev, String vNev, int magassag, int vIdo) {
		super();
		this.hNev = hNev;
		this.vNev = vNev;
		this.magassag = magassag;
		this.vIdo = vIdo;
	}

	public String gethNev() {
		return hNev;
	}

	public String getvNev() {
		return vNev;
	}

	public int getMagassag() {
		return magassag;
	}

	public int getvIdo() {
		return vIdo;
	}

	@Override
	public String toString() {
		return hNev + " (" + vNev + "): " + vIdo;
	}

}

public class Hullamvasutak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sor = sc.nextLine();
		int n = Integer.parseInt(sor);
		Adatok[] tmb = new Adatok[n];

		for (int i = 0; i < n; ++i) {
			sor = sc.nextLine();
			String hNev = sor.split(";")[0];
			String vNev = sor.split(";")[1];
			int magassag = Integer.parseInt(sor.split(";")[2]);
			int vIdo = Integer.parseInt(sor.split(";")[3]);

			tmb[i] = new Adatok(hNev, vNev, magassag, vIdo);
		}

		Arrays.sort(tmb,
				Comparator.comparing(Adatok::getvIdo, Comparator.naturalOrder())
						.thenComparing(Adatok::getMagassag, Comparator.reverseOrder())
						.thenComparing(Adatok::gethNev, Comparator.naturalOrder()));

		for (int i = 0; i < tmb.length; ++i) {
			System.out.println(tmb[i].toString());
		}
	}

}
