package chapter3.section5;

public class DeadlineEvent extends Event{
	public Mydate deadline;

	public DeadlineEvent(String title, Mydate deadline) {
		super(title);
		this.deadline = deadline;
	}
	
	public boolean isRelevant(Mydate date) {
		 return (this.deadline.compareTo(date)>=0);
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", "+deadline.toString();
	}

	@Override
	public Mydate getRepresntativeDate() {
		return deadline;
	}
	
	
	
}
