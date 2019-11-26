import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

class Adatok {
	String filmnev;
	int evszam;

	public Adatok(String filmnev, int evszam) {
		super();
		this.filmnev = filmnev;
		this.evszam = evszam;
	}

	public String getFilmnev() {
		return filmnev;
	}

	public int getEvszam() {
		return evszam;
	}

	@Override
	public String toString() {
		return evszam + ": " + filmnev;
	}
}

class Mozi {
	String sztarNev;
	ArrayList<Adatok> film;
	int db;

	public Mozi(String sztarNev, ArrayList<Adatok> film, int db) {
		super();
		this.sztarNev = sztarNev;
		this.film = film;
		this.db = db;
	}

	public String getSztarNev() {
		return sztarNev;
	}

	public ArrayList<Adatok> getFilm() {
		return film;
	}

	public int getDb() {
		return db;
	}
}

public class Mozisztarok {

	public static void main(String[] args) {
		ArrayList<Mozi> list = new ArrayList<Mozi>();
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			ArrayList<Adatok> xList = new ArrayList<Adatok>();
			String sor = sc.nextLine();
			String filmcim = sor.split(":")[0];
			String szereplok = sor.split(":")[1];

			filmcim = filmcim.replace(" (", ":");
			filmcim = filmcim.replace(")", "");
			String cim = filmcim.split(":")[0];
			int evszam = Integer.parseInt(filmcim.split(":")[1]);
			String[] tmp = szereplok.split(",");
			Adatok adat = new Adatok(cim, evszam);

			for (int i = 0; i < tmp.length; ++i) {
				boolean van = false;
				for (int j = 0; j < list.size(); ++j) {
					if (list.get(j).sztarNev.equals(tmp[i])) {
						list.get(j).film.add(new Adatok(cim, evszam));
						++list.get(j).db;
						van = true;
					}
				}
				if (!van) {
					xList.add(new Adatok(cim, evszam));
					ArrayList<Adatok> yList = (ArrayList<Adatok>) xList.clone();
					list.add(new Mozi(tmp[i], yList, 1));
					xList.clear();
				}
			}

		}

		Collections.sort(list, Comparator.comparing(Mozi::getDb, Comparator.reverseOrder())
				.thenComparing(Mozi::getSztarNev, Comparator.naturalOrder()));

		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i).sztarNev);
			Collections.sort(list.get(i).film, Comparator.comparing(Adatok::getEvszam, Comparator.naturalOrder())
					.thenComparing(Adatok::getFilmnev, Comparator.naturalOrder()));
			for (int j = 0; j < list.get(i).film.size(); ++j) {
				System.out.println(list.get(i).film.get(j).toString());
			}
		}

	}

}

/*
 * class Adatok { String nev; ArrayList<Map<Integer, String>> film;
 * //ArrayList<String,Integer> adat2; int db;
 * 
 * public Adatok(String nev, ArrayList<Map<Integer, String>> film, int db) {
 * super(); this.nev = nev; this.film = film; this.db = db; }
 * 
 * public String getNev() { return nev; }
 * 
 * public ArrayList<Map<Integer, String>> getFilm() { return film; }
 * 
 * public int getDb() { return db; } }
 * 
 * class Adatok2 { String film; int evszam;
 * 
 * }
 * 
 * public class Mozisztarok {
 * 
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * ArrayList<Adatok> list = new ArrayList<Adatok>();
 * 
 * // Map<Integer,String> film = new TreeMap<Integer,String>(); //
 * Map<Integer,ArrayList<String>> nev = new TreeMap<Integer, //
 * ArrayList<String>>();
 * 
 * while (sc.hasNextLine()) { String sor = sc.nextLine(); if (sor.equals("END"))
 * { break; } String filmcim = sor.split(":")[0]; String szereplok =
 * sor.split(":")[1];
 * 
 * filmcim = filmcim.replace(" (", ":"); filmcim = filmcim.replace(")", "");
 * String cim = filmcim.split(":")[0]; int evszam =
 * Integer.parseInt(filmcim.split(":")[1]); Map<Integer, String> map = new
 * TreeMap<Integer, String>(); map.put(evszam, cim); ArrayList<Map<Integer,
 * String>> list2 = new ArrayList<Map<Integer, String>>(); list2.add(map); //
 * film.put(evszam, cim);
 * 
 * String[] sztarok = szereplok.split(",");
 * 
 * for (int i = 0; i < sztarok.length; ++i) { boolean van = false; for (int j =
 * 0; j < list.size(); ++j) { if (list.get(j).nev.equals(sztarok[i])) {
 * list.get(j).film.add(map); ++list.get(j).db; van = true; } } if (!van) {
 * list.add(new Adatok(sztarok[i], list2, 1)); } } }
 * 
 * Collections.sort(list, Comparator.comparing(Adatok::getDb,
 * Comparator.reverseOrder()) .thenComparing(Adatok::getNev,
 * Comparator.naturalOrder()));
 * 
 * for (Adatok adatok : list) { System.out.println(adatok.nev);
 * 
 * System.out.println(adatok.film.toString()); } } }
 */