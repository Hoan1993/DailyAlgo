package algo1219;

public abstract class Code01_Shape implements Comparable<Object> {
	public String title;
	
	public Code01_Shape(String title)
	{
		this.title = title;
	}
	
	public abstract double calcParameter();
	public abstract double calcArea();
	
	@Override
	public int compareTo(Object o) {
		double myarea = calcArea();
		double yourarea = ((Code01_Shape)o).calcArea();
		
		if(myarea < yourarea) {
			return -1;
		} else if (myarea == yourarea) {
			return 0;
		} else {
			return 1;
		}
	
	}
	
}
