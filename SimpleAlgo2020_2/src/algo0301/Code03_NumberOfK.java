package algo0301;

import java.util.Arrays;

public class Code03_NumberOfK {
	public static void main(String[] args) {
		int [] array = {1,5,2,6,3,7,4};
		int [][] command = {{2,5,3}, {4,4,1}, {1,7,3}};
		
		System.out.println(command.length);
		
		int [] result = solution(array, command);
	
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+", ");
		}
	}

	private static int[] solution(int[] array, int[][] command) {
		int [] result = new int[array.length];
		int tempIndex2 = 0;
		
		for(int i=0; i<array.length; i++) {
			int startNum = command[i][0];
			int endNum = command[i][1];
			int numberK = command[i][2];
			
			int [] temp = new int[endNum-startNum+1];
			int tempIndex = 0;
			
			for(int j=startNum-1; j<endNum-1; j++) {
				temp[tempIndex++] = array[j];
			}
			Arrays.sort(temp);
			result[tempIndex2++] = temp[numberK-1]; 
		}

		return result;
	}
}
