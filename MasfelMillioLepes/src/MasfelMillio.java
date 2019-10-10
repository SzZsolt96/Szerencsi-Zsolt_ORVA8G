import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Adatok {
	String nev;
	int orszagos;
	int helyi;

	public Adatok(String nev, int orszagos, int helyi) {
		super();
		this.nev = nev;
		this.orszagos = orszagos;
		this.helyi = helyi;
	}

	public String getNev() {
		return nev;
	}

	public int getOrszagos() {
		return orszagos;
	}

	public int getHelyi() {
		return helyi;
	}
}

public class MasfelMillio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sor = sc.nextLine();
		int n = Integer.parseInt(sor);
		Adatok[] tmp = new Adatok[n];

		for (int i = 0; i < n; i++) {
			sor = sc.nextLine();
			String nev = sor.split(";")[0];
			String utvonal = sor.split(";")[1];
			int orszagos = 0;
			int helyi = 0;

			for (int j = 0; j < utvonal.length(); ++j) {
				if (utvonal.charAt(j) == 'K') {
					++orszagos;
				}
				if ((utvonal.charAt(j) == 'P') || (utvonal.charAt(j) == 'S') || (utvonal.charAt(j) == 'Z')) {
					++helyi;
				}
			}
			tmp[i] = new Adatok(nev, orszagos, helyi);
		}

		Arrays.sort(tmp,
				Comparator.comparing(Adatok::getOrszagos, Comparator.reverseOrder())
						.thenComparing(Adatok::getHelyi, Comparator.reverseOrder())
						.thenComparing(Adatok::getNev, Comparator.naturalOrder()));

		for (int i = 0; i < tmp.length; ++i) {
			System.out.println(tmp[i].nev);
		}
	}

}
