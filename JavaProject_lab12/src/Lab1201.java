import java.util.Scanner;
import java.io.*;
public class Lab1201 {
 
	public static void main(String[] args)throws IOException {
        Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
        while(readFile.hasNext()) {
        	
        	String fname = readFile.next();
        	String Lname = readFile.next().substring(0,1).toUpperCase();
        	
        	readFile.next();
        	
        	String email = readFile.next().toUpperCase();
        	System.out.println(Lname+"."+fname+" "+"("+ email +")");
        }
        readFile.close();
	}
 
}