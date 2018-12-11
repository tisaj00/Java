package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {
	
	// za primljena dva broja ispiši veći
	
	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi 1. broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi 2. broj"));
		
		//loše rješenje
		System.out.println(i>j ? i : j);
		
		//dobro
		if(i>j) {
			System.out.println(i);
		}else if (j>i) {
			System.out.println(j);
		}else {
			System.out.println("Isti su");
		}
		
		
	}

}
