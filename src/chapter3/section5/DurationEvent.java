package chapter3.section5;

public class DurationEvent extends Event{
	public Mydate begin;
	public Mydate end;
	
	public DurationEvent(String title, Mydate begin, Mydate end) {
		super(title);
		this.begin = begin;
		this.end = end;
	}
	
	public boolean isRelevant(Mydate date) {
		 return (this.begin.compareTo(date)<=0 && end.compareTo(date)>=0);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + begin.toString() + " ~ " + end.toString();
	}

	@Override
	public Mydate getRepresntativeDate() {
		return begin;
	}
	
	
}
