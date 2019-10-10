import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Adatok {
	String nev;
	int homerseklet;

	public Adatok(String nev, int homerseklet) {
		super();
		this.nev = nev;
		this.homerseklet = homerseklet;
	}

	public String getNev() {
		return nev;
	}

	public int getHomerseklet() {
		return homerseklet;
	}

	@Override
	public String toString() {
		return nev + " (" + homerseklet + ")";
	}

}

public class IzzasztoFeladat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sor = sc.nextLine();
		int n = Integer.parseInt(sor.split(" ")[0]);
		String telepules = sor.split(" ")[1];
		int tHomerseklet = 0;
		Adatok[] tmp = new Adatok[n];
		boolean van = false;

		for (int i = 0; i < n; ++i) {
			sor = sc.nextLine();
			String nev = sor.split(":")[0];
			int homerseklet = Integer.parseInt(sor.split(":")[1]);
			if (nev.equals(telepules)) {
				van = true;
				tHomerseklet = homerseklet;
			}
			tmp[i] = new Adatok(nev, homerseklet);
		}

		Arrays.sort(tmp, Comparator.comparing(Adatok::getHomerseklet, Comparator.reverseOrder())
				.thenComparing(Adatok::getNev, Comparator.naturalOrder()));

		if (van) {
			for (int j = 0; j < tmp.length; ++j) {
				if (tmp[j].homerseklet > tHomerseklet) {
					System.out.println(tmp[j].toString());
				}
			}
		} else {
			System.out.println("Missing data");
		}
	}

}
