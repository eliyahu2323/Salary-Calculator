package Math;

import javax.swing.JOptionPane;

public class MyGui {

	public  MyGui(){
		
	int day=Integer.parseInt(JOptionPane.showInputDialog(null,"enter number od day that you work"));
	System.out.println("the number you work is:"+day);
	for(int i=0;i<day;i++) {
		double sal=Double.parseDouble(JOptionPane.showInputDialog(null,"enter slary in day"+i));
		
	}
	
	
}
}