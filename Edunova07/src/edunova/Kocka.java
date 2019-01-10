package edunova;

public class Kocka {
	
	//kreirati kocku 3x3x3 i napuniti sve elemente s 1
	
	public static void main(String[] args) {
		int kocka[][][] = new int[3][3][3];
		for (int duzina=0;duzina<3;duzina++) {
			for(int sirina=0;sirina<3;sirina++) {
				for(int visina=0;visina<3;visina++) {
					kocka[duzina][sirina][visina]=slucajniBroj();
				}
			}
		}
		System.out.println("kk");
	}

	private static int slucajniBroj() {
		//https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
		return 1 + (int)(Math.random()*((10-1) + 1));
	}

}
