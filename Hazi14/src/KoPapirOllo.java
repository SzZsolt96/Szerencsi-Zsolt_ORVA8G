import java.util.Random;
import java.util.Scanner;

public class KoPapirOllo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sor = sc.nextLine();

		while (!sor.equals("v�ge")) {
			if (!sor.equals("v�ge") && !sor.equals("k�") && !sor.equals("pap�r") && !sor.equals("oll�")) {
				sor = sc.nextLine();
			} else {
				Random rnd = new Random();
				int n = rnd.nextInt(3);
				int x = 0;
				switch (sor) {
				case "k�":
					x = 0;
					break;
				case "pap�r":
					x = 1;
					break;
				case "oll�":
					x = 2;
					break;
				}
				if (x == n) {
					System.out.println("D�ntetlen.");
				} else if ((x == 0 && n == 2) || (x == 1 && n == 0) || (x == 2 && n == 1)) {
					System.out.println("A j�t�kos nyert.");
				} else
					System.out.println("A g�p nyert.");
				sor = sc.nextLine();
			}
		}
	}

}
