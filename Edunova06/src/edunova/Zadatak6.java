package edunova;

import java.util.Arrays;

public class Zadatak6 {
	
	//Ispiši zbroj svih prim brojeva između 
	//intervala koje unosi korisnik

	public static void main(String[] args) {
		int[] interval = Metode.ucitajBrojeve();
		Arrays.sort(interval);
		int ukupno=0;
		for(int i=interval[0];i<interval[1];i++) {
			ukupno+=Zadatak3.prim(i) ? i : 0;
		}
		System.out.println(ukupno);
	}
}
