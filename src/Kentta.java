import java.util.ArrayList;

public class Kentta {
	private int x=10;
	private int y=10;
	private ArrayList<Laiva> laivaLista = new ArrayList<>();
	private ArrayList<Ammus> ammusLista = new ArrayList<>();
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
	public void ammu(Ammus a) {
		ammusLista.add(a);
		for (int i=0; i<laivaLista.size(); i++) {
			laivaLista.get(i).vastaanota(a);
		}
		if (a.getOsui() == Ammus.TYHJA)
			a.huti();
	}
	public void kenttaV() {
		for (int j=0; j<x; j++) {
			for (int p=0; p<y; p++) {
				System.out.print(etsiAmmus(j,p).getOsui());
			}
			System.out.print("/n");
		}
	}
	private Ammus etsiAmmus(int j, int p) {
		for (int q=0; q<ammusLista.size(); q++) {
			if (ammusLista.get(q).kohdassa(j,p)) {
				return ammusLista.get(q);
			}
		}
		return new Ammus(1,1);
	}
}