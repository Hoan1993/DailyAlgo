package algo0308;

public class Code04_XNReturnArrays {
	public static void main(String[] args) {
		int x = -4;
		int n = 2;
		int [] answer = solution(x, n);
		
		for(int i=0;i<answer.length; i++) {
			System.out.println(answer[i]+", ");
		}
	}

	private static int[] solution(int x, int n) {
		int [] answer = new int[n];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = (x*(i+1));
		}
		return answer;
	}
}
