package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	//program učitava 5 brojeva i 
	//ispisje ih od najmanjeg do najvećeg
	
	
	public static void main(String[] args) {
		
		int niz[] = new int[5];
		for(int i=0;i<5;i++) {
			niz[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi"));
		}
		Arrays.sort(niz);
		System.out.println(Arrays.toString(niz));
		
	}

}
