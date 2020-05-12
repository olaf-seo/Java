package chapter1.section1;

import java.util.Scanner;

//	dp1912

public class code12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []d= new int[n];
		
		for(int i=0; i<n; i++) {
			d[i]=sc.nextInt();
		}
		sc.close();
		
		int max=0; 
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				int sum=0;
				for(int k=i; k<=j; k++) {
					sum+=d[k];
				}
				if(sum>max) {
					max=sum;
				}
			}
		}
		
		System.out.println(max);
		
	}
}
