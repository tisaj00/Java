package edunova;

public class Trokut {
	
	private int duzinaA;
	private int duzinaB;
	private int duzinaC;
	
	
	
	public Trokut() {
		
	}
	
	
	
	public Trokut(int duzinaA, int duzinaB, int duzinaC) {
		this.duzinaA = duzinaA;
		this.duzinaB = duzinaB;
		this.duzinaC = duzinaC;
	}



	public int getDuzinaA() {
		return duzinaA;
	}
	public void setDuzinaA(int duzinaA) {
		this.duzinaA = duzinaA;
	}
	public int getDuzinaB() {
		return duzinaB;
	}
	public void setDuzinaB(int duzinaB) {
		this.duzinaB = duzinaB;
	}
	public int getDuzinaC() {
		return duzinaC;
	}
	public void setDuzinaC(int duzinaC) {
		this.duzinaC = duzinaC;
	}
	
	
	public int getOpseg() {
		return duzinaA + duzinaB + duzinaC;
	}
	
	public double getPovrsina() {
		double s = 1/(double)2 * (duzinaA + duzinaB + duzinaC);
        return Math.sqrt(s*(s-duzinaA)*(s-duzinaB)*(s-duzinaC));
	}
	

}
