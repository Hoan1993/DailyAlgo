package algo1216;

import java.util.Arrays;
import java.util.Scanner;

public class Code03_Scheduler {

	static int capacity = 100;
	static Code03_Event [] events = new Code03_Event[capacity];
	static Scanner kb = new Scanner(System.in);
	static int n = 0; // events의 개수

	private void CommandProcessor() {

		while (true) {
			System.out.print("$ ");
			String command = kb.next();
			if (command.equals("addevent")) {
				String evc = kb.next();
				if (evc.equals("oneday")) {
					handleAdd();
				} else if (evc.equals("duration")) {
					handleDura();
				} else if (evc.equals("deadline")) {
					handleDeadl();
				} else {
					continue;
				}

			} else if (command.equals("show")) {
				handleShow();
			} else if (command.equals("list")) {
				handleList();
			} else if (command.equals("sort")) {
				handleSort();
			} else if (command.equals("exit")) {
				break;
			} else {
				continue;
			}
		}

	}
	
	private void handleSort() {
		Arrays.sort(events, 0, n);
		
	}


	private void handleList() {
		for(int i=0; i<n; i++) {
			System.out.println(events[i].toString());
		}
		
	}


	private void handleShow() {
		String dateString = kb.next();
		Code03_MyDate theDate = parseDateString(dateString); 
		
		for(int i=0; i<n; i++) {
			if(events[i].isRelevant(theDate)) {
				System.out.println(events[i].toString());
			}
		}
		
	}


	private Code03_MyDate parseDateString(String dateString) {
		String [] tokens =dateString.split("/");
		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		
		Code03_MyDate date = new Code03_MyDate(year, month, day);
		
		
		return date;
	}


	private void handleDeadl() {
		System.out.print("title : ");
		String ti = kb.next();
		System.out.print("Deadline : ");
		String d = kb.next();
		
		Code03_MyDate date = parseDateString(d);
		Code03_DeadLinedEvent dl = new Code03_DeadLinedEvent(ti, date);
		addWord(dl);
		
	}


	private void handleDura() {
		System.out.print("title : ");
		String ti = kb.next();
		System.out.print("begin : ");
		String begin = kb.next();
		System.out.print("end : ");
		String end = kb.next();
		
		Code03_MyDate date1 = parseDateString(begin);
		Code03_MyDate date2 = parseDateString(end);
		Code03_DurationEvent du = new Code03_DurationEvent(ti, date1, date2);
		addWord(du);
		
	}


	private void handleAdd() {
		System.out.print("title : ");
		String ti = kb.next();
		System.out.print("Date : ");
		String d = kb.next();
		
		Code03_MyDate date = parseDateString(d);
		Code03_OnedayEvent oe = new Code03_OnedayEvent(ti, date);
		addWord(oe);
	}


	private void addWord(Code03_Event ev) {
		if(n >= capacity) {
			reallocate();
		}
		events[n++] = ev;
		
		
	}


	private void reallocate() {
		Code03_Event [] temp = new Code03_Event[capacity*2];
		for(int i=0; i<n; i++) {
			temp[i] = events[i];
		}
		
		events = temp;
		
	}


	public static void main(String[] args) {
		Code03_Scheduler app = new Code03_Scheduler();
		app.CommandProcessor();
		

	}

}
