package algo0305;

import java.util.Scanner;

public class Code01_WaterMelon {

	public static void main(String[] args) {
		String result = "";
		
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		result = solution(num);
		System.out.println(result);
		
		kb.close();
	}

	private static String solution(int num) {
		String result = "";
		int j = num/2;
		
		for(int i=0; i<j; i++) {
			result += "수박";
		}
		if(num%2 != 0) {
			result +="수";
		}
		
		
		return result;
	}

}
