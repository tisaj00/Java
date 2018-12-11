package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//program učitava dva broja.
	//U slučaju da su oba broj pozitivna ispisuje njihov zbroj
	//inače ispisuje oba broja jedan pored drugoga odvojeno zarezom
	
	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi 1. broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi 2. broj"));
		
		if(i>0 && j>0) {
			System.out.println(j+i);
		}else {
			System.out.println(i + ", " + j);
		}
		
	}

}
