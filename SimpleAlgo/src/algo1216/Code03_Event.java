package algo1216;



public abstract class Code03_Event implements Comparable<Object> {
	public String title;
	
	public Code03_Event(String title) {
		this.title = title;
	}
	
	public abstract boolean isRelevant(Code03_MyDate date);
	public abstract Code03_MyDate getRepresentativeDate();
	
	public int compareTo(Object other) {
		Code03_MyDate mine = getRepresentativeDate();
		Code03_MyDate yours = ((Code03_Event)other).getRepresentativeDate();  // Object 타입을
		return mine.compareTo(yours);
	}
}
