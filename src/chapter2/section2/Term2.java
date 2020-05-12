package chapter2.section2;

public class Term2 {
	public int coef;
	public int expo;
	
	
	public void printTerm() {
		if(coef==1) {
			System.out.print("x^"+expo);
		}else {
			System.out.print(coef+"x^"+expo);
		}
	}
	
	public int calcTerm(int x) {
		return (int)(coef*Math.pow(x, expo));
	}
}
