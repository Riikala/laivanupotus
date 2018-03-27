import java.io.Serializable;

public class Laiva implements Serializable {
	private String nimi;
	private int pituus;
	private int x;
	private int y;
	private boolean horizontal;
	private boolean[] osumat;

public Laiva(String nimi, int pituus, int x, int y, boolean horizontal) {
	this.nimi=nimi;
	this.pituus=pituus;
	this.x=x;
	this.y=y;
	this.horizontal=horizontal;
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

@Override
public String toString() {
	return "Laiva [nimi=" + nimi + ", pituus=" + pituus + ", x=" + x + ", y=" + y + ", horizontal=" + horizontal + "]";
}

public boolean onkoOsuma(int ammuttux, int ammuttuy) {
	if(horizontal) {
		return (x+pituus>ammuttux&&x<ammuttux);
	}
	else return (y+pituus>ammuttuy&&y<ammuttuy);
	}

public void vastaanota(Ammus ammus) {
	System.out.println("osu: "+onkoOsuma(ammus.getX(), ammus.getY()));
	
	if(onkoOsuma(ammus.getX(), ammus.getY())==true) {
		if (horizontal) {
			osumat[ammus.getX()-x]=true;
		}
		else {
			osumat[ammus.getY()-y]=true;
		}
		ammus.osui();
	}
}
}