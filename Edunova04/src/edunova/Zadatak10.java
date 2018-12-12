package edunova;
import java.lang.Math;
import javax.swing.JOptionPane;

public class Zadatak10 {

	//Napiši program koji pročita jedan broj. 
	//Nakon toga ako je broj veći od 10 program 
	//izračuna površinu kruga i ispiše rezultat. 
	//U suprotno program izračuna opseg kruga i ispiše ga. 
	//U oba slučaja radijus je jednak upisanom broju.
public static void main(String[] args) {
	double i = Double.parseDouble(JOptionPane.showInputDialog("unesite broj:"));
	double p,o;
	if(i>10) {
		p=(i*i)* Math.PI;
		System.out.println("Površina kruga je: " + p);
	}else {
		o=2*i*Math.PI;
		System.out.println("Opseg kruga je: " + o);
	}
	
}
}
