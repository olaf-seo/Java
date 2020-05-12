package chapter2.section3;

import java.util.Scanner;

public class Code11 {
	
	private Polynomial3[] polys = new Polynomial3[100];
	private int n=0;
	
	public void processCommand() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("$ ");
			String command = sc.next();
			
			if(command.equals("create")) {
				char name=sc.next().charAt(0);
				polys[n] = new Polynomial3(name);
				n++;
				
			}else if(command.equals("add")) {
				char name=sc.next().charAt(0);
				int index= find(name);
				
				if(index==-1) {
					System.out.println("No such polynomial exists");
				}else {
					int c= sc.nextInt();
					int e= sc.nextInt();
					polys[index].addTerm(c, e);
				}
				
			}else if(command.equals("calc")) {
				char name=sc.next().charAt(0);
				int index=find(name);
				if(index==-1) {
					System.out.println("No such polynomial exists");
				}else {
					int x=sc.nextInt();
					int result = polys[index].calcPolynomial(x);
					System.out.println(result);
				}
			}else if(command.equals("print")) {
				char name=sc.next().charAt(0);
				int index=find(name);
				if(index==-1) {
					System.out.println("No such polynomial exists");
				}else {
					polys[index].printPolynomial();
				}
				
			}else if(command.equals("exit")) {
				break;
			}
			
		}
		
		sc.close();
	}

	private int find(char name) {
		for(int i=0; i<n; i++) {
			if(polys[i].getName()==name) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Code11 app = new Code11();
		app.processCommand();
	}
	
}
