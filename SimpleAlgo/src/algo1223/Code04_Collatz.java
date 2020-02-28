package algo1223;

public class Code04_Collatz {
	public static void main(String[] args) {
		int num = 626331;
		System.out.println(solution(num));
	}

	private static int solution(int num) {
		int answer = 0;
		while (num != 1) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = num * 3 + 1;
			}
			answer++;
		}
		
		if(answer >= 500) {
			answer = -1;
		}
		
		return answer;
		
	}
}
