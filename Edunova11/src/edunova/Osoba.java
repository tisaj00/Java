package edunova;

import java.math.BigDecimal;

public class Osoba {
	
	
	private int sifra;
	private String ime;
	private String prezime;
	private BigDecimal primanje;
	
	public Osoba(int sifra, String ime, String prezime, BigDecimal primanje) {
		super();
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
		this.primanje = primanje;
	}
	public Osoba() {
		super();
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
	public BigDecimal getPrimanje() {
		return primanje;
	}
	public void setPrimanje(BigDecimal primanje) {
		this.primanje = primanje;
	}
	@Override
	public String toString() {
		return "Osoba [sifra=" + sifra + ", ime=" + ime + ", prezime=" + prezime + ", primanje=" + primanje + "]";
	}
	
	

}
