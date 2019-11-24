import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Penz {
	String nev;
	int osszeg;

	public Penz(String nev, int osszeg) {
		super();
		this.nev = nev;
		this.osszeg = osszeg;
	}

	public String getNev() {
		return nev;
	}

	public int getOsszeg() {
		return osszeg;
	}

}

public class Osztalypenz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Penz> list = new ArrayList<Penz>();

		while (sc.hasNextLine()) {
			String sor = sc.nextLine();
			String nev = sor.split(";")[0];
			int osszeg = Integer.parseInt(sor.split(";")[1]);
			boolean van = false;

			for (int i = 0; i < list.size(); ++i) {
				if (list.get(i).nev.equals(nev)) {
					list.get(i).osszeg += osszeg;
					van = true;
				}
			}

			if (!van) {
				list.add(new Penz(nev, osszeg));
			}
		}

		Collections.sort(list, Comparator.comparing(Penz::getOsszeg, Comparator.reverseOrder())
				.thenComparing(Penz::getNev, Comparator.naturalOrder()));

		for (Penz penz : list) {
			System.out.println(penz.nev + ";" + penz.osszeg);
		}
	}
}