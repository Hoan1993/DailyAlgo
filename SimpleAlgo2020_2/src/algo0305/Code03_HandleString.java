package algo0305;

public class Code03_HandleString {

	public static void main(String[] args) {
		String s = "12345a";
		
		boolean result = solution(s);
		System.out.println(result);

	}

	private static boolean solution(String s) {
		boolean result = true;
		
		for(int i=0; i<s.length(); i++) {
			if((s.length() != 4 && s.length() != 6)
					|| !Character.isDigit(s.charAt(i)) ) {
				result = false;
				break;
			}
		}
		
		return result;
	}

}
