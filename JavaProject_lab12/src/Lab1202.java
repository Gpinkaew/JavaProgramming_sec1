import java.util.Scanner;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Section: ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);

	}
	public static void showListStudent(int sectionInput) throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tep = "";
		while((tep=readFile.readLine())!=null) {
			String[] data = tep.split("\t");
			double midtemScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			int sectionFile = Integer.parseInt(data[3]);
			
			if(sectionFile==sectionInput) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtemScore+"\t"+finalScore+"\t"+findResult(midtemScore,finalScore));
			}
		}
		readFile.close();

	}
	public static String findResult(double midtemscore,double finalscore) {
		double totalScore = midtemscore+finalscore;
//		if(totalScore<=40) return "Fail";
//		else return "Pass";
		return totalScore<=40?"Fail":"Pass";
	}
	public static void Header(int sec) {
		System.out.println("********************************************************");
		System.out.println("\tList of data for Section " + sec);
		System.out.println("********************************************************");
	}

}
