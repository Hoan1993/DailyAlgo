package algo1219;

public class Code01_Circle extends Code01_Shape {
	public double radius;
	
	public Code01_Circle(String title, double r) {
		super(title);
		radius = r;
	}

	@Override
	public double calcParameter() {
		
		return 2.0*(Math.PI)*radius;
	}

	@Override
	public double calcArea() {
		return (Math.PI)*radius*radius;
	}
	
	public String toString() {
		return "Radius is "+radius;
	}

}
