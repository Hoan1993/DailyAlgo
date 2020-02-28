package algo0228;

public class Code03_SortStringDesc {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = solution(s);
		System.out.println(answer);
	}

	private static String solution(String s) {
		String answer = "";
		
		String [] str= s.split("");
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str.length-1-i; j++) {
				if(str[j].compareTo(str[j+1]) < 0) {
					String temp = str[j+1];
					str[j+1] = str[j];
					str[j] = temp;
				}
			}
		}
		
		answer = String.join(" ", str);
		
		return answer;
	}
}
