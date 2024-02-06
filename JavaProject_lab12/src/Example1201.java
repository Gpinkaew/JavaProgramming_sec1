import java.util.Scanner;
import java.io.*;
public class Example1201 {

	public static void main(String[] args)throws IOException {
		//Using Scanner Class read data from file
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
		while(readFile.hasNext()) {
			String fname = readFile.next();
			
			readFile.next();
			readFile.next();
			String email = readFile.next().toLowerCase();
			System.out.println(fname+" "+ "("+email+")");
		}
		readFile.close();

	}

}
