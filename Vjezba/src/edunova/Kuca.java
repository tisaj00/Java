package edunova;

public class Kuca {
	
	private int velicina;
	private int kucniBroj;
	private String vlasnik;
	
	public Kuca() {
		System.out.println("Ovo je prazna kuća");
	}
	
	public Kuca(int velicina, int kucniBroj, String vlasnik) {
		super();
		this.velicina = velicina;
		this.kucniBroj = kucniBroj;
		this.vlasnik = vlasnik;
		System.out.println("Ovo je puna kuća");
	}

	public double getVelicina() {
		return velicina;
	}
	public void setVelicina(int velicina) {
		this.velicina = velicina;
	}
	public int getKucniBroj() {
		return kucniBroj;
	}
	public void setKucniBroj(int kucniBroj) {
		this.kucniBroj = kucniBroj;
	}
	public String getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}
	
	
	

}
