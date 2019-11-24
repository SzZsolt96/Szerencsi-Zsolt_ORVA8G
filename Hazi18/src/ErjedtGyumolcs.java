
public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos {
	private double alkoholtartalom;

	public ErjedtGyumolcs(String fajta, String iz, double alkoholtartalom) {
		super(fajta, iz);
		this.alkoholtartalom = alkoholtartalom;
	}

}
