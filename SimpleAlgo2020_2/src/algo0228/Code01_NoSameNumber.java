package algo0228;

import java.util.ArrayList;
import java.util.List;

public class Code01_NoSameNumber {
	public static void main(String[] args) {
		int [] array = {1,1,3,3,0,1};
		
		int [] result = solution(array);
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+", ");
		}
	}

	private static int[] solution(int[] array) {
	
		
		List<Integer> list = new ArrayList<Integer>(1);
		
		for(int i=0; i<array.length; i++) {
			if(i==0 || array[i] != array[i-1]) {
				list.add(array[i]);
			}
		}
		
		int [] result = new int[list.size()];
		for(int j=0; j<result.length; j++) {
			result[j] = list.get(j);
		}
		
		return result;
	}
	
}
