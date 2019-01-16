package edunova;

public class Osoba {
	
	private int sifra;
	private String imePrezime;
	
	
	
	
	public Osoba() {
		super();
	}
	
	
	public Osoba(int sifra, String imePrezime) {
		super();
		this.sifra = sifra;
		this.imePrezime = imePrezime;
	}


	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}


	@Override
	public String toString() {
		return "Osoba [sifra=" + sifra + ", imePrezime=" + imePrezime + "]";
	}
	
	

}
