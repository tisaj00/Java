package edunova;

public abstract class Osoba /*extends Object*/ {
	
	private int sifra;
	private String ime;
	private String prezime;
	private String email;
	protected String opis;
	
	public abstract void pozdravi(); //za polimorfizam
	
	
	public Osoba() {
		super();
		System.out.println("Kostruktor osobe");
	}
	
	
	
	
	
	public Osoba(int sifra, String ime, String prezime, String email) {
		super();
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
	}





	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return getIme();
	}

}
