package edunova;

import javax.swing.JOptionPane;

public class Zadatak15 {

	//Za primljeni broj mjeseca ispisati njegov naziv
	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj mjeseca"));
		int mjesec = i;
		
		switch (mjesec) {
		case 1:
			System.out.println("Siječanj");
			break;
		case 2:
			System.out.println("Veljača");
			break;
		case 3:
			System.out.println("Ožujak");
			break;
		case 4:
			System.out.println("Travanj");
			break;
		case 5:
			System.out.println("Svibanj");
			break;
		case 6:
			System.out.println("Lipanj");
			break;
		case 7:
			System.out.println("Srpanj");
			break;
		case 8:
			System.out.println("Kolovoz");
			break;
		case 9:
			System.out.println("Rujan");
			break;
		case 10:
			System.out.println("Listopad");
			break;
		case 11:
			System.out.println("Studeni");
			break;
		case 12:
			System.out.println("Prosinac");
			break;
		default:
			System.out.println("Nije mjesec");
		}
	}
	
	
}
