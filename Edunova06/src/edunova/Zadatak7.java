package edunova;

public class Zadatak7 {
	
	//Program učitava brojeve sve dok se ne pojavi broj -1
	//program ispisuje zbroj svih primljenih brojeva
	
	public static void main(String[] args) {
		int ukupno=0;
		int broj;
		while(true) {
			broj = Metode.ucitajBroj("Učitaj broj");
			if(broj==-1) {
				break;
			}
			ukupno+=broj;
		}
		System.out.println(ukupno);
	}

}
