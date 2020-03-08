package algo0304;

public class Code01_ReturnMiddleChar {

	public static void main(String[] args) {
		String s = "abcde";
		String result = solution(s);
		System.out.println(result);
		
		

	}

	private static String solution(String s) {
		String result = "";
		if(s.length()%2 == 0) {
			result += s.charAt(s.length()/2-1);
			result += s.charAt(s.length()/2);
			
		} else {
			result += s.charAt(s.length()/2);
		}
		
		return result;
	}

}
