package algo0304;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Code02_CalcDayOfWeek {
	public static void main(String[] args) {
		String result = solution(5, 24);
		System.out.println(result);
	
	}

	private static String solution(int month, int day) {
		String result = "";
		
		String today = "2016";
		today += month;
		today += day;
		
		DateFormat dateFormat = new SimpleDateFormat("yyyyMd");
		Date date;
		try {
			date = dateFormat.parse(today);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			
			int day_of_week_Int = cal.get(Calendar.DAY_OF_WEEK);

			switch (day_of_week_Int) {
			case 1:
				result = "SUN";
				break;
			case 2:
				result = "MON";
				break;
			case 3:
				result = "TUE";
				break;
			case 4:
				result = "WED";
				break;
			case 5:
				result = "THU";
				break;
			case 6:
				result = "FRI";
				break;
			case 7:
				result = "SAT";
				break;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
