package algo0225;

import java.util.Scanner;

public class Code01_1_isPrime {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		if(isPrime(num)) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		
		kb.close();
	}

	private static boolean isPrime(int num) {
		boolean result = true;
		if(num < 2) {
			return false;
		}
		
		for(int i=2; i*i<num; i++) {
			if(num%i == 0) {
				result = false;
			} 
		}
		
		return result;
	}
}
