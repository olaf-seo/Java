package chapter3.section4;

import java.util.Arrays;
import java.util.Scanner;

public class ShapeApplication {
	private int limit=10;
	private Shape[] shapes = new Shape[limit];
	private int n=0;
	private Scanner sc= new Scanner(System.in);
	
	public void processCommand() {
		while(true) {
			System.out.print("$ ");
			String command=sc.next();
			if(command.equals("add")) {
				handleAdd();
			}else if(command.equals("show") || command.equals("showDetail")) {
				handleShow(command.equals("showDetail"));
			}else if(command.equals("sort")) {
//				아무 데이터나 sort하지 않음 comparable 인터페이스 implements하여 compareTo 메소드 만들어야함(규칙 만들기)	Generic method
				Arrays.sort(shapes, 0 , n);
			}else if(command.equals("exit")) {
				break;
			}
		}
		sc.close();
	}
	

//	private void bubbleSort() {
//		for(int i=n-1; i>0; i--) {
//			for(int j=0; j<i; j++) {
//				if(shapes[j].computeArea()>shapes[j+1].computeArea()) {
//					Shape temp= shapes[i];
//					shapes[j]=shapes[j+1];
//					shapes[j+1]=temp;
//				}
//			}
//		}
//	}
	
	

	private void handleShow(boolean detail) {
		for(int i=0; i<n; i++) {
			System.out.println( (i+1) +"." +shapes[i].toString());
			if(detail) {
				System.out.println( "     The area is "+shapes[i].computeArea());
				System.out.println( "     The perimeter is "+shapes[i].computePerimeter());
			}
		}
	}

	private void handleAdd() {
		String type=sc.next();
		switch (type) {
		case "R":
			addShape(new Rectangle(sc.nextInt(), sc.nextInt()));
			break;
		case "C":
			addShape(new Circle(sc.nextInt()));
			break;
		case "T":
			
			break;
		}
	}

	private void addShape(Shape shape) {
		shapes[n++]=shape;
	}
	
	public static void main(String[] args) {
		ShapeApplication app= new ShapeApplication();
		app.processCommand();
	}

}
