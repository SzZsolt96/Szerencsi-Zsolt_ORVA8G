import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Auto implements Comparable<Auto> {
	private String rendszam;
	private int teljesitmeny;
	private boolean automata;
	private ArrayList<String> extra;

	public Auto(String rendszam, int teljesitmeny, boolean automata) {
		super();
		this.rendszam = rendszam;
		this.teljesitmeny = teljesitmeny;
		this.automata = automata;
	}

	public Auto(String rendszam, int teljesitmeny, boolean automata, ArrayList<String> extra) {
		super();
		this.rendszam = rendszam;
		this.teljesitmeny = teljesitmeny;
		this.automata = automata;
		this.extra = new ArrayList<String>();
	}

	public String getRendszam() {
		return rendszam;
	}

	public int getTeljesitmeny() {
		return teljesitmeny;
	}

	public boolean isAutomata() {
		return automata;
	}

	public ArrayList<String> getExtra() {
		return extra;
	}

	@Override
	public String toString() {
		return rendszam + " " + teljesitmeny + " " + automata;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (rendszam == null) {
			if (other.rendszam != null)
				return false;
		} else if (!rendszam.equals(other.rendszam))
			return false;
		return true;
	}

	@Override
	public int compareTo(Auto o) {
		if (teljesitmeny > o.teljesitmeny) {
			return 1;
		}
		if (teljesitmeny < o.teljesitmeny) {
			return -1;
		}
		return 0;
	}

	public static boolean Szabalyos(String rendszam) {
		if (rendszam.length() != 6) {
			return false;
		}
		for (int i = 0; i < 6; ++i) {
			char ch = rendszam.charAt(i);

			if (i < 3) {
				if (!Character.isAlphabetic(ch)) {
					return false;
				}
			} else if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

	public static int HanyAuto(Auto[] tmp) {
		int db = 0;

		for (int i = 0; i < tmp.length; ++i) {
			if (tmp[i] instanceof Auto) {
				++db;
			}
		}
		return db;
	}
}

class Teherauto extends Auto {
	int teherbiras;

	public Teherauto(String rendszam, int teljesitmeny, boolean automata, int teherbiras) {
		super(rendszam, teljesitmeny, automata);
		this.teherbiras = teherbiras;
	}

	@Override
	public String toString() {
		return getRendszam() + " " + getTeljesitmeny() + " " + isAutomata() + " " + teherbiras;
	}

}

public class Main {

	public static ArrayList<Teherauto> nagyobbMint(Auto[] tmp) {
		ArrayList<Teherauto> list = new ArrayList<Teherauto>();

		for (int i = 0; i < tmp.length; ++i) {
			if (tmp[i] instanceof Teherauto) {
				Teherauto name = (Teherauto) tmp[i];
				if (name.teherbiras > 20000) {
					list.add(new Teherauto(name.getRendszam(), name.getTeljesitmeny(), name.isAutomata(),
							name.teherbiras));
				}
			}
		}
		return list;
	}

	public static void Kiir(ArrayList<Auto> list) {
		Collections.sort(list, Comparator.comparing(Auto::getTeljesitmeny, Comparator.reverseOrder()));

		for (Auto auto : list) {
			if (list.size() < 3) {
				System.out.println(auto.toString());
			} else {
				for (int i = 0; i < 3; ++i) {
					System.out.println(auto.toString());
				}
			}
		}
	}

	public static void main(String[] args) {
		Auto auto = new Auto("ABC123", 100, true);
		System.out.println(auto);
		Auto[] tomb = new Auto[4];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; ++i) {
			String sor = sc.nextLine();
			String[] tokens = sor.split(" ");
			int teljesitmeny = Integer.parseInt(tokens[1]);
			boolean automata = false;
			if (tokens[2].equals("true")) {
				automata = true;
			}
			if (tokens.length == 3) {
				tomb[i] = new Auto(tokens[0], teljesitmeny, automata);
			}
			if (tokens.length == 4) {
				int teherbiras = Integer.parseInt(tokens[3]);
				tomb[i] = new Teherauto(tokens[0], teljesitmeny, automata, teherbiras);
			}
		}
		
		System.out.println(nagyobbMint(tomb));
	}
}