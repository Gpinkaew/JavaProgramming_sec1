import java.util.*;
import java.io.*;
public class AddProduct {

	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner(System.in);
		
		FileWriter filename = new FileWriter("d://txtFile//product.txt",true);
		PrintWriter writeFile = new PrintWriter(filename);
		
		System.out.print("Product Id: ");
		String productId = input.next();
		System.out.print("Product Name: ");
		String productName = input.next();
		System.out.print("Product Unit: ");
		int productUnit = input.nextInt();
		System.out.print("Product Price: ");
		float produPrice = input.nextFloat();
		
		
		writeFile.println(productId+","+productName +","+productUnit+","+ produPrice);
		System.out.println("Write file already....");
		
		writeFile.close();
	}

}
