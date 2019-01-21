package edunova;

import java.util.ArrayList;
import java.util.List;
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
		System.out.println("1: dodaj novu osobu");
		System.out.println("2: promjeni postojeću osobu");
		System.out.println("3: obriši osobu");
		System.out.println("4: izlistaj sve osobe");
		System.out.println("5: Izlaz iz programa");
		switch (Pomocno.ucitajBroj(ulaz,"Unesi odabir", 1, 5)) {
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
			return;

		default:
			break;
		}
		odabir();
	}

	private void obrisiOsobu() {
		if(osobe.size()==0) {
			return;
		}
		System.out.println("Odaberite redni broj osobe za brisanje");
		for(int i=0;i<osobe.size();i++) {
			System.out.println((i+1) + ": " + osobe.get(i));
		}
		
		int index = Pomocno.ucitajBroj(
				ulaz, 
				"redni broj osobe", 
				1, osobe.size());
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
		
		int index = Pomocno.ucitajBroj(
				ulaz, 
				"redni broj osobe", 
				1, osobe.size());
		
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
		
		o.setSifra(Pomocno.ucitajBroj(ulaz,"Unesi šifru", 1, Integer.MAX_VALUE));
		o.setIme(Pomocno.ucitajString(ulaz,"Unesi ime"));
		o.setPrezime(Pomocno.ucitajString(ulaz, "Unesi prezime"));
		o.setPrimanje(Pomocno.ucitajDecimalniBroj(ulaz,"Unesi primanje"));
		
		return o;
	}

	public static void main(String[] args) {
		new Start();
	}

}
