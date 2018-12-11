package edunova;

public class Zadatak4 {

	// Program za 3 unesena broja ispisuje najmanji

	public static void main(String[] args) {

		int i = 4, j = 2, k = 2;

		if (i == j && i == k) {
			System.out.println("Isti su");
			return;
		}

		if (i > j && i > k) {
			System.out.println(i);
			return;
		}

		if (j > i && j > k) {
			System.out.println(j);
			return;
		}

		if (k > i && k > j) {
			System.out.println(k);
		}

	}

}
