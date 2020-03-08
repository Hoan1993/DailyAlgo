package algo0306;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Code01_ReverseNumber {

	public static void main(String[] args) {
		long n = 12345;
		solution(n);
		
		/*
		 * for(int i=0; i<result.length; i++) { System.out.print(result[i]+", "); }
		 */

	}

	private static int[] solution(long n) {
		String strNum = Long.toString(n);
		int [] result = new int[strNum.length()];
		
		for(int i=0; i<result.length; i++) {
			result[i] = Character.getNumericValue(strNum.charAt(i));
		}
		

		List<int[]> list = Arrays.asList(result);
		Collections.reverse(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+", ");
		}
		
		
		
		
		
		
		
		
		return null;
	}

}
