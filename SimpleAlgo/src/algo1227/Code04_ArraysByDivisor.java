package algo1227;

import java.util.Arrays;

public class Code04_ArraysByDivisor {

	public static void main(String[] args) {
		int [] arr = {3, 2, 6};
		int divisor = 10;
		int [] temp = solution(arr, divisor);
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
		
	}

	public static int[] solution(int[] arr, int divisor) {
			int[] answer = {};
			int count = 0;
			int k =0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%divisor == 0) {
					count++;  
				}
			}
			answer = new int[count];
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%divisor == 0) {
					answer[k++] = arr[i];  
				}
			}
			
			Arrays.sort(answer);
			
			if(answer.length == 0) {
				answer = new int[1];
				answer[0] = -1;
			}
			 
			
			return answer;
		}
}