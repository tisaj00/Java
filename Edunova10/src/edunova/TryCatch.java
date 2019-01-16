package edunova;

import java.util.Scanner;

public class TryCatch {
	
	private Scanner ulaz;
	
	public TryCatch() {
		//ulaz = new Scanner(System.in);

		System.out.println("Unesi broj:");
		int i = 0;
		try {

			i = Integer.parseInt(ulaz.nextLine());

		} catch (NumberFormatException e) {
			System.out.println("Niste unije broj: " + e.getMessage());
		}catch (NullPointerException e) {
			System.out.println("Nemam instancu skenera");
		}catch(Exception e) {
			System.out.println("Greška, kontaktirajte podršku");
		}finally {
			System.out.println("Ovo se izvodi uvijek");
		}
		

		System.out.println(i);

		ulaz.close();
	}

	public static void main(String[] args) {
		new TryCatch();
	}
}
