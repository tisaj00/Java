package edunova;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Generici {

	
	public static void main(String[] args) {
		
		Osoba niz[] = new Osoba[3];
		
		for(int i=0;i<3;i++) {
			niz[i] = new Osoba(Pomocno.ucitajBroj(),"Osoba " + i);
		}
		
		for(Osoba o : niz) {
			System.out.println(o.getImePrezime());
		}
		
		
		Vector v = new Vector();
		
		v.add(new Osoba(1,"a"));
		v.add("Osijek");
		
		for(Object o: v) {
			//System.out.println(o.getImePrezime());
		}
		
		
		List<Osoba> lista = new ArrayList<>();
		
		lista.add(new Osoba(1,"Pero"));
		
		
		System.out.println(lista.get(0).getImePrezime());
		
	}
}
