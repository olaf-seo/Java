package chapter3.section2;

import java.util.Scanner;

public class Scheduler {
	
	public int limit=10;
	public Event [] events= new Event [limit];
	public int n=0;
	Scanner sc ;
	
	public void processCommand() {
		sc= new Scanner(System.in);
		while(true) {
			System.out.print("$ ");
			String command = sc.next();
			if(command.equalsIgnoreCase("addEvent")) {
				String type= sc.next();
				if(type.equalsIgnoreCase("oneday")) {
					handleAddOneDayEvent();
				}else if(type.equalsIgnoreCase("duration")) {
					handleAddDurationEvent();
				}else if(type.equalsIgnoreCase("deadline")) {
					handleAddDeadlineEvent();
				}
			}else if(command.equalsIgnoreCase("list")) {
				handleList();
			}else if(command.equalsIgnoreCase("show")) {
				
			}else if(command.equalsIgnoreCase("exit")) {
				break;
			}
		}
		sc.close();
	}
	
	private void handleList() {
		for(int i=0; i<n; i++) {
			System.out.println("   " + events[i].toString());		//dynamic binding
		}
	}

	private void handleAddDeadlineEvent() {
		System.out.print(" untill: ");
		String untill=sc.next();
		Mydate date= parseDateString(untill);
		
		System.out.print(" title: ");
		String title=sc.next();
		
		DeadlineEvent ev=new DeadlineEvent(title, date);
		
		addEvent(ev);	
	}

	private void handleAddDurationEvent() {
		System.out.print(" begin: ");
		String begin=sc.next();	// dateString = 2020/05/20
		System.out.print(" end: ");
		String end=sc.next();
		Mydate date1= parseDateString(begin);
		Mydate date2= parseDateString(end);
		
		System.out.print(" title: ");
		String title=sc.next();
		
		DurationEvent ev=new DurationEvent(title, date1, date2);
		
		addEvent(ev);		
	}

	private void handleAddOneDayEvent() {
		System.out.print(" when: ");
		String dateString=sc.next();	// dateString = 2020/05/20
		
		Mydate date= parseDateString(dateString);
		
		System.out.print(" title: ");
		String title=sc.next();
		
		OneDayEvent ev=new OneDayEvent(title, date);
		
		addEvent(ev);
	}

	private void addEvent(Event ev) {
		if(n>limit) {
			rellocate();	// 베열 재할당 
		}
		events[n++]=ev;
	}

	private void rellocate() {
		limit= limit*2;
		Event temp[]= new Event[limit];
		for(int i=0; i<n; i++) {
			temp[i]=events[i];
		}
		events=temp;
	}

	private Mydate parseDateString(String dateString) {
		String tokens[]= dateString.split("/");
		int year=Integer.parseInt(tokens[0]);
		int month=Integer.parseInt(tokens[1]);
		int day=Integer.parseInt(tokens[2]);
		
		Mydate d= new Mydate(year, month, day);
		return d;
	}

	public static void main(String[] args) {
		
		
		Scheduler app= new Scheduler();
		app.processCommand();
		
	}
}
