package chapter2.section3;

public class Term3 {
	private int coef;
	private int expo;
	
	public Term3() {
		// TODO Auto-generated constructor stub
	}
	
	public Term3(int coef, int expo) {
		this.coef = coef;
		this.expo = expo;
	}
	
	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}

	public int getExpo() {
		return expo;
	}

	public void setExpo(int expo) {
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
