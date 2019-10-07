import java.util.ArrayList;
import java.util.Arrays;

public class StatikusMetodusok {
	public static void Novekvo(int[] tmb) {
		Arrays.sort(tmb);
	}

	public static void MinMax(double a, double b, double c) {
		double min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		System.out.println("Minimum: " + min);

		if (a < 0)
			a *= -1;
		if (b < 0)
			b *= -1;
		if (c < 0)
			c *= -1;
		double max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;

		System.out.println("Maximum: " + max);
	}

	public static void Sorrend(double a, double b, double c, double d) {
		System.out.println(a + " " + b + " " + c + " " + d);

		if (d >= 0) {
			System.out.println(a + " " + c + " " + b + " " + d);
		} else {
			System.out.println(a + " " + b + " " + d + " " + c);
		}
	}

	public static Boolean Haromszog(double a, double b, double c) {
		boolean lehet = true;
		if (a + b < c) {
			lehet = false;
		}
		if (b + c < a) {
			lehet = false;
		}
		if (a + c < b) {
			lehet = false;
		}
		return lehet;
	}

	public static int Szokoev(int x, int y) {
		int db = 0;
		boolean szokoev = false;
		for (int i = x + 1; i < y; ++i) {
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				++db;
			}
		}
		return db;
	}

	public static void Eredmeny(int jegy) {
		switch (jegy) {
		case 1:
			System.out.println("Elégtelen");
			break;
		case 2:
			System.out.println("Elégséges");
			break;
		case 3:
			System.out.println("Közepes");
			break;
		case 4:
			System.out.println("Jó");
			break;
		case 5:
			System.out.println("Jeles");
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + jegy);
		}
	}

	public static int Osztas(int a, int b) {
		int hanyados = 0;

		while (a >= b) {
			++hanyados;
			a = a - b;
		}

		return hanyados;
	}

	public static boolean Prime(int x) {
		int osztok = 1;
		for (int i = 2; i < x + 1; i++) {
			if (x % i == 0) {
				++osztok;
			}
		}
		if (osztok == 2) {
			return true;
		} else
			return false;
	}

	public static void Fibo(int x) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 2; i < x - 1; ++i) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		System.out.println(a + b);
	}

	public static int ForditottSorrend(int szam) {
		int ujszam = 0;

		while (szam != 0) {
			ujszam = ujszam * 10 + (szam % 10);
			szam = szam / 10;
		}

		return ujszam;
	}

	public static long Faktorialis(int szam) {
		long fakt = 1;
		for (int i = 1; i < szam + 1; ++i) {
			fakt *= i;
		}
		return fakt;
	}

	public static ArrayList<Integer> OsszesOszto(int k, int n1, int n2) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		if (n1 > n2) {
			int seged = n1;
			n1 = n2;
			n2 = seged;
		}

		for (int i = n1; i < n2; ++i) {
			if (i % k == 0) {
				list.add(i);
			}
		}
		return list;
	}

	public static int LegkissebbFibo(int n) {
		int a = 0;
		int b = 1;
		int c = a + b;
		while (c < n) {
			a = b;
			b = c;
			c = a + b;
		}

		return c;
	}

	public static ArrayList<Integer> Kobok() {
		ArrayList<Integer> list = new ArrayList<Integer>();

		int[] tmb = new int[3];
		for (int i = 999; i > 0; i--) {
			tmb[0] = i / 100;
			tmb[1] = (i - tmb[0] * 100) / 10;
			tmb[2] = tmb[1] / 10;
			int szam = tmb[0] * tmb[0] * tmb[0] + tmb[1] * tmb[1] * tmb[1] + tmb[2] * tmb[2] * tmb[2];
			if (szam == i) {
				list.add(szam);
			}

		}
		return list;
	}

	public static void main(String[] args) {
		int[] tomb = { 8, 3, 2, 1 };

		Novekvo(tomb);
		System.out.println("Tömb növekvõ sorrendben: ");
		for (int i = 0; i < tomb.length - 1; ++i) {
			System.out.print(tomb[i] + " ");
		}
		System.out.println(tomb[tomb.length - 1]);

		MinMax(5, -9, 8);

		System.out.print("Sorrend ha d>=0: ");
		Sorrend(3, 1, 6, 1);
		System.out.print("Sorrend ha d<0: ");
		Sorrend(3, 0, 4, -5);

		System.out.println("Háromszög-e? " + Haromszog(5, 6, 4));
		System.out.println("Szököévek: " + Szokoev(1996, 2020));

		Eredmeny(4);

		System.out.println(Osztas(10, 8));

		System.out.println("Prim-e? " + Prime(102));

		Fibo(10);

		System.out.println(ForditottSorrend(123456789));

		System.out.println(Faktorialis(12));

		System.out.println(OsszesOszto(2, 1, 11));

		System.out.println(LegkissebbFibo(33));

		System.out.println(Kobok());
	}

}
