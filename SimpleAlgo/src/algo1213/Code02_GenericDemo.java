package algo1213;

public class Code02_GenericDemo {

	public static void main(String[] args) {
		Code02_Person<String> p1 = new Code02_Person<String>();
		Code02_Person<Integer> p2 = new Code02_Person<Integer>();
		
		p1.setInfo("alo");
		p2.setInfo( new Integer(10));  // boxing
		int b = p2.getInfo().intValue(); // unboxing
		
		System.out.println(p1.getInfo());
		System.out.println(b);

	}

}
