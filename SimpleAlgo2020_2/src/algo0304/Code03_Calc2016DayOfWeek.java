package algo0304;

public class Code03_Calc2016DayOfWeek {
	public static void main(String[] args) {
		String str =solution(5, 24);
		
		System.out.println(str);
	}

	private static String solution(int month, int day) {
		String dayOfWeek = "";
		int sum = calcDays(month, day);
		dayOfWeek = returnDayOfWeek(DivBy7(sum));
		
		return dayOfWeek;
	}

	private static String returnDayOfWeek(int divBy7) {
		String answer = "";
		switch(divBy7) {
		case 1:
			answer = "FRI";
			break;
		case 2:
			answer = "SAT";
			break;
		case 3:
			answer = "SUN";
			break;
		case 4:
			answer = "MON";
			break;
		case 5:
			answer = "TUE";
			break;
		case 6:
			answer = "WED";
			break;
		case 0:
			answer = "THU";
			break;	
			
		}
		
		return answer;
	}

	private static int DivBy7(int sum) {
		return sum%7;
	}

	private static int calcDays(int month, int day) {
		int sum = 0;
		for(int i=1; i<month; i++) {
			sum += sumDays(i);
		}
		sum += day;
		
		return sum;
	}

	private static int sumDays(int i) {
		int days = 0;
		
		switch(i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: days = 31; break;
			case 4:
			case 6:
			case 9:
			case 11: days = 30; break;
			case 2: days = 29;
		}
		return days;
	}
}
