package algo1212;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code03_IndexMaker {
	// memory reallocate 구현해야 함.
	static int capacity = 100;
	static String [] words = new String[capacity];
	static int [] counts = new int[capacity];
	static int n = 0;
	
	
	static Scanner kb = new Scanner(System.in);

	public void ProcessCommand() {
		while (true) {
			System.out.print("$ ");
			String command = kb.next();
			if (command.equalsIgnoreCase("read")) {
				handleRead();
			} else if (command.equalsIgnoreCase("saveas")) {
				handleSave();
			} else if (command.equalsIgnoreCase("list")) {
				handleList();
			} else if (command.equalsIgnoreCase("find")) {
				handleFind();
			} else if (command.equalsIgnoreCase("sort")) {
				MySort();

			} else if (command.equalsIgnoreCase("exit")) {
				break;
			}
		}
	}

	private void MySort() {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
					String temp = words[j + 1];
					words[j + 1] = words[j];
					words[j] = temp;

					int tempC = counts[j + 1];
					counts[j + 1] = counts[j];
					counts[j] = tempC;
				}
			}
		}
		
	}

	
	private void handleFind() {
		String fWord = kb.next();
		int index = findWord(fWord);
		if(index != -1) {
			System.out.println(words[index]+" "+counts[index]);
		} else {
			System.out.println("No such words");
		}
		
	}



	private void handleList() {
		for(int i=0; i<n; i++) {
			System.out.println(words[i]+", "+counts[i]);
		}
		
 	}



	private void handleSave() {
		String fileName = kb.next();
		try {
			PrintWriter out = new PrintWriter(new FileWriter(fileName));
			for(int i=0; i<n; i++) {
				out.println(words[i]+": "+counts[i]);
			}
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Save failed");
			return;
		}
		
		
	}



	private void handleRead() {
		String fileName = kb.next();
		try {
			Scanner inFile = new Scanner(new File(fileName));
			while(inFile.hasNext()) {
				String str = inFile.next();
				addWord(str);
			}			
			inFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("NO file");
		}
		
	}



	private void addWord(String next) {
		int index = findWord(next);
		if(n >= capacity ) {
			reallocate();
		}
		
		
		if(index != -1) {
			counts[index] += 1;
			return;
			
		}
		words[n] = next;
		counts[n] += 1;
		n++;			
	}



	private void reallocate() {
		capacity = capacity*2;
		String [] temp = new String[capacity];
		int [] temp2 = new int[capacity];
		
		for(int i=0; i<words.length; i++) {
			temp[i] = words[i];
			temp2[i] = counts[i];
		}
		
		words = temp;
		counts = temp2;
 		
	}

	private int findWord(String next) {
		for(int i=0; i<n; i++) {
			if(words[i].equalsIgnoreCase(next)) {
				return i;
			}
		}	
		return -1;
	}



	public static void main(String[] args) {
		Code03_IndexMaker app = new Code03_IndexMaker();
		app.ProcessCommand();
	}

}
