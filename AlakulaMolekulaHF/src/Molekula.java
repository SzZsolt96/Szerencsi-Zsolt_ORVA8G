import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

class Vegyjelek {
	String vegyjel;
	String elemnev;
	int db;

	public Vegyjelek(String vegyjel, String elemnev, int db) {
		super();
		this.vegyjel = vegyjel;
		this.elemnev = elemnev;
		this.db = db;
	}

	public String getVegyjel() {
		return vegyjel;
	}

	public String getElemnev() {
		return elemnev;
	}

	public int getDb() {
		return db;
	}

	@Override
	public String toString() {
		return db + " " + elemnev;
	}
}

class Molekulak {
	String nev;
	ArrayList<Vegyjelek> vList;

	public Molekulak(String nev, ArrayList<Vegyjelek> vList) {
		super();
		this.nev = nev;
		// this.vList = new ArrayList<Vegyjelek>();
		this.vList = vList;
	}

	public String getNev() {
		return nev;
	}

	public ArrayList<Vegyjelek> getvList() {
		return vList;
	}

}

public class Molekula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		ArrayList<Molekulak> mList = new ArrayList<Molekulak>();
		ArrayList<Vegyjelek> xList = new ArrayList<Vegyjelek>();

		boolean minusz = false;
		while (sc.hasNextLine()) {
			String sor = sc.nextLine();
			if (sor.equals("-")) {
				minusz = true;
				sor = sc.nextLine();
			}
			if (!minusz) {
				String vegyjel = sor.split(":")[0];
				String elemnev = sor.split(":")[1];
				map.put(vegyjel, elemnev);
			}
			if (minusz) {
				sor = sor.replaceAll(":", ",");
				String[] tmp = sor.split(",");

				for (int i = 1; i < tmp.length; ++i) {
					for (Entry<String, String> entry : map.entrySet()) {
						if (tmp[i].equals(entry.getKey())) {
							boolean van = false;
							for (int j = 0; j < xList.size(); ++j) {
								if (xList.get(j).vegyjel.equals(tmp[i])) {
									++xList.get(j).db;
									van = true;
								}
							}
							if (!van) {
								xList.add(new Vegyjelek(entry.getKey(), entry.getValue(), 1));
							}
						}
					}
				}
				ArrayList<Vegyjelek> yList = (ArrayList<Vegyjelek>) xList.clone();
				Collections.sort(yList, Comparator.comparing(Vegyjelek::getDb, Comparator.reverseOrder())
						.thenComparing(Vegyjelek::getElemnev, Comparator.naturalOrder()));
				xList.clear();
				mList.add(new Molekulak(tmp[0], yList));

			}
		}
		Collections.sort(mList, Comparator.comparing(Molekulak::getNev, Comparator.naturalOrder()));
		for (int j = 0; j < mList.size(); ++j) {
			System.out.println(mList.get(j).nev + ":");
			for (int i = 0; i < mList.get(j).vList.size(); ++i) {
				System.out.println(mList.get(j).vList.get(i).toString());
			}
		}
	}
}

/*
 * class Vegyjelek { String vegyjel; String elemnev; int db;
 * 
 * public Vegyjelek(String vegyjel, String elemnev, int db) { super();
 * this.vegyjel = vegyjel; this.elemnev = elemnev; this.db = db; }
 * 
 * public String getVegyjel() { return vegyjel; }
 * 
 * public String getElemnev() { return elemnev; }
 * 
 * public int getDb() { return db; }
 * 
 * @Override public String toString() { // return vegyjel + " " + elemnev + " "
 * + db; return db + " " + elemnev; }
 * 
 * }
 * 
 * public class Molekula {
 * 
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * Map<String, String> map2 = new HashMap<String, String>();
 * ArrayList<Vegyjelek> mList = new ArrayList<Vegyjelek>(); Map<String,
 * ArrayList<Vegyjelek>> map = new TreeMap<String, ArrayList<Vegyjelek>>();
 * 
 * boolean minusz = false; while (sc.hasNextLine()) { String sor =
 * sc.nextLine(); if (sor.equals("-")) { minusz = true; sor = sc.nextLine(); }
 * if (sor.equals("END")) { break; } if (!minusz) { String vegyjel =
 * sor.split(":")[0]; String elemnev = sor.split(":")[1]; map2.put(vegyjel,
 * elemnev); } if (minusz) { sor = sor.replaceAll(":", ","); String[] tmp =
 * sor.split(",");
 * 
 * for (int i = 1; i < tmp.length; ++i) { for (Entry<String, String> e :
 * map2.entrySet()) { if (tmp[i].equals(e.getKey())) { boolean van = false; for
 * (int j = 0; j < mList.size(); ++j) { if (mList.get(j).vegyjel.equals(tmp[i]))
 * { ++mList.get(j).db; van = true; } } if (!van) { mList.add(new
 * Vegyjelek(tmp[i], e.getValue(), 1)); } } } } Collections.sort(mList,
 * Comparator.comparing(Vegyjelek::getDb, Comparator.reverseOrder())
 * .thenComparing(Vegyjelek::getElemnev, Comparator.naturalOrder())); if
 * (!map.containsKey(tmp[0])) { map.put(tmp[0], mList); } }
 * 
 * }
 * 
 * for (Entry<String, ArrayList<Vegyjelek>> entry : map.entrySet()) {
 * System.out.println(entry.getKey() + ":");
 * System.out.println(entry.getValue().toString());
 * 
 * } } }
 */