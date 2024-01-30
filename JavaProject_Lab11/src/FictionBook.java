import java.time.*;
public class FictionBook implements Book,Author {

	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	private String firstName;
	private String lastName;
	private int name;
	
	FictionBook (String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) {
		author_name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		name = author_name.indexOf(" ");
		firstName = author_name.substring(0,name);
		lastName = author_name.substring(name,author_name.length()-1);
		if(author_name.trim().indexOf(" ")!=-1) {
			return true;
		}
		else {
		return false; 
		}
	}
	@Override
	public String getLastName() {
		int space = this.author_name.trim().indexOf(" ");
		return this.author_name.substring(space+1).toUpperCase();
	}
	@Override
	public String getFirstName() {
		int space = this.author_name.trim().indexOf(" ");
		return this.author_name.substring(0,space).toUpperCase();
	}
	@Override
	public boolean checkEmail() {
		this.email = this.email.toLowerCase();
		if(email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com")) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String getTitle() {
		return this.title;
	}
	public int totalPublicYear() {
		
		int year = Year.now().getValue(); 
		return year-this.publicYear;
		
	}
	@Override
	public int getPublicYear () {
		return publicYear;
	}
	public String toString() {
		return title +  " write by " + lastName.toUpperCase().substring(name,name+1) + "." + firstName.toUpperCase() 
		+ "(" + this.email + ") Publicshed for " + this.publicYear + "years." ;
	}

}
