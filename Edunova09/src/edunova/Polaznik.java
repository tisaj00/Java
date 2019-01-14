package edunova;

public class Polaznik extends Osoba {
	
	public static String OSLOVI = "Polazniče"; //može se mjenjati
	public static final String SIFRA="POL"; //konstanta

	private String brojUgovora;
	

	public Polaznik() {
		super();
	}



	public Polaznik(int sifra, String ime, String prezime, String email, String brojUgovora) {
		super(sifra, ime, prezime, email);
		this.brojUgovora = brojUgovora;
	}



	public String getBrojUgovora() {
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		this.brojUgovora = brojUgovora;
	}



	@Override
	public void pozdravi() {
		System.out.println("Dobar dan polaznik " + getIme());
		
	}



	@Override
	public String toString() {
		return "Polaznik [brojUgovora=" + brojUgovora + ", getSifra()=" + getSifra() + ", getIme()=" + getIme()
				+ ", getPrezime()=" + getPrezime() + ", getEmail()=" + getEmail() + "]";
	}
	
	
	public static Polaznik kreirajPolaznika() {
		return new Polaznik();
	}
	
	
}
