package algo0309;

public class Code02_WhoIsLuckyGuy {

	public static void main(String[] args) {
		int [] answer = {1,2,3,4,5};
		int [] result = solution(answer);
		
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
		//System.out.println(result);
	}

	private static int[] solution(int[] answer) {
		int [] stu1 = {1,2,3,4,5};
		int [] stu2 = {2,1,2,3,2,4,2,5};
		int [] stu3 = {3,3,1,1,2,2,4,4,5,5};
		
		int countStu1 = 0;
		int countStu2 = 0;
		int countStu3 = 0;
		
		
		for(int i=0; i<answer.length; i++) {
			if(answer[i] == stu1[rotateIndex(stu1, i)]) {
				countStu1++;
			} 
			if(answer[i] == stu2[rotateIndex(stu2, i)]) {
				countStu2++;
			}
			
			if(answer[i] == stu3[rotateIndex(stu3, i)]) {
				countStu3++;
			}
		}
		
		int result = Math.max(countStu1, Math.max(countStu2, countStu3));
		
		if(result == countStu1 && result > countStu2 && result > countStu3) {
			answer = new int[1];
			answer[0] = 1;
		} else if(result == countStu2 && result > countStu1 && result > countStu2) {
			answer = new int[1];
			answer[0] = 2;
		} else if(result == countStu3 && result > countStu1 && result > countStu2) {
			answer = new int[1];
			answer[0] = 3;
		} else if(result == countStu1 && countStu1 == countStu2 && countStu2 > countStu3) {
			answer = new int[2];
			answer[0] = 1;
			answer[1] = 2;
		} else if(result == countStu2 && countStu2 == countStu3 && countStu3 > countStu1) {
			answer = new int[2];
			answer[0] = 2;
			answer[1] = 3;
		} else if(result == countStu2 && countStu2 == countStu3 && countStu3 == countStu1) {
			answer = new int[3];
			answer[0] = 1;
			answer[1] = 2;
			answer[2] = 3;
		}
		

		
		 
/*		if(countStu1 > countStu2) {
			
		}*/
		
		
		
		return answer;
	}

	private static int rotateIndex(int[] stu, int i) {
		
		return i%stu.length;
	}


}
