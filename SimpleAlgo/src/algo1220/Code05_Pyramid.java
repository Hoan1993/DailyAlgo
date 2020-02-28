package algo1220;

import java.util.Scanner;

public class Code05_Pyramid {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(i*2)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		kb.close();
	}

}
