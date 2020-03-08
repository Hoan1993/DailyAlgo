package algo0301;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code01_ArrayByDivisor {
	public static void main(String[] args) {
		int [] arr = {10,9,7,5};
		int divisor = 5;
		int [] result = solution(arr, divisor);
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+", ");
		}
	}

	private static int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<Integer>(1);
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor == 0) {
				list.add(arr[i]);
			}
		}
		
		int [] result = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			result[i] = list.get(i);
		}
		if(result.length == 0) {
			int [] result1 = {-1};
			return result1;
		}
		
		Arrays.sort(result);
		
		return result;
	}
}
