public class PersonalInfo {
	private person name;
	private date bDay;
	private int personID;
	
	//Default Constructor
	PersonalInfo(){
		name = new person(); //firstName="",LastName=""
		bDay = new date();//dMonth = 1 dDay=1, dYear=1900
		personID = 0 ;
	}
	PersonalInfo(String first,String last, int month ,int day,int year ,int ID){
		name = new person(first,last);
		bDay = new date(month,day,year);
		personID = ID;
	}
	public void setPersonalInfo(String first,String last, int month ,int day,int year ,int ID) {
		name.setName(first, last);
		bDay.setdate(month, day, year);
		personID = ID;
	
	}
	public String toString() {
		return "Name : "+ name.toString() + "\n"+" Date of birth : "
	+bDay.toString() + "\n" + "Personal ID: "+personID;
	
	}
 
	
}