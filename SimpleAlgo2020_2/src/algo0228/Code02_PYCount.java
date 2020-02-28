package algo0228;

public class Code02_PYCount {
	public static void main(String[] args) {
		String s = "pPoooyY";
		
/*		System.out.println(s);
		String su = s.toUpperCase();
		System.out.println(su);*/
		
		boolean result = solution(s);
		
		System.out.println(result);
	}

	private static boolean solution(String s) {
		String s2 = s.toUpperCase();
		String [] str = s2.split("");
		int countP = 0;
		int countY = 0;
		
		boolean result = false;
		
 		for(int i=0; i<str.length; i++) {
			if(str[i].equals("P")) {
				countP++;
			} else if(str[i].equals("Y")) {
				countY++;
			}
		}
 		
 		if(countP == countY) {
 			result = true;
 		}
		
	
		return result;
	}
}
