import java.util.*;
import java.util.Scanner;
public class LaivanupotusP7 {
	public final boolean DEBUG=false;
	public void breakln(){
		System.out.println("_______________________________________");
	    System.out.println("");
	    }
	public void luoKentta(String[][] kentta){
		for(int r=0; r<kentta.length; r++){
			for (int c=0; c<kentta[0].length; c++){
				kentta[r][c]="~";
				}
			}
		}
	public void showKentta(String[][] kentta){
		breakln();
		for (int r=0;r<kentta.length; r++){
			for (int c=0; c<kentta[0].length; c++){
				if(kentta[r][c].equals("L")){
					System.out.print(" "+"~");
					}else{
						System.out.print(" "+kentta[r][c]);
						}
				}
			System.out.println("");
			}
		breakln();
		}
	public void luoLaiva(String[][] kentta,int pituus){
		if(Math.random()<0.5){ //horizontal
			int sarake=(int)(Math.random()*5);
			int rivi=(int)(Math.random()*7);
			for (int i=0; i<pituus; i++){
				kentta[rivi][sarake+i]="L";
				}
			}else{ //vertical
				int sarake=(int)(Math.random()*7);
				int rivi=(int)(Math.random()*5);
				for (int i=0; i<pituus; i++){
					kentta[rivi+i][sarake]="L";
					}
				}
		}
	public int pewpew(String[][] kentta, int osumat, int ammukset){
		Scanner input=new Scanner(System.in);
		int rivi,sarake;
	    System.out.println("Sinulla on "+ammukset+" ammusta jäljellä");
	    System.out.println("Valitse rivi, jota haluat ampua ");
	    rivi=input.nextInt();
	    while (rivi>8 || rivi<1){
	    	System.out.println("Syötä numero väliltä 1-8");
	    	rivi=input.nextInt();
	    	}
	    System.out.println("Valitse sarake, jota haluat ampua ");
	    sarake=input.nextInt();
	    while (sarake>8 || rivi<1){
	    	System.out.println("Syötä numero väliltä 1-8");
	    	sarake=input.nextInt();
	    	}
	    if (kentta[rivi-1][sarake-1].equals("L")){
	    	osumat++;
	    	System.out.println("PewPew osuit!");
	    	kentta[rivi-1][sarake-1]="!";
	    	}else{
	    		System.out.println("*plumps* meni ohi");
	    		kentta[rivi-1][sarake-1]="H";
	    		}
	    return osumat;
	    }
	public void finall(int osumat, int ammukset){
		if(osumat<4)
			System.out.println("Et upottanut laivaa. Hävisit pelin :c");
		if(ammukset<1)
			System.out.println("Tuhlasit kaikki ammuksesi meren ampumiseen.");
		else
			if(osumat >=4){
				System.out.println("*blub blub blub* Onneksi olkoon! Sait upotettua laivan. Voitit pelin.");
				}
		System.out.println("GG WP");
		}
	public static void main(String[] args){
		String[][] kentta=new String[8][8];
		LaivanupotusP7 peli= new LaivanupotusP7();
		peli.luoKentta(kentta);
	    peli.luoLaiva(kentta,4);
	    int ammukset=15;
	    int osumat=0;
	    while(ammukset>0 && osumat<4){
	    	peli.showKentta(kentta);
	    	osumat=peli.pewpew(kentta, osumat, ammukset);
	    	ammukset --;
	    	}
	    peli.finall(osumat, ammukset);
	    }
}