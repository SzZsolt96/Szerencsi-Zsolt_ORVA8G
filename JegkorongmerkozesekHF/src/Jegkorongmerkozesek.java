import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Adatok {
	String nev;
	int pont;
	int golok;

	public Adatok(String nev, int pont, int golok) {
		super();
		this.nev = nev;
		this.pont = pont;
		this.golok = golok;
	}

	public String getNev() {
		return nev;
	}

	public int getPont() {
		return pont;
	}

	public int getGolok() {
		return golok;
	}

	@Override
	public String toString() {
		return nev + ": " + pont + " points (" + golok + " scored goals)";
	}

}

public class Jegkorongmerkozesek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Adatok> list = new ArrayList<Adatok>();

		while (sc.hasNextLine()) {
			String sor = sc.nextLine();
			String nevek = sor.split(":")[0];
			String merkozesek = sor.split(":")[1];

			String csapatA = nevek.split("-")[0];
			String csapatB = nevek.split("-")[1];

			String[] eredmenyek = merkozesek.split(",");

			int golokA = 0;
			int golokB = 0;

			for (int i = 0; i < eredmenyek.length; ++i) {
				int hazai = Integer.parseInt(eredmenyek[i].split("-")[0]);
				int vendeg = Integer.parseInt(eredmenyek[i].split("-")[1]);
				golokA += hazai;
				golokB += vendeg;
			}
			boolean vanA = false;
			boolean vanB = false;
			if (eredmenyek.length == 3) {
				if (golokA > golokB) {
					for (int j = 0; j < list.size(); ++j) {
						if (list.get(j).nev.equals(csapatA)) {
							list.get(j).golok += golokA;
							list.get(j).pont += 3;
							vanA = true;
						}
						if (list.get(j).nev.equals(csapatB)) {
							list.get(j).golok += golokB;
							vanB = true;
						}
					}
					if (!vanA) {
						list.add(new Adatok(csapatA, 3, golokA));
					}
					if (!vanB) {
						list.add(new Adatok(csapatB, 0, golokB));
					}
				}

				if (golokA < golokB) {
					for (int j = 0; j < list.size(); ++j) {
						if (list.get(j).nev.equals(csapatB)) {
							list.get(j).golok += golokB;
							list.get(j).pont += 3;
							vanB = true;
						}
						if (list.get(j).nev.equals(csapatA)) {
							list.get(j).golok += golokA;
							vanA = true;
						}
					}
					if (!vanA) {
						list.add(new Adatok(csapatA, 0, golokA));
					}
					if (!vanB) {
						list.add(new Adatok(csapatB, 3, golokB));
					}
				}
			}
			if (eredmenyek.length != 3) {
				if (golokA > golokB) {
					for (int j = 0; j < list.size(); ++j) {
						if (list.get(j).nev.equals(csapatA)) {
							list.get(j).golok += golokA;
							list.get(j).pont += 2;
							vanA = true;
						}
						if (list.get(j).nev.equals(csapatB)) {
							list.get(j).golok += golokB;
							list.get(j).pont += 1;
							vanB = true;
						}
					}
					if (!vanA) {
						list.add(new Adatok(csapatA, 2, golokA));
					}
					if (!vanB) {
						list.add(new Adatok(csapatB, 1, golokB));
					}
				}

				if (golokA < golokB) {
					for (int j = 0; j < list.size(); ++j) {
						if (list.get(j).nev.equals(csapatB)) {
							list.get(j).golok += golokB;
							list.get(j).pont += 2;
							vanB = true;
						}
						if (list.get(j).nev.equals(csapatA)) {
							list.get(j).golok += golokA;
							list.get(j).pont += 1;
							vanA = true;
						}
					}
					if (!vanA) {
						list.add(new Adatok(csapatA, 1, golokA));
					}
					if (!vanB) {
						list.add(new Adatok(csapatB, 2, golokB));
					}
				}
			}
		}
		Collections.sort(list,
				Comparator.comparing(Adatok::getPont, Comparator.reverseOrder())
						.thenComparing(Adatok::getGolok, Comparator.reverseOrder())
						.thenComparing(Adatok::getNev, Comparator.reverseOrder()));
		for (Adatok adatok : list) {
			System.out.println(adatok.toString());
		}
	}

}
