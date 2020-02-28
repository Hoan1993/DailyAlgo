package algo1218;

import java.util.Arrays;
import java.util.Collections;
// 문자열 내림차순 하는 알고리즘.
public class Code05_1_sortArray {
	
	public static void main(String[] args) {
		String test = "zefAespBei";
		
		String test2 = sortStr(test);
		
		System.out.println(test2);
	}

	private static String sortStr(String test) {
		String [] str = test.split("");
		Arrays.sort(str);  // 정렬을 한다
		Collections.reverse(Arrays.asList(str));  // 여기서 뒤바꾼다.

		return String.join("", str);
	}

}
