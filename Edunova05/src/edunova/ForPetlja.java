package edunova;

public class ForPetlja {
	
	public static void main(String[] args) {
		
		//ispišite 4 puta jedno ispod drugog Osijek
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		System.out.println("Osijek");
//		
//		System.out.println("Osijek\nOsijek\nOsijek\nOsijek");
		
		for(int i=0;i<4;i=i+1) {
			System.out.println((i+1) + " Osijek");
		}
		
		//zadatak: Ispisati sve brojeve od 10 do 100
		
		for(int i = 10;i<=100;i=i+1) {
			System.out.println(i);
		}
		
		//zadatak: ispisati brojve od 2 do 10
		//UVIJEK KORISTITI {}, ne ovako
		for(int i=2; i<=10;i=i+1)
			System.out.println(i);
			System.out.println("s");
		
	}

}
