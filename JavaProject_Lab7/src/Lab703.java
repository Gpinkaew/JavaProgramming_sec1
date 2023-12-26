import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nums[] = {78,36,58,41,25,92,75};
		int inputnumber;
		
		
		
		System.out.print("Input index of array : ");
		inputnumber = scan.nextInt();
		
		while(inputnumber<0||inputnumber>=nums.length) {
			
			System.out.print("Input index of array, again : ");
			inputnumber = scan.nextInt();
		}
		
		
		
		System.out.println();
		System.out.println("Value in current index is "+nums[inputnumber]);
		
		
		if(inputnumber==(nums.length-1)) {
			
			System.out.println("Sorry, "+inputnumber+" is the last index in array.");
		}
		
		else System.out.println("Value in next index is "+nums[inputnumber+1]);

	}

}
