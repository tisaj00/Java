package edunova;

import javax.swing.JOptionPane;

public class Varijable {
	
	public static void main(String[] args) {
		
		//varijabla je prostor u memoriji
		//deklarcija varijable
		//tip podatka naziv
		//primitivni tipovi podataka - NISU OBJEKTI
		int i;
		//dodjeljivanje vrijednosti
		i=10;
		
		System.out.println(i);
		
		//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		byte b=22; //0 - početna vrijednost
		short s = 18;//0 - početna vrijednost
		int in=276767;//0 - početna vrijednost
		long lon = 12653461254L;//0 - početna vrijednost
		float f = 2.33F;//0 - početna vrijednost
		double dd = 2.33;//0 - početna vrijednost
		boolean x = true;//false - početna vrijednost
		char c = 'A';//'' - početna vrijednost
		
		// omotači wrapper primitivnih tipova podataka
		b = Byte.parseByte(JOptionPane.showInputDialog("daj byte"));
		s = Short.parseShort(JOptionPane.showInputDialog("Unesi short"));
		in = Integer.parseInt(JOptionPane.showInputDialog("Daj integer"));
		lon = Long.parseLong(JOptionPane.showInputDialog("Daj long"));
		f = Float.parseFloat(JOptionPane.showInputDialog("daj float"));
		dd = Double.parseDouble(JOptionPane.showInputDialog("daj double"));
		x = Boolean.parseBoolean(JOptionPane.showInputDialog("daj boolean"));
		c = Character.toChars(Integer.parseInt(JOptionPane.showInputDialog("Daj broj za char")))[0];
		System.out.println(b);
		
		//kako sve možemo deklarirati varijable
		int var;
		var=2;
		
		int j,k,l;
		k=2;
		
		int a=3, aa=4; boolean ok=true;
		
		double d2 = 1.234e2;
		
		//java je type strict
		//int o = "3";
		
		
	}
	//tri načina kako deklarirati varijablu
	int varijablaKlase;
	
	private void metoda(int parametarMetode) {
		
		int varijablaMetode;
		
	}

}
