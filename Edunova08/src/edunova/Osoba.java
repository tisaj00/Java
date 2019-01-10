package edunova;

//klasa je opisnik objekta
public class Osoba {
	
	//int visina; //ovako ne raditi
	//boolean aktivan; //ovako ne raditi
	//int visina; //1. način priastupa: package - ništa ne piše prije tipa podatka
	//princip učahurivanja
	//sakrij svojstvo
	private int visina; //vidljivo SAMO ovoj klasi
	private String ime;
	private Mjesto mjesto;

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public Mjesto getMjesto() {
		return mjesto;
	}

	public void setMjesto(Mjesto mjesto) {
		this.mjesto = mjesto;
	}
	
	//i učini ga dostupno putem metoda
	
	

}
