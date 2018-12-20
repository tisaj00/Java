package edunova;

public class Zadatak2 {
	
	//program prima 5 brojeva i ispisuje njihov zbroj
	
	public static void main(String[] args) {
		int[] brojevi = Metode.ucitajBrojeve(5);
		System.out.println(Metode.zbroji(brojevi));
		
		Metode.ispisi(Metode.zbroji(Metode.ucitajBrojeve(5)));
	}

}
