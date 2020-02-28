package algo0224;

import java.util.Comparator;


public class Code04_Fruit {
	String name;
	int quantity;
	
	public Code04_Fruit() {
		
	}
	
	public Code04_Fruit(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public static Comparator<Code04_Fruit> nameComparator = new Comparator<Code04_Fruit>() {


		public int compare(Code04_Fruit fruit1, Code04_Fruit fruit2) {
			// compareTo는 앞에 있는 것과 뒤에 있는 것을 비교한다.
			// 비교해서, 만약 앞에 있는것이 더 작다면 음수를 반환한다.
			return fruit1.name.compareTo(fruit2.name);
		}
		
	
	};
	
	public static Comparator<Code04_Fruit> quanComparator = new Comparator<Code04_Fruit>() {


		public int compare(Code04_Fruit fruit1, Code04_Fruit fruit2) {
		
			return fruit1.quantity - fruit2.quantity;
		}
		
	};
	
	
}
