package edunova;

import javax.swing.JOptionPane;

public class Zadatak8 {

	//U programu omogućite unos dvije stranice pravokutnika 
	//i izračunajte njegovu površinu i opseg
	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("unesite prvu stranicu:"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("unesite drugu  stranicu:"));
		int O,P;
		O=2*(i+j);
		P=i*j;
		System.out.println("površina je: " + P);
		System.out.println("opseg je : " + O);
		
	}
}

