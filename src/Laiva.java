public class Laiva  {
	private String nimi;
	private int pituus;
	private int x;
	private int y;
	private boolean horizontal;
	private boolean[] osumat;

public Laiva(String nimi, int pituus, int x, int y, boolean horizontal) {
	nimi=nimi;
	pituus=pituus;
	x=x;
	y=y;
	horizontal=horizontal;
	osumat=new boolean[pituus];
}

public boolean mahdutko(int leveys, int korkeus) {
	if(x+pituus<leveys||y+pituus<korkeus) {
		return true;
	}
	else {
		return false;
	}
	}
}
