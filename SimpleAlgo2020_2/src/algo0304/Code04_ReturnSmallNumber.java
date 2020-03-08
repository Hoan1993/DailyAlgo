package algo0304;

import java.util.Arrays;

public class Code04_ReturnSmallNumber {

	public static void main(String[] args) {
		int [] arr = {4, 3, 2, 1};
		int [] result = solution(arr);

		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]+", ");
		}
		
		
	}

	private static int[] solution(int[] arr) {
		int [] result;
		if(arr.length-1 == 0) {
			result = new int[1];
			result[0] = -1;
		} else {
			int indexMin = checkMinNum(arr);
			
			result = new int[arr.length-1];
			int j = 0;
		
			for(int i=0; i<arr.length; i++) {
				if(i == indexMin) {
					continue;
				}
				
				result[j++] = arr[i];
			}
		}
		
		
		return result;
	}

	private static int checkMinNum(int[] arr) {
		int minNum = arr[0];
		int indexMin = 0;
		for(int i=0; i<arr.length; i++) {
			if(minNum > arr[i]) {
				minNum = arr[i];
				indexMin = i;
			}
		}
		
		return indexMin;
	}

}
