package edunova;

import javax.swing.JOptionPane;

public class Zadatak11 {

	// Program prima 4 broja
	// ispisuje zbroj svih parnih primljenih brojeva

	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi 1. broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi 2. broj"));
		int k = Integer.parseInt(JOptionPane.showInputDialog("Unesi 3. broj"));
		int l = Integer.parseInt(JOptionPane.showInputDialog("Unesi 4. broj"));
		
		int zbroj=0;
		if(i%2==0) {
			zbroj=zbroj+i;
		}
		if(j%2==0) {
			zbroj=zbroj+j;
		}
		if(k%2==0) {
			zbroj=zbroj+k;
		}
		if(l%2==0) {
			zbroj=zbroj+l;
		}
		
		System.out.println(zbroj);
		
		
	}

}
