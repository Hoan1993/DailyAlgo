package algo1216;

import java.util.ArrayList;

public class Code02_sumSelfNumber {
	public static void main(String[] args) {
		calcGeneratorNum();
		int sum = 0;
		for(int i=0; i<5000; i++) {
			if(!hasGenerator(i)) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
	private static boolean hasGenerator(int i) {
		
		return numberGenerator.contains(i);
	}
	private static ArrayList<Integer> numberGenerator;
	
	private static void calcGeneratorNum() {
		numberGenerator = new ArrayList<Integer>();
		
		for(int i=0; i<=5000; i++) {
			String strNum = String.valueOf(i);
			int no = 0;
			for(int j=0; j<strNum.length(); j++) {
				no += Integer.parseInt(strNum.substring(j, j+1));
			}
			numberGenerator.add(no+i);
			
		}
		 
		
	}
}
