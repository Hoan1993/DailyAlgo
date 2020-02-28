package algo0226;

import java.util.Scanner;

public class Code05_NumberTo124 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num =kb.nextInt();
		
		int result = changeTo124(num);
		
		System.out.println(result);
		
		kb.close();
	}

	private static int changeTo124(int num) {
		if(num < 3) {
			return num;
		} else if(num == 3) {
			return 4;
		} 
		
		
		
		
		
		return 0;
	}
}
