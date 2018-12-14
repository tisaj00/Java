package edunova;

import javax.swing.JOptionPane;

public class Zadatak9 {

	//U programu omogućite unos broja sekundi i ispišite 
	//odgovarajuće vrijeme u satima, minutama i sekundama
	
	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj sekundi:"));
		int p1,p2,p3;
		p1=i%60;
		p2=i/60;
		p3=p2/60;
		p2=p2/60;
		
		
		
			
			System.out.println(p2+ "sat  "+ p3 + "minuta "+  p1+ "sekundi ");
		
		
		
		
		
		
	}
	
	
}
