package algo0329;

import java.util.Arrays;

public class Code01_Budget {
	public static void main(String[] args) {
		int [] d = {1,3,2,5,4};
		int budget = 9;
		int answer = solution(d, budget);
		
		System.out.println(answer);
	}

	private static int solution(int[] d, int budget) {
		int count = 0;
		Arrays.sort(d);
		
		for(int i=0; i<d.length; i++) {
			if(budget >= d[i]) {
				count++;
				budget = budget - d[i];
			}
		}
		
		
		
		return count;
	}
}
