import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence,again: ");
			sentence = scan.nextLine();
		}
		System.out.println();
		
		int spaceber = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceber +=1;
			}
		}
		System.out.print("This sentence has "+ spaceber + " spaceber.");
		System.out.print("\nThis sentence has "+ (spaceber+1) + " word.");

	}

}
