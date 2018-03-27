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
	@Override
	public void vastaanota(Ammus a) {
		if(suojat!=0) {
			suojat=suojat-1;
		}
		
		// TODO Auto-generated method stub
		else{
			super.vastaanota(a);
		}
	}
	@Override
	public String toString() {
		return "Lentotukialus [suojat=" + suojat + " "+super.toString()+"]";
	}

}
