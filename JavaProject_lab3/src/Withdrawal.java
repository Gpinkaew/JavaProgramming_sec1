import javax.swing.*;

import java.text.DecimalFormat;
import java.util.*;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int withdrawalMoney = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+ frm.format(balance)+"\nInput money to withdrawal"));
		int withdrawal = 0;
		
		if (withdrawal > 20000) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdrawal more than 20,000" , "ERROR", JOptionPane.ERROR_MESSAGE);
			
		}
		else if (withdrawal > balance) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdrawal more than balance" , "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else if (withdrawal % 100!= 0) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdrawal  "+withdrawal%100 , "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		int num1000 = withdrawalMoney / 1000;
        int num500 = (withdrawalMoney %1000 )/ 500;
        int num100 = (withdrawalMoney %500) /100 ;
		JOptionPane.showMessageDialog(null, "You withdrawal ");

	}

}
