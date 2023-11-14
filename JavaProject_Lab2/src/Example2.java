import java.text.*; //1. import for format number
public class Example2 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final double BUFFET = 299;
		int numberofCustomer = 5;
		double netPrice = BUFFET * numberofCustomer;
		
		System.out.println("Buffet of "+numberofCustomer
				+" Customer is "+ frm.format(netPrice));
		double serviceCharge = netPrice + (netPrice*3/100);
		System.out.println("Add Service Charge 3% is "
				+ frm.format(serviceCharge));
	}

}
