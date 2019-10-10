class Katona {
	private int tamadoero;
	private int vedoero;

	public Katona() {
		super();
		this.tamadoero = 5;
		this.vedoero = 5;
	}

	public Katona(int tamadoero, int vedoero) {
		super();
		this.tamadoero = tamadoero;
		this.vedoero = vedoero;
	}

	public int getTamadoero() {
		return tamadoero;
	}

	public void setTamadoero(int tamadoero) {
		this.tamadoero = tamadoero;
	}

	public int getVedoero() {
		return vedoero;
	}

	public void setVedoero(int vedoero) {
		this.vedoero = vedoero;
	}

	@Override
	public String toString() {
		return "TE: " + tamadoero + ",VE: " + vedoero;
	}
}

class Nyilas extends Katona {
	private int lotav;

	public Nyilas(int lotav) {
		super();
		this.lotav = lotav;
	}

	public int getLotav() {
		return lotav;
	}

	public void setLotav(int lotav) {
		this.lotav = lotav + getTamadoero();
	}

}

public class Teszt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
