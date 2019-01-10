package edunova;

import javax.swing.JOptionPane;

public class StartTrokut {
	
	//za upisane tri stranice trokuta ispišite opseg
	
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("b"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("c"));
		
		Trokut t = new Trokut(a,b,c);
		
		System.out.println(t.getOpseg());
		System.out.println(t.getPovrsina());
		
	}

}
