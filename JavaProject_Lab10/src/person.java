public class person {
	private String firstName;
	private String lastName;
	
	person(){
		firstName=lastName="";
	}
	person(String first,String last){
		firstName = first;
		lastName = last;
	}
	public void setName(String first,String last) {
		firstName = first;
		lastName = last;
	}
	public String getFirstName(){
		return firstName;
				
	}
	public String getLastName(){
		return lastName;
	}
	public String toString() {
		return firstName+" "+lastName;
	
	}
 
	
}