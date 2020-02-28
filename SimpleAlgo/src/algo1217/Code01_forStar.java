package algo1217;

import java.util.Scanner;

public class Code01_forStar {

	public static void main(String[] args) {
		// 삼항연산자를 활용한 피라미드
		
		
		
		Scanner kb = new Scanner(System.in);
		int star = kb.nextInt();
		
		for(int i=1; i<=(star*2-1); i++) {
			int line = (i<= star) ? i : (star*2-i);
			
			for(int j=1; j<=line; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		int temp = star;
		int temp2 = star;
		for(int i=1; i<=(star*2-1); i++) {
			int line = (i<= star) ? temp-- : 2+temp++;
			int line2 = (i<= star) ? i : (temp2--)-1;
			for(int j=1; j<=line; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=line2*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		
		kb.close();
	}

}
