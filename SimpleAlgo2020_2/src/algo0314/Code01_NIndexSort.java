package algo0314;

import java.util.Arrays;

public class Code01_NIndexSort {
	public static void main(String[] args) {
		String [] array = {"bca", "aac", "cba"};
		int index = 1;
		String [] result = solution(array, index);
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+", ");
		}
		
	}

	private static String[] solution(String[] array, int n) {
		char [] temp = new char[array.length];
		
		Arrays.sort(array);
		
		for(int i=0; i<temp.length; i++) {
			temp[i] = array[i].charAt(n);
		}
		
		for(int i=0; i<temp.length-1; i++) {
			for(int j=i; j<temp.length-1; j++) {
				if(temp[j] > temp[j+1]) {
					char tem = temp[j];
					temp[j] = temp[j+1];
					temp[j+1] = tem;
					
					String temStr = array[j];
					array[j] = array[j+1];
					array[j+1] = temStr; 
				}
			}
		}
		
		return array;
	}
}
