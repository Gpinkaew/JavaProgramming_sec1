import java.util.*;
public class Example1Java {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		
		System.out.print("Input a number : ");
		int previousNumber = scan.nextInt();
		
		int currentNumber;
		
		while(true){
			System.out.print("Input a number : ");
			currentNumber = scan.nextInt();
			if(currentNumber < previousNumber) {
				System.out.println("\nBey Bey");
				break;
			}
			currentNumber =  previousNumber;
		}

	}

}
