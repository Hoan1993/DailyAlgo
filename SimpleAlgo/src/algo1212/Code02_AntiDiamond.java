package algo1212;

import java.util.Scanner;

public class Code02_AntiDiamond {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int size = kb.nextInt();
		
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-i; j++) {
				System.out.print("*");
			}
			
			for(int j=0; j<i*2; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<size -i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			
			for(int j=0; j<(size*2)-(i*2)-2; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		kb.close();
		 

	}

}
