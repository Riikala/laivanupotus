import java.io.Serializable;

public class Lentotukialus extends Laiva implements Serializable{
	int suojat=1;
	public Lentotukialus(String nimi, int x, int y, boolean horizontal) {
		super(nimi, 5, x, y, horizontal);{
		}
	}
	public String getTyyppi() {
		return "Lentotukialus";
	}

}
