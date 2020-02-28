package algo1218;

import java.util.Arrays;
import java.util.Collections;

public class Code05_2_stringSort {

	public static void main(String[] args) {
		String test = "dDBiydkao";
		
		String sortString1 = sortAsc(test);
		String sortString2 = sortDesc(test);
		
		System.out.println(sortString1);
		System.out.println(sortString2);
	}

	private static String sortDesc(String test) {
		String [] str = test.split("");
		Arrays.sort(str);
		Collections.reverse(Arrays.asList(str));
		return String.join("", str);
	}

	private static String sortAsc(String test) {
		String [] str = test.split("");
		Arrays.sort(str);
		return String.join("", str);
		
	}

}
