package edunova;

public class KlasaString {

	
	public static void main(String[] args) {
		//String ime = new String(); ne koristi
		String ime="Pero";
		System.out.println(ime.length());
		System.out.println(ime.substring(1, 2));
		System.out.println(ime.substring(1));
		ime=ime+" je iz Osijeka";
		ime+=", i tu živi";
		System.out.println(ime);
		Osoba o = new Osoba();
	}
	
	
}
