import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Hozzavalok {
	String nev;
	int db;

	public Hozzavalok(String nev, int db) {
		super();
		this.nev = nev;
		this.db = db;
	}

	public String getNev() {
		return nev;
	}

	public int getDb() {
		return db;
	}

}

public class Karacsonyi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Hozzavalok> list = new ArrayList<Hozzavalok>();

		while (sc.hasNextLine()) {
			String sor = sc.nextLine();
			String nev = sor.split(";")[0];
			int db = Integer.parseInt(sor.split(";")[1]);
			boolean van = false;

			for (int i = 0; i < list.size(); ++i) {
				if (list.get(i).nev.equals(nev)) {
					list.get(i).db += db;
					van = true;
				}
			}
			if (!van) {
				list.add(new Hozzavalok(nev, db));
			}
		}

		Collections.sort(list, Comparator.comparing(Hozzavalok::getDb, Comparator.reverseOrder())
				.thenComparing(Hozzavalok::getNev, Comparator.naturalOrder()));

		for (Hozzavalok hozzavalok : list) {
			System.out.println(hozzavalok.nev + ";" + hozzavalok.db);
		}
	}
}
