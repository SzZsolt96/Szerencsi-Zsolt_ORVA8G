import java.util.Date;

class Ital {
	protected String nev;
	protected String kiszereles;
	private static int ar;
	protected Date gyartasiDatum;

	public Ital(String nev, String kiszereles) {
		super();
		this.nev = nev;
		this.kiszereles = kiszereles;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public String getKiszereles() {
		return kiszereles;
	}

	public void setKiszereles(String kiszereles) {
		this.kiszereles = kiszereles;
	}

	public static int getAr() {
		return ar;
	}

	public static void setAr(int ar) {
		Ital.ar = 10;
	}

	public Date getGyartasiDatum() {
		return gyartasiDatum;
	}

	public void setGyartasiDatum(Date gyartasiDatum) {
		this.gyartasiDatum = gyartasiDatum;
	}

	@Override
	public String toString() {
		return nev + ", " + kiszereles + ", " + ar + " Ft";
	}

	@Override
	public boolean equals(Object obj) {

		Ital other = (Ital) obj;
		if (gyartasiDatum == null) {
			if (other.gyartasiDatum != null)
				return false;
		} else if (!gyartasiDatum.equals(other.gyartasiDatum))
			return false;
		if (kiszereles == null) {
			if (other.kiszereles != null)
				return false;
		} else if (!kiszereles.equals(other.kiszereles))
			return false;
		if (nev == null) {
			if (other.nev != null)
				return false;
		} else if (!nev.equals(other.nev))
			return false;
		return true;
	}

	public static int getArEuroban() {
		return ar % 320;
	}

}

public class Italok {

	public static void main(String[] args) {

	}
}