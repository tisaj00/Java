package edunova;

public class StartFlomaster {

	public static void main(String[] args) {
		//definirati instancu flomaster - objekt ne ne živ
		Flomaster f;
		//konstruiranje objekta - oživljavanje objekta
		f=new Flomaster(); //new poziva konstruktor metodu na klasi
		
		//korištenje objekta
		f.setBoja("crna");
		System.out.println(f.getBoja());
		
		//uništavanje objekta - umiranje je zadatak Garbage Collector-a koji radi na JVM
	}
}
