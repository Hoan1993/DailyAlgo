package algo1220;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Code02_RotateList_2 {
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {

		int command = kb.nextInt();
		System.out.println();
		if (command >= 0) {
			rotateToRight(command);
		} else {
			rotateToLeft(command);
		}

		kb.close();
	}

	
	private static void rotateToLeft(int command) {
		
		String str = kb.nextLine();

		String[] tokens = str.split(" ");

		// String temp = tokens[tokens.length-1];
		
		
		if(Math.abs(command) > tokens.length) {
			command = ((Math.abs(command))%tokens.length);
			command++;
		} else {
			command = (Math.abs(command))+1; 
		}
		
		
		
		String[] temp1 = new String[command];
		
		for (int i = 0; i < command; i++) {
			temp1[i] = tokens[i];
		}

		for (int i = 0; i < (tokens.length - command); i++) {
			tokens[i] = tokens[i + command];
		}
		
		for (int i = 0; i < temp1.length; i++) {
			tokens[tokens.length-command+i] = temp1[i];
		}

		System.out.println();
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i]);
		}

	}

	private static void rotateToRight(int command) {
		// 입력을 받는다.
		String str = kb.nextLine();
		// 문자열을 배열로 변환한다.
		String[] tokens = str.split(" ");
		
		if(command > tokens.length) {
			command = (command%tokens.length)+1;
			
		} 
		
		String[] temp1 = new String[command];
		for (int i = 0; i < command; i++) {
			temp1[i] = tokens[tokens.length - 1 - i];
		}

		for (int i = (tokens.length - 1); i >= command; i--) {
			tokens[i] = tokens[i - command];
		}

		List<String> list = Arrays.asList(temp1);
		Collections.reverse(list);
		temp1 = list.toArray(new String[list.size()]);

		
		for (int i = 0; i < command; i++) {
			tokens[i] = temp1[i];
		}

		System.out.println();
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i]);
		}

	}

}
