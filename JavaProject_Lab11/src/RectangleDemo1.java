import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
	/*	double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input Width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input Length"));
		String colorInput = JOptionPane.showInputDialog("Input Color");
		
		//send 3-arguments to Constructor
		Rectangle obj1 = new Rectangle(widthInput,lengthInput,colorInput);
		
		//show the width length and color
		JOptionPane.showMessageDialog(null, obj1 + "\nArea of Rectangle = " + obj1.getArea()); //obj1.toString
	} */
		
		//Input data using interface class
		double widthInput = Double.parseDouble(
				JOptionPane.showInputDialog("Input Width"));
		double lengthInput = Double.parseDouble(
				JOptionPane.showInputDialog("Input Length"));
		
		Rectangle2 obj2 = new Rectangle2(widthInput,lengthInput);
		JOptionPane.showMessageDialog(null, obj2 + "\nArea of Rectangle = " + obj2.getArea());
	}
}
