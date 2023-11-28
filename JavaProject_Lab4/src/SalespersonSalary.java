import java.util.Scanner;
public class SalespersonSalary {

	public static void main(String[] args) {
		 
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1;
		 final int S_salary = 1000;
		 
		 
		 int sales;
		 double salary = 0;
		 
		 Scanner scan = new Scanner(System.in);
		 
		 while(true) {
			 System.out.print("Enter sales in dollars (or -1 to end): ");
			 sales = scan.nextInt();
			 if(sales == SENTINEL) 
			 {
				 System.out.print("bye");
				 break;
			 }
			 	salary = S_salary + sales * COMMISSION_RATE;
		 		System.out.printf("Salary is: $%.2f", salary);
		 }

	}

}
