package edunova;

public class Dekrement {
	
	public static void main(String[] args) {
		
		int i=2;
		System.out.println(--i);
		//1
		System.out.println(i);
		//1
		System.out.println(i--);
		//1
		System.out.println(i);
		//0
		
		
		//Zadatak
		i=2;
		int j=2;
		
		i = --j + i;
		j=i + ++j;
		System.out.println(i + j);
		//8
	}

}
