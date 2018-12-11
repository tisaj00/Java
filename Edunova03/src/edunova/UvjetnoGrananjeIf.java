package edunova;

import java.util.Scanner;

public class UvjetnoGrananjeIf {
	
	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesi cijeli broj");
		
		int i = ulaz.nextInt();
		
		
		//ako je broj veći od 10 ispiši OK
		System.out.println(i>10);
		//osnovna sintaksa
		if(i>10) { //if radi isključivo s boolean
			System.out.println("OK");
		}
		
		//puna sintaksa
		if(i>10) {
			System.out.println("OK");
		}else {
			System.out.println("Nije dobro");
		}
		
		
		//loša sintaksa
		if(i>10)
			System.out.println("OK");
		else
			System.out.println("Nije dobro");
			System.out.println("Drugi red");
		
		//uvijek koristiti vitičaste zagrade
			
			
		//inline if - tercijarni operator
			System.out.println(i>10 ? "OK" : "Nije dobro");
			// ne koristiti uvije i svuda je postaje ne čitljiv
		//System.out.println(i>10 ? i<7 ? "OK" : "OK" : "Nije dobro");
			
		//de ide samo sa if stranim
		//System.out.println(i>10 ? "OK" );
		
		if(i>10 & i<15) { // jedan & provjerava oba uvjeta
			System.out.println("OK");
		}
		
		if(i>10 && i<15) {// u slučaju dva && ne zadovoljavanje 1. uvjeta ne provjerava drugi
			System.out.println("OK");
		}
		
		if(provjeriStanje() && logiraj()) { // & ispisije Logiram, && ne ispisuje logiram
			System.out.println("OK");
		}
		
		if(i>10 | i<5) { //provjeravaju se oba uvjeta
			System.out.println("OK");
		}
		
		if(i>10 || i<5) { //u slučaju da je prvi uvjet zadovoljen ne provjerava se drugi
			System.out.println("OK");
		}
		
		if(i==10) { // == provjerava točan iznos
			System.out.println("OK");
		}
		
		if(i!=10) { // != različito
			System.out.println("OK");
		}
		
		if(!(i<10)) {
			System.out.println("");
		}
		
		if(i==2) {
			System.out.println("Dovoljan");
		}else if (i==3) {
			System.out.println("Dobar");
		}else {
			System.out.println("Nije dobro");
		}
		
		if(i==2) {
			
		}else {
			if(i==3) {
				
			}
		}
		
		
		//System.out.println(i);

		ulaz.close();
		
	}

	private static boolean logiraj() {
		System.out.println("Logiram");
		return false;
	}

	private static boolean provjeriStanje() {
		System.out.println("Provjeravam stanje");
		return false;
	}

	

}
