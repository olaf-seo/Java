package chapter2.section2;

public class Myrectangle2 {
	public Mypoint2 lu;
//	public Mypoint2 rl;
	
	public int width;
	public int height;
	/*
	public Myrectangle2(int x, int y, int width, int height) {
		lu= new Mypoint2(x, y);
		rl = new Mypoint2(x+width, y+height);
	}

	public int calcArea() {
		return rl.x-lu.x*rl.y-lu.y;
	}
	
	@Override
	public String toString() {
		return "( "+lu.x+" "+lu.y+" ) "+(rl.x-lu.x)+" "+(rl.y-lu.y)+" ";
	}
	*/
	
	public Myrectangle2(int x, int y, int width, int height) {
		lu= new Mypoint2(x, y);
//		lu.x=x;
//		lu.y=y;
		this.width = width;
		this.height = height;
	}

	public Myrectangle2(Mypoint2 p, int width, int height) {
		this.lu = p;
		this.width = width;
		this.height = height;
	}
	
	public int calcArea() {
		return width*height;
	}
	
	@Override
	public String toString() {
		return "( "+lu.x+" "+lu.y+" ) "+width+" "+height+" ";
	}
	
	
	
	
}
