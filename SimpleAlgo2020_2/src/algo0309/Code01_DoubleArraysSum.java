package algo0309;

public class Code01_DoubleArraysSum {
	public static void main(String[] args) {
		int [][] array1 = {{1,2},{2,3}};
		int [][] array2 = {{3,4},{5,6}};
	
		int [][] answer = solution(array1, array2);
		
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[i].length; j++) {
			System.out.print(answer[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] solution(int[][] array1, int[][] array2) {
		
		int [][] answer = new int[array1.length][array1[0].length];
		
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array1[i].length; j++) {
				answer[i][j] = array1[i][j]+array2[i][j];
			}
		}
		
		
		return answer;
	}
}
