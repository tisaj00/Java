package edunova;

import java.awt.Color;

public class Start {
	
	public static void main(String[] args) {
		//Osoba o = new Osoba(); ne može se koristiti jer je apstraktna
		
	
		
		OsobaI o = new OsobaI();
		
		Predavac p = new Predavac();
		
		Osoba[] niz = new Osoba[2];
		
		p.setIme("Ivan");
		niz[0]=p;
		
		Polaznik polaznik = new Polaznik();
		polaznik.setIme("Maja");
		niz[1]=polaznik;
		
		for(Osoba osoba:niz) {
			osoba.pozdravi(); //polimorfizam
			System.out.println(osoba);
		}
		polaznik.getIme();
		Polaznik.kreirajPolaznika();
		
		Color c = new Color(255, 0, 0);
		Color co = Color.getColor("#FF0000");
		
		Polaznik.OSLOVI="E moj polazniče";
		//Polaznik.SIFRA="PPP"; //konstanta se ne može mijenjati
		
	}

}
