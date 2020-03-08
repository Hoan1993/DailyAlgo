package algo0306;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code00_Test {
	public static void main(String[] args) {
		long n = 1234;
		String strNum = Long.toString(n);
		
		List<Integer> list = new ArrayList<Integer>();
	
		for(int i=0; i<strNum.length(); i++) {
			list.add(Character.getNumericValue(strNum.charAt(i)));
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)+", ");
		}
		int [] result = new int[list.size()];
		
		Collections.reverse(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)+", ");
		}
		
		for(int i=0; i<list.size(); i++) {
			result[i] = list.get(i);
		}
		
		
		
		
		
	}
}
