
public class Bor extends AlkoholosItal {
	private String szoloFajta;
	private String termoTerulet;

	public Bor(String iz, double alkoholtartalom, String szoloFajta, String termoTerulet) {
		super(iz, alkoholtartalom);
		this.szoloFajta = szoloFajta;
		this.termoTerulet = termoTerulet;
	}

	public String getSzoloFajta() {
		return szoloFajta;
	}

	public String getTermoTerulet() {
		return termoTerulet;
	}
}
