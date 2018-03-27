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
public boolean onkoOsuma(int ammuttux, int ammuttuy) {
	if(horizontal==false) {
		return (x+pituus>ammuttux&&x<ammuttux);
	}
	else return (y+pituus>ammuttuy&&y<ammuttuy);
	}

public void vastaanota(int ammuttux, int ammuttuy) {
	if(onkoOsuma(ammuttux, ammuttuy)==true) {
		if (horizontal) {
			osumat[ammuttux-x]=true;
		}
		else {
			osumat[ammuttuy-y]=true;
		}
	}
}
}