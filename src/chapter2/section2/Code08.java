package chapter2.section2;

import java.util.Scanner;

public class Code08 {
	
	static Polynomial3[] polys = new Polynomial3[100];
	static int n=0;
	
	public static void main(String[] args) {
		
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


	private static int find(char name) {
		for(int i=0; i<n; i++) {
			if(polys[i].name==name) {
				return i;
			}
		}
		return -1;
	}
}
