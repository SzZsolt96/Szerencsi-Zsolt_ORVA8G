import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

class Auto {
	String rendszam;
	int motorTeljesitmeny;
	Date gyartasDatuma;

	public Auto() {
		super();
	}

	public Auto(String rendszam, int motorTeljesitmeny) {
		super();
		this.rendszam = rendszam;
		this.motorTeljesitmeny = motorTeljesitmeny;
		this.gyartasDatuma = new Date();
	}

	public String getRendszam() {
		return rendszam;
	}

	public int getMotorTeljesitmeny() {
		return motorTeljesitmeny;
	}

	public Date getGyartasDatuma() {
		return gyartasDatuma;
	}

	public void setRendszam(String rendszam) {
		this.rendszam = rendszam;
	}

	@Override
	public String toString() {
		return rendszam + " " + motorTeljesitmeny + " " + gyartasDatuma;
	}

}

class Teherauto extends Auto {
	int maxSzallithatoTeher;

	public Teherauto(String rendszam, int motorTeljesitmeny, int maxSzallithatoTeher) {
		super();
		this.rendszam = rendszam;
		this.motorTeljesitmeny = motorTeljesitmeny;
		this.maxSzallithatoTeher = maxSzallithatoTeher;
	}

	public int getMaxSzallithatoTeher() {
		return maxSzallithatoTeher;
	}

	@Override
	public String toString() {
		return rendszam + " " + motorTeljesitmeny + " " + maxSzallithatoTeher;
	}

}

public class Test {

	public static void rendezMaxSzallithatoTeherCsokkenoleg(Teherauto[] tmp) {
		Arrays.sort(tmp, Comparator.comparing(Teherauto::getMaxSzallithatoTeher, Comparator.reverseOrder()));
	}

	public static Auto keresMaxMotorTeljesitmeny(Auto[] tmp) {
		Arrays.sort(tmp, Comparator.comparing(Auto::getMotorTeljesitmeny, Comparator.reverseOrder()));

		return tmp[0];

	}

	public static void main(String[] args) {
		Auto[] tomb = new Auto[10];

		tomb[0] = new Auto("ABC123", 350);
		tomb[1] = new Auto("ACD213", 350);
		tomb[2] = new Auto("CBD542", 400);
		tomb[3] = new Auto("LKF859", 300);
		tomb[4] = new Auto("URM749", 350);
		tomb[5] = new Teherauto("KFO123", 80, 1000);
		tomb[6] = new Teherauto("KFO124", 90, 1000);
		tomb[7] = new Teherauto("KFO125", 80, 1000);
		tomb[8] = new Teherauto("KFO126", 90, 1500);
		tomb[9] = new Teherauto("KFO127", 90, 2000);

		Teherauto[] tomb2 = new Teherauto[10];

		tomb2[0] = new Teherauto("LKJ123", 90, 1500);
		tomb2[1] = new Teherauto("LKJ124", 70, 1500);
		tomb2[2] = new Teherauto("LKJ125", 80, 1000);
		tomb2[3] = new Teherauto("LKJ126", 90, 1500);
		tomb2[4] = new Teherauto("LKJ127", 90, 1000);
		tomb2[5] = new Teherauto("LKJ128", 100, 2000);
		tomb2[6] = new Teherauto("LKJ129", 90, 1500);
		tomb2[7] = new Teherauto("LKJ120", 100, 2000);
		tomb2[8] = new Teherauto("LKJ131", 90, 1500);
		tomb2[9] = new Teherauto("LKJ130", 95, 1500);

		rendezMaxSzallithatoTeherCsokkenoleg(tomb2);

		for (int i = 0; i < tomb2.length; ++i) {
			System.out.println(tomb2[i].toString());
		}
		System.out.println();
		System.out.println(keresMaxMotorTeljesitmeny(tomb));
	}

}
