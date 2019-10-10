import java.util.Scanner;

class Adatok {
	String nev;
	String elotte;

	public Adatok(String nev, String elotte) {
		super();
		this.nev = nev;
		this.elotte = elotte;
	}
}

public class Fejesek2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sor = sc.nextLine();
		int n = Integer.parseInt(sor.split(";")[0]);
		String legelsoGyerek = sor.split(";")[1];
		String x = sor.split(";")[2];
		String[] tmp = new String[5];
		tmp[0] = legelsoGyerek;
		Adatok[] adat = new Adatok[n - 1];
		for (int i = 0; i < n - 1; ++i) {
			sor = sc.nextLine();
			adat[i] = new Adatok(sor.split(";")[0], sor.split(";")[1]);
		}
		for (int k = 0; k < n; ++k) {
			for (int j = 0; j < adat.length; ++j) {
				if (adat[j].elotte.equals(tmp[k])) {
					tmp[k + 1] = adat[j].nev;
				}
			}
		}
		int hanyadik = 0;
		for (int z = 0; z < tmp.length; ++z) {
			if (tmp[z].equals(x)) {
				hanyadik = z;
			}
		}
		int piros = 0;
		int kek = 0;
		for (int y = 0; y < hanyadik; ++y) {
			if (y % 2 == 0) {
				++piros;
			}
			if (y % 2 != 0) {
				++kek;
			}
		}

		System.out.println(piros + " " + kek);
	}
}