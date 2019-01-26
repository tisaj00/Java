package edunova;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Start {
	
	private List<Osoba> osobe;
	private Scanner ulaz;
	
	
	public Start() {
		ulaz= new Scanner(System.in);
		osobe = new ArrayList<>();
		odabir();
		
		ulaz.close();
	}
	
	private void dodajNovuOsobu() {
		Osoba o = new Osoba();
		o=postaviVrijednostiSvojstava(ulaz, o);
		
		osobe.add(o);

		
	}
	private void odabir() {
		System.out.println("CRUD primjer");
		System.out.println("Unesite broj za akciju");
		System.out.println("1: Dodaj novu osobu");
		System.out.println("2: Promjeni postojeću osobu");
		System.out.println("3: Obriši osobu");
		System.out.println("4: Izlistaj sve osobe");
		System.out.println("5: Brisanje svake osobe čija šifra je parni broj");
		System.out.println("6: Ispis imena i prezimena osobe s najvećim primanjima");
		System.out.println("7: Ispis prosjeka svih primanja");
		System.out.println("8: Dodavanje 10 osoba s slučajnim vrijednostima");
		System.out.println("9: Izlaz iz programa");
		switch (Pomocno.ucitajBroj(ulaz,"Unesi odabir", 1, 9)) {
		case 1:
			dodajNovuOsobu();
			break;
		case 2:
			promjeniOsobu();
			break;
		case 3:
			obrisiOsobu();
			break;
		case 4:
			izlistajSveOsobe();
			break;
		case 5:
			brisanjeParnihOsoba();
			return;
		case 6:
			najvecePrimanje();
			break;
		case 7:
			prosjekPrimanja();
			break;
		case 8:
			slucajneOsobe();
			break;
		case 9:
			return;
		default:
			break;
		}
		odabir();
	}

	private void brisanjeParnihOsoba() {
		if(osobe.size()==0) {
			return;
		}
		int index = Pomocno.ucitajBroj(ulaz, "redni broj osobe", 1, osobe.size());
		if(index%2==0) {
		osobe.remove(index);
		}
	}

	private void slucajneOsobe() {
		if(osobe.size()==0) {
			return;
		}
		for(int i=0;i<=10;i++) {
			
		}
		
		
	}

	private void prosjekPrimanja() {
		if(osobe.size()==0) {
			return;
		}
		
		
	}

	private void najvecePrimanje() {
		// TODO Auto-generated method stub
		
	}

	private void obrisiOsobu() {
		if(osobe.size()==0) {
			return;
		}
		System.out.println("Odaberite redni broj osobe za brisanje");
		for(int i=0;i<osobe.size();i++) {
			System.out.println((i+1) + ": " + osobe.get(i));
		}
		
		int index = Pomocno.ucitajBroj(ulaz, "redni broj osobe", 1, osobe.size());
		osobe.remove(index-1);
		
		
	}

	private void promjeniOsobu() {
		if(osobe.size()==0) {
			return;
		}
		System.out.println("Odaberite redni broj osobe za promjenu");
		for(int i=0;i<osobe.size();i++) {
			System.out.println((i+1) + ": " + osobe.get(i));
		}
		
		int index = Pomocno.ucitajBroj(ulaz, "redni broj osobe", 1, osobe.size());
		
		Osoba o = osobe.get(index-1);
		
		o=postaviVrijednostiSvojstava(ulaz, o);
	
		osobe.set(index-1, o);
			
	
			
		
	}

	private void izlistajSveOsobe() {
		for(Osoba o: osobe) {
			System.out.println(o);
		}
	}
	
	private Osoba postaviVrijednostiSvojstava(Scanner ulaz,Osoba o) {
		
		int sifra = Pomocno.ucitajBroj(ulaz, "Unesite šifru", 1, Integer.MAX_VALUE);
		
		for(int i=0;i<osobe.size();i++) {
			if(sifra==osobe.get(i).getSifra()) {
				System.err.println("Osoba s tom šifrom već postoji.");
				odabir();						
			}				
			
		}
		o.setSifra(sifra);
		
		o.setIme(Pomocno.ucitajString(ulaz,"Unesi ime"));
		o.setPrezime(Pomocno.ucitajString(ulaz, "Unesi prezime"));
		
		BigDecimal uvijet = Pomocno.ucitajDecimalniBroj(ulaz, "Unesi primanje");
		if(uvijet.compareTo(BigDecimal.ZERO)<0) {
			System.err.println("Primanje mora bit veće od 0");
			odabir();
		}
		o.setPrimanje(uvijet);
		
		return o;
	}
	
	public static void main(String[] args) {
		new Start();
	}

}


//Domaća zadaća:
//Implementirati kontrolu da pri dodavanju nove osobe ne može biti ista šifra koja je već dodjeljena  //rjeseno
//Unijeti kontrole da iznos ne smije biti manji od 0		//rjeseno
//Implementirati mehanizam da kod promjene osobe ukoliko unese prazno ostane postojeća vrijednost.  
//Unijeti nove opcije programa:
//6: Ispis imena i prezimena osobe s najvećim primanjima
//7: Ispis prosjeka svih primanja
//8: Dodavanje 10 osoba s slučajnim vrijednostima
//9: Brisanje svake osobe čija šifra je parni broj

