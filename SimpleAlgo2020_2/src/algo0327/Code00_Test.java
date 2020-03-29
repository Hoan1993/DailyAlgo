package algo0327;

public class Code00_Test {
	public static void main(String[] args) {
		String answer = "";
		
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				answer += " ";
			}
			answer += "a";
			
		}
		
		System.out.println(answer);
	}
}
