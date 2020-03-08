package algo0307; 

public class Code00_Test {
	public static void main(String[] args) {
		String s = "ZzYy ZzYy";
		String result = "";
		int n = 1;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==32) {
				char empty = (char) (s.charAt(i));
				System.out.println(empty);
				result += empty;
				continue;
			}
			
			if((s.charAt(i) >= 65 && s.charAt(i) <= 90) &&
					!((s.charAt(i)+n <= 90 && s.charAt(i)+n >= 65))) {
				 char tempCh = (char) (s.charAt(i)+n - 26);
				 System.out.println(tempCh);
				 result += tempCh;
				 continue;
			} else if((s.charAt(i) >= 97 && s.charAt(i) <= 122) &&
					!((s.charAt(i)+n >= 97 && s.charAt(i)+n <= 122))) {
				 char tempCh = (char) (s.charAt(i)+n - 26);
				 System.out.println(tempCh);
				 result += tempCh;
				 continue;
			}
			
			char ch = (char) (s.charAt(i)+n);
			result += ch;
			System.out.println(ch);
		}
		
		System.out.println(result);
	}
}
