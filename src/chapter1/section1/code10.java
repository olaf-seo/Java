package chapter1.section1;

public class code10 {
	public static void main(String[] args) {
		for(int n=2; n<=10000; n++) {
			boolean isPrime=true;
			
			for(int i=2; i*i<=n; i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(n);
			}
			
		}
	}
}
