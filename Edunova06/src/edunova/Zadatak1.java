package edunova;

public class Zadatak1 {

	//Program učitava dva broja i ispisuje umnožak
	
	public static void main(String[] args) {
		int[] niz = Metode.ucitajBrojeve();
		Metode.ispisi(pomnozi(niz));
	}
	
	static int pomnozi(int[] niz) {
		return niz[0] * niz[1];
	}
}
