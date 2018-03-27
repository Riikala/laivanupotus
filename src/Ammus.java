public class Ammus {
	private int x;
	private int y;
	private String osui; 

public Ammus(int x, int y) {
	this.x=x;
	this.y=y;
	osui= "~";
}

public void osui(){
	osui="X";
}

public String getOsui() {
	return osui;
}

public Boolean kohdassa() {
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