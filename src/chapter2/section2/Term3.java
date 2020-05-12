package chapter2.section2;

public class Term3 {
	public int coef;
	public int expo;
	
	public Term3() {
		// TODO Auto-generated constructor stub
	}
	
	public Term3(int coef, int expo) {
		this.coef = coef;
		this.expo = expo;
	}

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
