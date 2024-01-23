public class date {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	
	date(){
		dMonth = 1;
		dDay = 1;
		dYear= 1900;
	}
	date(int month, int day, int year){
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	public void setdate(int month, int day, int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	public int getMonth() {
		return dMonth;
	}
	public int getDay() {
		return dDay;
	}
	public int getYear() {
		return dYear;
	}
	public String toString () {
		return dMonth+"-"+dDay+"-"+dYear;
	}
}