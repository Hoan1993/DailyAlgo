package algo0308;

import java.util.Arrays;

public class Code00_Test {
	public static void main(String[] args) {
		int [] array = {1,5,2,6,3,7,4};
		int [] commands = {2,5,3};
		
		int [][] commands2 = {{2,5,3},
							{4,4,1},
							{1,7,3}};
		
		//int result = solution(array, commands);
		int [] result2 = solution2(array,commands2);
		//System.out.println(result);
		
		for(int i=0; i<result2.length; i++) {
			System.out.println(result2[i]+", ");
		}
	
	}

	private static int[] solution2(int[] array, int[][] commands2) {
		int [] result = new int[commands2.length];
		for(int i=0; i<commands2.length; i++) {
			int [] temp = new int[(commands2[i][1]-commands2[i][0])+1];
			for(int j=commands2[i][0]; j<=commands2[i][1]; j++) {
				temp[j-commands2[i][0]] = array[j-1];
			}
			Arrays.sort(temp);
			result[i] = temp[commands2[i][2]-1];
		}
		
		return result;
	}

	private static int solution(int[] array, int[] commands) {
		int result = 0;
		int [] temp = new int[(commands[1]-commands[0])+1];
		for(int i=commands[0]; i<= commands[1]; i++) {
			temp[i-commands[0]]= array[i-1];
			
		}
		
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+", ");
		}
		System.out.println();
		
		Arrays.sort(temp);
		result = temp[commands[2]-1];
		
		
		return result;
	}
}
