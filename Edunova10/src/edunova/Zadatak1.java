package edunova;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//program učitava brojeve sve dok se ne pojavi riječ DOSTA
	//program ispisuje zbroj svih primljenih brojeva
	
	public static void main(String[] args) {
		
		String ulaz;
		List<Integer> brojevi = new ArrayList<>();
		while(true) {
			ulaz = JOptionPane.showInputDialog("Unesi broj ili DOSTA za kraj");
			if(ulaz.equals("DOSTA")) {
				break;
			}
			try {
				brojevi.add(Integer.parseInt(ulaz));
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Nisi unio broj");
			}
		}
		BigInteger ukupno = BigInteger.ZERO;
		for(int i:brojevi) {
			ukupno=ukupno.add(new BigInteger(String.valueOf(i)));
		}
		System.out.println(ukupno);
		
	}

}
