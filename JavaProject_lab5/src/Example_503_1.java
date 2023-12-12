import javax.swing.*;

import javax.swing.JOptionPane;
public class Example_503_1 {

	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Input a sentence : ");
		while(!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence : ");
		}
		int spaceber = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceber +=1;
			}
		}
		JOptionPane.showMessageDialog(null, "This sentence has "+ spaceber + " spaceber." + "\nThis sentence has "
		+ (spaceber+1) + " word."+JOptionPane.WARNING_MESSAGE);
		

	}

}
