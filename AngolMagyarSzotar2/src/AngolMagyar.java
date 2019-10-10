import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Szotar {
	String angol;
	String magyar;

	public Szotar(String angol, String magyar) {
		super();
		this.angol = angol;
		this.magyar = magyar;
	}

	public String getAngol() {
		return angol;
	}

	public String getMagyar() {
		return magyar;
	}

	@Override
	public String toString() {
		return angol + ":" + magyar;
	}

}

public class AngolMagyar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sor = sc.nextLine();
		int n = Integer.parseInt(sor);
		Szotar[] tmp = new Szotar[n];

		for (int i = 0; i < n; i++) {
			sor = sc.nextLine();
			String angol = sor.split(":")[0];
			String magyar = sor.split(":")[1];

			tmp[i] = new Szotar(angol, magyar);
		}
		Arrays.sort(tmp, Comparator.comparing(Szotar::getAngol, Comparator.naturalOrder())
				.thenComparing(Szotar::getMagyar, Comparator.naturalOrder()));

		for (int i = 0; i < tmp.length; ++i) {
			System.out.println(tmp[i].toString());
		}
	}

}
