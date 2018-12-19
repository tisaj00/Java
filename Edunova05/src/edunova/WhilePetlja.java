package edunova;

public class WhilePetlja {

	public static void main(String[] args) {
		
		//ispisati sve brojeve od 1 do 10
		int i=0;
		while(i<10) {
			System.out.println(i++ +1);
		}
		
		i=0;
		boolean ostaniUPetlji = i<10;
		while (ostaniUPetlji) {
			System.out.println(i+1);
			ostaniUPetlji = ++i<10;
		}
		
		i=0;
		//beskonačna
		while(true) { //uvijek boolean
			if(i++ ==4) {
				continue;
			}
			if (i==10) {
				break;
			}
			System.out.println(i);
		}
		i=0;
		while(true) {
			System.out.print(Math.random());
			if(i++ % 10==0) {
				System.out.println();
			}
		}
		
	}
}
