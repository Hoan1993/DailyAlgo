package algo1220;

import java.util.Scanner;

public class Code03_isPrimeNumber {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int  n = kb.nextInt();
		int count = 0;
		
		for(int i=2; i<n; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		System.out.println(count);
		kb.close();

	}

	private static boolean isPrime(int n) {
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}

		return true;
	}

}
