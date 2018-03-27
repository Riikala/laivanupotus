public class Sukellusvene extends Laiva{
	public Sukellusvene(String nimi, int x, int y, boolean horizontal) {
		super(nimi, 1, x, y, horizontal);{
		}
	}
	public String getTyyppi() {
		return "Sukellusvene";
	}
}