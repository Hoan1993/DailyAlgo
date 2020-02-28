package algo1216;

public class Code03_DurationEvent extends Code03_Event {

	public Code03_MyDate begin;
	public Code03_MyDate end;
	
	public Code03_DurationEvent(String title, Code03_MyDate b, Code03_MyDate e) {
		super(title);
		begin = b;
		end = e;
	}
	
	@Override
	public boolean isRelevant(Code03_MyDate date) {
		// TODO Auto-generated method stub
		return begin.compareTo(date) <= 0 && end.compareTo(date) >= 0;
	}

	@Override
	public Code03_MyDate getRepresentativeDate() {
		// TODO Auto-generated method stub
		return begin;
	}
	
	public String toString() {
		return title+": "+begin+"~"+end;
	}

}
