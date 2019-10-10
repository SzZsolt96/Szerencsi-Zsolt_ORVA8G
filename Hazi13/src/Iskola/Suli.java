package Iskola;

import java.util.Scanner;

public class Suli {

	public static boolean oratHozzaad(Ora ora, Orarend orarend) {
		boolean lehet = true;
		if (orarend.oraszamlalo == 12) {
			lehet = false;
		}
		for (int i = 0; i < orarend.ora.length; ++i) {
			if (orarend.ora[i].kezdes == ora.kezdes) {
				lehet = false;
			}
		}
		return lehet;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sor = sc.nextLine();
		String nap = sor;
		sor = sc.nextLine();
		int db = Integer.parseInt(sor);
		Orarend orarend = new Orarend(nap);
		int i = 0;
		for (int k = 0; k < db; ++k) {
			sor = sc.nextLine();
			int oraKod = Integer.parseInt(sor.split(" ")[0]);
			String nev = sor.split(" ")[1];
			int kezdes = Integer.parseInt(sor.split(" ")[2]);

			Ora ora = new Ora(oraKod, nev, kezdes);

			if (orarend.oraszamlalo == 0) {
				System.out.println("Sikeres");
				orarend.ora[i].oraKod = oraKod;
				orarend.ora[i].oraNev = nev;
				orarend.ora[i].kezdes = kezdes;
				orarend.oraszamlalo++;
				++i;
			} else {
				if (oratHozzaad(ora, orarend)) {
					System.out.println("Sikeres");
					orarend.ora[i].oraKod = oraKod;
					orarend.ora[i].oraNev = nev;
					orarend.ora[i].kezdes = kezdes;
					orarend.oraszamlalo++;
					++i;
				}
				if (!oratHozzaad(ora, orarend)) {
					System.out.println("Sikertelen");
				}
			}
		}
		System.out.println(orarend.nap);
		for (int j = 0; j < orarend.ora.length; ++j) {
			System.out.println(orarend.ora[j].toString());
		}
	}

}
