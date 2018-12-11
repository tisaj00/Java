package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	//Napišite program za provjeru parnosti broja
	
	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj")); 
		
		
		//R1
		if(i%2==0) {
			System.out.println("Broj je paran");
		}
		
		
		//R2
		if(i%2==0) {
			System.out.println("Broj je paran");
		}else {
			System.out.println("Broj je neparan");
		}
		
		//R3
		System.out.println("Broj je " + (i%2==0 ? "paran" : "neparan"));
		
		//R4
		int rez = i%2;
		System.out.print("Broj je ");
		if(rez==0) {
			System.out.println("paran");
		}else {
			System.out.println("neparan");
		}
		
		
		
	}

}
