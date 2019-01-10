package edunova;

public class Petlje {
	
	public static void main(String[] args) {
		//ispiši Osijek 10 puta
		int i;
		for(i=0;i>0;i--) {
			System.out.println("Osijek " + i);
		}
		i=i+1;
		i+=1;
		i=20;
		while(i<10) {
			System.out.println(i++);
		}
		
		do {
			System.out.println(i++);
		}while(i<10);
		
		int niz[] = {2,2,2,2,23};
		for(i=0;i<niz.length/2;i++) {
			System.out.println(niz[i]);
		}
		for(int t:niz) {
			System.out.println(t);
		}
	}

}
