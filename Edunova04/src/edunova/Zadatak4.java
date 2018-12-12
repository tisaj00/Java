package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {
	
	// Za dva unesena broja ispiši njihovu razliku u apsolutnoj vrijednosti

	public static void main(String[] args) {
		int i=Integer.parseInt(JOptionPane.showInputDialog("pb"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("db"));
		
		
		if(i-j<0) {
			System.out.println((i-j)* -1);
		}else {
			System.out.println(i-j);
		}
		
		if(i<j) {
			System.out.println(j-i);
		}else {
			System.out.println(i-j);
		}
		
		
	}
}
