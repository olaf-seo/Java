package chapter2.section2;

import java.io.File;
import java.util.Scanner;

public class Code10 {
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(new File("data.txt"));
			int n= sc.nextInt();
			OrthoPolygon thePolygon= new OrthoPolygon(n);
			for(int i=0; i<n; i++) {
				thePolygon.addVertex(sc.nextInt(), sc.nextInt());
			}
			Mypoint2 thePoint = new Mypoint2(sc.nextInt(), sc.nextInt());
			sc.close();
			
			if(thePolygon.contains(thePoint)) {
				System.out.println("yes");
			}else {
				System.out.println("No");
			}
		} catch (Exception e) {
			System.out.println("No data file exists");
			System.exit(1);
		}
	}
}
