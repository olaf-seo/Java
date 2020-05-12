package chapter3.section1;

public class NoteBook extends Computer{
	
	public double screenSize;
	public double weight;
	
	
	public NoteBook(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed, double screenSize, double weight) {
		super(manufacturer, processor, ramSize, diskSize, processorSpeed);
		this.screenSize=screenSize;
		this.weight=weight;
	}
	
	@Override
	public String toString() {
		String result = super.toString() +
						"\nscreenSize : " + screenSize +
						"\nweight : " + weight;
		return result;
	}
	
	public static void main(String[] args) {
//		다형성(Polymorphism) : 슈퍼 클래스 타입의 변수가 서브 클래스 타입의 객체를 참조할 수 있다.
		Computer test =  new NoteBook("dell", "15", 4, 1000, 3.2, 15.6, 1.2);
		System.out.println(test.toString());
	}
	
	
}
