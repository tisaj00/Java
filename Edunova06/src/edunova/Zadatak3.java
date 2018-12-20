package edunova;

public class Zadatak3 {

	
	// za dani broj ispiši da li je on prim (prosti) broj
	public static void main(String[] args) {
		int broj = Metode.ucitajBroj("Unesi broj");
//		boolean prim=true;
//		for(int i=2;i<broj;i++) {
//			System.out.println(i);
//			if(broj%i==0) {
//				prim=false;
//				break;
//			}
//		}
//		System.out.println(broj + (prim ? " je " : " nije ") + "prim broj");
		System.out.println(broj + (prim(broj) ? " je ": " nije ") + " prim broj");
	}
	
	static boolean prim(int broj) {
		for(int i=2;i<broj;i++) {
			if(broj%i==0) {
				return false; // short curcuiting
			}
		}
		return true;
	}
	
}
