package chapter3.section2;

public class Mydate {
	public int year;
	public int month;
	public int day;
	
	public Mydate() {
		// TODO Auto-generated constructor stub
	}
	
	public Mydate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public String toString() {
		return year + " / " + month + " / " + day;
	}
	
}
