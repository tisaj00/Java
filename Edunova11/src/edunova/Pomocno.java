package edunova;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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
	
	public static String slucajniString() {
        String SALTCHARS = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpRrSsTtUuVvZz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { 
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
	}

	public static int slucajniInteger() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 10000 + 1);

	    return randomNum;
	    }

	public static BigDecimal slucajniBigDecimal() {
		 BigDecimal max = new BigDecimal(30000 + ".6");
	        BigDecimal randFromDouble = new BigDecimal(Math.random());
	        BigDecimal actualRandomDec = randFromDouble.multiply(max);
	        return actualRandomDec;
	}


}
