package edunova;

import javax.swing.JOptionPane;

public class Metode {
	
	//program učitava dva broja i ispisuje njigov zbroj
	
	public static void main(String[] args) {
		
		//stari način
//		int i=Integer.parseInt(JOptionPane.showInputDialog("b1"));
//		int j=Integer.parseInt(JOptionPane.showInputDialog("b2"));
		
		//int rez = i+j;
		
		//System.out.println(rez);
		
		//osnvno korištenje metoda
		int[] ub = ucitajBrojeve();
		int rez = zbroji(ub);
		ispisi(rez);
		
		//ovako raditi
		ispisi(zbroji(ucitajBrojeve()));
		
		float f = ucitajDecimalniBroj("Daj broj");
		
		
	}
	
	private static float ucitajDecimalniBroj(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	//static mora za sada biti jer ju pocivamo iz static metode (main)
	//metoda je organizacijaska cjelina koda
	//koja ima svoj tip, naziv, listu parametara koje prima i tijelo
	//int[] je tip
	//ucitajBrojeve je naziv
	//() je lista parametara
	// između {} je tijelo
	//ako metoda ni etipa void tada MORA vratiti vrijednost (return)
	static int[] ucitajBrojeve() {
		int[] niz = {ucitajBroj("Upiši 1. broj"),ucitajBroj("Upiši 2. broj")};
//		niz[0] = ucitajBroj("Upiši 1. broj");
//		niz[1] = ucitajBroj("Učitaj 2. broj");
		return niz;
	}
	
	//potpis metode se satoji od naziva + liste parametara koje prima
	static int[] ucitajBrojeve(int ukupno) {
		int[] niz = new int[ukupno];
		for(int i=0;i<ukupno;i++) {
			niz[i] = ucitajBroj("Učitaj " + (i+1) + ". broj");
		}
		return niz;
	}
	
	static int ucitajBroj(String poruka) {
		return Integer.parseInt(JOptionPane.showInputDialog(poruka));
	}
	
	static int zbroji(int[] niz) {
		int rez=0;
		for(int i=0;i<niz.length;i++) {
			rez+=niz[i];
		}
		return rez;
		//return niz[0] + niz[1];
	}
	
	static void ispisi(int b) {
		System.out.println(b);
	}
	
	static void primaDvaParametra(int i, int j) {
		
	}

}
