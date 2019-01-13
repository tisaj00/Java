package edunova;


public class Start {
	
	public static void main(String[] args) {
		
		
		//instanca klase = objekt
		
		//objekt je instanca (pojavnost) klase
		//ImeKlase naziv = new ImeKlase();
		Osoba o = new Osoba();
		o.setVisina(12);
		o.setIme("pero");
		System.out.println(o.getVisina());
		System.out.println(o.getIme().substring(0, 1).toUpperCase()+
				o.getIme().substring(1).toLowerCase());
		//o.visina=12; //ovako ne raditi
		//o.aktivan=true; //ovako ne raditi
		//Exception in thread "main" java.lang.NullPointerException
		//System.out.println(o.getMjesto().getNaziv());
		
		Mjesto mjesto = new Mjesto();
		mjesto.setNaziv("Osijek");
		mjesto.setPostanskiBroj("31000");
		o.setMjesto(mjesto);
		System.out.println(o.getMjesto().getNaziv());
		
				
	
		
		
	}

}

