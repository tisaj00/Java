package edunova;

public class StartKuca {
	public static void main(String[] args) {
		
		Kuca k;
		k = new Kuca();
		
		k.setKucniBroj(38);
		k.setVelicina(128);
		k.setVlasnik("Pero");
		
		System.out.println(k.getKucniBroj()+", "  + k.getVelicina()+ ","+ k.getVlasnik());
		
	}

}
