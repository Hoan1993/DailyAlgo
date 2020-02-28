package algo1219;

import java.util.Arrays;
import java.util.Scanner;

public class Code01_ShapeApplication {
	static int capacity = 2;
	static Code01_Shape [] shapes = new Code01_Shape[capacity];
	static Scanner kb = new Scanner(System.in);
	static int n = 0;
	
	private void commandProcessor() {
		while (true) {
			System.out.print("$ ");
			String command = kb.next();
			if (command.equalsIgnoreCase("add")) {
				handleAdd();
			}
			else if (command.equalsIgnoreCase("show") || command.equalsIgnoreCase("showdetail")) {
				handleShow(command.equalsIgnoreCase("showdetail"));
			}
			else if (command.equalsIgnoreCase("sort")) {
				Arrays.sort(shapes, 0, n);
			}
			else if (command.equalsIgnoreCase("exit")) {
				break;
			} else {
				continue;
			}
				
		}
		
	}
	private void handleShow(boolean showdetail) {
		for(int i=0; i<n; i++) {
			System.out.println(shapes[i].toString());
			if(showdetail) {
				System.out.println("Parameter is "+shapes[i].calcParameter());
				System.out.println("Area is "+shapes[i].calcArea());
			}
		}
		
	}
	private void handleAdd() {
		String type = kb.next();
		switch(type) {
		case "R":
			addWord(new Code01_Rectangle("R" ,kb.nextInt(), kb.nextInt()));
			break;
		case "C":
			addWord(new Code01_Circle("C" ,kb.nextInt()));
			break;
		case "T":
			//addWord(new Code01_Rectangle("R" ,kb.nextInt(), kb.nextInt()));
			break;
		}	
	}
	private void reallocate() {
		capacity *= 2;
		Code01_Shape [] temp = new Code01_Shape[capacity];
		System.arraycopy(shapes, 0, temp, 0, n);
		shapes = temp;
		
	}
	private void addWord(Code01_Shape shape) {
		if(n >= capacity) {
			reallocate();
		}
		shapes[n++] = shape;
	}



	public static void main(String[] args) {
		Code01_ShapeApplication app = new Code01_ShapeApplication();
		app.commandProcessor();
		
	}

	
}
