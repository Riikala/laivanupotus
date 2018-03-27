import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Peli implements Serializable {

	int ammukset=32;
	Kentta k;
	
	public static void main(String[] args) {
		Peli laivanupotus=new Peli();
		
		laivanupotus = lataa();
		
		System.out.println("Tervetuloa pelaamaan. Sinulla on" + laivanupotus.ammukset + "ammusta");
		laivanupotus.aloitaPeli();
		laivanupotus.lopetus();
	}
	private static Peli lataa() {
		Peli ladattupeli= new Peli();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tallennus.lu"));
			ladattupeli = (Peli) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return ladattupeli;
	}
	private void aloitaPeli() {
		if(k == null) {
			k=new Kentta();		
			Laiva laivaL=new Lentotukialus("Titanic", 2,2,true );
			k.lisaaLaiva(laivaL);
		
		}
		while (ammukset>0) {
			System.out.println("Anna koordinaatti x");
			Scanner sc=new Scanner(System.in);
			int kohdex=sc.nextInt();
			System.out.println("Anna koordinaatti y");
			int kohdey=sc.nextInt();
			Ammus luoti=new Ammus(kohdex,kohdey);
			k.ammu(luoti);
			ammukset=ammukset-1;
			k.kenttaV();
			tallenna();
		}
	}
	private void tallenna() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tallennus.lu"));
			oos.writeObject(this);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void lopetus() {
		System.out.println("Peli loppui");
		
	}
}