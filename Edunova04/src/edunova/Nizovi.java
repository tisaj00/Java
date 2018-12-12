package edunova;

import java.util.Arrays;

public class Nizovi {
	
	
	//polja
	public static void main(String[] args) {
		
		//ako imamo više vrijednosti istog tipa ne koristiti varijable
		int i=3, j=4,k=2,l=6;
		
		int i1=2,i2=23,i3=4,i4=4;
		
		//već koristiti nizove
		//osnovna sintaksa - jednodimenzonalni
		int[] niz = new int[4];	
		niz[0]=3;
		niz[1]=4;
		niz[2]=2;
		niz[3]=6;
		
		System.out.println(Arrays.toString(niz));
		
		//varijanta 2
		int polje[] = {3,4,2,6};
		
		Arrays.sort(polje);
		
		System.out.println(Arrays.toString(polje));
		
		System.out.println(niz.length);
		
		
		
		
	}

}
