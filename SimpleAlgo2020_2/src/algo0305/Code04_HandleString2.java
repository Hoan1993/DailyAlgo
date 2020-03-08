package algo0305;

public class Code04_HandleString2 {

	public static void main(String[] args) {
		String s = "1234a";
		boolean result = solution(s);

		System.out.println(result);
	}

	private static boolean solution(String s) {
		boolean result = isNum(s);
		
		
		return result;
	}

	private static boolean isNum(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch(Exception e) {
			return false;
		}
		

	}
	
	

}
