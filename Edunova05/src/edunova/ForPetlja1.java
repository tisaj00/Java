package edunova;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class ForPetlja1 {
	
	public static void main(String[] args) {
		
		//ispisati sve brojeve od 1 do 10
		for(int i=0;i<10;i++) {
			//System.out.println(i+1);
		}
		
		//ispisati svaki drugi broj od 2 do 10
		for(int i=2; i<=10; i=i+2) {
			System.out.println(i);
		}
		
		
		//ispiši sve parne brojeve od 1 do 10
		//priručno - loše
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);
		}
		
		
		//unesi dva broja i ispiši sve parne brojeve između njih
		System.out.println("--------------");
		int poc = Integer.parseInt(JOptionPane.showInputDialog("početak"));
		int kraj = Integer.parseInt(JOptionPane.showInputDialog("kraj"));
		//lošija sintaksa
		for(int i=poc;i<=kraj;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		//bolja sintaksa
		for(int i=poc;i<=kraj;i++) {
			if(i%2!=0) {
				continue; // short cuircuiting //nastavlja od for
			}
			
			if(i==11) {
				break; //izlazi iz petlje
			}
			
			System.out.println(i);
		}
		
		//beskonačne petlje
		int i=0;
		for(;;) {
			if(i++<10) {
				System.out.println(i);
				continue;
			}
			break;
		}
		
		
	}

}
