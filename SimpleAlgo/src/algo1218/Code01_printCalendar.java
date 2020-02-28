package algo1218;

import java.util.Scanner;

public class Code01_printCalendar {
	Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {

		Code01_printCalendar app = new Code01_printCalendar();
		app.start();
	
	}

	private void start() {
		while(true) {
			System.out.print("$ ");
			String command = kb.next();
			if(command.equalsIgnoreCase("day")) {
				handleDay();
			} else if(command.equalsIgnoreCase("printCal")) {
				handlePrint();
			} else if(command.equalsIgnoreCase("exit")) {
				kb.close();
				break;
			} else {
				continue;
			}	
		}
	}

	private void handlePrint() {
		int year = kb.nextInt();
		int month = kb.nextInt();
		
		int sum = calcDays(year, month);
		
		int total = sum+1;  // 모든 날
		int start = calcDay(total);   // 무슨 요일인지.
		int end = dates(year, month);					// 그 달이 몇 일까지 있는지. 
		
		printCal(start, end);
		
	}

	private void printCal(int start, int end) {
		System.out.print("  일    월    화    수    목   금   토");
		System.out.println();
		int count = 1;
		//for(int i=0; i<1; i++) {
			for(int j=0; j<start; j++) {
				System.out.print("   ");
			}
			
			for(int j=count; j<=7-start; j++) {
				
				System.out.printf("%2d ", count);
				count++;
			}
		
		//}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {

				System.out.printf("%2d ", count);
				count++;
				if (count == (end + 1))
					break;
			}
			System.out.println();
			if (count == (end + 1))
				break;

			//System.out.println();
		}

	}
	private void handleDay() {
		int start = 0;
		//int yearStart = 1;
		
		int sum = 0;
		int total = 0;
		
		/*
		 * int year = 2019; int month = 12; int day = 26;
		 */

		//Scanner kb = new Scanner(System.in);
		int year = kb.nextInt();
		int month = kb.nextInt();
		int day = kb.nextInt();
		
		sum = calcDays(year, month);
		// 여기서 2018년까지의 날이 모두 계산된다.
		

		total = sum + day + start;

		System.out.println(isDay(calcDay(total)));

		//kb.close();	
	}
	private int calcDays(int year, int month) {
		int sum = 0;
		int yearStart = 1;
		
		for (int i = yearStart; i < year; i++) {
			for (int j = 1; j < 13; j++) {
				sum += dates(i, j); //
			}
		}

		// 2019년 11월까지의 모든 날이 계산된다.
		for (int j = 1; j < month; j++) {
			sum += dates(year, j);

		}
		
		return sum;
	}
	private static int dates(int i, int j) {
		int temp = 0;
		if (!isLeapYear(i)) { // 평년일 떄
			switch (j) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				temp = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				temp = 30;
				break;
			case 2:
				temp = 28;
				break;
			}
		} else {
			switch (j) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				temp = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				temp = 30;
				break;
			case 2:
				temp = 29;
				break;
			}
		}

		return temp;
	}

	private static boolean isLeapYear(int i) {
		boolean isLeap = false;
		
		if(((i%4 == 0) && (i%100 != 0)) || (i%400 == 0)) {
			isLeap = true;  // 윤년임
			
		}
		return isLeap;  // 평년임.
	}

	private static String isDay(int Day) {
		String temp = null;
		switch(Day) {
		case 0 :
			temp = "일요일";
			break;
		case 1 :
			temp = "월요일";
			break;
		case 2 :
			temp = "화요일";
			break;
		case 3 :
			temp = "수요일";
			break;
		case 4 :
			temp = "목요일";
			break;
		case 5 :
			temp = "금요일";
			break;
		case 6 :
			temp = "토요일";
			break;			
		}
		
		return temp;
	}

	private static int calcDay(int total) {
		return (total%7);
		
	}
}