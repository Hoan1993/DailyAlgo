package algo0308;

public class Code03_MakeStrangeString {
	public static void main(String[] args) {
		String s = "try   hello   wor  ld liwjflwjef";
		String answer = "";
		//String result = solution(s);
		s = s.trim().replaceAll(" +", " ");
		String [] str = s.split(" ");
		/*
		 * for(int i=0; i<str.length; i++) { System.out.println(str[i]); }
		 */
		
		for (int i = 0; i < str.length; i++) {
			String temp = "";
			for (int j = 0; j < str[i].length(); j++) {
				if (j % 2 == 0) {
					temp += Character.toUpperCase(str[i].charAt(j));
				} else {
					temp += Character.toLowerCase(str[i].charAt(j));
				}
			}
			str[i] = temp;
		}
		
	      for(int i=0; i<str.length; i++) {
	          answer += str[i]+" ";
	      }
	      
	     answer.replace(answer.substring(answer.length()-1), "");
	      System.out.println(answer);
		
	      String realAnswer = "";
	      for(int i=0; i<answer.length()-1; i++) {
	    	  realAnswer += answer.charAt(i); 
	      }
	      
		//System.out.println(result);
	}

	private static String solution(String s) {
	
		return null;
	}
}
