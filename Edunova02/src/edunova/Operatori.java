package edunova;

import javax.swing.JOptionPane;

public class Operatori {

	public static void main(String[] args) {
		
		System.out.println(Short.MAX_VALUE);
		System.out.println((short)(Short.MAX_VALUE+1));
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi 1. broj"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Unesi 2. broj"));
		
		int z = i+j;
		z=i-j;
		
		z=i/j; // 10/3 = 3
		
		z=i*j;
		
		System.out.println(z);
		
		
		//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html

	}

}
