package algo1213;

import java.util.Scanner;

public class Code03_Polynomial {

	Code03_PolynomialC [] polys = new Code03_PolynomialC[100];
	int n = 0;
	Scanner kb = new Scanner(System.in);
	
	private void CommandProcessor() {
		
		while (true) {
			System.out.print("$ ");
			String command = kb.next();
			if (command.equalsIgnoreCase("create")) {
				handleCreate();
			} else if (command.equalsIgnoreCase("add")) {
				handleAdd();
			} else if (command.equalsIgnoreCase("calc")) {
				handleCalc();
			} else if (command.equalsIgnoreCase("print")) {
				handlePrint();
			} else if (command.equalsIgnoreCase("exit")) {
				
				break;
			} 		
		}
		
	}
		
	private void handlePrint() {
		char name = kb.next().charAt(0);
		int index = findWord(name);
		if(index == -1) {
			System.out.println("you should create "+name+" first");
		}
		
		for(int i=0; i<polys[index].nTerm; i++) {
			System.out.print(polys[index].terms[i].coef+"x^"+polys[index].terms[i].expo+"+");
		}
		System.out.println();
	}




	private void handleCalc() {
		char name = kb.next().charAt(0);
		int index = findWord(name);
		int sum = 0;
		int result = 0;
		
		if(index == -1) {
			System.out.println("you should create "+name+" first");
		}
		int x = kb.nextInt();
		for(int i=0; i<polys[index].nTerm; i++) {
			sum = polys[index].terms[i].coef*((int)Math.pow(x, polys[index].terms[i].expo));
			result += sum; 
		}
		System.out.println(result);
		
		
	}


	private void handleAdd() {
		char name = kb.next().charAt(0);
		int index = findWord(name);
		if(index == -1) {
			System.out.println("you should create "+name+" first");
		}
		
		int c = kb.nextInt();
		int e = kb.nextInt();
		
		addWord(polys[index], c, e);
		
	}


	private void addWord(Code03_PolynomialC p, int c, int e) {
		int index = findTerm(p, e);
		if(index != -1) {
			p.terms[index].coef += c;
			return;
		}
		int i = p.nTerm -1;
		while(i >= 0 && p.terms[i].expo < e) {
			p.terms[i+1] = p.terms[i];
			i--;		
		}
		p.terms[i+1] = new Code03_Term();
		p.terms[i+1].coef = c;
		p.terms[i+1].expo = e;
		p.nTerm += 1;
				
	}

	private int findTerm(Code03_PolynomialC p, int e) {
		for(int i=0; i< p.nTerm && p.terms[i].expo >= 0; i++) {
			if(p.terms[i].expo == e)
				return i;
		}
		return -1;
	}

	private int findWord(char name) {
		
		return 0;
	}

	private void handleCreate() {
		char name = kb.next().charAt(0);
		/*int index = findWord(name);
		if(index != -1) {
			System.out.println("이미 존재합니다");
			return;
		} */
		
		polys[n] = new Code03_PolynomialC(); 
		polys[n].name = name;
		polys[n].nTerm = 0;
		n++;
	}




	public static void main(String[] args) {
		Code03_Polynomial app = new Code03_Polynomial();
		app.CommandProcessor();

	}



}
