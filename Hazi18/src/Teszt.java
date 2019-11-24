import java.util.ArrayList;

public class Teszt {

	public static ArrayList<Aszu> hanyPuttony(Bor[] tomb) {
		ArrayList<Aszu> tmb = new ArrayList<Aszu>();
		for (int i = 0; i < tomb.length; ++i) {
			if (tomb[i] instanceof Aszu) {
				Aszu name = (Aszu) tomb[i];
				if (name.getPuttonySzam() == 5) {
					tmb.add(new Aszu(name.getIz(), name.getAlkoholtartalom(), name.getSzoloFajta(),
							name.getTermoTerulet(), name.getPuttonySzam()));
				}
			}
		}
		return tmb;
	}

	public static void main(String[] args) {
		Bor[] tmp = new Bor[10];

		tmp[0] = new Bor("szaraz", 10.0, "feher", "Tokaj");
		tmp[1] = new Aszu("szaraz", 15.0, "feher", "Tokaj", 5);
		tmp[2] = new Bor("edes", 15.0, "voros", "Tokaj");
		tmp[3] = new Aszu("szaraz", 15.0, "voros", "Tokaj", 8);
		tmp[4] = new Bor("feledes", 10.0, "voros", "Tokaj");
		tmp[5] = new Bor("szaraz", 10.0, "feher", "Tokaj");
		tmp[6] = new Aszu("szaraz", 15.0, "feher", "Tokaj", 3);
		tmp[7] = new Aszu("feledes", 15.0, "feher", "Tokaj", 5);
		tmp[8] = new Aszu("roze", 15.0, "voros", "Tokaj", 5);
		tmp[9] = new Aszu("szaraz", 15.0, "feher", "Tokaj", 5);

		ArrayList<Aszu> aszu = hanyPuttony(tmp);

		for (Aszu aszu2 : aszu) {
			System.out.println(aszu2.toString());
		}
	}

}
