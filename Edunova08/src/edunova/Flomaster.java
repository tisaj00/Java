package edunova;

public class Flomaster {

	private String boja;
	private boolean ispravno;
	
	//prazni konstruktor
	public Flomaster() {
		System.out.println("U praznom konstrukotru flomastera");
	}
	
	//konstruktor - puni
	public Flomaster(String boja, boolean ispravno) {
		this.boja=boja;
		this.ispravno=ispravno;
		System.out.println("U punom konstrukotru flomastera");
	}
	
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	public boolean isIspravno() {
		return ispravno;
	}
	public void setIspravno(boolean ispravno) {
		this.ispravno = ispravno;
	}
	
	
}
