package algo1216;

public class Code03_OnedayEvent extends Code03_Event {
	
	public Code03_MyDate date;
	
	public Code03_OnedayEvent(String title, Code03_MyDate date) {
		super(title);
		this.date = date;
	}

	@Override
	public boolean isRelevant(Code03_MyDate date) {
		// TODO Auto-generated method stub
		return this.date.compareTo(date) == 0;
	}

	@Override
	public Code03_MyDate getRepresentativeDate() {
		// TODO Auto-generated method stub
		return date;
	}
	
	public String toString() {
		return title+" , "+this.date;
	}
	
	
	
}
