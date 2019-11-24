package ital;

public class Ital implements Comparable<Ital> {
	protected String nev;
	protected String kiszereles;
	protected int ar;

	public Ital(String nev, String kiszereles, int ar) {
		super();
		this.nev = nev;
		this.kiszereles = kiszereles;
		this.ar = ar;
	}

	public String getNev() {
		return nev;
	}

	public String getKiszereles() {
		return kiszereles;
	}

	public int getAr() {
		return ar;
	}

	@Override
	public String toString() {
		return nev + ", " + kiszereles + "dl, " + ar + "Ft";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ital other = (Ital) obj;
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

	@Override
	public int compareTo(Ital o) {
		if (ar > o.ar) {
			return 1;
		} else if (ar < o.ar)
			return -1;
		return 0;
	}

}
