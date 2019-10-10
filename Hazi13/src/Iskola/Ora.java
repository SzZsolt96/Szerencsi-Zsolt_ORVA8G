package Iskola;

public class Ora {
	int oraKod;
	String oraNev;
	int kezdes;

	public Ora() {
		super();
	}

	public Ora(int oraKod, String oraNev, int kezdes) {
		super();
		this.oraKod = oraKod;
		this.oraNev = oraNev;

		if (kezdes >= 8 && kezdes <= 19) {
			this.kezdes = kezdes;
		} else {
			if (kezdes < 8)
				this.kezdes = 8;
			if (kezdes > 19) {
				this.kezdes = 19;
			}
		}
	}

	public int getOraKod() {
		return oraKod;
	}

	public void setOraKod(int oraKod) {
		this.oraKod = oraKod;
	}

	public String getOraNev() {
		return oraNev;
	}

	public void setOraNev(String oraNev) {
		this.oraNev = oraNev;
	}

	public int getKezdes() {
		return kezdes;
	}

	public void setKezdes(int kezdes) {
		this.kezdes = kezdes;
	}

	@Override
	public String toString() {
		return "oraKod= " + oraKod + ", oraNev= " + oraNev + ", kezdes= " + kezdes;
	}

}
