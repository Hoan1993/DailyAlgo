package algo0308;

import java.util.Arrays;

public class Code02_NumberOfK {
	public static void main(String[] args) {
		int [] array = {1,5,2,6,3,7,4};
		int [][] commands = {{2,5,3},
							{4,4,1},
							{1,7,3}};
		int [] answer = solution(array, commands);
		
		//System.out.println(commands.length);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+", ");
		}
	}

	private static int[] solution(int[] array, int[][] commands) {
		int [] answer = new int[commands.length];
		
		int [] temp = null;
		for(int i=0; i<commands.length; i++) {
			int k = 0;
			for(int j=commands[i][0]; j<=commands[i][1]; j++) {
				temp = new int[(commands[i][1]-commands[i][0])+1];
				temp [k++] = array[j];
				
			}
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2]-1];
			
		}
	
		
		return answer;
	}
}
