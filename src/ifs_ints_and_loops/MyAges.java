package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class MyAges {
	public static void main(String[] args) {
	for(int i=2007; i<2019; i++) {
		System.out.println(i);
		int Age=i-2007;
		JOptionPane.showMessageDialog(null, " In " + i + " , I was " + Age + " Years Old ");
		
	}


}
}
