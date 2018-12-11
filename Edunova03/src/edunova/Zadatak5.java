package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {
	
	//Program učitava 4 broja.
	//u slučaju da je prvi jednak zadnjem broju ispisuje
	//zbroj drugog i trećeg broja
	//inače ispisuje sljedno brojeve od najmanjeg prema najvećem
	
	
	// DOVRŠITI ZA DZ

	
		public static void main(String[] args) {
			int sw;
			int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			int k = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			int l = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			
			if(i==l) {
				System.out.println(j+k);
			}
			
			}
			
			
}

