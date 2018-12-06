package edunova;
import javax.swing.JOptionPane;

public class Zadatak2 {

	//Program prima dva cijela broja i jedan decimalni.
	//ispisuje prvo decimalni pa razlika primljena dva cijela broja
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli broj:"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli broj:"));
		double c=Double.parseDouble(JOptionPane.showInputDialog("Unesite decimalni broj:"));
		
		System.out.println(c);
		System.out.println(a-b);
		
	}
	
}
