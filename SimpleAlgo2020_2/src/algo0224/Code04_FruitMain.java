package algo0224;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Code04_FruitMain {
	public static void main(String[] args) {
		Code04_Fruit [] fruits = new Code04_Fruit[3];
		fruits[0] = new Code04_Fruit("apple", 150);
		fruits[1] = new Code04_Fruit("mangon", 50);
		fruits[2] = new Code04_Fruit("banana", 200);
		
		Arrays.sort(fruits);
		
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i].name+" "+fruits[i].quantity);
		}
		
		
		
	}
}
