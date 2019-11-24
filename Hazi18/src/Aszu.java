
public class Aszu extends Bor {
	private int puttonySzam;

	public Aszu(String iz, double alkoholtartalom, String szoloFajta, String termoTerulet, int puttonySzam) {
		super(iz, alkoholtartalom, szoloFajta, termoTerulet);
		this.puttonySzam = puttonySzam;
	}

	public int getPuttonySzam() {
		return puttonySzam;
	}

	@Override
	public String toString() {
		return getIz() +" " +getAlkoholtartalom() + " "+getSzoloFajta()+" "+ getTermoTerulet() +" "+getPuttonySzam(); 
	}

	
}
