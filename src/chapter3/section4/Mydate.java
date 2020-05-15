package chapter3.section4;

public class Mydate {
	public int year;
	public int month;
	public int day;
	
	public Mydate() {
		// TODO Auto-generated constructor stub
	}
	
	public int compareTo(Mydate other) {
		if( year < other.year || year == other.year && month < other.month || year == other.year && month == other.month && day<other.day) {
			return -1;
		}else if( year > other.year || year == other.year && month > other.month || year == other.year && month == other.month && day>other.day) {
			return 1;
		}else {
			return 0;
		}
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
