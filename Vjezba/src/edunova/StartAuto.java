package edunova;

public class StartAuto {
	
	public static void main(String[] args) {
		
		Auto a;
		a= new Auto();
		
		ModelAuta b;
		b = new ModelAuta();
		
		a.setJacina(110);
		a.setBrojVrata(5);
		a.setJakostMotora(1.6);
		a.setVlasnik("Josip");
		b.setGodinaProizvodnje(1995);
		b.setModel("Golf");
		
		System.out.println(a.getVlasnik() + " ima auto jačine " + a.getJacina() + " jakosti motora " + a.getJakostMotora() + " i s brojem vrata "+ a.getBrojVrata());
		System.out.println(b.getModel() + " je proizveden " + b.getGodinaProizvodnje());
	}

}
