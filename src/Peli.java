import java.util.Scanner;

public class Peli {

	public static void main(String[] args) {
		Peli laivanupotus=new Peli();
		laivanupotus.aloitaPeli();
		laivanupotus.lopetus();
	}
	private void aloitaPeli() {
		Kentta k=new Kentta();
		Laiva laivaL=new Lentotukialus("Titanic", 2,2,true );
		k.lisaaLaiva(laivaL);
		int ammukset=32;
		while (ammukset>0) {
			System.out.println("Anna koordinaatti x");
			Scanner sc=new Scanner(System.in);
			int kohdex=sc.nextInt();
			System.out.println("Anna koordinaatti y");
			int kohdey=sc.nextInt();
			Ammus luoti=new Ammus(kohdex,kohdey);
			k.ammu(luoti);
			ammukset=ammukset-1;
		}
	}
	private void lopetus() {
		System.out.println("Peli loppui");
		
	}
}