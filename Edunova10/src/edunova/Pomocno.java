package edunova;

import javax.swing.JOptionPane;

public class Pomocno {
	
	public static int ucitajBroj() {
		for(;;) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Niste unijeli cijeli broj");
			}
		}
	}
	
	public static int ucitajBroj(String poruka) {
		for(;;) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Niste unijeli cijeli broj");
			}
		}
	}
	
	
	
	
	
	
	public static int ucitajBroj(String poruka, int min, int max) {
		int vrati=0;
		
		while(true) {
			try {
				vrati = Integer.parseInt(JOptionPane.showInputDialog(poruka));
				if(vrati<min || vrati>max) {
					JOptionPane.showConfirmDialog(null, "Broj nije u rasponu: " + min + " - " + max);
				}else {
					break;
				}
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Niste unijeli cijeli broj");
			}
		}
		return vrati;
	}
	
	
	public static int ucitajBroj(int min, int max) {
		int vrati=0;
		
		while(true) {
			try {
				vrati = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
				if(vrati<min || vrati>max) {
					JOptionPane.showConfirmDialog(null, "Broj nije u rasponu: " + min + " - " + max);
				}else {
					break;
				}
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Niste unijeli cijeli broj");
			}
		}
		return vrati;
	}

	
	
	
	
	
}
