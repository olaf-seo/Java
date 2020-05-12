package chapter3.section2;

public class DurationEvent extends Event{
	public Mydate begin;
	public Mydate end;
	
	public DurationEvent(String title, Mydate begin, Mydate end) {
		super(title);
		this.begin = begin;
		this.end = end;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + begin.toString() + " ~ " + end.toString();
	}
	
	
}
