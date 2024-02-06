import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tep="";
		
		int countBook=0,i=1;
		while((tep=readFile.readLine()) !=null) {
		String[] data = tep.split("\t");
		System.out.println(data[0]+" ("+ data[1]+"), reting "+data[2]+" publish on "+ data[5]);
		countBook++;
		i++;
		}
		
		System.out.println("==========================================================================");
		System.out.println("Total book ="+countBook);
		
		readFile.close();

	}

}
