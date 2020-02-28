package algo1220;

import java.util.Arrays; 
import java.util.Collections; 
import java.util.List;



public class Code02_ArrayReverse {

	public static void main(String[] args) {
		Integer[] array = new Integer[] {2,3,4,5,7,2,1,56};
		
		List<Integer> list = Arrays.asList(array); // Arrays.asList()는 배열을 list처럼 쓸 수 있는것.
		Collections.reverse(list); 					// 여기서 뒤집는다.
		array = list.toArray(new Integer[list.size()]);	// 다시 array에 넣는다.
		
		System.out.println(Arrays.toString(array));
		
		String[] array1 = new String[] {"a","b","c","d","e","f","g","h"};
		
		List<String> lists = Arrays.asList(array1); 
		Collections.reverse(lists); 
		array1 = lists.toArray(new String[lists.size()]);
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array1));
		
	}

}
