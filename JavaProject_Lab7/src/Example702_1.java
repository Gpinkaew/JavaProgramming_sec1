import javax.swing.*;
public class Example702_1 {
	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	
	static double itemPrice = 0.0; //get price
	static boolean validItem = false; //check found or not

	public static void main(String[] args) {
		inputItem();
		
	}
	
	
	public static void inputItem() {
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("" + "enter item number order"));
		
		if(checkItem(itemOrder)) {
			System.out.print("Item " + itemOrder+" is " +itemOrder);
		}
		else {
			System.out.print("Invalid Item");
		}
	}

	
	public static boolean checkItem(int item) {
		for (int i=0;i<validValues.length;i++) {
			if(item == validValues[i]) {
				validItem = true;
				itemPrice = price[i];
		
		
	}
			

    }
		return validItem;
 }
}