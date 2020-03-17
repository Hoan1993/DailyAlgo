package algo0315;

import javax.sound.sampled.ReverbType;

public class Code01_SportsUniform {
	public static void main(String[] args) {
		int n = 3;
		int [] lost = {3};
		int [] reserve = {1};
		
		int result = solution(n, lost, reserve);
		System.out.println(result);
	}

	private static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		
		int [] countStu = new int[n];
		for(int i=0; i<countStu.length; i++) {
			countStu[i] = 1;
		}
		
		for(int i=0; i<countStu.length; i++) {
			for(int j=0; j<reserve.length; j++) {
				if((i+1)==reserve[j]) {
					countStu[i] += 1; 
				}
			}
		}
		
		for(int i=0; i<countStu.length; i++) {
			System.out.print(countStu[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<countStu.length; i++) {
			for(int j=0; j<lost.length; j++) {
				if((i+1) == lost[j]) {
					countStu[i] -= 1;
				}
			}
		}
		
		for(int i=0; i<countStu.length; i++) {
			System.out.print(countStu[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<countStu.length; i++) {
			if(countStu[i] == 0) {
				if(countStu[i-1] == 2 && i >= 0) {
					countStu[i-1] -= 1;
					countStu[i] += 1;
					answer++;
				} else if((i+1)!=countStu.length && countStu[i+1] ==2 ) {
					countStu[i+1] -= 1;
					countStu[i] += 1;
					answer++;
				} 
			} else {
				answer++;
			}
		}
		
		return answer;
	}
}
