public class Laiva  {
	private String nimi;
	private int pituus;
	private int x;
	private int y;
	private boolean horizontal;

public Laiva(String nimi, int pituus, int x, int y, boolean horizontal) {
	nimi=nimi;
	pituus=pituus;
	x=x;
	y=y;
	horizontal=horizontal;
}

public boolean mahdutko(int leveys, int korkeus) {
	if(x+pituus<leveys) {
		return true;
	}
	else {
		return false;
	}
	if(y+korkeus<korkeus) {
		return true;
	}
	else {
		return false;
	}
	}
}
}