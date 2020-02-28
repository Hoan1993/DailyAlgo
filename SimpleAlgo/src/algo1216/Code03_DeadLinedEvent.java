package algo1216;

public class Code03_DeadLinedEvent extends Code03_Event{

	public Code03_MyDate deadline;
	
	public Code03_DeadLinedEvent(String title, Code03_MyDate d) {
		super(title);
		deadline = d;
	}
	
	@Override
	public boolean isRelevant(Code03_MyDate date) {
		// TODO Auto-generated method stub
		return deadline.compareTo(date) >= 0;
	}

	@Override
	public Code03_MyDate getRepresentativeDate() {
		// TODO Auto-generated method stub
		return deadline;
	}
	
	public String toString() {
		return title+" : "+deadline;
	}

}
