package chapter3.section4;

//	sort를 이용하려면 comparable 인터페이스를 implements 해야함
public abstract class Shape implements Comparable {
	
	public String shapeName;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}
	 
	public abstract double computeArea();
	public abstract double computePerimeter();
	
	public int compareTo(Object other) {
		double myArea=computeArea();
		double otherArea=((Shape)other).computeArea();
		if(myArea<otherArea) {
			return -1;
		}else if(myArea==otherArea) {
			return 0;	
		}else {
			return 1;
		}
		
	}
	
}
