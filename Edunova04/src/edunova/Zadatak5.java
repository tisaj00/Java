package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {
	
	//Ukoliko korisnik unese ime grada Osijek tada ispiši najbolji grad
	//inače ispiši OK
	
	public static void main(String[] args) {
		
			System.out.println(JOptionPane.showInputDialog("Unesi ime grada").equals("Osijek") ? "najbolji grad" : "OK");
		
	}

}
