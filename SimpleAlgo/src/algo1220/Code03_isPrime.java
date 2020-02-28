package algo1220;

import java.util.Scanner;

public class Code03_isPrime {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int n = kb.nextInt();
		boolean isPrime = true;
		for(int i=2; i<n; i++) {
			
			if(n%i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("소수 입니다");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		kb.close();
	}

}
