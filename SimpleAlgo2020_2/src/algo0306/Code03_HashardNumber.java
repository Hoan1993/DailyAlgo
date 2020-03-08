package algo0306;

public class Code03_HashardNumber {
	public static void main(String[] args) {
		int num = 12;
		boolean result = solution(num);
		System.out.println(result);
	}

	private static boolean solution(int num) {
		boolean result = false;
		int sum = 0;
		
		String strNum = String.valueOf(num);
		String [] strResult = strNum.split("");
		for(int i=0; i<strResult.length; i++) {
			sum += Integer.parseInt(strResult[i]);
		}
		
		if(num%sum == 0) {
			result = true;
		}
		
		return result;
	}
}
