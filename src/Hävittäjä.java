import java.io.Serializable;

public class H�vitt�j� extends Laiva implements Serializable{
	public H�vitt�j�(String nimi, int x, int y, boolean horizontal) {
		super(nimi, 2, x, y, horizontal);{
		}
	}
	public String getTyyppi() {
		return "H�vitt�j�";
	}
}
