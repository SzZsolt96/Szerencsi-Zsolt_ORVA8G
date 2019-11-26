import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Sztarok {
	String szineszNev;
	int evszam;

	public Sztarok(String szineszNev, int evszam) {
		super();
		this.szineszNev = szineszNev;
		this.evszam = evszam;
	}

	public String getSzineszNev() {
		return szineszNev;
	}

	public int getEvszam() {
		return evszam;
	}

	@Override
	public String toString() {
		return evszam + ": " + szineszNev;
	}
}

class Filmek {
	String filmcim;
	ArrayList<Sztarok> sztarok;
	int db;

	public Filmek(String filmcim, ArrayList<Sztarok> sztarok, int db) {
		super();
		this.filmcim = filmcim;
		this.sztarok = sztarok;
		this.db = db;
	}

	public String getFilmcim() {
		return filmcim;
	}

	public ArrayList<Sztarok> getSztarok() {
		return sztarok;
	}

	public int getDb() {
		return db;
	}
}

public class Mozisztarok2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Filmek> list = new ArrayList<Filmek>();

		while (sc.hasNextLine()) {
			ArrayList<Sztarok> xList = new ArrayList<Sztarok>();
			String sor = sc.nextLine();
			String szineszEvszam = sor.split(":")[0];
			String filmek = sor.split(":")[1];

			szineszEvszam = szineszEvszam.replace(" (", ",");
			szineszEvszam = szineszEvszam.replace(")", "");
			String szineszNev = szineszEvszam.split(",")[0];
			int evszam = Integer.parseInt(szineszEvszam.split(",")[1]);

			String[] filmcimek = filmek.split(";");

			for (int i = 0; i < filmcimek.length; ++i) {
				boolean van = false;
				for (int j = 0; j < list.size(); ++j) {
					if (list.get(j).filmcim.equals(filmcimek[i])) {
						list.get(j).sztarok.add(new Sztarok(szineszNev, evszam));
						++list.get(j).db;
						van = true;
					}
				}
				if (!van) {
					xList.add(new Sztarok(szineszNev, evszam));
					ArrayList<Sztarok> yList = (ArrayList<Sztarok>) xList.clone();
					list.add(new Filmek(filmcimek[i], yList, 1));
					xList.clear();
				}
			}
		}
		Collections.sort(list, Comparator.comparing(Filmek::getDb, Comparator.reverseOrder())
				.thenComparing(Filmek::getFilmcim, Comparator.naturalOrder()));

		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i).filmcim);
			Collections.sort(list.get(i).sztarok, Comparator.comparing(Sztarok::getEvszam, Comparator.naturalOrder())
					.thenComparing(Sztarok::getSzineszNev, Comparator.naturalOrder()));
			for (int j = 0; j < list.get(i).sztarok.size(); ++j) {
				System.out.println(list.get(i).sztarok.get(j).toString());
			}
		}
	}
}