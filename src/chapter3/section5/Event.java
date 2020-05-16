package chapter3.section5;

public abstract class Event implements Comparable{
	public String title;

	public Event() {
		// TODO Auto-generated constructor stub
	}
	
	public Event(String title) {
		this.title = title;
	}

	public abstract boolean isRelevant(Mydate date);
	public abstract Mydate getRepresntativeDate();
	
	@Override
	public String toString() {
		return title;
	}
	
	public int compareTo(Object other) {
		Mydate myDate = getRepresntativeDate();
		Mydate otherDate = ((Event)other).getRepresntativeDate();
		return myDate.compareTo(otherDate);
	}
}
