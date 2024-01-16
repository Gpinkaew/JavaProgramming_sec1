import java.util.*;
public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input book title : ");
		String title = scan.nextLine();
		System.out.print("Input book price : ");
		float price = scan.nextFloat();
		System.out.print("Input publish year : ");
		int publishyear = scan.nextInt();
		
		b1.setTitle(title);
		b1.setPrice(price);
		b1.setPublishyear(publishyear);
		
		
		System.out.print(b1);
	}

}
