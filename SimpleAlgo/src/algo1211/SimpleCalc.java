package algo1211;

import java.util.Scanner;

public class SimpleCalc {
	Scanner kb = new Scanner(System.in);
	public void ProcessCommand() {
		
		while(true) {

			System.out.print("$ ");
			
			int a = kb.nextInt();
			String sym = kb.next();
			int b = kb.nextInt();
			
			if (sym.equals("+")) {
				System.out.println(a+b);
			} else if (sym.equals("-")) {
				System.out.println(a-b);
			} else if (sym.equals("*")) {
				System.out.println(a*b);
			} else if (sym.equals("/")) {
				System.out.println(a/b);
			}

		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		SimpleCalc app = new SimpleCalc();
		app.ProcessCommand();
	}
}
