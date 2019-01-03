package edunova;

import javax.swing.JOptionPane;

public class CiklickaTablicav2 {

public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Zadaj broj redaka"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Zadaj broj stupaca"));
		
		int[][] tablica= new int [a][b];
		
		int najmanjiStupac = 0;
		int najveciStupac = b-1;
		int najmanjiRedak = 0;
		int najveciRedak = a-1;
	    int broj=1;    
		
	    while(broj<=(a*b)){
			for (int i = najveciRedak; i >= najmanjiRedak; i--){
				tablica[i][najveciStupac] = broj++;
				}
			if(broj>(a*b)) {
				break;
			}
			for (int i = najveciStupac-1; i >= najmanjiStupac; i--) {
				tablica[najmanjiRedak][i] = broj++;
				}
			if(broj>(a*b)) {
				break;
			}
			for (int i = najmanjiRedak+1; i <= najveciRedak; i++){
				tablica[i][najmanjiStupac] = broj++;
				}
			if(broj>(a*b)) {
				break;
			}
			for (int i = najmanjiStupac+1; i <= najveciStupac-1; i++){
				tablica[najveciRedak][i] = broj++;
				}
			if(broj>(a*b)) {
				break;
			}
			
			najmanjiStupac++;
			najmanjiRedak++;
			najveciStupac--;
			najveciRedak--;
		        }
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(tablica[i][j]+ "	");
				
			}
		System.out.println();
		}
		
	}
		
	}

