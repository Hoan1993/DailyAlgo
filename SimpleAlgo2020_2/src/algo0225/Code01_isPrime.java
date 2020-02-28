package algo0225;

import java.util.Scanner;

public class Code01_isPrime {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num =kb.nextInt();
		int result = solution(num);
		System.out.println(result);
		kb.close();
	}

	private static int solution(int num) {
		int answer = 0;
		
		for(int i=1; i<=num; i++) {
			if(isPrime(i)) {
				answer += 1;
			}
		}
		
		return answer;
	}

	private static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				return false;
			} 
		}
		
		return true;
	}
}
