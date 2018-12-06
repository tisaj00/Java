package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//napisati program koji za tri unesena decimalna broja ispisuje
	// zbroj prva dva umanjen za treći broj
	public static void main(String[] args) {
		
		double a=Double.parseDouble(JOptionPane.showInputDialog("Unesite prvi broj:"));
		double b=Double.parseDouble(JOptionPane.showInputDialog("Unesite drugi broj:"));
		double c=Double.parseDouble(JOptionPane.showInputDialog("Unesite treći broj:"));
		
		double d=a+b;
		double e=d-c;
		System.out.println(d);
		System.out.println(e);
		
		
	}
}
