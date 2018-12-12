package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//Program učitava 4 cijela broja i ispisuje ih od najmanjeg prema najvećem
	
	public static void main(String[] args) {
		int polje[] = {3,4,2,6};
		int[] niz = {
				Integer.parseInt(JOptionPane.showInputDialog("Unesi 1. broj")),
				Integer.parseInt(JOptionPane.showInputDialog("Unesi 2. broj")),
				Integer.parseInt(JOptionPane.showInputDialog("Unesi 3. broj")),
				Integer.parseInt(JOptionPane.showInputDialog("Unesi 4. broj"))	
		};
		Arrays.sort(niz);
		System.out.println(Arrays.toString(niz));
		
		
	}

}
