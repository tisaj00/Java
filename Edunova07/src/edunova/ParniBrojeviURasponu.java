package edunova;

import javax.swing.JOptionPane;

public class ParniBrojeviURasponu {
	
	//ispiši sve parne brojeve u danom rasponu
	
	public static void main(String[] args) {
		//učitati dva broja
		int i = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
		
		//osigurati da od ima manju vrijedno i dob ima veću vrijednost
		int od = j>=i ? i : j;
		int dob = i<=j ? j : i;
		
		ispisParnihBrojevaURasponu(od,dob);
		
	}

	private static void ispisParnihBrojevaURasponu(int od, int dob) {
		for(int i=od;i<=dob;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}
	
	//nema veze s zadatko, prikazuje princip potpisa metode
	static void ispisParnihBrojevaURasponu(int od) {
		ispisParnihBrojevaURasponu(od, 100);
	}

}
