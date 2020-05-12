package chapter1.section1;

import java.util.Scanner;

public class code14 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []d= new int[n];
		
		for(int i=0; i<n; i++) {
			d[i]=sc.nextInt();
		}

		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				if(d[j]>d[j+1]) {
					int temp=d[j];
					d[j]=d[j+1];
					d[j+1]=temp;
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(d[i]+" ");
		}

		sc.close();
	}
}
