package chapter1.section1;

import java.util.Scanner;

public class code11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []d= new int[n];
		
		for(int i=0; i<n; i++) {
			d[i]=sc.nextInt();
		}
		sc.close();
		
		int count=0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(d[i]==d[j]) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		
	}
}
