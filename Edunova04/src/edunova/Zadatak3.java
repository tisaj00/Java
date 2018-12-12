package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {
	
	//Program prima broj i ispisuje taj broj uvećan za 10
	public static void main(String[] args) {
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("unesite broj:"));
		System.out.println(i + 10);
	}

}
