package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//program prima dva broj i ispisuje 
	//zbroj svih brojeva između ta dva broja
	
	//i=2
	//j=4
	// 2+3+4
	// out 9
	
	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("b1")); //2
		int j = Integer.parseInt(JOptionPane.showInputDialog("b2")); //4
		int r=0;
		for(int t = i; t<=j;t++) {
			r+=t; //2+3+4
		}
		System.out.println(r); //9
		
		//ovo rješenje zahtjeva 100 iteracija
		//DZ: pronaći rješenje koje zahtjeva manje iteracija 
	}

}
