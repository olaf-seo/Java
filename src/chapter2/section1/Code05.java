package chapter2.section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code05 {

	static Myrectangle1 [] rects= new Myrectangle1[100];
	static int n=0;
	
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(new File("data.txt"));
			while(sc.hasNext()) {
				rects[n]= new Myrectangle1();
				rects[n].lu= new Mypoint1();
				
				rects[n].lu.x=sc.nextInt();
				rects[n].lu.x=sc.nextInt();
				rects[n].width=sc.nextInt();
				rects[n].height=sc.nextInt();
				n++;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file");
			System.exit(1);
		}
		
		bubbleSort();
		
		for(int i=0; i<n; i++) {
			System.out.println(rects[i].lu.x+" "+rects[i].lu.y+" "+rects[i].width+" "+rects[i].height+" ");
		}
		
	}

	private static void bubbleSort() {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(calcArea(rects[j])>calcArea(rects[j+1])) {
					Myrectangle1 temp=rects[j];
					rects[j]=rects[j+1];
					rects[j+1]=temp;
				}
			}
		}
	}
	
	public static int calcArea(Myrectangle1 r) {
		return r.width*r.height;
	}
}
