package edunova;

public class UvjetnoGrananjeSwitch {

	public static void main(String[] args) {

		int ocjena = 2;
		// dobra sintaksa
		// if(ocjena==1) {
		// System.err.println("Nedovoljan");
		// }else if (ocjena==2) {
		// System.out.println("Dovoljan");
		// }else if (ocjena==3) {
		// System.out.println("Dobar");
		// }else if (ocjena==4) {
		// System.out.println("Vrlo dobar");
		// }else if (ocjena==5) {
		// System.out.println("Izvrstan");
		// }else {
		// System.out.println("Nije ocjena");
		// }

		// bolja sintaksa
		switch (ocjena) {
		case 1:
			System.out.println("Nedovoljan");
			break;
		case 2:
			System.out.println("Dovoljan");
			break;
		case 3:
			System.out.println("Dobar");
			break;
		case 4:
			System.out.println("Vrlo dobar");
			break;
		case 5:
			System.out.println("Izvrstan");
			break;
		default:
			System.out.println("Nije ocjena");
		}
		
		switch (ocjena) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			if(true) {
				System.out.println("Ocjena je");
			}
			
			break;

		default:
			System.out.println("Nije ocjena");
			break;
		}
		
		String grad = "Osijek";
		switch (grad) {
		case "Osijek":
			System.out.println("Moj grad");
			break;

		default:
			System.out.println("NE");
			break;
		}
		
		//swotch rad s int, char i String
//		boolean b = true;
//		switch (b) {
//		case true:
//			
//			break;
//
//		default:
//			break;
//		}

	}
}
