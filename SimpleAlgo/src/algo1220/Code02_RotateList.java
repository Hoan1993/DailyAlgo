package algo1220;



public class Code02_RotateList {
	
	public static void main(String[] args) {
		String str = "a b c d e";
		
		String [] tokens = str.split(" ");

		for(int i=0; i<tokens.length; i++) {
			System.out.print(tokens[i]);
		}
		
		String temp = tokens[tokens.length-1];
		
		for(int i=(tokens.length-1); i>0; i--) {
			tokens[i] = tokens[i-1];
		}
		
		tokens[0] = temp;
		System.out.println();
		for(int i=0; i<tokens.length; i++) {
			System.out.print(tokens[i]);
		}
		
	}

	
	
}
