import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Adatok {
	String ev;
	String honap;
	String nap;
	String nev;
	int tav;

	public Adatok(String ev, String honap, String nap, String nev, int tav) {
		super();
		this.ev = ev;
		this.honap = honap;
		this.nap = nap;
		this.nev = nev;
		this.tav = tav;
	}

	public String getEv() {
		return ev;
	}

	public String getHonap() {
		return honap;
	}

	public String getNap() {
		return nap;
	}

	public String getNev() {
		return nev;
	}

	public int getTav() {
		return tav;
	}

	@Override
	public String toString() {
		return ev + ";" + honap + ";" + nap + ";" + nev;
	}

}

public class BudapestKupa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sor = sc.nextLine();
		int n = Integer.parseInt(sor);
		Adatok[] tmp = new Adatok[n];
		for (int i = 0; i < n; i++) {
			sor = sc.nextLine();
			String[] token = sor.split(";");
			int tav = 0;
			for (int j = 4; j < token.length; ++j) {
				tav += Integer.parseInt(token[j]);
			}
			tmp[i] = new Adatok(token[0], token[1], token[2], token[3], tav);
		}

		Arrays.sort(tmp,
				Comparator.comparing(Adatok::getTav, Comparator.reverseOrder())
						.thenComparing(Adatok::getEv, Comparator.naturalOrder())
						.thenComparing(Adatok::getHonap, Comparator.naturalOrder())
						.thenComparing(Adatok::getNap, Comparator.naturalOrder())
						.thenComparing(Adatok::getNev, Comparator.naturalOrder()));
		int max = tmp[0].tav;
		for (int i = 0; i < tmp.length; ++i) {
			if (tmp[i].tav == max) {
				System.out.println(tmp[i].toString());
			}
		}
	}
}