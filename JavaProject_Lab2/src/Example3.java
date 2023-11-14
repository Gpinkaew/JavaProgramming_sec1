import java.text.DecimalFormat;
import java.util.*;
import java.text.*;
public class Example3 {
	
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.0000");

		Scanner input = new Scanner(System.in);
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float priceperUnit = input.nextFloat();
		System.out.println();
		float totalPrice = productUnit * priceperUnit;
		System.out.println("Total Price is "+totalPrice + " baht.");
		double vat = totalPrice + (totalPrice*7/100);
		System.out.println("Add VAT 7% is "+frm.format(vat) + " baht.");
		
    
	}

}
