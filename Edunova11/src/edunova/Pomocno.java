package edunova;

import java.math.BigDecimal;
import java.util.Scanner;

public class Pomocno {
	
	public static int ucitajBroj(Scanner ulaz, String poruka, int min, int max) {
		int vrati=0;
		
		while(true) {
			System.out.print(poruka + ": ");
			
			try {
				vrati=Integer.parseInt(ulaz.nextLine());
				if(vrati>=min && vrati<=max) {
					break;
				}else {
					System.out.println("Broj nije u rasponu " + min + " - " + max);
				}
			} catch (Exception e) {
				System.out.println("Nije cijeli broj u rasponu " + min + " - " + max);
			}
	
		}
		
		return vrati;
	}

	public static String ucitajString(Scanner ulaz, String string) {
		String ucitao;
		while(true) {
			System.out.print(string+": ");
			ucitao=ulaz.nextLine();
			if(ucitao.trim().length()!=0) {
				return ucitao;
			}else {
				System.out.println("Obavezno unos niza znakova");
			}
		}
	}

	public static BigDecimal ucitajDecimalniBroj(Scanner ulaz, String string) {
		
		while(true) {
			System.out.print(string+": ");
			
			try {
				return new BigDecimal(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Niste unijeli decimalni broj");
			}
		}
		
	}


}
