package algo1211;

import java.util.Scanner;

public class code01 {

	public static void main(String[] args) {
		int eng = 60;
		int math = 70 ;
		int kor = 90;
		
		int sum = eng + math + kor;
		int avg = sum / 3;
		
		
		System.out.println(sum+" "+avg);
		
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		kb.close();
	}

}
