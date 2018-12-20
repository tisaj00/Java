package edunova;

public class Zadatak4 {
	
	//ispišite sve prim brojeve od 18 do 1900
	
	public static void main(String[] args) {
		for(int i=18;i<1900;i++) {
			if(Zadatak3.prim(i)){
				System.out.println(i);
			}
		}
	}

}
