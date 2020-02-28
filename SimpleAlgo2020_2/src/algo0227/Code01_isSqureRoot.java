package algo0227;

public class Code01_isSqureRoot {
	public static void main(String[] args) {
		long num1 = 1;
		
		int result = solution(num1);
		System.out.println(result);
		
	}

	private static int solution(long num1) {
		if(num1 == 1) {
			return 4;	
		}
		
		for(int i=1; i<num1; i++) {
			if(i*i == num1) {
				int result = (i+1)*(i+1);
				return result;
			}
		}
	
		return -1;
	}
	
	
}
