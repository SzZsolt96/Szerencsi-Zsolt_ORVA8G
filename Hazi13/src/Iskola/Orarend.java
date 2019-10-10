package Iskola;

import java.util.Arrays;

public class Orarend extends Ora {
	String nap;
	Ora[] ora;
	int oraszamlalo;

	public Orarend(String nap) {
		super();
		this.nap = nap;
		this.oraszamlalo = 0;
		this.ora = new Ora[12];
	}

	public String getNap() {
		return nap;
	}

	public void setNap(String nap) {
		this.nap = nap;
	}

	public Ora[] getOra() {
		return ora;
	}

	public void setOra(Ora[] ora) {
		this.ora = ora;
	}

	public int getOraszamlalo() {
		return oraszamlalo;
	}

	public void setOraszamlalo(int oraszamlalo) {
		this.oraszamlalo = oraszamlalo;
	}

	@Override
	public String toString() {
		return "nap=" + nap + ", ora=" + Arrays.toString(ora) + ", oraszamlalo=" + oraszamlalo;
	}
}