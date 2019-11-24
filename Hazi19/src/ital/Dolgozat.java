package ital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Dolgozat {

	public static SzeszesItal[] legmagasabbAlkohol(Ital[] tmp) {
		SzeszesItal[] szeszesItal = new SzeszesItal[3];
		ArrayList<SzeszesItal> list = new ArrayList<SzeszesItal>();
		for (int i = 0; i < tmp.length; ++i) {
			if (tmp[i] instanceof SzeszesItal) {
				SzeszesItal name = (SzeszesItal) tmp[i];
				list.add(new SzeszesItal(name.nev, name.kiszereles, name.ar, name.getAlkohlolTartalom()));
			}
		}
		Collections.sort(list, Comparator.comparing(SzeszesItal::getAlkohlolTartalom, Comparator.reverseOrder()));
		for (int j = 0; j < 3; ++j) {
			szeszesItal[j] = new SzeszesItal(list.get(j).nev, list.get(j).kiszereles, list.get(j).ar,
					list.get(j).getAlkohlolTartalom());
		}

		if (szeszesItal.length != 3) {
			return null;
		}
		return szeszesItal;
	}

	public static void main(String[] args) {
		Ital[] tomb = new Ital[10];

		tomb[0] = new Ital("Pepsi", "3", 300);
		tomb[1] = new Ital("Coca-cola", "5", 300);
		tomb[2] = new SzeszesItal("JimBeam", "7", 4000, 40.0);
		tomb[3] = new SzeszesItal("Royal", "7", 3000, 30.0);
		tomb[4] = new SzeszesItal("Kekfrankos", "1", 500, 15.5);
		tomb[5] = new SzeszesItal("Guinness", "5", 350, 4.2);
		tomb[6] = new SzeszesItal("Soproni", "4", 250, 2.0);
		tomb[7] = new SzeszesItal("RedLabel", "7", 3500, 40.0);
		tomb[8] = new SzeszesItal("Unicum", "7", 3700, 33.0);
		tomb[9] = new SzeszesItal("Heineken", "4", 290, 3.0);

		SzeszesItal[] tmp = legmagasabbAlkohol(tomb);

		Arrays.sort(tmp, Comparator.comparing(SzeszesItal::getAr, Comparator.naturalOrder()));

		for (SzeszesItal szeszesItal : tmp) {
			System.out.println(szeszesItal.toString());
		}
	}
}
