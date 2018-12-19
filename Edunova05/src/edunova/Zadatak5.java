package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak5 {
	
	//DZ
	
	//Napisati program koji ispisuje sve neparne brojeve između 
	//dva unesena broja od većeg prema manjem
	// 23   89
	//89 87 85 ... 23
	
	//36   23
	//35,33,..23
	
	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("broj1")); 
		int j = Integer.parseInt(JOptionPane.showInputDialog("broj2"));
		for(int x=i;x<=j;x++){
			if(x%2!=0) {
				System.out.print(x+ " ");
				
			}
			
		}
		
	}
	
	
	
	//Napisai progra koji prima broj i provjera dali je on prim (prosti) broj

}
