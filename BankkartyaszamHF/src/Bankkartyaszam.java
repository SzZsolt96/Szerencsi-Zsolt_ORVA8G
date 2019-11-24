import java.util.Scanner;

public class Bankkartyaszam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String sor = sc.nextLine();
			int szam = 0;
			for (int i = 0; i < sor.length(); ++i) {
				int x = Character.getNumericValue(sor.charAt(i));
				if (i % 2 != 0) {
					szam += x;
				}
				if (i % 2 == 0) {
					x = x * 2;
					if (x < 10) {
						szam += x;
					}
					if (x > 9) {
						int a = x / 10;
						szam += a;
						int b = x - a * 10;
						szam += b;
					}
				}
			}

			if (szam % 10 == 0) {
				System.out.println("YES");
			} else
				System.out.println("NO");
		}
	}
}