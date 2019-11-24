
public class AlkoholosItal extends Ital implements Alkoholos {
	private String iz;
	private double alkoholtartalom;

	public AlkoholosItal(String iz, double alkoholtartalom) {
		super();
		this.iz = iz;
		this.alkoholtartalom = alkoholtartalom;
	}

	public String getIz() {
		return iz;
	}

	public double getAlkoholtartalom() {
		return alkoholtartalom;
	}

}
