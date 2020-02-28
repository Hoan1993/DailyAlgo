package algo1219;

public class Code01_Rectangle extends Code01_Shape {

	public int width;
	public int height;
	
	public Code01_Rectangle(String title, int w, int h) {
		super(title);
		width = w;
		height = h;
	}

	@Override
	public double calcParameter() {
		// TODO Auto-generated method stub
		return 2.0*(width+height);
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return (double)(width*height);
	}
	
	public String toString() {
		return "Width is "+width+" height is "+height;
	}

}
