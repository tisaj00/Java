package edunova;

import javax.swing.JOptionPane;

public class Zadatak6 {

	//Upiši dva cijela broja
	//ispiši
	//Zbroj
	//Razliku
	//Produkt
	//Kvocijent
	//Aritmetičku sredinu
	//zbroj kvadtara brojeva
	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("unesite broj:"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("unesite broj:"));
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i+j/2);
		System.out.println((i*i)+(j*j));
	}
	
}
