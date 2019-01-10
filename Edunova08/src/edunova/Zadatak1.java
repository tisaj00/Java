package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//Program prima ime grada
	//ako je ime grada Osijek ispisuje OK
	
	public static void main(String[] args) {
		String grad = JOptionPane.showInputDialog("Upiši ime grada");
		if(grad.equals("Osijek")) {
			System.out.println("OK");
		}
		
	}

}
