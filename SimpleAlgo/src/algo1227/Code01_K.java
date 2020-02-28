package algo1227;

import java.util.Arrays;

public class Code01_K {

	public static void main(String[] args) {
		int [] array = new int[] {1, 5, 2, 6, 3, 7, 4};
		int [][] commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int [] answer = new int[commands.length];
		answer =	solution(array, commands);
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}

	}
	
	
    public static int[] solution(int[] array, int[][] commands) {
        int [] answer = new int[commands.length];
        
        for(int a=0; a<commands.length; a++) {
        	int [] temp = new int[3];
        	for(int j=0; j<commands[a].length; j++) {
        		  temp [j]= commands[a][j];
        	}
        	
        	int i = temp[0]-1;
        	int j = temp[1]-1;
        	int k = temp[2];
        	int [] temp2 = new int[j-i+1];
        	int x= 0;
        	
        	
			for (int tem = i; tem <= j; tem++) {
				temp2[x++] = array[tem];
			}
			
			Arrays.sort(temp2);
			answer[a]= temp2[k-1];
        	
        	
        }
        // i, j, k를 뽑아내야 함.
/*        int [] temp = new int[j-i];
        int k = 0;
        for(int temp = i; temp<j; temp++) {
        	temp[k++] = temp;
        }*/
       

/*        	answer[i]	= temp[k];*/
        
        
        
        return answer;
    }

}
