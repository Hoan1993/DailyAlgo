package algo1218;

import java.util.Scanner;

public class Code02_compress {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String data = kb.nextLine()+ " ", anw="";
		
		int count = 1;
		for(int i=0; i<data.length()-1; i++) {
			if(data.charAt(i) == data.charAt(i+1)) {
				count++;
			} else {
				anw += data.charAt(i)+(count+"");
				count = 1;
			}
		}
		
		System.out.print(anw);
		
		kb.close();
	
	}
}
