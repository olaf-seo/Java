package chapter3.section5;

public class OneDayEvent extends Event{
	public Mydate date;

	public OneDayEvent(String title, Mydate date) {
		super(title);
		this.date = date;
	}
	
	public boolean isRelevant(Mydate date) {
		 return (this.date.compareTo(date)==0);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " +date.toString();
	}

	@Override
	public Mydate getRepresntativeDate() {
		return date;
	}
	
	
}
