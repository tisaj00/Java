package edunova;

public class ModelAuta extends Auto {

	private String Model;
	private int godinaProizvodnje;
	
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	
	
	@Override
	public String toString() {
		return "ModelAuta [Model=" + Model + ", godinaProizvodnje=" + godinaProizvodnje + ", getModel()=" + getModel()
				+ ", getGodinaProizvodnje()=" + getGodinaProizvodnje() + ", getVlasnik()=" + getVlasnik()
				+ ", getJacina()=" + getJacina() + ", getBrojVrata()=" + getBrojVrata() + ", getJakostMotora()="
				+ getJakostMotora() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
}
