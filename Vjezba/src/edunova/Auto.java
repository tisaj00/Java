package edunova;

public class Auto {

	private String vlasnik;
	private int jacina;
	private int brojVrata;
	private double jakostMotora;
	
	public Auto() {
		System.out.println("prazan konsturktor");
	}
	
	public Auto(String vlasnik, int jacina, int brojVrata, double jakostMotora) {
		this.vlasnik = vlasnik;
		this.jacina = jacina;
		this.brojVrata = brojVrata;
		this.jakostMotora = jakostMotora;
		System.out.println("puni konstruktor");
	}
	
	public String getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}
	public int getJacina() {
		return jacina;
	}
	public void setJacina(int jacina) {
		this.jacina = jacina;
	}
	public int getBrojVrata() {
		return brojVrata;
	}
	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
	public double getJakostMotora() {
		return jakostMotora;
	}
	public void setJakostMotora(double jakostMotora) {
		this.jakostMotora = jakostMotora;
	}
	
	
}
