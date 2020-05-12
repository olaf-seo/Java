package chapter1.section1;

import java.util.Scanner;

public class code9 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []d= new int[n];
		
		for(int i=0; i<n; i++) {
			d[i]=sc.nextInt();
		}
		sc.close();
		
		int temp=d[n-1];
		
		for(int i=n-2; i>=0; i--) {
			d[i+1]=d[i];
		}
		d[0]=temp;
		
		System.out.println();
		for(int i=0; i<n; i++) {
			System.out.print(d[i] + " ");
		}
		
	}
}
