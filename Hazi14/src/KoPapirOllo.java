import java.util.Random;
import java.util.Scanner;

public class KoPapirOllo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sor = sc.nextLine();

		while (!sor.equals("vége")) {
			if (!sor.equals("vége") && !sor.equals("kõ") && !sor.equals("papír") && !sor.equals("olló")) {
				sor = sc.nextLine();
			} else {
				Random rnd = new Random();
				int n = rnd.nextInt(3);
				int x = 0;
				switch (sor) {
				case "kõ":
					x = 0;
					break;
				case "papír":
					x = 1;
					break;
				case "olló":
					x = 2;
					break;
				}
				if (x == n) {
					System.out.println("Döntetlen.");
				} else if ((x == 0 && n == 2) || (x == 1 && n == 0) || (x == 2 && n == 1)) {
					System.out.println("A játékos nyert.");
				} else
					System.out.println("A gép nyert.");
				sor = sc.nextLine();
			}
		}
	}

}
