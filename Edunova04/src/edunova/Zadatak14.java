package edunova;

import java.util.Random;

import javax.swing.JOptionPane;

public class Zadatak14 {
	public static void main(String[] args) {
		


	//Program prima logičku vrijednost
	//us slučaju istinitosti ispisuje Osijek
	//inače ispisuje Slučajni broj između 0 i 1
	
	boolean x = Boolean.parseBoolean(JOptionPane.showInputDialog("Unesite logičku vrijednost:"));
	
	if(x){
		System.out.println("Osijek");
		
	}
	if(!x){
		System.out.println("broj: "+Math.random());
	}
}
}