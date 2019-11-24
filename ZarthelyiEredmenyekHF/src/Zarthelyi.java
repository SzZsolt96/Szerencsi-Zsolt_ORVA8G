import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Eredmenyek {
	String nev;
	int pont;

	public Eredmenyek(String nev, int pont) {
		super();
		this.nev = nev;
		this.pont = pont;
	}

	public String getNev() {
		return nev;
	}

	public int getPont() {
		return pont;
	}
}

public class Zarthelyi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Eredmenyek> list = new ArrayList<Eredmenyek>();

		while (sc.hasNextLine()) {
			String sor = sc.nextLine();
			String nev = sor.split(";")[0];
			int pont = Integer.parseInt(sor.split(";")[1]);
			boolean van = false;

			for (int i = 0; i < list.size(); ++i) {
				if (list.get(i).nev.equals(nev)) {
					list.get(i).pont += pont;
					van = true;
				}
			}
			if (!van) {
				list.add(new Eredmenyek(nev, pont));
			}
		}
		Collections.sort(list, Comparator.comparing(Eredmenyek::getPont, Comparator.reverseOrder())
				.thenComparing(Eredmenyek::getNev, Comparator.naturalOrder()));

		for (Eredmenyek eredmenyek : list) {
			System.out.println(eredmenyek.nev + ": " + eredmenyek.pont + " pont");
		}
	}
}