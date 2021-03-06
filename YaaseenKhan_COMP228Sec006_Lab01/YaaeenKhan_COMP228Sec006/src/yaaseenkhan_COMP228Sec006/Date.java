package yaaseenkhan_COMP228Sec006;

public class Date {
		
	private int month;
	private int day;
	private int year;
	
	public Date() 
		{
			day = 00;
			month = 00;
			year = 0000;			
		}

	public Date(int month, int day, int year) {
		
	if (day>0 && day<=31 && month>0 && month<13 && year>1900 && year<=2021)
		{
			this.day = day;
			this.month = month;
			this.year = year;
		}
		
	}
	public int getMonth(){
		return month;
	}
	
	public int getDay() {
		return day;
	}
		
	public int getYear() {
		return year;
	}
	
	//setting date
	public void setMonth(int month)	
		{
			this.month = month;
		}
	
	
	
	public void setDay(int day) 
		{	
			this.day = day;		
		}
	
	public void setYear(int year) 
		{
			this.year = year;			
		}
	
	
	public void displayDate() {
		System.out.println(getMonth()+"/"+getDay()+"/"+getYear());
	}
	
}//class end