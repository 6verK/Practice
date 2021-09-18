package yaaseenkhan_COMP228Sec006;

public class Singer {

	//SINGER
	private int singerId;
	private String name;
	private String address;
	private int day;
	private int month;
	private int year;
	private int numberOfAlbums;
	private String dateOfBirth;

	//no arguments
	public Singer() {
		
	}
	//1 arguments
	public Singer(int singerId) {
		this.singerId = singerId;
	}
	//2 arguments
	public Singer(int singerId , String name) {
			this.singerId = singerId;
			this.name = name;
		}
	//3 arguments
	public Singer(int singerId , String name, String address) {
		this.singerId = singerId;
		this.name = name;
		this.address = address;
	}
	//4 argument
	public Singer(int singerId , String name, String address, int day, int month, int year) {
		this.singerId = singerId;
		this.name = name;
		this.address = address;
		this.day = day;
		this.month = month;
		this.year = year; 
	}
	//5 argument
	public Singer(String name) {
		this.name = name; 
	}
	//Getter for singerId
	public int getSingerId() {
		return singerId;
	}
	//Getter for name;
	public String getName() {		
		return name;
	}	
	//Getter for address
	public String getAddress() {		
		return address;
	}
	//Getter for month
	public int getMonth(){
		return month;
	}
	//Getter for day
	public int getDay() {
		return day;
	}
	//Getter for year
	public int getYear() {
		return year;
	}
	//Getter for Date of birth
	public String getDateofBirth() {
		return (getMonth()+"/"+getDay()+"/"+getYear());
	}	
	//Getter for
	public int getnumberOfAlbums() {
		return numberOfAlbums;
	}	
	
	//Setter for singerId
	public void setSingerId(int singerId) {
		this.singerId = singerId;
	}
	//Setter for name
	public void setName(String name) {			
		this.name = name;							
	}	
	//Setter for address
	public void setAddress(String address) {		
		this.address = address;								
	}	

	//Setter for Date of Birth
	public void setDateofBirth(int month, int day, int year) {		
		if (day>0 && day<=31 && month>0 && month<13 && year>1900 && year<=2021)
		{
			this.day = day;
			this.month = month;
			this.year = year;
			
		}								
	}	
	
	//Setter for number of albums
	public void setNumberOfAlbums(int numberOfAlbums) {		
		this.numberOfAlbums = numberOfAlbums;								
	}	
	
	public void setSinger(int singerId, String name, String address, int month, int day, int year, int numberOfAlbums ) {
		
		this.singerId = singerId;
		this.name = name;
		this.address = address;	
		this.month = month;
		this.day = day;
		this.year = year;
		this.numberOfAlbums = numberOfAlbums; 
	}
		
//	@Override
//	public String toString() {
//		return String.format("\nSinger ID: %d\nName: %s\nAddress: %s\nDate Of Birth: \nNumber Of Albums: ",
//				String.valueOf(singerId), String.valueOf(name), address, dateOfBirth, String.valueOf(numberOfAlbums));
	

	


	

}// end of class
