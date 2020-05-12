package chapter2.section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code09 {

	static Myrectangle2 [] rects= new Myrectangle2[100];
	static int n=0;
	
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(new File("data.txt"));
			while(sc.hasNext()) {
				rects[n++]= new Myrectangle2(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file");
			System.exit(1);
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(rects[i].toString());
		}
		
		bubbleSort();
		
		for(int i=0; i<n; i++) {
			System.out.println(rects[i].toString());
		}
		
	}

	private static void bubbleSort() {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(rects[j].calcArea()>rects[j+1].calcArea()) {
					Myrectangle2 temp=rects[j];
					rects[j]=rects[j+1];
					rects[j+1]=temp;
				}
			}
		}
	}
	
	
}
