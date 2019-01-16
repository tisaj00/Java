package edunova;

import javax.swing.JOptionPane;

public class Primjer01 {
	
	public static void main(String[] args) {
		
		//učitaj broj
		while(true) {
			
			try {
				
				int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
				break;
			} catch (Exception e) {
				
				JOptionPane.showConfirmDialog(null, "Niste unije broj");
				
			}
			
		}
		
		
	}

}
