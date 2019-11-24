import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Adatok {
	String nev;
	int szabadHely;

	public Adatok(String nev, int szabadHely) {
		super();
		this.nev = nev;
		this.szabadHely = szabadHely;
	}

	public String getNev() {
		return nev;
	}

	public int getSzabadHely() {
		return szabadHely;
	}

}

public class Parkolo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Adatok> list = new ArrayList<Adatok>();

		while (sc.hasNextLine()) {
			String sor = sc.nextLine();
			String[] tmp = sor.split(";");
			int kapacitas = Integer.parseInt(tmp[2]);
			int szabadHely = kapacitas - (tmp.length - 3);

			list.add(new Adatok(tmp[0], szabadHely));
		}
		Collections.sort(list, Comparator.comparing(Adatok::getSzabadHely, Comparator.reverseOrder())
				.thenComparing(Adatok::getNev, Comparator.naturalOrder()));

		for (Adatok adatok : list) {
			if (adatok.szabadHely > 2) {
				System.out.println(adatok.nev + ": " + adatok.szabadHely + " szabad hely");
			}
		}
	}
}