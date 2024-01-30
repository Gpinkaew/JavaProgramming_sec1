import java.util.*;
 
public class FictionDemo1 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Book title : ");
		String BookTitle = scan.nextLine();
		System.out.print("Book public Year : ");
		int BookPubYear = Integer.parseInt(scan.nextLine());
		
		
		FictionBook Book = new FictionBook(BookTitle,BookPubYear);
		System.out.print("Author name : ");
		String authorName = scan.nextLine();
		Book.setAuthorName(authorName);
		while(!Book.checkFormatName()) {
			System.out.print("again, Author name : ");
			authorName = scan.nextLine();
			
			Book.setAuthorName(authorName);
		}
		System.out.print("Author email : ");
		String authorEmail = scan.nextLine();
		
		Book.setEmail(authorEmail);
		while(!Book.checkEmail()) {
			
			
			System.out.print("again, Author email : ");
			authorEmail = scan.nextLine();
			Book.setEmail(authorEmail);
		}
		System.out.println(Book);
 
	}
 
}