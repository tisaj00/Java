package edunova;

import javax.swing.JOptionPane;

public class Zadatak13 {

	//Napiši program u Javi koji pročita jedan broj preko tipkovnice. 
	//Nakon toga program odredi da li je upisani broj paran
	//ili neparan. Ako je paran neka program ispiše taj broj uvećan za
	//10 puta. U slučaju da je neparan neka program
	//ispiše taj broj 5 puta jedan pored drugoga

	 public static void main(String[] args) {
		 int i=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj:"));
		 if(i%2==0) {
			 System.out.println(i + 10);
		 }
		 else if(i%2!=0) {
			 System.out.println(i + " " + i + " " + i + " " + i + " " + i);
		 }
	}
}
