package algo0307;

public class Code01_StringToNumber {
	public static void main(String[] args) {
		String s = "-1234";
		int num = solution(s);
		System.out.println(num);
	}

	private static int solution(String s) {
		int result = 0;
		result = Integer.parseInt(s);
		
		
		
		return result;
	}
}
