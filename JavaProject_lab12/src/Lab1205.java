import java.util.Scanner;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("d://txtFile//student.txt"));
		Header();
		int number = 1;
		while(scan.hasNext()) {
			String IdStudent = scan.next();
			String Mname = scan.next();
			String Fname = scan.next().substring(0,1).toUpperCase();
			String Lname = scan.next();
			double grade = scan.nextDouble();
			int num = scan.nextInt();
			System.out.println(number+".\t"+IdStudent+"\t"+Level(IdStudent)+"\t"+Fname+"."+Lname+"\t"+grade+"\t"+Status(grade));
			number++;
			
		}
		scan.close();

	}
	public static String Level(String id) {
		int year = 22-Integer.parseInt(id.substring(0, 2));
        return year+"th";
	}
	public static String Status(double grade) {
		if (grade >= 2.00) {
            return "Pass";
        } else if (grade >= 1.00) {
            return "Critical";
        } else {
            return "Retired";
        }
		
	}
	public static void Header() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("**************************************************************");
	}

}
