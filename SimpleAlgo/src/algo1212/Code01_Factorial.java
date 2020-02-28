package algo1212;

import java.util.Scanner;

public class Code01_Factorial {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int num = kb.nextInt();
		int result = 1;
		
		for(int i=1; i<=num; i++) {
			result = i*result;
		}
		kb.close();
		System.out.println(result);
	} 

}
