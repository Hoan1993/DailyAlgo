package algo0327;

public class Code02_MakeStrangeString {
	public static void main(String[] args) {
		String s = "tryd hello world ";
		
		String answer = solution(s);
		
		System.out.println("=="+answer+"==");
	}

	private static String solution(String s) {
		
		String answer = "";
		int cnt = 0;
		String [] array = s.split("");
		System.out.println(array.length);
		for(String ss : array) {
			cnt = ss.contains(" ") ? 0:cnt+1;
			answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
		}
		
		return answer;

	}
}
