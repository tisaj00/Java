package edunova;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ForEachPetlja {
	
	public static void main(String[] args) {
		
		
		int niz[] = {2,34,3,2,2,3,3};
		
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		
		for(int i: niz) { //iteriram UVIJEK sve elemente niza
			System.out.println(i);
		}
		
		List<Integer> lista = new ArrayList<>();
		lista.add(2);
		lista.add(4);
		lista.forEach(i->System.err.println(i));
		
		
		
	}

}
