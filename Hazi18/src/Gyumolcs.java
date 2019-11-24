
public class Gyumolcs {
	private String fajta;
	private String iz;

	public Gyumolcs(String fajta, String iz) {
		super();
		this.fajta = fajta;
		this.iz = iz;
	}

	@Override
	public String toString() {
		return fajta + " " + iz;
	}

}
