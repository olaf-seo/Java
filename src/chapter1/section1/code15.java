package chapter1.section1;

import java.util.Scanner;

public class code15 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []d= new int[n];
		
		for(int i=0; i<n; i++) {
			int temp=sc.nextInt();
			int j=i-1;
			while(j>=0 && d[j]>temp) {
				d[j+1]=d[j];
				j--;
			}
			d[j+1]=temp;
			
			for(int k=0; k<=i; k++) {
				System.out.print(d[k] +" ");
			}
			
		}
		sc.close();
	}
}
