import java.time.LocalDate;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	// Constructor:
	public MyDate(int d, int m, int y) {
		if(d >= 1 && d <= 31) {
			this.day = d;
		} else {
			this.day = 1;
		}
		if(m >= 1 && m <= 12) {
			this.month = m;
		} else {
			this.month = 1;
		}
		if(y > 0) {
			this.year = y;
		} else {
			this.year = 2000;
		}
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day >= 1 && day <= 31)
			this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month >= 1 && month <= 12)
			this.month = month;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year > 0)
			this.year = year;
	}

	public void printDay() {
		System.out.println("Day: "+this.day);
	}
	public void printMonth() {
		System.out.println("Month: "+this.month);
	}
	public void printYear() {
		System.out.println("Year: "+this.year);
	}
	public void printDate() {
		System.out.println("Date: "+this.day+"-"+this.month+"-"+this.year);
	}
}
