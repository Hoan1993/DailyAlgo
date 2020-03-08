package algo0306;

import java.util.Scanner;

public class Code02_Collatz {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		
		int count = solution(num);
		System.out.println(count);
	}

	private static int solution(int num) {
		int count = 0;
		if(num == 1) {
			return 0;
		}
		
		
		if(num%2 == 0) {
			count++;
			solution(num/2);
			
		} else if(num%2 != 0) {
			count++;
			solution(num*3+1);
		}
		
		return count;
	
		
		
	}
}
