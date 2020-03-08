package algo0307;

public class Code03_DigitSum {

	public static void main(String[] args) {
	
		int n = 1234;
		int result = solution(n);
		System.out.println(result);
	}

	private static int solution(int n) {
		int result = 0;
		
		String s = String.valueOf(n);
		
		for(int i=0; i<s.length(); i++) {
			result += Character.getNumericValue(s.charAt(i));
		}
		
		
		return result;
	}

}
