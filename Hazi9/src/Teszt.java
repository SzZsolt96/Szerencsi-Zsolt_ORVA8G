import java.util.ArrayList;

class VendeglatoipariEgyseg {
	String nev;
	int ferohelySzama;
	boolean dohanyzo;

	public VendeglatoipariEgyseg() {
		super();
	}

	public VendeglatoipariEgyseg(String nev, int ferohelySzama, boolean dohanyzo) {
		super();
		this.nev = nev;
		this.ferohelySzama = ferohelySzama;
		this.dohanyzo = dohanyzo;
	}

	public String getNev() {
		return nev;
	}

	public int getFerohelySzama() {
		return ferohelySzama;
	}

	public boolean isDohanyzo() {
		return dohanyzo;
	}

	public void setDohanyzo(boolean dohanyzo) {
		this.dohanyzo = dohanyzo;
	}
}

class Etterem extends VendeglatoipariEgyseg {
	String[] etlap;

	public Etterem(String nev, int ferohelySzama, String[] etlap) {
		super();
		this.nev = nev;
		this.ferohelySzama = ferohelySzama;
		this.dohanyzo = false;
		this.etlap = etlap;
	}

	public String[] getEtlap() {
		return etlap;
	}
}

class Kocsma extends VendeglatoipariEgyseg {
	String[] sorlap;

	public Kocsma(String nev, int ferohelySzama, String[] sorlap) {
		super();
		this.nev = nev;
		this.ferohelySzama = ferohelySzama;
		this.dohanyzo = true;
		this.sorlap = sorlap;
	}

	public String[] getSorlap() {
		return sorlap;
	}

}

public class Teszt {

	public static ArrayList<String> adottItaltKinaloKocsmak(String ital, VendeglatoipariEgyseg[] tmb) {
		ArrayList<String> kocsmaNevek = new ArrayList<String>();

		for (int i = 0; i < tmb.length; ++i) {
			if (tmb[i].dohanyzo) {

				kocsmaNevek.add(tmb[i].nev);
			}
		}
		return kocsmaNevek;
	}

	public static void main(String[] args) {
		VendeglatoipariEgyseg[] tomb = new VendeglatoipariEgyseg[10];
		String etterem1 = "Etterem1";
		String etterem2 = "Etterem2";
		String etterem3 = "Etterem3";
		String etterem4 = "Etterem4";
		String etterem5 = "Etterem5";
		String[] etlap = { "eloetel", "leves", "foetel", "desszert" };
		String kocsma1 = "Kocsma1";
		String kocsma2 = "Kocsma2";
		String kocsma3 = "Kocsma4";
		String kocsma4 = "Kocsma4";
		String kocsma5 = "Kocsma5";
		String[] sorlap = { "Heineken", "AranyAszok", "Dreher" };
		tomb[0] = new Etterem(etterem1, 100, etlap);
		tomb[1] = new Etterem(etterem2, 100, etlap);
		tomb[2] = new Etterem(etterem3, 100, etlap);
		tomb[3] = new Etterem(etterem4, 100, etlap);
		tomb[4] = new Etterem(etterem5, 100, etlap);
		tomb[5] = new Kocsma(kocsma1, 120, sorlap);
		tomb[6] = new Kocsma(kocsma2, 120, sorlap);
		tomb[7] = new Kocsma(kocsma3, 120, sorlap);
		tomb[8] = new Kocsma(kocsma4, 120, sorlap);
		tomb[9] = new Kocsma(kocsma5, 120, sorlap);

		System.out.println(adottItaltKinaloKocsmak("Dreher", tomb));
	}

}
