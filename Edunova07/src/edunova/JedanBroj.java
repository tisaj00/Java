package edunova;

import javax.swing.JOptionPane;

public class JedanBroj {

		//Napiši program koji pročita jedan broj. 
		//Nakon toga ako je broj veći od 10 program 
		//izračuna površinu kruga i ispiše rezultat. 
		//U suprotno program izračuna opseg kruga i ispiše ga. 
		//U oba slučaja radijus je jednak upisanom broju.

		public static void main(String[] args) {
			int i = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
			if(i>10) {
				System.out.println((i*i)*3.14);//dobar
				System.out.println(Math.pow(i, 2)*Math.PI);//kako treba
			}else {
				System.out.println(2*i*Math.PI);
			}
		}
}
