import javax.swing.*; 
import java.text.*;
public class Example4 {

	public static void main(String[] args) {
		String porductName = JOptionPane.showInputDialog("Input product name : ");
		/*String strUnit = JOptionPane.showInputDialog("Input porduct unit : ");
		int productUnit = Integer.parseInt(strUnit);
		String strPrice = JOptionPane.showInputDialog("Input price per unit : ");
		float pricePerUnit = Float.parseFloat(strPrice);*/
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input prduct unit : "));
		float pricePerUnit = Float.parseFloat(JOptionPane.showInputDialog("Input price per unit : "));
		float totalprice = productUnit * pricePerUnit;
		
		/*JOptionPane.showMessageDialog(null,"total Price is "
				+totalprice );*/
		
		double vat = totalprice + (totalprice*7/100);
		JOptionPane.showMessageDialog(null, "total price is"+frm.format(totalprice)+"baht"+"\nAdd Vat 7% is" + frm.format(vat)+"baht");
		//double vat = totalprice + (totalprice*7/100);
		//System.out.println("Add VAT 7% is "+frm.format(vat) + " baht.");
	}

}
