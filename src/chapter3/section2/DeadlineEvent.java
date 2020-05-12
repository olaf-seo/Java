package chapter3.section2;

public class DeadlineEvent extends Event{
	public Mydate deadline;

	public DeadlineEvent(String title, Mydate deadline) {
		super(title);
		this.deadline = deadline;
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", "+deadline.toString();
	}
	
	
	
}
