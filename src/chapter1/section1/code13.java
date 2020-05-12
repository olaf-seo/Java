package chapter1.section1;

import java.util.Scanner;

public class code13 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []d= new int[n];
		
		for(int i=0; i<n; i++) {
			d[i]=sc.nextInt();
		}
		sc.close();
	
		int max=-1;
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				int val=0;
				for(int k=i; k<=j; k++) {
					val=10*val+d[k];
				}
			
				boolean isPrime=true;
				for(int k=2; k*k<=val && isPrime; k++) {
					if(val%k==0) {
						isPrime=false;
					}
				}
				if(isPrime && val>1 && val>max) {
					max=val;
				}
			}
		}
		
		if(max==-1) {
			System.out.println("not found Prime");
		}else {
			System.out.println(max);
		}
		
	}
}
