import java.io.Serializable;

public class Ammus implements Serializable{
	public static final String TYHJA="~";
	private int x;
	private int y;
	private String osui; 

public Ammus(int x, int y) {
	this.x=x;
	this.y=y;
	osui= TYHJA;
}

public void osui(){
	osui="X";
}

public void huti() {
	osui="O";
}

public String getOsui() {
	return osui;
}

public Boolean kohdassa(int j, int p) {
	if(x==j&&y==p) {
		return true;
	}
	else {
		return false;
	}
}

public int getX() {
	return x;
}

public int getY() {
	return y;
}
}