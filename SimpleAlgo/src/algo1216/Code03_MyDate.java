package algo1216;

public class Code03_MyDate {

	int year;
	int month;
	int day;
	
	public Code03_MyDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	
	public int compareTo(Code03_MyDate other) {
		
		if(year  < other.year || year == other.year && month < other.month || year == other.year && month == other.month && day < other.day) {
			return -1;
		} else if(year  > other.year || year == other.year && month > other.month || year == other.year && month == other.month && day > other.day) {
			return 1;
		} else {
		return 0;
		}
	
	}
	public String toString() {
		return year+"/"+month+"/"+day;
	}
	
	
}
