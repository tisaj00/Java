package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak3 {
	
	//Program traži unos broja
	//unosi onoliko brojeva koliko je definirano u prvom broju
	//ispisuje ih od najvećeg prema najmanjem
	
	public static void main(String[] args) {
		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("broj"));
		int niz[] = new int[prviBroj];
		for(int i=0;i<prviBroj;i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("broj"));
		}
		Arrays.sort(niz);
		for(int i=niz.length-1;i>=0;i--) {
			System.out.print(niz[i] + ((i>0) ? ", " : ""));
		}
		
	}

}
