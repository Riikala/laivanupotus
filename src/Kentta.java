import java.util.ArrayList;

public class Kentta {
	private int x=10;
	private int y=10;
	private ArrayList<Laiva> laivaLista = new ArrayList<>();
	public Kentta () {
	}
	public Kentta(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void lisaaLaiva(Laiva laiva1) {
		if (laiva1.mahdutko(x, y)) {
			laivaLista.add(laiva1);
		}
	}
}
