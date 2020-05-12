package chapter3.section2;

public class OneDayEvent extends Event{
	public Mydate date;

	public OneDayEvent(String title, Mydate date) {
		super(title);
		this.date = date;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " +date.toString();
	}
	
	
}
