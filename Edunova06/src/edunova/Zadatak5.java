package edunova;

public class Zadatak5 {
	
	//Ispiši sve prim brojeve od 270 do 3 (od najvećeg do majnanjeg)
	public static void main(String[] args) {
		for(int i=270;i>3;i--) {
			if(Zadatak3.prim(i)){
				System.out.println(i);
			}
		}
	}
}
