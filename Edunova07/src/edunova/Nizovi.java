package edunova;

import java.util.Arrays;

public class Nizovi {
	
	//Kreirati niz s 25 elemenata tipa double i napuniti ih s slučajnim brojevima
	
	public static void main(String[] args) {
		double niz[]=new double[25];
		
		for(int i=0;i<niz.length;i++) {
			niz[i]=Math.random();
		}
		
		System.out.println(Arrays.toString(niz));
	}

}
